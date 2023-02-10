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

public class ResponseForShgSaving {

    private Integer state;

    private Integer noOfShgs;

    private Integer noOfMeetingsConducted;

    private Integer expectedAmount;

    private Integer amountCollected;

    private Integer percentageOfCollection;

    private Integer voluntarySavingAmountReceived;

    private String shgName;

    private Integer noOfMembers;

    private Integer amountReceived;

    private  Integer noOfMembersBeingPenalised;

    private Integer totalPenaltyAmount;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getNoOfShgs() {
        return noOfShgs;
    }

    public void setNoOfShgs(Integer noOfShgs) {
        this.noOfShgs = noOfShgs;
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

    public Integer getPercentageOfCollection() {
        return percentageOfCollection;
    }

    public void setPercentageOfCollection(Integer percentageOfCollection) {
        this.percentageOfCollection = percentageOfCollection;
    }

    public Integer getVoluntarySavingAmountReceived() {
        return voluntarySavingAmountReceived;
    }

    public void setVoluntarySavingAmountReceived(Integer voluntarySavingAmountReceived) {
        this.voluntarySavingAmountReceived = voluntarySavingAmountReceived;
    }

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public Integer getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(Integer noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public Integer getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(Integer amountReceived) {
        this.amountReceived = amountReceived;
    }

    public Integer getNoOfMembersBeingPenalised() {
        return noOfMembersBeingPenalised;
    }

    public void setNoOfMembersBeingPenalised(Integer noOfMembersBeingPenalised) {
        this.noOfMembersBeingPenalised = noOfMembersBeingPenalised;
    }

    public Integer getTotalPenaltyAmount() {
        return totalPenaltyAmount;
    }

    public void setTotalPenaltyAmount(Integer totalPenaltyAmount) {
        this.totalPenaltyAmount = totalPenaltyAmount;
    }
}
