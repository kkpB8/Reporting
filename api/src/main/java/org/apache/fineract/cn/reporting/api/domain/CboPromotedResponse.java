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

public class CboPromotedResponse {
    private String sno;
    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;
    private String block_id;
    private String block_name;
    private String total_shg;
    private String target_shg_members;
    private String total_vo;
    private String total_vo_shg;
    private String total_vo_members;
    private String total_clf;
    private String total_clf_shg;
    private String total_clf_memebers;

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

    public String getTarget_shg_members() {
        return target_shg_members;
    }

    public void setTarget_shg_members(String target_shg_members) {
        this.target_shg_members = target_shg_members;
    }

    public String getTotal_vo() {
        return total_vo;
    }

    public void setTotal_vo(String total_vo) {
        this.total_vo = total_vo;
    }

    public String getTotal_vo_shg() {
        return total_vo_shg;
    }

    public void setTotal_vo_shg(String total_vo_shg) {
        this.total_vo_shg = total_vo_shg;
    }

    public String getTotal_vo_members() {
        return total_vo_members;
    }

    public void setTotal_vo_members(String total_vo_members) {
        this.total_vo_members = total_vo_members;
    }

    public String getTotal_clf() {
        return total_clf;
    }

    public void setTotal_clf(String total_clf) {
        this.total_clf = total_clf;
    }

    public String getTotal_clf_shg() {
        return total_clf_shg;
    }

    public void setTotal_clf_shg(String total_clf_shg) {
        this.total_clf_shg = total_clf_shg;
    }

    public String getTotal_clf_memebers() {
        return total_clf_memebers;
    }

    public void setTotal_clf_memebers(String total_clf_memebers) {
        this.total_clf_memebers = total_clf_memebers;
    }


}
