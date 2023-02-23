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

public class ShgLivelyHoodDetailsResponse {
    private String sno;
    private String state_id;

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

    public String getTotalshglivelthood() {
        return totalshglivelthood;
    }

    public void setTotalshglivelthood(String totalshglivelthood) {
        this.totalshglivelthood = totalshglivelthood;
    }

    public String getTotalshglivestock() {
        return totalshglivestock;
    }

    public void setTotalshglivestock(String totalshglivestock) {
        this.totalshglivestock = totalshglivestock;
    }

    public String getTotalshgntfp() {
        return totalshgntfp;
    }

    public void setTotalshgntfp(String totalshgntfp) {
        this.totalshgntfp = totalshgntfp;
    }

    public String getTotalshgagriculture() {
        return totalshgagriculture;
    }

    public void setTotalshgagriculture(String totalshgagriculture) {
        this.totalshgagriculture = totalshgagriculture;
    }

    public String getNonfarm() {
        return nonfarm;
    }

    public void setNonfarm(String nonfarm) {
        this.nonfarm = nonfarm;
    }

    private String state_name;
    private String district_id;
    private String district_name;
    private String block_id;
    private String block_name;
    private String total_shg;
    private String totalshglivelthood;
    private String totalshglivestock;
    private String totalshgntfp;
    private String totalshgagriculture;
    private String nonfarm;

}
