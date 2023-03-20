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

import java.math.BigInteger;

public class GeographicalCoverageRequest {
private String loctype;
private String dto;
private String dfrom;
private String sid;
private String did;
private String bid;
private String pid;

private Integer totalRuralHouseholds;

private Integer targetRuralHouseholds;

private Integer shg_mem;

   public String getLoctype() {
      return loctype;
   }

   public void setLoctype(String loctype) {
      this.loctype = loctype;
   }

   public String getDto() {
      return dto;
   }

   public void setDto(String dto) {
      this.dto = dto;
   }

   public String getDfrom() {
      return dfrom;
   }

   public void setDfrom(String dfrom) {
      this.dfrom = dfrom;
   }

   public String getSid() {
      return sid;
   }

   public void setSid(String sid) {
      this.sid = sid;
   }

   public String getDid() {
      return did;
   }

   public void setDid(String did) {
      this.did = did;
   }

   public String getBid() {
      return bid;
   }

   public void setBid(String bid) {
      this.bid = bid;
   }

   public String getPid() {
      return pid;
   }

   public void setPid(String pid) {
      this.pid = pid;
   }

   public Integer getTotalRuralHouseholds() {
      return totalRuralHouseholds;
   }

   public void setTotalRuralHouseholds(Integer totalRuralHouseholds) {
      this.totalRuralHouseholds = totalRuralHouseholds;
   }

   public Integer getTargetRuralHouseholds() {
      return targetRuralHouseholds;
   }

   public void setTargetRuralHouseholds(Integer targetRuralHouseholds) {
      this.targetRuralHouseholds = targetRuralHouseholds;
   }

   public Integer getShg_mem() {
      return shg_mem;
   }

   public void setShg_mem(Integer shg_mem) {
      this.shg_mem = shg_mem;
   }
}
