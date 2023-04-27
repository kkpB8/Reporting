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

public class TransactionSummaryRequest {

    private String fromDate;

    private String toDate;

    private BigInteger shgId;

    private BigInteger voId;

    private BigInteger clfId;

    private Integer stateId;

    private Integer districtId;

    private Integer blockId;

    private Integer panchayatId;

    private Integer villageId;

    private Integer geoGraphicalLevel;

    private Integer flag;

    private String qtrhalfYearFlag;

    private String year;


    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Integer getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Integer panchayatId) {
        this.panchayatId = panchayatId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public BigInteger getShgId() {
        return shgId;
    }

    public void setShgId(BigInteger shgId) {
        this.shgId = shgId;
    }

    public BigInteger getVoId() {
        return voId;
    }

    public void setVoId(BigInteger voId) {
        this.voId = voId;
    }

    public BigInteger getClfId() {
        return clfId;
    }

    public void setClfId(BigInteger clfId) {
        this.clfId = clfId;
    }

    public Integer getGeoGraphicalLevel() {
        return geoGraphicalLevel;
    }

    public void setGeoGraphicalLevel(Integer geoGraphicalLevel) {
        this.geoGraphicalLevel = geoGraphicalLevel;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getQtrhalfYearFlag() {
        return qtrhalfYearFlag;
    }

    public void setQtrhalfYearFlag(String qtrhalfYearFlag) {
        this.qtrhalfYearFlag = qtrhalfYearFlag;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
