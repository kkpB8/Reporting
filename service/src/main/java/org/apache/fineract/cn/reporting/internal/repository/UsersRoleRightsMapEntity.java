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

import javax.persistence.*;

@Entity
@Cacheable(value = false)
@Table(name = UsersRoleRightsMapping.TABLE_NAME)
public class UsersRoleRightsMapEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = UsersRoleRightsMapping.ID_COLUMN, nullable = false)
  private Long id;

  @Column(name = UsersRoleRightsMapping.USERID_COLUMN)
  private String userId;

  @Column(name = UsersRoleRightsMapping.CATEGORYID_COLUMN)
  private String categoryId;

  @Column(name = UsersRoleRightsMapping.ROLEID_COLUMN)
  private String roleId;

  @Column(name = UsersRoleRightsMapping.STATE_ID_COLUMN)
  private Integer stateId;

  @Column(name = UsersRoleRightsMapping.DISTRICT_ID_COLUMN)
  private String districtId;

  @Column(name = UsersRoleRightsMapping.BLOCK_ID_COLUMN)
  private String blockId;

  @Column(name = UsersRoleRightsMapping.PANCHAYAT_ID_COLUMN)
  private String panchayatId;

  @Column(name = UsersRoleRightsMapping.VILLAGE_ID_COLUMN)
  private String villageId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

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

  public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  public String getDistrictId() {
    return districtId;
  }

  public void setDistrictId(String districtId) {
    this.districtId = districtId;
  }

  public String getBlockId() {
    return blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }

  public String getPanchayatId() {
    return panchayatId;
  }

  public void setPanchayatId(String panchayatId) {
    this.panchayatId = panchayatId;
  }

  public String getVillageId() {
    return villageId;
  }

  public void setVillageId(String villageId) {
    this.villageId = villageId;
  }
}
