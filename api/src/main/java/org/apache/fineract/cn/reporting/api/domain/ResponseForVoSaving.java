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

public class ResponseForVoSaving {

        private Integer state;
        private Integer district;
        private Integer block;
        private Integer panchayat;
        private Integer noOfVos;
        private BigInteger voId;
        private BigInteger clfId;
        private Integer noOfMeetingsConducted;
        private Integer expectedAmount;
        private Integer amountCollected;
        private Integer noOfMembers;
        private  Integer noOfBeingMemberPenalised;
        private Integer totalPenaltyAmount;
        private Integer geographicalLevel;
        private String yearMonth;
        private BigInteger totalVoluntarySavingAmount;
        private Integer noOfMemberContributingVoluntary;
        private Integer noOfCompulsorySaved;

        public Integer getState() {
                return state;
        }

        public void setState(Integer state) {
                this.state = state;
        }

        public Integer getNoOfVos() {
                return noOfVos;
        }

        public void setNoOfVos(Integer noOfVos) {
                this.noOfVos = noOfVos;
        }

        public Integer getNoOfMeetingsConducted() {
                return noOfMeetingsConducted;
        }

        public void setNoOfMeetingsConducted(Integer noOfMeetingsConducted) {
                this.noOfMeetingsConducted = noOfMeetingsConducted;
        }

        public Integer getExpectedAmount() {
                return expectedAmount;
        }

        public void setExpectedAmount(Integer expectedAmount) {
                this.expectedAmount = expectedAmount;
        }

        public Integer getAmountCollected() {
                return amountCollected;
        }

        public void setAmountCollected(Integer amountCollected) {
                this.amountCollected = amountCollected;
        }


        public Integer getNoOfMembers() {
                return noOfMembers;
        }

        public void setNoOfMembers(Integer noOfMembers) {
                this.noOfMembers = noOfMembers;
        }



        public Integer getNoOfBeingMemberPenalised() {
                return noOfBeingMemberPenalised;
        }

        public void setNoOfBeingMemberPenalised(Integer noOfBeingMemberPenalised) {
                this.noOfBeingMemberPenalised = noOfBeingMemberPenalised;
        }

        public Integer getTotalPenaltyAmount() {
                return totalPenaltyAmount;
        }

        public void setTotalPenaltyAmount(Integer totalPenaltyAmount) {
                this.totalPenaltyAmount = totalPenaltyAmount;
        }

       /* public Integer getNoOfVOsByPercentageOfMembersSaving() {
                return noOfVOsByPercentageOfMembersSaving;
        }

        public void setNoOfVOsByPercentageOfMembersSaving(Integer noOfVOsByPercentageOfMembersSaving) {
                this.noOfVOsByPercentageOfMembersSaving = noOfVOsByPercentageOfMembersSaving;
        }*/

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

       /* public Integer getVillage() {
                return village;
        }

        public void setVillage(Integer village) {
                this.village = village;
        }*/

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

        public BigInteger getTotalVoluntarySavingAmount() {
                return totalVoluntarySavingAmount;
        }

        public void setTotalVoluntarySavingAmount(BigInteger totalVoluntarySavingAmount) {
                this.totalVoluntarySavingAmount = totalVoluntarySavingAmount;
        }

        public Integer getNoOfMemberContributingVoluntary() {
                return noOfMemberContributingVoluntary;
        }

        public void setNoOfMemberContributingVoluntary(Integer noOfMemberContributingVoluntary) {
                this.noOfMemberContributingVoluntary = noOfMemberContributingVoluntary;
        }

        public Integer getNoOfCompulsorySaved() {
                return noOfCompulsorySaved;
        }

        public void setNoOfCompulsorySaved(Integer noOfCompulsorySaved) {
                this.noOfCompulsorySaved = noOfCompulsorySaved;
        }

    public Integer getGeographicalLevel() {
        return geographicalLevel;
    }

    public void setGeographicalLevel(Integer geographicalLevel) {
        this.geographicalLevel = geographicalLevel;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }
}


