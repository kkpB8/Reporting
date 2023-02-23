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

public class InactiveCbosResponse {
    private String sno;
    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;
    private String block_id;
    private String block_name;
    private String approved_shg;
    private String inactive_shg;
    private String inactive_shg_members;

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

    public String getApproved_shg() {
        return approved_shg;
    }

    public void setApproved_shg(String approved_shg) {
        this.approved_shg = approved_shg;
    }

    public String getInactive_shg() {
        return inactive_shg;
    }

    public void setInactive_shg(String inactive_shg) {
        this.inactive_shg = inactive_shg;
    }

    public String getInactive_shg_members() {
        return inactive_shg_members;
    }

    public void setInactive_shg_members(String inactive_shg_members) {
        this.inactive_shg_members = inactive_shg_members;
    }

    public String getApproved_vo() {
        return approved_vo;
    }

    public void setApproved_vo(String approved_vo) {
        this.approved_vo = approved_vo;
    }

    public String getInactive_vo() {
        return inactive_vo;
    }

    public void setInactive_vo(String inactive_vo) {
        this.inactive_vo = inactive_vo;
    }

    public String getApproved_clf() {
        return approved_clf;
    }

    public void setApproved_clf(String approved_clf) {
        this.approved_clf = approved_clf;
    }

    public String getInactive_clf() {
        return inactive_clf;
    }

    public void setInactive_clf(String inactive_clf) {
        this.inactive_clf = inactive_clf;
    }

    private String approved_vo;
    private String inactive_vo;
    private String approved_clf;
    private String inactive_clf;
}
