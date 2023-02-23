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
package org.apache.fineract.cn.reporting.internal.repository;

import com.datastax.driver.core.DataType;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.schemabuilder.Create;
import com.datastax.driver.core.schemabuilder.SchemaBuilder;
import com.datastax.driver.mapping.Mapper;
import org.apache.fineract.cn.cassandra.core.CassandraSessionProvider;
import org.apache.fineract.cn.cassandra.core.TenantAwareCassandraMapperProvider;
import org.apache.fineract.cn.cassandra.core.TenantAwareEntityTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;


@Component
public class AccessRights {

  public static final String TABLE_NAME = "access_rights";
  public static final String ID_COLUMN = "id";
  public static final String ROLE_ID_COLUMN = "role_id";
  //public static final String ACCESSRIGHTS_ID_COLUMN = "accessrights_id";
  public static final String CATEGORY_ID_COLUMN = "category_id";
  public static final String FUNCTIONAL_ID_COLUMN = "functional_id";
  public static final String RIGHTS = "rights";

  private final CassandraSessionProvider cassandraSessionProvider;
  private final TenantAwareEntityTemplate tenantAwareEntityTemplate;
  private final TenantAwareCassandraMapperProvider tenantAwareCassandraMapperProvider;
  private final Environment environment;
  private final UserMasterRepository userMasterRepository;

  @Autowired
  AccessRights(final CassandraSessionProvider cassandraSessionProvider,
               final Environment environment,
               final TenantAwareEntityTemplate tenantAwareEntityTemplate,
               final TenantAwareCassandraMapperProvider tenantAwareCassandraMapperProvider, UserMasterRepository userMasterRepository)
  {
    this.cassandraSessionProvider = cassandraSessionProvider;
    this.tenantAwareEntityTemplate = tenantAwareEntityTemplate;
    this.tenantAwareCassandraMapperProvider = tenantAwareCassandraMapperProvider;
    this.environment = environment;
    this.userMasterRepository = userMasterRepository;
  }

  public void buildTable() {
    final Create create = SchemaBuilder.createTable(TABLE_NAME)
        .ifNotExists()
        .addPartitionKey(ROLE_ID_COLUMN, DataType.text())
        .addColumn(CATEGORY_ID_COLUMN, DataType.text())
        .addColumn(FUNCTIONAL_ID_COLUMN, DataType.text())
       .addUDTListColumn(RIGHTS, SchemaBuilder.frozen(Permissions.TYPE_NAME));
    cassandraSessionProvider.getTenantSession().execute(create);

  }

  public void add(final AccessRightsEntity instance) {
    tenantAwareEntityTemplate.save(instance);
  }

  public void delete(final AccessRightsEntity instance) {

    tenantAwareEntityTemplate.delete(instance);
  }

  public boolean exists( final String userId, final String roleId) {
    return tenantAwareEntityTemplate.findById(AccessRightsEntity.class, userId, roleId).isPresent();
  }

  public Optional<AccessRightsEntity> get(final String identifier)
  {
    final AccessRightsEntity instance =
        tenantAwareCassandraMapperProvider.getMapper(AccessRightsEntity.class).get(identifier);

    if (instance != null) {
      Assert.notNull(instance.getRoleId());
    }
    return Optional.ofNullable(instance);
  }




  public List<AccessRightsEntity> getAll()
  {
    final Mapper<AccessRightsEntity> entityMapper = tenantAwareCassandraMapperProvider.getMapper(AccessRightsEntity.class);
    final Session tenantSession = cassandraSessionProvider.getTenantSession();

    final Statement statement = QueryBuilder.select().all().from(TABLE_NAME);

    return entityMapper.map(tenantSession.execute(statement)).all();
  }
}
