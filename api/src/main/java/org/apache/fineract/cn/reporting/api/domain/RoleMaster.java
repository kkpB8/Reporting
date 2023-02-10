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
package org.apache.fineract.cn.reporting.api.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class RoleMaster {


  @NotBlank
  @Length(min = 1, max = 30)
  private String roleId;
  @Length(min = 1, max = 50)
  private String roleName;
  @Length(min = 1, max = 3)
  private String CategoryId;
  @Length(min = 1, max = 3)
  private String LevelId;
  @Length(min = 1, max = 3)
  private String TypeId;
  @Length(min = 1, max = 2)
  private String status;
  private String createOn;
  private String createdBy;

  public RoleMaster() {
    super();
  }

  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public String getCategoryId() {
    return CategoryId;
  }

  public void setCategoryId(String categoryId) {
    CategoryId = categoryId;
  }

  public String getLevelId() {
    return LevelId;
  }

  public void setLevelId(String levelId) {
    LevelId = levelId;
  }

  public String getTypeId() {
    return TypeId;
  }

  public void setTypeId(String typeId) {
    TypeId = typeId;
  }

  public String getCreateOn() {
    return createOn;
  }

  public void setCreateOn(String createOn) {
    this.createOn = createOn;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  /*public String getStatus() {
    return this.status.name();
  }

  public void setStatus(final String status) {
    this.status = Status.valueOf(status);
  }*/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public enum Status {
    PENDING,
    ACTIVE,
    CLOSED
  }
}
