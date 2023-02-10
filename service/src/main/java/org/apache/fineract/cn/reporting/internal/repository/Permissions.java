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
import com.datastax.driver.core.schemabuilder.SchemaBuilder;
import org.apache.fineract.cn.cassandra.core.CassandraSessionProvider;
import org.apache.fineract.cn.cassandra.util.CodecRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Microware
 */
@Component
public class Permissions {

  static final String TYPE_NAME = "permission_master";
  static final String PERMITTABLE_GROUP_IDENTIFIER_FIELD = "permittable_group_id";
  static final String ALLOWED_OPERATIONS_FIELD = "allowed_operations";

  private final CassandraSessionProvider cassandraSessionProvider;
  private final Environment environment;
  @Autowired
  public Permissions(final CassandraSessionProvider cassandraSessionProvider, final Environment environment) {
    this.cassandraSessionProvider = cassandraSessionProvider;
    this.environment = environment;
  }

  @SuppressWarnings("unchecked")
  @PostConstruct
  public void initialize()
  {
    CodecRegistry.register(AllowedOperationType.getCodec());
  }

  public void buildType() {
    final String type_statement =
        SchemaBuilder.createType(TYPE_NAME)
            .ifNotExists()
            .addColumn(PERMITTABLE_GROUP_IDENTIFIER_FIELD, DataType.text())
            .addColumn(ALLOWED_OPERATIONS_FIELD, DataType.set(DataType.text()))
            .buildInternal();
    cassandraSessionProvider.getTenantSession().execute(type_statement);
  }
}
