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


public class ShgReportResponseDto {
    String geolocation;
    Integer locationId;
    String locationName;
    Long totalShg;
    Long totalMappedShg;
    Long shgConductingMeeting;
    BigDecimal shgConductingMeetingPercent;

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Long getTotalShg() {
        return totalShg;
    }

    public void setTotalShg(Long totalShg) {
        this.totalShg = totalShg;
    }

    public Long getTotalMappedShg() {
        return totalMappedShg;
    }

    public void setTotalMappedShg(Long totalMappedShg) {
        this.totalMappedShg = totalMappedShg;
    }

    public Long getShgConductingMeeting() {
        return shgConductingMeeting;
    }

    public void setShgConductingMeeting(Long shgConductingMeeting) {
        this.shgConductingMeeting = shgConductingMeeting;
    }

    public BigDecimal getShgConductingMeetingPercent() {
        return shgConductingMeetingPercent;
    }

    public void setShgConductingMeetingPercent(BigDecimal shgConductingMeetingPercent) {
        this.shgConductingMeetingPercent = shgConductingMeetingPercent;
    }
}
