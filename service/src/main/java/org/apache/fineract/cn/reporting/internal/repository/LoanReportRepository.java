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
package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface LoanReportRepository  extends JpaRepository<LookUpMasterEntity, BigInteger> {

    @Query(nativeQuery = true,value= "select ts.state_id as State, ts.total_shg as noOfShgs, ts.total_shg_member as noOfMembers, ts.total_members_availing_loans as noOfMembersAvailingLoans,ts.total_number_of_loans as noOfLoans,ts.total_amount_of_loans as amountOfLoans ,ts.district_id as district,ts.block_id as block,ts.panchayat_id as panchayat ,ts.village_id as village,ts.total_consumptions_loans as totalConsumptionLoans,ts.total_amount_of_consumptions_loans as totalAmountOfConsumptionsLoans,ts.total_agriculture_loans as totalAgricultureLoans,ts.total_amount_of_agriculture_loans as totalAmountOfAgricultureLoans,ts.total_livestock_fisheries_loans as totalLivestockFisheriesLoans," +
            "ts.total_amount_of_livestock_fisheries_loans as totalAmountOfLivestockFisheries_loans,ts.total_ntfp_loans as totalNtfpLoans ,ts.total_amount_of_ntfp_loans as totalAmountNtfpLoans,ts.total_non_farm_loans as totalNonFarmLoans,ts.total_amount_of_non_farm_loans as totalAmountNonFarmLoans,ts.total_loans_lt_20k as totalLoansLt20k, ts.total_loans_20k_50k as totalLoans20kTo50K,ts.total_loans_50k_1lac as totalLoans50kTo1Lac, ts.total_loans_1lac_2lac50k as totalLoans1LacTo2Lac50k, ts.total_loans_2lac50k_5lac as totalLoans2Lac50kTo5Lac,ts.total_loans_5lac_10lac as totalLoans5LacTo10Lac,ts.total_loans_gt_10lac as totalLoansGt10Lac, ts.shg_id as shgId,ts.vo_id as voId,ts.clf_id as clfId," +
            "ts.total_loans_demanded as totalLoansDemanded ,ts.total_loans_supplied_same_day as totalLoansSuppliedSameDay, ts.total_loans_supplied_lt_1w as totalLoansSuppliedLtTo1w, ts.total_loans_supplied_1w_2w as totalLoansSupplied1wTo2w , ts.total_loans_supplied_1_2month as totalLoansSupplied1To2month,ts.total_loans_supplied_2_3month as totalLoansSupplied2To3Month,ts.total_loans_supplied_gt_3month as totalLoansSuppliedGt3Month,ts.total_loans_principle_demand as totalLoansPrincipleDemand,ts.total_loans_repaid as totalLoansRepaid,ts.total_loans_repayment_within_period as totalLoansRepaymentWithinPeriod,ts.total_loans_repayment_1month_delay as totalLoansRepayment1MonthDelay,ts.total_loans_repayment_2month_delay as totalLoansRepayment2MonthDelay,ts.total_loans_repayment_3month_delay as totalLoansRepayment3MonthDelay,ts.total_loans_repayment_gt_3month_delay as totalLoansRepaymentGt3MonthDelay,ts.year_month as yearMonth from "+
    "transaction_summary ts where (?1 = -1 or ts.state_id::int=?1) and (?2 =-1 or ts.district_id::int=?2) and (?3 =-1 or ts.block_id::int=?3) and (?4 =-1 or ts.panchayat_id::int=?4) and (?5 =-1 or ts.village_id::int=?5) and ts.year_month between ?6 and ?7 and (?8 = -1 or ts.shg_id = ?8) and (?9 = -1 or ts.vo_id = ?9) and (?10 = -1 or ts.clf_id = ?10) and (ts.geographical_level = ?11)")
    List<Object[]> getLoanShgReportDetails(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, String fromDate, String toDate, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel);
}
