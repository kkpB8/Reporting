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

public class MemberBankAccountDetailsResponse {
    private String sno;
    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;
    private String block_id;
    private String block_name;
    private String total_member;
    private String total_members_account;

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

    public String getTotal_member() {
        return total_member;
    }

    public void setTotal_member(String total_member) {
        this.total_member = total_member;
    }

    public String getTotal_members_account() {
        return total_members_account;
    }

    public void setTotal_members_account(String total_members_account) {
        this.total_members_account = total_members_account;
    }

    public String getPer_members_account() {
        return per_members_account;
    }

    public void setPer_members_account(String per_members_account) {
        this.per_members_account = per_members_account;
    }

    public String getTotal_members_adhar() {
        return total_members_adhar;
    }

    public void setTotal_members_adhar(String total_members_adhar) {
        this.total_members_adhar = total_members_adhar;
    }

    public String getPer_members_adhar() {
        return per_members_adhar;
    }

    public void setPer_members_adhar(String per_members_adhar) {
        this.per_members_adhar = per_members_adhar;
    }

    public String getTotal_members_secc() {
        return total_members_secc;
    }

    public void setTotal_members_secc(String total_members_secc) {
        this.total_members_secc = total_members_secc;
    }

    public String getPer_members_secc() {
        return per_members_secc;
    }

    public void setPer_members_secc(String per_members_secc) {
        this.per_members_secc = per_members_secc;
    }

    private String per_members_account;
    private String total_members_adhar;
    private String per_members_adhar;
    private String total_members_secc;
    private String per_members_secc;

}
