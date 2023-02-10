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


public class ShgMeetingAttendenceResponseDto {
    String shgName;
    Long totalMember;
    Long totalConductedMeeting;
    Long totalAttendentMember;
    Double attendancePercent;

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public Long getTotalMember() {
        return totalMember;
    }

    public void setTotalMember(Long totalMember) {
        this.totalMember = totalMember;
    }

    public Long getTotalConductedMeeting() {
        return totalConductedMeeting;
    }

    public void setTotalConductedMeeting(Long totalConductedMeeting) {
        this.totalConductedMeeting = totalConductedMeeting;
    }

    public Long getTotalAttendentMember() {
        return totalAttendentMember;
    }

    public void setTotalAttendentMember(Long totalAttendentMember) {
        this.totalAttendentMember = totalAttendentMember;
    }

    public Double getAttendancePercent() {
        return attendancePercent;
    }

    public void setAttendancePercent(Double attendancePercent) {
        this.attendancePercent = attendancePercent;
    }
}
