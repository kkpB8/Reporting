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

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.Frozen;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

import java.util.List;

@Table(name = AccessRights.TABLE_NAME)
public class AccessRightsEntity {
  @PartitionKey
  @Column(name = AccessRights.ROLE_ID_COLUMN)
  private String roleId;
  @Column(name = AccessRights.CATEGORY_ID_COLUMN)
  private String categoryId;
  @Column(name = AccessRights.FUNCTIONAL_ID_COLUMN)
  private String functionalId;
  @Frozen
  @Column(name = AccessRights.RIGHTS)
  private List<PermissionType> rights;

  public AccessRightsEntity() {}

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public String getFunctionalId() {
    return functionalId;
  }

  public void setFunctionalId(String functionalId) {
    this.functionalId = functionalId;
  }

  public void setRights(List<PermissionType> rights) {
    this.rights = rights;
  }

  public List<PermissionType> getRights() {
    return rights;
  }
}
