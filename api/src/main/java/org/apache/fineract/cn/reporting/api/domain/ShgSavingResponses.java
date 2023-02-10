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


public class ShgSavingResponses {
    private Integer state;
    private Integer district;
    private Integer block;
    private Integer panchayat;
    private Integer village;
    private Integer shg;
    private BigInteger vo;
    private BigInteger clf;
    private Integer geographicalRegion;
    private String yearMonth;
    private Integer noOfShgs;
    private Integer noOfMembers;
    private BigInteger expectedAmount;
    private BigInteger amountCollected;
    private BigInteger voluntarySaving;
    private  Integer numberOfMemberPenalised;
    private  Integer totalPenaltyAmount;
    private  Integer numberOfMeetingConducted;
    private  Integer numberOfMemberContributingVoluntary;
    private  Integer numberOfCompulsorySaved;

    public Integer getNumberOfMeetingConducted() {
        return numberOfMeetingConducted;
    }

    public void setNumberOfMeetingConducted(Integer numberOfMeetingConducted) {
        this.numberOfMeetingConducted = numberOfMeetingConducted;
    }

    public Integer getNumberOfMemberContributingVoluntary() {
        return numberOfMemberContributingVoluntary;
    }

    public void setNumberOfMemberContributingVoluntary(Integer numberOfMemberContributingVoluntary) {
        this.numberOfMemberContributingVoluntary = numberOfMemberContributingVoluntary;
    }

    public Integer getNumberOfCompulsorySaved() {
        return numberOfCompulsorySaved;
    }

    public void setNumberOfCompulsorySaved(Integer numberOfCompulsorySaved) {
        this.numberOfCompulsorySaved = numberOfCompulsorySaved;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getPanchayat() {
        return panchayat;
    }

    public void setPanchayat(Integer panchayat) {
        this.panchayat = panchayat;
    }

    public Integer getVillage() {
        return village;
    }

    public void setVillage(Integer village) {
        this.village = village;
    }

    public Integer getShg() {
        return shg;
    }

    public void setShg(Integer shg) {
        this.shg = shg;
    }

    public BigInteger getVo() {
        return vo;
    }

    public void setVo(BigInteger vo) {
        this.vo = vo;
    }

    public BigInteger getClf() {
        return clf;
    }

    public void setClf(BigInteger clf) {
        this.clf = clf;
    }

    public Integer getGeographicalRegion() {
        return geographicalRegion;
    }

    public void setGeographicalRegion(Integer geographicalRegion) {
        this.geographicalRegion = geographicalRegion;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getNoOfShgs() {
        return noOfShgs;
    }

    public void setNoOfShgs(Integer noOfShgs) {
        this.noOfShgs = noOfShgs;
    }

    public Integer getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(Integer noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public BigInteger getExpectedAmount() {
        return expectedAmount;
    }

    public void setExpectedAmount(BigInteger expectedAmount) {
        this.expectedAmount = expectedAmount;
    }

    public BigInteger getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(BigInteger amountCollected) {
        this.amountCollected = amountCollected;
    }

    public BigInteger getVoluntarySaving() {
        return voluntarySaving;
    }

    public void setVoluntarySaving(BigInteger voluntarySaving) {
        this.voluntarySaving = voluntarySaving;
    }

    public Integer getNumberOfMemberPenalised() {
        return numberOfMemberPenalised;
    }

    public void setNumberOfMemberPenalised(Integer numberOfMemberPenalised) {
        this.numberOfMemberPenalised = numberOfMemberPenalised;
    }

    public Integer getTotalPenaltyAmount() {
        return totalPenaltyAmount;
    }

    public void setTotalPenaltyAmount(Integer totalPenaltyAmount) {
        this.totalPenaltyAmount = totalPenaltyAmount;
    }
}
