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
import java.text.Bidi;
import java.util.List;

public interface ReportingSavingRepository extends JpaRepository<LookUpMasterEntity, BigInteger> {





    @Query(value="  select ssv.state_id,state_name_en,total_shg,sum(total_meeting_conducted) as total_meeting_conducted, " +
            "\t    cast(sum(total_savings_collection_compulsory_expected) as int8)  as total_savings_collection_compulsory_expected, " +
            "        cast(sum(total_actual_compulsory_savings) as int8)  as total_actual_compulsory_savings , " +
            "        cast(sum(total_actual_voluntary_savings) as int8) as  total_actual_voluntary_savings " +
            "         from transaction_summary ssv " +
            "         inner join state_master sm on sm.state_id =ssv.state_id " +
            "         where geographical_level=1 and  year_month between ?1 and ?2 " +
            "         group by ssv.state_id,state_name_en,total_shg ",nativeQuery=true)
    List<Object[]> getSavingState(String fromDate, String toDate);


@Query(value=" select ssv.district_id,dm.district_name_en,total_shg, " +
        "sum(total_meeting_conducted) as total_meeting_conducted, " +
        "cast(sum(total_savings_collection_compulsory_expected) as int8) as total_savings_collection_compulsory_expected, " +
        "cast(sum(total_actual_compulsory_savings) as int8) as total_actual_compulsory_savings, " +
        "cast(sum(total_actual_voluntary_savings) as int8)   as  total_actual_voluntary_savings " +
        "         from transaction_summary ssv  " +
        "         inner join district_master dm  on dm.district_id  =ssv.district_id  and dm.state_id=?1 " +
        "         where geographical_level=2 and  year_month between ?2 and ?3 " +
        "         group by dm.district_name_en,ssv.state_id,ssv.district_id ,total_shg",nativeQuery=true)
List<Object[]> getSavingDistrict(Integer stateId, String fromDate, String toDate);



    @Query(value=" select ssv.block_id,bm.block_name_en ,total_shg,sum(total_meeting_conducted) as total_meeting_conducted," +
            "cast(sum(total_savings_collection_compulsory_expected) as int8) as total_savings_collection_compulsory_expected, " +
            "cast(sum(total_actual_compulsory_savings) as int8)  as total_actual_compulsory_savings ," +
            "cast(sum(total_actual_voluntary_savings) as int8) as total_actual_voluntary_savings " +
            "         from transaction_summary ssv  " +
            "         inner join block_master bm  on bm.block_id  =ssv.block_id   and bm.district_id =?1 " +
            "         where geographical_level=3 and  year_month between ?2 and ?3 " +
            "         group by bm.block_name_en,ssv.state_id,ssv.district_id,ssv.block_id ,total_shg ",nativeQuery=true)
    List<Object[]> getSavingBlock(Integer districtId, String fromDate, String toDate);


    @Query(value="select ssv.panchayat_id,panchayat_name_en,total_shg,sum(total_meeting_conducted) as total_meeting_conducted," +
            "cast(sum(total_savings_collection_compulsory_expected) as int8) as total_savings_collection_compulsory_expected, " +
            "cast(sum(total_actual_compulsory_savings) as int8)  as total_actual_compulsory_savings ," +
            "cast(sum(total_actual_voluntary_savings) as int8) as  total_actual_voluntary_savings " +
            "         from transaction_summary ssv  " +
            "         inner join panchayat_master pm  on pm.panchayat_id  =ssv.panchayat_id and pm.block_id=?1 " +
            "         where geographical_level=4 and  year_month between ?2 and ?3 " +
            "         group by panchayat_name_en,ssv.state_id,ssv.district_id,ssv.block_id,ssv.panchayat_id,total_shg",nativeQuery=true)
    List<Object[]> getSavingPanChayat(Integer blockId, String fromDate, String toDate);


@Query(value="select ssv.village_id,village_name_en,total_shg,sum(total_meeting_conducted) as total_meeting_conducted," +
        "cast(sum(total_savings_collection_compulsory_expected) as int8) as  total_savings_collection_compulsory_expected, " +
        "cast(sum(total_actual_compulsory_savings) as int8) as total_actual_compulsory_savings ," +
        "cast(sum(total_actual_voluntary_savings) as int8) as    total_actual_voluntary_savings " +
        "         from transaction_summary ssv  " +
        "         inner join village_master vm  on vm.village_id  =ssv.village_id  and vm.panchayat_id=?1 " +
        "         where geographical_level=5 and  year_month between ?2 and ?3 " +
        "         group by village_name_en,ssv.state_id,ssv.district_id,ssv.block_id,ssv.panchayat_id,ssv.village_id,total_shg",nativeQuery=true)
List<Object[]> getSavingVillage(Integer panchayatId, String fromDate, String toDate);


    @Query(value="select ssv.shg_id,sp.shg_name,total_shg_member,sum(total_meeting_conducted)as total_meeting_conducted," +
            "cast(sum(total_savings_collection_compulsory_expected) as int8) as total_savings_collection_compulsory_expected, " +
            "cast(sum(total_actual_compulsory_savings) as int8) as total_actual_compulsory_savings," +
            "cast(sum(total_actual_voluntary_savings) as int8) as   total_actual_voluntary_savings " +
            "         from transaction_summary ssv  " +
            "         inner join shg_profile sp  on sp.shg_id  =ssv.shg_id  and sp.village_id =?1  " +
            "         where geographical_level=8 and  year_month between ?2 and ?3 " +
            "         group by sp.shg_name,ssv.state_id,ssv.district_id,ssv.block_id,ssv.panchayat_id,ssv.village_id,ssv.shg_id,total_shg_member",nativeQuery=true)
    List<Object[]> getSavingShg(Integer voId, String fromDate, String toDate);


//
//    @Query(nativeQuery = true,value= "select  ts.state_id as State,ts.district_id as district,ts.block_id as block,ts.panchayat_id as panchayat , " +
//            "ts.village_id as village,ts.shg_id  as shg,ts.vo_id  as vo,ts.clf_id  as clf,ts.geographical_level as geographicalLevel,  " +
//            "year_month  as year_month, " +
//            "ts.total_shg as noOfShgs, " +
//            "ts.total_shg_member as noOfMembers, ts.total_savings_collection_compulsory_expected as expectedAmount, " +
//            "ts.total_actual_compulsory_savings as amountCollected,ts.total_actual_voluntary_savings as voluntarySaving , " +
//            "ts.number_of_member_penalised as numberOfMemberPenalised, " +
//            "ts.total_penality as totalPenaltyAmount " +
//            "from transaction_summary ts where (?1 = -1 or ts.state_id::int=?1) and (?2 =-1 or ts.district_id::int=?2) " +
//            "and (?3 =-1 or ts.block_id::int=?3) and (?4 =-1 or ts.panchayat_id::int=?4) and (?5 =-1 or ts.village_id::int=?5) " +
//            "and (?8 =-1 or ts.shg_id::int=?8) and  (?6 =-1 or ts.clf_id=?6) and  (?7 =-1 or ts.vo_id=?7)and ts.year_month between ?9 and ?10")
//    List<Object[]> getSavingShgReportDetails(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, BigInteger clfId, BigInteger voId, Integer shgId,String fromDate, String toDate);

    @Query(nativeQuery = true,value= "select  ts.state_id as State,ts.district_id as district,ts.block_id as block,ts.panchayat_id as panchayat , " +
            "ts.village_id as village,ts.shg_id  as shg,ts.vo_id  as vo,ts.clf_id  as clf,ts.geographical_level as geographicalLevel,  " +
            "year_month  as year_month, " +
            "ts.total_shg as noOfShgs, " +
            "ts.total_shg_member as noOfMembers, ts.total_savings_collection_compulsory_expected as expectedAmount, " +
            "ts.total_actual_compulsory_savings as amountCollected,ts.total_actual_voluntary_savings as voluntarySaving , " +
            "ts.number_of_member_penalised as numberOfMemberPenalised, " +
            "ts.total_penality as totalPenaltyAmount, " +
            "ts.total_meeting_conducted as noOfMeetingConducted, " +
            "ts.number_of_member_contributing_voluntary as noOfMemberContributingVoluntary, " +
            "ts.no_of_members_saved_comp as noOfCompulsorySaved  " +
            "from transaction_summary ts where (?1 = -1 or ts.state_id::int=?1) and (?2 =-1 or ts.district_id::int=?2) " +
            "and (?3 =-1 or ts.block_id::int=?3) and (?4 =-1 or ts.panchayat_id::int=?4) and (?5 =-1 or ts.village_id::int=?5) " +
            "and (?8 =-1 or ts.shg_id::int=?8) and  (?6 =-1 or ts.clf_id=?6) and  (?7 =-1 or ts.vo_id=?7)and ts.year_month between ?9 and ?10")
    List<Object[]> getSavingShgReportDetails(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, BigInteger clfId, BigInteger voId, Integer shgId,String fromDate, String toDate);

    @Query(nativeQuery = true,value= "select  ts.state_id as State,ts.district_id as district,ts.block_id as block,ts.panchayat_id as panchayat , " +
            "ts.village_id as village,ts.shg_id  as shg,ts.vo_id  as vo,ts.clf_id  as clf,ts.geographical_level as geographicalLevel,  " +
            "year_month  as year_month, " +
            "ts.total_shg as noOfShgs, " +
            "ts.total_shg_member as noOfMembers, ts.total_savings_collection_compulsory_expected as expectedAmount," +
            "ts.total_actual_compulsory_savings as amountCollected,ts.total_actual_voluntary_savings as voluntarySaving ," +
            "ts.number_of_member_penalised as numberOfMemberPenalised," +
            "ts.total_penality as totalPenaltyAmount," +
            "ts.total_meeting_conducted as noOfMeetingConducted," +
            "ts.number_of_member_contributing_voluntary as noOfMemberContributingVoluntary," +
            "ts.no_of_members_saved_comp as noOfCompulsorySaved " +
            "from transaction_summary ts where (?1 = -1 or ts.state_id::int=?1) and (?2 =-1 or ts.district_id::int=?2) " +
            "and (?3 =-1 or ts.block_id::int=?3) and (?4 =-1 or ts.panchayat_id::int=?4) and (?5 =-1 or ts.village_id::int=?5) " +
            "and ts.year_month between ?6 and ?7 and (?8 =-1 or ts.shg_id::int=?8) and  (?9 =-1 or ts.vo_id=?9) and  (?10 =-1 or ts.clf_id=?10) and (ts.geographical_level = ?11)")
    List<Object[]> getSavingShgReportDetails1(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, String fromDate, String toDate, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel);


    @Query(nativeQuery = true,value= "select  ts.state_id as State,ts.district_id as district,ts.block_id as block,ts.panchayat_id as panchayat , " +
            "ts.vo_id  as vo,ts.clf_id  as clf, " +
            "ts.total_vo as noOfVos, " +
            "ts.total_vo_member as noOfMembers, ts.total_savings_collection_compulsory_expected as expectedAmount," +
            "ts.total_actual_compulsory_savings as amountCollected,ts.total_actual_voluntary_savings as totalVoluntarySaving ," +
            "ts.number_of_member_penalised as numberOfMemberPenalised," +
            "ts.total_penality as totalPenaltyAmount," +
            "ts.total_meeting_conducted as noOfMeetingConducted," +
            "ts.number_of_member_contributing_voluntary as noOfMemberContributingVoluntary," +
            "ts.no_of_members_saved_comp as noOfCompulsorySaved ,ts.geographical_level as geographicalLevel, " +
            "year_month  as year_month from vo_transaction_summary ts where (?1 = -1 or ts.state_id::int=?1) and (?2 =-1 or ts.district_id::int=?2) " +
            "and (?3 =-1 or ts.block_id::int=?3) and (?4 =-1 or ts.panchayat_id::int=?4) " +
            "and ts.year_month between ?5 and ?6  and  (?7 =-1 or ts.vo_id=?7) and  (?8 =-1 or ts.clf_id=?8) and (ts.geographical_level = ?9)")
    List<Object[]> getSavingVoReportDetails(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, String fromDate1, String toDate1, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel);

    @Query(nativeQuery = true,value= "SELECT ts.state_id as state_id, ts.district_id as district_id , ts.block_id as block_id, ts.panchayat_id as panchayat_id, ts.village_id as village_id, ts.shg_id as shg_id, ts.vo_id as vo_id, ts.clf_id as clf_id, ts.year_month as year_month, ts.geographical_level as geographical_level, ts.total_shg as total_shg, ts.total_shg_member as total_shg_member, " +
            "ts.total_meeting_conducted as total_meeting_conducted, ts.total_savings_collection_compulsory_expected as total_savings_collection_compulsory_expected, ts.total_actual_compulsory_savings as total_actual_compulsory_savings, ts.total_actual_voluntary_savings as total_actual_voluntary_savings, ts.number_of_member_contributing_voluntary as number_of_member_contributing_voluntary, " +
            "ts.number_of_member_penalised as number_of_member_penalised, ts.total_penality as total_penality, ts.memberpenaltylist as memberpenaltylist, ts.no_of_members_saved_comp as no_of_members_saved_comp, ts.total_members_availing_loans as total_members_availing_loans, ts.total_number_of_loans as total_number_of_loans, ts.total_amount_of_loans as total_amount_of_loans, ts.total_loans_lt_20k " +
            "as total_loans_lt_20k, ts.total_loans_20k_50k as total_loans_20k_50k, ts.total_loans_50k_1lac as total_loans_50k_1lac, ts.total_loans_1lac_2lac50k as total_loans_1lac_2lac50k, ts.total_loans_2lac50k_5lac as total_loans_2lac50k_5lac, " + "ts.total_loans_5lac_10lac as total_loans_5lac_10lac, ts.total_loans_gt_10lac as total_loans_gt_10lac, ts.total_consumptions_loans as total_consumptions_loans, " +
            "ts.total_amount_of_consumptions_loans as total_amount_of_consumptions_loans, ts.total_agriculture_loans as total_agriculture_loans, ts.total_amount_of_agriculture_loans as total_amount_of_agriculture_loans, ts.total_livestock_fisheries_loans as total_livestock_fisheries_loans, ts.total_amount_of_livestock_fisheries_loans as total_amount_of_livestock_fisheries_loans, ts.total_ntfp_loans as total_ntfp_loans, " +
            "ts.total_amount_of_ntfp_loans as total_amount_of_ntfp_loans, ts.total_non_farm_loans as total_non_farm_loans, ts.total_amount_of_non_farm_loans as total_amount_of_non_farm_loans, ts.total_loans_demanded as total_loans_demanded, ts.total_loans_supplied_same_day as total_loans_supplied_same_day, ts.total_loans_supplied_lt_1w as total_loans_supplied_lt_1w, ts.total_loans_supplied_1w_2w as total_loans_supplied_1w_2w," +
            " ts.total_loans_supplied_1_2month as total_loans_supplied_1_2month, ts.total_loans_supplied_2_3month as total_loans_supplied_2_3month, ts.total_loans_supplied_gt_3month as total_loans_supplied_gt_3month, ts.total_loans_principle_demand as total_loans_principle_demand, ts.total_loans_repaid as total_loans_repaid, ts.total_loans_repayment_within_period as total_loans_repayment_within_period, ts.total_loans_repayment_1month_delay as total_loans_repayment_1month_delay," +
            " ts.total_loans_repayment_2month_delay as total_loans_repayment_2month_delay, ts.total_loans_repayment_3month_delay as total_loans_repayment_3month_delay, ts.total_loans_repayment_gt_3month_delay as total_loans_repayment_gt_3month_delay, ts.no_cbo_who_conducted_mtg as no_cbo_who_conducted_mtg, ts.no_meeting_scheduled as no_meeting_scheduled, ts.total_attendance_in_mtg as total_attendance_in_mtg " +
             "from transaction_summary ts where (?1 = -1 or ts.state_id::int=?1) and (?2 =-1 or ts.district_id::int=?2) and (?3 =-1 or ts.block_id::int=?3) and (?4 =-1 or ts.panchayat_id::int=?4) and (?5 =-1 or ts.village_id::int=?5) and ts.year_month >=?6 and ts.year_month <=?7 and (?8 = -1 or ts.shg_id = ?8) and (?9 = -1 or ts.vo_id = ?9) and (?10 = -1 or ts.clf_id = ?10) and (ts.geographical_level = ?11)")
    List<Object[]> getTransactionSummaryDetails(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, String fromDate1, String toDate1, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel);
}
