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

/**
 * @Microware
 */
@Component
public class UsersRoleRightsMapping {

  public static final String TABLE_NAME = "user_role_rights_map";
  public static final String ID_COLUMN = "id";
  public static final String USERID_COLUMN = "user_id";
  public static final String ROLEID_COLUMN = "role_id";
  public static final String CATEGORYID_COLUMN = "category_id";
  public static final String STATE_ID_COLUMN = "state_id";
  public static final String DISTRICT_ID_COLUMN = "district_id";
  public static final String BLOCK_ID_COLUMN = "block_id";
  public static final String PANCHAYAT_ID_COLUMN = "panchayat_id";
  public static final String VILLAGE_ID_COLUMN = "village_id";

  private final CassandraSessionProvider cassandraSessionProvider;
  private final TenantAwareEntityTemplate tenantAwareEntityTemplate;
  private final TenantAwareCassandraMapperProvider tenantAwareCassandraMapperProvider;
  private final Environment environment;
  private final UserMasterRepository userMasterRepository;

  @Autowired
  UsersRoleRightsMapping(final CassandraSessionProvider cassandraSessionProvider,
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
            .addPartitionKey(USERID_COLUMN, DataType.text())
            .addClusteringColumn(ROLEID_COLUMN, DataType.text())
            .addColumn(CATEGORYID_COLUMN, DataType.text())
            .addColumn(STATE_ID_COLUMN, DataType.cint())
            .addColumn(DISTRICT_ID_COLUMN, DataType.text())
            .addColumn(BLOCK_ID_COLUMN, DataType.text())
            .addColumn(PANCHAYAT_ID_COLUMN, DataType.text())
            .addColumn(VILLAGE_ID_COLUMN, DataType.text());
    cassandraSessionProvider.getTenantSession().execute(create);
  }

  public void add(final UserRoleRightsMapEntity instance) {
    tenantAwareEntityTemplate.save(instance);
  }

  public void delete(final UserRoleRightsMapEntity instance) {
    tenantAwareEntityTemplate.delete(instance);
  }


  public Optional<UserRoleRightsMapEntity> get(final String identifier)
  {
    final UserRoleRightsMapEntity instance =
            tenantAwareCassandraMapperProvider.getMapper(UserRoleRightsMapEntity.class).get(identifier);

    if (instance != null) {
      Assert.notNull(instance.getUserId());
    }

    return Optional.ofNullable(instance);
  }

  public Optional<UserRoleRightsMapEntity> get(final String userId, final String roleId)
  {
    final UserRoleRightsMapEntity entity =
            tenantAwareCassandraMapperProvider.getMapper(UserRoleRightsMapEntity.class).get(userId, roleId);

    if (entity != null) {
      Assert.notNull(entity.getUserId());
      Assert.notNull(entity.getRoleId());
    }
    return Optional.ofNullable(entity);
  }

  public List<UserRoleRightsMapEntity> getAllForUser(final String userId) {
    final Mapper<UserRoleRightsMapEntity> entityMapper = tenantAwareCassandraMapperProvider.getMapper(UserRoleRightsMapEntity.class);
    final Session tenantSession = cassandraSessionProvider.getTenantSession();

    final Statement statement = QueryBuilder.select().from(TABLE_NAME).where(QueryBuilder.eq(USERID_COLUMN, userId));

    return entityMapper.map(tenantSession.execute(statement)).all();
  }

  public List<UserRoleRightsMapEntity> getAll()
  {
    final Mapper<UserRoleRightsMapEntity> entityMapper = tenantAwareCassandraMapperProvider.getMapper(UserRoleRightsMapEntity.class);
    final Session tenantSession = cassandraSessionProvider.getTenantSession();

    final Statement statement = QueryBuilder.select().all().from(TABLE_NAME);

    return entityMapper.map(tenantSession.execute(statement)).all();
  }
}
