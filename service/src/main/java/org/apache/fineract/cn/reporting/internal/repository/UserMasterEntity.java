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

import org.apache.fineract.cn.postgresql.util.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Cacheable(value = false)
@Table(name = Users.TABLE_NAME)
public class UserMasterEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = Users.ID_COLUMN)
  private Long id;
  @Column(name = Users.IDENTIFIER_COLUMN)
  private String userId;
  @Column(name = Users.NAME_COLUMN)
  private String userName;
  @Column(name = Users.PASSWORD_COLUMN)
  private byte[] passwordWord;
  @Column(name = Users.SALT_COLUMN)
  private byte[] salt;
  @Column(name = Users.ITERATION_COUNT_COLUMN )
  private Integer iterationCount;
  @Column(name = Users.PASSWORD_EXPIRES_ON_COLUMN)
  private Date passwordExpiresOn;
  @Column(name = Users.MOBILE_NUMBER_COLUMN)
  private String mobileNo;
  @Column(name = Users.EMAIL_ID_COLUMN)
  private String emailId;
  @Column(name = Users.DESIGNATION_COLUMN)
  private String designation;
  @Column(name = Users.STATUS_COLUMN)
  private String status;
  @Column(name = Users.LAST_LOGIN_COLUMN)
  @Convert(converter = LocalDateTimeConverter.class)
  private LocalDateTime lastLogin;
  @Column(name = Users.WRONG_LOGIN_ATTEMPS_COLUMN)
  private int wrongLoginAttemps;
  @Column(name = Users.LAST_WRONG_LOGIN_ATTEMP_ON_COLUMN)
  @Convert(converter = LocalDateTimeConverter.class)
  private LocalDateTime lastWrongLoginAttempOn;
  @Column(name = Users.USER_LOCKED_DURATION_COLUMN)
  @Convert(converter = LocalDateTimeConverter.class)
  private LocalDateTime userLockedDuration;
  @Column(name = Users.TENANT_ID_COLUMN)
  private String tenantId;
  @Column(name = Users.CREATED_ON_COLUMN, nullable = false)
  @Convert(converter = LocalDateTimeConverter.class)
  private LocalDateTime createdOn;
  @Column(name = Users.CREATED_BY_COLUMN, nullable = false)
  private String createdBy;
  @Column(name = Users.LAST_MODIFIED_ON_COLUMN)
  @Convert(converter = LocalDateTimeConverter.class)
  private LocalDateTime lastModifiedOn;
  @Column(name = Users.LAST_MODIFIED_BY_COLUMN)
  private String lastModifiedBy;
  public byte[] getPasswordWord() {
    return passwordWord;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setPasswordWord(byte[] passwordWord) {
    this.passwordWord = passwordWord;
  }

  public UserMasterEntity() {
    super();
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public LocalDateTime getUserLockedDuration() {
    return userLockedDuration;
  }

  public void setUserLockedDuration(LocalDateTime userLockedDuration) {
    this.userLockedDuration = userLockedDuration;
  }

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Date getPasswordExpiresOn() {
    return passwordExpiresOn;
  }

  public byte[] getSalt() {
    return salt;
  }

  public void setSalt(byte[] salt) {
    this.salt = salt;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setPasswordExpiresOn(Date passwordExpiresOn) {
    this.passwordExpiresOn = passwordExpiresOn;
  }

  public Integer getIterationCount() {
    return iterationCount;
  }

  public void setIterationCount(Integer iterationCount) {
    this.iterationCount = iterationCount;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LocalDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(LocalDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public LocalDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(LocalDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public int getWrongLoginAttemps() {
    return wrongLoginAttemps;
  }

  public void setWrongLoginAttemps(int wrongLoginAttemps) {
    this.wrongLoginAttemps = wrongLoginAttemps;
  }

  public LocalDateTime getLastWrongLoginAttempOn() {
    return lastWrongLoginAttempOn;
  }

  public void setLastWrongLoginAttempOn(LocalDateTime lastWrongLoginAttempOn) {
    this.lastWrongLoginAttempOn = lastWrongLoginAttempOn;
  }
}
