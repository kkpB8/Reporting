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

public class ShgMeetingRegularityResponseDto {
    String shgName;
    Integer meetingFrequency;
    Integer totalMeetingToBeConducted;
    Long totalConductedMeeting;

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public Integer getMeetingFrequency() {
        return meetingFrequency;
    }

    public void setMeetingFrequency(Integer meetingFrequency) {
        this.meetingFrequency = meetingFrequency;
    }

    public Integer getTotalMeetingToBeConducted() {
        return totalMeetingToBeConducted;
    }

    public void setTotalMeetingToBeConducted(Integer totalMeetingToBeConducted) {
        this.totalMeetingToBeConducted = totalMeetingToBeConducted;
    }

    public Long getTotalConductedMeeting() {
        return totalConductedMeeting;
    }

    public void setTotalConductedMeeting(Long totalConductedMeeting) {
        this.totalConductedMeeting = totalConductedMeeting;
    }
}
