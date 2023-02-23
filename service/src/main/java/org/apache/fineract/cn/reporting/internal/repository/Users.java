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

/**
 * @author Myrle Krantz
 */
@Component
public class Users {

  static final String TABLE_NAME = "users_master";
  static final String ID_COLUMN = "id";
  static final String IDENTIFIER_COLUMN = "user_id";
  static final String NAME_COLUMN = "user_name";
  static final String PASSWORD_COLUMN = "passwordWord";
  static final String PASSWORD_EXPIRES_ON_COLUMN = "password_expires_on";
  static final String SALT_COLUMN = "salt";
  static final String ITERATION_COUNT_COLUMN = "iteration_count";
  static final String MOBILE_NUMBER_COLUMN = "mobile_no";
  static final String EMAIL_ID_COLUMN = "email_id";
  static final String DESIGNATION_COLUMN = "designation";
  static final String STATUS_COLUMN = "status";
  static final String LAST_LOGIN_COLUMN = "last_login";
  static final String WRONG_LOGIN_ATTEMPS_COLUMN = "wrong_login_attemps";
  static final String LAST_WRONG_LOGIN_ATTEMP_ON_COLUMN = "last_wrong_login_attemp_on";
  static final String USER_LOCKED_DURATION_COLUMN = "user_locked_duration";
  static final String TENANT_ID_COLUMN = "tenant_id";
  static final String USERROLERIGHTSMAPID_COLUMN = "user_role_rights_map_id";
  static final String CREATED_BY_COLUMN = "created_by";
  static final String CREATED_ON_COLUMN = "created_on";
  static final String LAST_MODIFIED_ON_COLUMN = "last_modified_on";
  static final String LAST_MODIFIED_BY_COLUMN = "last_modified_by";


}
