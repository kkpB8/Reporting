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

public class ShgByEachTypeResponse {
    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;
    private String block_id;
    private String block_name;
    private String noofshg;
    private String noofwomanshg;
    private String noofpvtg;
    private String noofpwd;
    private String noofelderly;
    private String noofothers;
    private String total;

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

    public String getNoofshg() {
        return noofshg;
    }

    public void setNoofshg(String noofshg) {
        this.noofshg = noofshg;
    }

    public String getNoofwomanshg() {
        return noofwomanshg;
    }

    public void setNoofwomanshg(String noofwomanshg) {
        this.noofwomanshg = noofwomanshg;
    }

    public String getNoofpvtg() {
        return noofpvtg;
    }

    public void setNoofpvtg(String noofpvtg) {
        this.noofpvtg = noofpvtg;
    }

    public String getNoofpwd() {
        return noofpwd;
    }

    public void setNoofpwd(String noofpwd) {
        this.noofpwd = noofpwd;
    }

    public String getNoofelderly() {
        return noofelderly;
    }

    public void setNoofelderly(String noofelderly) {
        this.noofelderly = noofelderly;
    }

    public String getNoofothers() {
        return noofothers;
    }

    public void setNoofothers(String noofothers) {
        this.noofothers = noofothers;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }


}
