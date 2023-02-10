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

public class BankWiseCboAccountResponse {
    private String sno;
    private String banktypeid;
    private String bank_type;
    private String bank_code;
    private String bank_name;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getBanktypeid() {
        return banktypeid;
    }

    public void setBanktypeid(String banktypeid) {
        this.banktypeid = banktypeid;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getNoofshg() {
        return noofshg;
    }

    public void setNoofshg(String noofshg) {
        this.noofshg = noofshg;
    }

    public String getNoofvo() {
        return noofvo;
    }

    public void setNoofvo(String noofvo) {
        this.noofvo = noofvo;
    }

    public String getNoofclf() {
        return noofclf;
    }

    public void setNoofclf(String noofclf) {
        this.noofclf = noofclf;
    }

    public String getNoof() {
        return noof;
    }

    public void setNoof(String noof) {
        this.noof = noof;
    }

    private String branch_code;
    private String branch_name;
    private String noofshg;
    private String noofvo;
    private String noofclf;
    private String noof;

}
