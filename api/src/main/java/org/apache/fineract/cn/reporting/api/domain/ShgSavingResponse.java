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
import java.math.BigDecimal;
import java.math.BigInteger;


public class ShgSavingResponse {
    Integer locationId;
    String locationOrShgName;
    Integer numberOfShgOrMembers;
    BigInteger numberOfMeetingConducted;
    BigInteger expectedAmount;
    BigInteger amountCollected;
    Double percentOfCollection;
    BigInteger voluntarySavingAmount;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationOrShgName() {
        return locationOrShgName;
    }

    public void setLocationOrShgName(String locationOrShgName) {
        this.locationOrShgName = locationOrShgName;
    }

    public Integer getNumberOfShgOrMembers() {
        return numberOfShgOrMembers;
    }

    public void setNumberOfShgOrMembers(Integer numberOfShgOrMembers) {
        this.numberOfShgOrMembers = numberOfShgOrMembers;
    }

    public BigInteger getNumberOfMeetingConducted() {
        return numberOfMeetingConducted;
    }

    public void setNumberOfMeetingConducted(BigInteger numberOfMeetingConducted) {
        this.numberOfMeetingConducted = numberOfMeetingConducted;
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

    public Double getPercentOfCollection() {
        return percentOfCollection;
    }

    public void setPercentOfCollection(Double percentOfCollection) {
        this.percentOfCollection = percentOfCollection;
    }

    public BigInteger getVoluntarySavingAmount() {
        return voluntarySavingAmount;
    }

    public void setVoluntarySavingAmount(BigInteger voluntarySavingAmount) {
        this.voluntarySavingAmount = voluntarySavingAmount;
    }
}
