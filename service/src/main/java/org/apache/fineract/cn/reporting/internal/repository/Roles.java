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

import org.springframework.stereotype.Component;


@Component
public class Roles {
  static final String TABLE_NAME = "roles_master";
  static final String ID_COLUMN = "id";
  static final String IDENTIFIER_COLUMN = "role_id";
  static final String NAME_COLUMN = "role_name";
  static final String USER_CATEGORYID_COLUMN = "category_id";
  static final String USER_LEVELID_COLUMN = "level_Id";
  static final String USER_TYPEID_COLUMN = "type_Id";
  static final String STATUS_COLUMN = "status";
  static final String CREATED_ON_COLUMN = "created_on";
  static final String CREATED_BY_COLUMN = "created_by";



}
