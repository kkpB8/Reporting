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

public class MemberEducationReponse {
    private String sno;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(String district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getBlock_id() {
        return block_id;
    }

    public void setBlock_id(String block_id) {
        this.block_id = block_id;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public String getTotal_shg() {
        return total_shg;
    }

    public void setTotal_shg(String total_shg) {
        this.total_shg = total_shg;
    }

    public String getTotal_shg_members() {
        return total_shg_members;
    }

    public void setTotal_shg_members(String total_shg_members) {
        this.total_shg_members = total_shg_members;
    }

    public String getIlliterate() {
        return illiterate;
    }

    public void setIlliterate(String illiterate) {
        this.illiterate = illiterate;
    }

    public String getFunctional() {
        return functional;
    }

    public void setFunctional(String functional) {
        this.functional = functional;
    }

    public String getPrimary5() {
        return primary5;
    }

    public void setPrimary5(String primary5) {
        this.primary5 = primary5;
    }

    public String getMiddle8() {
        return middle8;
    }

    public void setMiddle8(String middle8) {
        this.middle8 = middle8;
    }

    public String getSecondary12() {
        return secondary12;
    }

    public void setSecondary12(String secondary12) {
        this.secondary12 = secondary12;
    }

    public String getVocationaltraining() {
        return vocationaltraining;
    }

    public void setVocationaltraining(String vocationaltraining) {
        this.vocationaltraining = vocationaltraining;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;
    private String block_id;
    private String block_name;
    private String total_shg;
    private String total_shg_members;
    private String illiterate;
    private String functional;
    private String primary5;
    private String middle8;
    private String secondary12;
    private String vocationaltraining;
    private String other;
}
