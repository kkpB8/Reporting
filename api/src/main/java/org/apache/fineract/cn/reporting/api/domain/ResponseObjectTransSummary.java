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

public class ResponseObjectTransSummary {

    private Integer state_id;
    private Integer district_id;
    private Integer block_id;
    private Integer panchayat_id;
    private Integer village_id;
    private BigInteger shg_id;
    private BigInteger  vo_id;
    private BigInteger clf_id;
    private String  year_month;
    private Integer geographical_level;
    private Integer total_shg;
    private Integer total_shg_member;
    private Integer total_meeting_conducted;
    private Integer total_savings_collection_compulsory_expected;
    private Integer total_actual_compulsory_savings;
    private Integer total_actual_voluntary_savings;
    private Integer number_of_member_contributing_voluntary;
    private Integer number_of_member_penalised;
    private Integer total_penality;
    private Integer memberpenaltylist;
    private Integer no_of_members_saved_comp;
    private Integer total_members_availing_loans;
    private Integer total_number_of_loans;
    private BigInteger total_amount_of_loans;
    private Integer total_loans_lt_20k;
    private Integer total_loans_20k_50k;
    private Integer total_loans_50k_1lac;
    private Integer total_loans_1lac_2lac50k;
    private Integer total_loans_2lac50k_5lac;
    private Integer total_loans_5lac_10lac;
    private Integer total_loans_gt_10lac;
    private Integer total_consumptions_loans;
    private BigInteger total_amount_of_consumptions_loans;
    private Integer total_agriculture_loans;
    private BigInteger total_amount_of_agriculture_loans;
    private Integer total_livestock_fisheries_loans;
    private BigInteger total_amount_of_livestock_fisheries_loans;
    private Integer total_ntfp_loans;
    private BigInteger total_amount_of_ntfp_loans;
    private Integer total_non_farm_loans;
    private BigInteger total_amount_of_non_farm_loans;
    private Integer total_loans_demanded;
    private Integer total_loans_supplied_same_day;
    private Integer total_loans_supplied_lt_1w;
    private Integer total_loans_supplied_1w_2w;
    private Integer total_loans_supplied_1_2month;
    private Integer total_loans_supplied_2_3month;
    private Integer total_loans_supplied_gt_3month;
    private BigInteger total_loans_principle_demand;
    private BigInteger total_loans_repaid;
    private Integer total_loans_repayment_within_period;
    private Integer total_loans_repayment_1month_delay;
    private Integer total_loans_repayment_2month_delay;
    private Integer total_loans_repayment_3month_delay;
    private Integer total_loans_repayment_gt_3month_delay;
    private Integer no_cbo_who_conducted_mtg;
    private Integer no_meeting_scheduled;
    private Integer total_attendance_in_mtg;

    public Integer getState_id() {
        return state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    public Integer getBlock_id() {
        return block_id;
    }

    public void setBlock_id(Integer block_id) {
        this.block_id = block_id;
    }

    public Integer getPanchayat_id() {
        return panchayat_id;
    }

    public void setPanchayat_id(Integer panchayat_id) {
        this.panchayat_id = panchayat_id;
    }

    public Integer getVillage_id() {
        return village_id;
    }

    public void setVillage_id(Integer village_id) {
        this.village_id = village_id;
    }

    public BigInteger getShg_id() {
        return shg_id;
    }

    public void setShg_id(BigInteger shg_id) {
        this.shg_id = shg_id;
    }

    public BigInteger getVo_id() {
        return vo_id;
    }

    public void setVo_id(BigInteger vo_id) {
        this.vo_id = vo_id;
    }

    public BigInteger getClf_id() {
        return clf_id;
    }

    public void setClf_id(BigInteger clf_id) {
        this.clf_id = clf_id;
    }

    public String getYear_month() {
        return year_month;
    }

    public void setYear_month(String year_month) {
        this.year_month = year_month;
    }

    public Integer getGeographical_level() {
        return geographical_level;
    }

    public void setGeographical_level(Integer geographical_level) {
        this.geographical_level = geographical_level;
    }

    public Integer getTotal_shg() {
        return total_shg;
    }

    public void setTotal_shg(Integer total_shg) {
        this.total_shg = total_shg;
    }

    public Integer getTotal_shg_member() {
        return total_shg_member;
    }

    public void setTotal_shg_member(Integer total_shg_member) {
        this.total_shg_member = total_shg_member;
    }

    public Integer getTotal_meeting_conducted() {
        return total_meeting_conducted;
    }

    public void setTotal_meeting_conducted(Integer total_meeting_conducted) {
        this.total_meeting_conducted = total_meeting_conducted;
    }

    public Integer getTotal_savings_collection_compulsory_expected() {
        return total_savings_collection_compulsory_expected;
    }

    public void setTotal_savings_collection_compulsory_expected(Integer total_savings_collection_compulsory_expected) {
        this.total_savings_collection_compulsory_expected = total_savings_collection_compulsory_expected;
    }

    public Integer getTotal_actual_compulsory_savings() {
        return total_actual_compulsory_savings;
    }

    public void setTotal_actual_compulsory_savings(Integer total_actual_compulsory_savings) {
        this.total_actual_compulsory_savings = total_actual_compulsory_savings;
    }

    public Integer getTotal_actual_voluntary_savings() {
        return total_actual_voluntary_savings;
    }

    public void setTotal_actual_voluntary_savings(Integer total_actual_voluntary_savings) {
        this.total_actual_voluntary_savings = total_actual_voluntary_savings;
    }

    public Integer getNumber_of_member_contributing_voluntary() {
        return number_of_member_contributing_voluntary;
    }

    public void setNumber_of_member_contributing_voluntary(Integer number_of_member_contributing_voluntary) {
        this.number_of_member_contributing_voluntary = number_of_member_contributing_voluntary;
    }

    public Integer getNumber_of_member_penalised() {
        return number_of_member_penalised;
    }

    public void setNumber_of_member_penalised(Integer number_of_member_penalised) {
        this.number_of_member_penalised = number_of_member_penalised;
    }

    public Integer getTotal_penality() {
        return total_penality;
    }

    public void setTotal_penality(Integer total_penality) {
        this.total_penality = total_penality;
    }

    public Integer getMemberpenaltylist() {
        return memberpenaltylist;
    }

    public void setMemberpenaltylist(Integer memberpenaltylist) {
        this.memberpenaltylist = memberpenaltylist;
    }

    public Integer getNo_of_members_saved_comp() {
        return no_of_members_saved_comp;
    }

    public void setNo_of_members_saved_comp(Integer no_of_members_saved_comp) {
        this.no_of_members_saved_comp = no_of_members_saved_comp;
    }

    public Integer getTotal_members_availing_loans() {
        return total_members_availing_loans;
    }

    public void setTotal_members_availing_loans(Integer total_members_availing_loans) {
        this.total_members_availing_loans = total_members_availing_loans;
    }

    public Integer getTotal_number_of_loans() {
        return total_number_of_loans;
    }

    public void setTotal_number_of_loans(Integer total_number_of_loans) {
        this.total_number_of_loans = total_number_of_loans;
    }

    public BigInteger getTotal_amount_of_loans() {
        return total_amount_of_loans;
    }

    public void setTotal_amount_of_loans(BigInteger total_amount_of_loans) {
        this.total_amount_of_loans = total_amount_of_loans;
    }

    public Integer getTotal_loans_lt_20k() {
        return total_loans_lt_20k;
    }

    public void setTotal_loans_lt_20k(Integer total_loans_lt_20k) {
        this.total_loans_lt_20k = total_loans_lt_20k;
    }

    public Integer getTotal_loans_20k_50k() {
        return total_loans_20k_50k;
    }

    public void setTotal_loans_20k_50k(Integer total_loans_20k_50k) {
        this.total_loans_20k_50k = total_loans_20k_50k;
    }

    public Integer getTotal_loans_50k_1lac() {
        return total_loans_50k_1lac;
    }

    public void setTotal_loans_50k_1lac(Integer total_loans_50k_1lac) {
        this.total_loans_50k_1lac = total_loans_50k_1lac;
    }

    public Integer getTotal_loans_1lac_2lac50k() {
        return total_loans_1lac_2lac50k;
    }

    public void setTotal_loans_1lac_2lac50k(Integer total_loans_1lac_2lac50k) {
        this.total_loans_1lac_2lac50k = total_loans_1lac_2lac50k;
    }

    public Integer getTotal_loans_2lac50k_5lac() {
        return total_loans_2lac50k_5lac;
    }

    public void setTotal_loans_2lac50k_5lac(Integer total_loans_2lac50k_5lac) {
        this.total_loans_2lac50k_5lac = total_loans_2lac50k_5lac;
    }

    public Integer getTotal_loans_5lac_10lac() {
        return total_loans_5lac_10lac;
    }

    public void setTotal_loans_5lac_10lac(Integer total_loans_5lac_10lac) {
        this.total_loans_5lac_10lac = total_loans_5lac_10lac;
    }

    public Integer getTotal_loans_gt_10lac() {
        return total_loans_gt_10lac;
    }

    public void setTotal_loans_gt_10lac(Integer total_loans_gt_10lac) {
        this.total_loans_gt_10lac = total_loans_gt_10lac;
    }

    public Integer getTotal_consumptions_loans() {
        return total_consumptions_loans;
    }

    public void setTotal_consumptions_loans(Integer total_consumptions_loans) {
        this.total_consumptions_loans = total_consumptions_loans;
    }

    public BigInteger getTotal_amount_of_consumptions_loans() {
        return total_amount_of_consumptions_loans;
    }

    public void setTotal_amount_of_consumptions_loans(BigInteger total_amount_of_consumptions_loans) {
        this.total_amount_of_consumptions_loans = total_amount_of_consumptions_loans;
    }

    public Integer getTotal_agriculture_loans() {
        return total_agriculture_loans;
    }

    public void setTotal_agriculture_loans(Integer total_agriculture_loans) {
        this.total_agriculture_loans = total_agriculture_loans;
    }

    public BigInteger getTotal_amount_of_agriculture_loans() {
        return total_amount_of_agriculture_loans;
    }

    public void setTotal_amount_of_agriculture_loans(BigInteger total_amount_of_agriculture_loans) {
        this.total_amount_of_agriculture_loans = total_amount_of_agriculture_loans;
    }

    public Integer getTotal_livestock_fisheries_loans() {
        return total_livestock_fisheries_loans;
    }

    public void setTotal_livestock_fisheries_loans(Integer total_livestock_fisheries_loans) {
        this.total_livestock_fisheries_loans = total_livestock_fisheries_loans;
    }

    public BigInteger getTotal_amount_of_livestock_fisheries_loans() {
        return total_amount_of_livestock_fisheries_loans;
    }

    public void setTotal_amount_of_livestock_fisheries_loans(BigInteger total_amount_of_livestock_fisheries_loans) {
        this.total_amount_of_livestock_fisheries_loans = total_amount_of_livestock_fisheries_loans;
    }

    public Integer getTotal_ntfp_loans() {
        return total_ntfp_loans;
    }

    public void setTotal_ntfp_loans(Integer total_ntfp_loans) {
        this.total_ntfp_loans = total_ntfp_loans;
    }

    public BigInteger getTotal_amount_of_ntfp_loans() {
        return total_amount_of_ntfp_loans;
    }

    public void setTotal_amount_of_ntfp_loans(BigInteger total_amount_of_ntfp_loans) {
        this.total_amount_of_ntfp_loans = total_amount_of_ntfp_loans;
    }

    public Integer getTotal_non_farm_loans() {
        return total_non_farm_loans;
    }

    public void setTotal_non_farm_loans(Integer total_non_farm_loans) {
        this.total_non_farm_loans = total_non_farm_loans;
    }

    public BigInteger getTotal_amount_of_non_farm_loans() {
        return total_amount_of_non_farm_loans;
    }

    public void setTotal_amount_of_non_farm_loans(BigInteger total_amount_of_non_farm_loans) {
        this.total_amount_of_non_farm_loans = total_amount_of_non_farm_loans;
    }

    public Integer getTotal_loans_demanded() {
        return total_loans_demanded;
    }

    public void setTotal_loans_demanded(Integer total_loans_demanded) {
        this.total_loans_demanded = total_loans_demanded;
    }

    public Integer getTotal_loans_supplied_same_day() {
        return total_loans_supplied_same_day;
    }

    public void setTotal_loans_supplied_same_day(Integer total_loans_supplied_same_day) {
        this.total_loans_supplied_same_day = total_loans_supplied_same_day;
    }

    public Integer getTotal_loans_supplied_lt_1w() {
        return total_loans_supplied_lt_1w;
    }

    public void setTotal_loans_supplied_lt_1w(Integer total_loans_supplied_lt_1w) {
        this.total_loans_supplied_lt_1w = total_loans_supplied_lt_1w;
    }

    public Integer getTotal_loans_supplied_1w_2w() {
        return total_loans_supplied_1w_2w;
    }

    public void setTotal_loans_supplied_1w_2w(Integer total_loans_supplied_1w_2w) {
        this.total_loans_supplied_1w_2w = total_loans_supplied_1w_2w;
    }

    public Integer getTotal_loans_supplied_1_2month() {
        return total_loans_supplied_1_2month;
    }

    public void setTotal_loans_supplied_1_2month(Integer total_loans_supplied_1_2month) {
        this.total_loans_supplied_1_2month = total_loans_supplied_1_2month;
    }

    public Integer getTotal_loans_supplied_2_3month() {
        return total_loans_supplied_2_3month;
    }

    public void setTotal_loans_supplied_2_3month(Integer total_loans_supplied_2_3month) {
        this.total_loans_supplied_2_3month = total_loans_supplied_2_3month;
    }

    public Integer getTotal_loans_supplied_gt_3month() {
        return total_loans_supplied_gt_3month;
    }

    public void setTotal_loans_supplied_gt_3month(Integer total_loans_supplied_gt_3month) {
        this.total_loans_supplied_gt_3month = total_loans_supplied_gt_3month;
    }

    public BigInteger getTotal_loans_principle_demand() {
        return total_loans_principle_demand;
    }

    public void setTotal_loans_principle_demand(BigInteger total_loans_principle_demand) {
        this.total_loans_principle_demand = total_loans_principle_demand;
    }

    public BigInteger getTotal_loans_repaid() {
        return total_loans_repaid;
    }

    public void setTotal_loans_repaid(BigInteger total_loans_repaid) {
        this.total_loans_repaid = total_loans_repaid;
    }

    public Integer getTotal_loans_repayment_within_period() {
        return total_loans_repayment_within_period;
    }

    public void setTotal_loans_repayment_within_period(Integer total_loans_repayment_within_period) {
        this.total_loans_repayment_within_period = total_loans_repayment_within_period;
    }

    public Integer getTotal_loans_repayment_1month_delay() {
        return total_loans_repayment_1month_delay;
    }

    public void setTotal_loans_repayment_1month_delay(Integer total_loans_repayment_1month_delay) {
        this.total_loans_repayment_1month_delay = total_loans_repayment_1month_delay;
    }

    public Integer getTotal_loans_repayment_2month_delay() {
        return total_loans_repayment_2month_delay;
    }

    public void setTotal_loans_repayment_2month_delay(Integer total_loans_repayment_2month_delay) {
        this.total_loans_repayment_2month_delay = total_loans_repayment_2month_delay;
    }

    public Integer getTotal_loans_repayment_3month_delay() {
        return total_loans_repayment_3month_delay;
    }

    public void setTotal_loans_repayment_3month_delay(Integer total_loans_repayment_3month_delay) {
        this.total_loans_repayment_3month_delay = total_loans_repayment_3month_delay;
    }

    public Integer getTotal_loans_repayment_gt_3month_delay() {
        return total_loans_repayment_gt_3month_delay;
    }

    public void setTotal_loans_repayment_gt_3month_delay(Integer total_loans_repayment_gt_3month_delay) {
        this.total_loans_repayment_gt_3month_delay = total_loans_repayment_gt_3month_delay;
    }

    public Integer getNo_cbo_who_conducted_mtg() {
        return no_cbo_who_conducted_mtg;
    }

    public void setNo_cbo_who_conducted_mtg(Integer no_cbo_who_conducted_mtg) {
        this.no_cbo_who_conducted_mtg = no_cbo_who_conducted_mtg;
    }

    public Integer getNo_meeting_scheduled() {
        return no_meeting_scheduled;
    }

    public void setNo_meeting_scheduled(Integer no_meeting_scheduled) {
        this.no_meeting_scheduled = no_meeting_scheduled;
    }

    public Integer getTotal_attendance_in_mtg() {
        return total_attendance_in_mtg;
    }

    public void setTotal_attendance_in_mtg(Integer total_attendance_in_mtg) {
        this.total_attendance_in_mtg = total_attendance_in_mtg;
    }
}
