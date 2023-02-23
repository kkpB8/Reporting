/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.anubis.security;

import org.apache.fineract.cn.anubis.api.v1.domain.AllowedOperation;
import org.apache.fineract.cn.anubis.api.v1.domain.TokenPermission;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.apache.fineract.cn.reporting.internal.service.RoleMapper;
import org.apache.fineract.cn.lang.ApplicationName;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Aspect
@Component
public class AddPermissionsAdvice {

    @Autowired
    AccessRights accessRights;
    @Autowired
    UsersRoleRightsMapping userRoleRightsMap;
    @Autowired
    ApplicationName applicationName;
    @Autowired
    PermittableGroups permittableGroups;

    @AfterReturning(pointcut = "execution(org.springframework.security.core.Authentication org.apache.fineract.cn.anubis.security.IsisAuthenticatedAuthenticationProvider.authenticate(org.springframework.security.core.Authentication))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("====> returned with value " + result);

        AnubisAuthentication auth = (AnubisAuthentication)result;
        String userid = auth.getPrincipal().getUser();
        if(!userid.equals("guest") &&  !userid.equals("wepemnefret")) {
            List<UserRoleRightsMapEntity> entitiesList = userRoleRightsMap.getAllForUser(userid);
            Set<TokenPermission> tokenPermissions = new HashSet<>() ;
            if(entitiesList.size()==1) {
                UserRoleRightsMapEntity entity = entitiesList.get(0);
                final Optional<AccessRightsEntity> accessRight = accessRights.get(entity.getRoleId());
                tokenPermissions = accessRight
                        .map(r -> r.getRights().stream().flatMap(this::mapPermissions).collect(Collectors.toSet()))
                        .orElse(new HashSet<>());
            }else if(entitiesList.size()>1){
                Iterator itr = entitiesList.iterator();
                while(itr.hasNext()){
                    UserRoleRightsMapEntity userRoleRightsMapEntity = (UserRoleRightsMapEntity)itr.next();
                    final Optional<AccessRightsEntity> accessRight = accessRights.get(userRoleRightsMapEntity.getRoleId());
                    Set<TokenPermission> tokenPermission = accessRight
                            .map(r -> r.getRights().stream().flatMap(this::mapPermissions).collect(Collectors.toSet()))
                            .orElse(new HashSet<>());
                    tokenPermissions.addAll(tokenPermission);
                }
            }
            Field f = null;
            try {
                f = auth.getClass().getDeclaredField("applicationPermissions");
                f.setAccessible(true);
                Set<ApplicationPermission> permission = (Set<ApplicationPermission>) f.get(auth);

                f = auth.getClass().getDeclaredField("applicationPermissions");
                f.setAccessible(true);

                HashSet<ApplicationPermission> set = new HashSet<>();
                set.addAll(permission);
                set.addAll(translatePermissions(getMinifiedTokenPermissions(tokenPermissions)));

                Field modifiersField = Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(f, f.getModifiers() & ~Modifier.FINAL);

                f.set(auth, set);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(auth);
    }

    private Set<ApplicationPermission> translatePermissions(@Nonnull List<TokenPermission> tokenPermissions) {
        return (Set)tokenPermissions.stream().filter((x) -> {
            return x.getPath().startsWith(applicationName.toString());
        }).flatMap(this::getAppPermissionFromTokenPermission).collect(Collectors.toSet());
    }

    private Stream<ApplicationPermission> getAppPermissionFromTokenPermission(TokenPermission tokenPermission) {
        String servletPath = tokenPermission.getPath().substring(applicationName.toString().length());
        return tokenPermission.getAllowedOperations().stream().map((x) -> {
            return new ApplicationPermission(servletPath, x, false);
        });
    }


    private Stream<TokenPermission> mapPermissions(final PermissionType permission) {
        return permittableGroups.get(permission.getPermittableGroupIdentifier())
                .map(PermittableGroupEntity::getPermittables)
                .map(Collection::stream)
                .orElse(Stream.empty())
                .filter(permittable -> isAllowed(permittable, permission))
                .map(this::getTokenPermission);
    }
    private boolean isAllowed(final PermittableType permittable, final PermissionType permission) {
        return permission.getAllowedOperations().contains(AllowedOperationType.fromHttpMethod(permittable.getMethod()));
    }
    private TokenPermission getTokenPermission(final PermittableType permittable) {
        final HashSet<AllowedOperation> allowedOperations = new HashSet<>();
        allowedOperations.add(RoleMapper.mapAllowedOperation(AllowedOperationType.fromHttpMethod(permittable.getMethod())));
        return new TokenPermission(permittable.getPath(), allowedOperations);
    }

    private List<TokenPermission> getMinifiedTokenPermissions( Set<TokenPermission> tokenPermissions) {
        final List<TokenPermission> minifiedTokenPermissions = new ArrayList<>(
                tokenPermissions
                        .stream()
                        .collect(Collectors.toMap(TokenPermission::getPath,
                                tokenPermission -> tokenPermission,
                                (currentTokenPermission, newTokenPermission) -> {
                                    newTokenPermission.getAllowedOperations()
                                            .forEach(allowedOperation -> currentTokenPermission.getAllowedOperations().add(allowedOperation));
                                    return currentTokenPermission;
                                })
                        )
                        .values()
        );
        return minifiedTokenPermissions;
    }

}


