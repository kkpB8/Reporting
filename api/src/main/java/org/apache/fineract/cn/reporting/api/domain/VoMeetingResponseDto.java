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

public class VoMeetingResponseDto {
    String geolocation;
    String locationId;
    String locationName;
    Long totalvo;
    Long totalMappedvo;
    Long voconductingmeeting;
    BigDecimal voconductingmeetingpercent;

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Long getTotalvo() {
        return totalvo;
    }

    public void setTotalvo(Long totalvo) {
        this.totalvo = totalvo;
    }

    public Long getTotalMappedvo() {
        return totalMappedvo;
    }

    public void setTotalMappedvo(Long totalMappedvo) {
        this.totalMappedvo = totalMappedvo;
    }

    public Long getVoconductingmeeting() {
        return voconductingmeeting;
    }

    public void setVoconductingmeeting(Long voconductingmeeting) {
        this.voconductingmeeting = voconductingmeeting;
    }

    public BigDecimal getVoconductingmeetingpercent() {
        return voconductingmeetingpercent;
    }

    public void setVoconductingmeetingpercent(BigDecimal voconductingmeetingpercent) {
        this.voconductingmeetingpercent = voconductingmeetingpercent;
    }
}
