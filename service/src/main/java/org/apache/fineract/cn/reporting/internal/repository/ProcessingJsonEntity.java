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
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Cacheable(value = false)
@Table(name = "processing_json")
public class ProcessingJsonEntity {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id;
    @Column(name = "json")
    private String json;
    @Column(name = "files")
    private String files;
    @Column(name = "parameter")
    private String parameter;
    @Column(name = "start_time")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime startTime;
    @Column(name = "end_time")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime endTime;
    @Column(name = "created_date")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime createdDate;
    @Column(name = "flag")
    private Short flag;
    @Column(name = "cbo_type")
    private Short cboType;
    @Column(name = "transaction_id")
    private String transactionId  ;
    @Column(name = "user_id")
    private String userId  ;
    @Column(name = "role")
    private String role  ;

    public static Short noReadFlag=1;
    public static Short processingFlag=2;
    public static Short executedFlag=3;

    public static Integer autoInc=1;

    public BigInteger getId() {
        return id;
    }

    public void setId(final BigInteger id) {
        this.id = id;
    }

    public String getJson() {
        return json;
    }

    public void setJson(final String json) {
        this.json = json;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(final String files) {
        this.files = files;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(final String parameter) {
        this.parameter = parameter;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(final LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(final LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(final Short flag) {
        this.flag = flag;
    }

    public Short getCboType() {
        return cboType;
    }

    public void setCboType(final Short cboType) {
        this.cboType = cboType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

