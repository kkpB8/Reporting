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

public class VoAttendancePercentDto {
    String locationType;
    String locationId;
    String locationName;
    Long totalVo;
    Long fiftyPercent;
    Long fiftySeventy;
    Long seventyNinety;
    Long Ninety;

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
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

    public Long getTotalVo() {
        return totalVo;
    }

    public void setTotalVo(Long totalVo) {
        this.totalVo = totalVo;
    }

    public Long getFiftyPercent() {
        return fiftyPercent;
    }

    public void setFiftyPercent(Long fiftyPercent) {
        this.fiftyPercent = fiftyPercent;
    }

    public Long getFiftySeventy() {
        return fiftySeventy;
    }

    public void setFiftySeventy(Long fiftySeventy) {
        this.fiftySeventy = fiftySeventy;
    }

    public Long getSeventyNinety() {
        return seventyNinety;
    }

    public void setSeventyNinety(Long seventyNinety) {
        this.seventyNinety = seventyNinety;
    }

    public Long getNinety() {
        return Ninety;
    }

    public void setNinety(Long ninety) {
        Ninety = ninety;
    }
}
