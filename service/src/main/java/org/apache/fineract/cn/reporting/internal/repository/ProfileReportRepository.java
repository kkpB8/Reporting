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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface ProfileReportRepository extends JpaRepository<ProfileReportEntity, BigInteger>  {

    @Query("FROM  ProfileReportEntity c WHERE "+
            "(c.geographicalFlag=:geographicalFlag) and "+
            "(c.yearMonth=:yearMonth) and "+
            "(-1 = :stateId or c.stateId=:stateId) and "+
            "(-1 = :districtId or c.districtId=:districtId) and "+
            "(-1 = :blockId or c.blockId=:blockId) and "+
            "(-1 = :panchayatId or c.panchayatId=:panchayatId) and "+
            "(-1 = :villageId or c.villageId=:villageId)")
            List<ProfileReportEntity> findByFilter(
            @Param("geographicalFlag") final Integer geographicalFlag,
            @Param("yearMonth") final String yearMonth,
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("panchayatId") final Integer panchayatId,
            @Param("villageId") final Integer villageId
    );


    @Query(nativeQuery = true, value="select State_name_en State,su.*,distcnt,du.*,blockcnt,bu.* " +
//            ", current_timestamp updated_date  " +
            "from state_master s inner join (select state_id,count(case when role_id='890' then 1 end)SA,count(case when role_id='870' then 1 end)SM, count(case when role_id='850' then 1 end)ST from user_role_rights_map  where role_status=1 group by state_id)su on s.state_id=su.state_id inner join (select state_id,count(district_id)DistCnt from district_master group by state_id)d on s.state_id=d.state_id inner join (select state_id,count(case when role_id='790' then 1 end)DA,count(case when role_id='770' then 1 end)DM ,count(case when role_id='750' then 1 end)DT from user_role_rights_map where role_status=1  group by state_id)du on s.state_id=du.state_id inner join (select state_id,count(block_id)BlockCnt from block_master group by state_id)b on s.state_id=b.state_id inner join(select state_id,count(case when role_id='690' then 1 end)BA,count(case when role_id='670' then 1 end)BM ,count(case when role_id='650' then 1 end)BT from user_role_rights_map where role_status=1  group by state_id)bu on s.state_id=bu.state_id where (?1 = -1 or s.state_id=?1)")
/*    @Query(nativeQuery = true, value="select State_name_en State,su.*,distcnt,du.*,blockcnt,bu.* from state_master s " +
            "inner join (select state_id,count(case when role_id='890' then 1 end)SA,count(case when role_id='870' then 1 end)SM ,count(case when role_id='850' then 1 end)ST from user_role_rights_map group by state_id)su on s.state_id=su.state_id " +
            "inner join (select state_id,count(district_id)DistCnt from district_master group by state_id)d on s.state_id=d.state_id " +
            "inner join (select state_id,count(case when role_id='790' then 1 end)DA,count(case when role_id='770' then 1 end)DM ,count(case when role_id='750' then 1 end)DT from user_role_rights_map group by state_id)du on s.state_id=du.state_id " +
            "inner join (select state_id,count(block_id)BlockCnt from block_master group by state_id)b on s.state_id=b.state_id " +
            "inner join (select state_id,count(case when role_id='690' then 1 end)BA,count(case when role_id='670' then 1 end)BM ,count(case when role_id='650' then 1 end)BT from user_role_rights_map group by state_id)bu on s.state_id=bu.state_id where s.state_id=?1;")*/
    List<Object[]> fetchStateWiseMissionLevelReport(Integer stateId);

    @Query(nativeQuery = true, value="select State_name_en State,district_name_en District ,s.state_id stateId,du.*," +
            "blockcnt,bu.*, d.district_id" +
//            ", current_timestamp updated_date" +
            "  from state_master s inner join   district_master  d on s.state_id=d.state_id left join (select district_id,count(case when role_id='790' then 1 end)DA,count(case when role_id='770' then 1 end)DM, count(case when role_id='750' then 1 end)DT from user_role_rights_map where role_status=1 group by district_id)du  on d.district_id::varchar=du.district_id left join (select district_id,count(block_id)BlockCnt from block_master group by district_id)b  on d.district_id=b.district_id left join (select district_id,count(case when role_id='690' then 1 end)BA,count(case when role_id='670' then 1 end)BM , count(case when role_id='650' then 1 end)BT from user_role_rights_map where role_status=1 group by district_id)bu  on d.district_id::varchar=bu.district_id where (?1 = -1 or s.state_id=?1) and (?2 = -1 or d.district_id=?2)")
    List<Object[]> fetchDistrictWiseMissionLevelReport(Integer stateId,Integer districtId);
    @Query(nativeQuery = true, value="select State_name_en State,district_name_en District ,d.district_id as  " +
            "districtId ,block_name_en as  Block,bu.*,s.state_id, d.district_id, b.block_id" +
//            ", current_timestamp updated_date" +
            "  from state_master s inner join   " +
            "district_master  d on s.state_id=d.state_id inner join  block_master  b on d.district_id=b.district_id  " +
            "left join (select block_id,count(case when role_id='690' then 1 end)BA,count(case when role_id='670' then 1 end)BM , " +
            "count(case when role_id='650' then 1 end)BT from user_role_rights_map where role_status =1 group by block_id)bu on b.block_id::varchar =bu.block_id  " +
            "where (?1 = -1 or s.state_id=?1) and (?2 = -1 or d.district_id=?2) and (?3 =-1 or b.block_id=?3)")
    List<Object[]> fetchBlockWiseMissionLevelReport(Integer stateId,Integer districtId ,Integer blockId);

    @Query(nativeQuery = true, value="select state_id,state_name , COUNT(CASE WHEN  age_block IN (0,1,2,3) THEN age_block end) as int_block_zero_3,  " +
            "COALESCE(SUM(CASE WHEN  age_block IN (0,1,2,3) THEN is_saturated end),0) int_block_zero_3_sat,  " +
            "COUNT(CASE WHEN  age_block IN (4,5,6) THEN age_block end) as int_block_three_6,  " +
            "COALESCE(SUM(CASE WHEN  age_block IN (4,5,6) THEN is_saturated end),0) int_block_three_6_sat,  " +
            "COUNT(CASE WHEN  age_block IN (7,8,9,10) THEN age_block end) as int_block_six_10,  " +
            "COALESCE(SUM(CASE WHEN  age_block IN (7,8,9,10) THEN is_saturated end),0) int_block_six_10_sat,  " +
            "COUNT(CASE WHEN  age_block >10  THEN age_block end) as int_block_more_10, " +
            "COALESCE(SUM(CASE WHEN  age_block > 10 THEN is_saturated end),0) int_block_more_10_sat " +
//            ", current_timestamp updated_date " +
            "from tbl_summary where  year_month = ?1 and (?2 = -1 or state_id = ?2) and geographical_flag = 3  " +
            "group by state_id, state_name, updated_date")
    List<Object[]> fetchBS(String yearMonth, Integer stateId);
    @Query(nativeQuery = true, value = "select state_id,state_name ,district_id,district_name,  " +
            "COUNT(CASE WHEN  age_block IN (0,1,2,3) THEN age_block end) as int_block_zero_3,  " +
            "COALESCE(SUM(CASE WHEN  age_block IN (0,1,2,3) THEN is_saturated end),0) int_block_zero_3_sat,  " +
            "COUNT(CASE WHEN  age_block IN (4,5,6) THEN age_block end) as int_block_three_6,  " +
            "COALESCE(SUM(CASE WHEN  age_block IN (4,5,6) THEN is_saturated end),0) int_block_three_6_sat,  " +
            "COUNT(CASE WHEN  age_block IN (7,8,9,10) THEN age_block end) as int_block_six_10,  " +
            "COALESCE(SUM(CASE WHEN  age_block IN (7,8,9,10) THEN is_saturated end),0) int_block_six_10_sat,  " +
            "COUNT(CASE WHEN  age_block >10  THEN age_block end) as int_block_more_10,  " +
            "COALESCE(SUM(CASE WHEN  age_block > 10 THEN is_saturated end),0) int_block_more_10_sat " +
//            ", updated_date as updateddate " +
            "from tbl_summary where  year_month= ?1 and (?2 = -1 or state_id = ?2) and (?3 = -1 or district_id = ?3) and geographical_flag = 3  " +
            "group by state_id,state_name,district_id,district_name, updated_date")
    List<Object[]> fetchBSlist(String yearMonth, Integer stateId, Integer districtId);

    @Query(nativeQuery = true, value="select s.state_name_en as State, "+
            // "d.district_name_en as District, "+
            // "b.block_name_en as Block, "+
            "c.category_name as TypeofCBO, "+
            "count(CASE WHEN u.role_status=1 then u end ) as NoofBookkeepers,  "+
            "count(sp)+count(fp)+count(fp1) as NoofMappedBookkeepers,  "+
            "((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0))) as TotalCBOCount, "+
            "(SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0))) as CBOMappedCount, "+
            "case when ((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0)))>0  then round((((SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0)))*100)/((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0))))::numeric,2) else 0 end "+
            "as CBOMappedPercentage, "+
            "sum(COALESCE(shg_mapped_migrated,0))+sum(COALESCE(vo_mapped_migrated,0))+sum(COALESCE(clf_mapped_migrated,0)) as "+
            "CBOsMappedMigrated, "+
            "sum(COALESCE(shg_mapped_new,0))+sum(COALESCE(vo_mapped_new,0))+sum(COALESCE(clf_mapped_new,0)) as "+
            "NewCBOsMapped, "+
            "sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+sum(COALESCE(clf_approved_bm,0)) as "+
            "CBOsApprovedbyBM, "+
            "sum(COALESCE(shg_rejected_bm,0))+sum(COALESCE(vo_rejected_bm,0))+sum(COALESCE(clf_rejected_bm,0)) as "+
            "CBOsrejectedbyBM, "+
            "sum(COALESCE(shg_pending_bm,0))+sum(COALESCE(vo_pending_bm,0))+sum(COALESCE(clf_pending_bm,0)) as "+
            "CBOsPendingwithBM, "+
            "sum(COALESCE(shg_pending_bk,0))+sum(COALESCE(vo_pending_bk,0))+sum(COALESCE(clf_pending_bk,0)) as "+
            "CBOspendingwithBookkeeper, "+
            "sum(COALESCE(shg_incomplete_bk,0))+sum(COALESCE(vo_incomplete_bk,0))+sum(COALESCE(clf_incomplete_bk,0)) as "+
            "IncompleteCBOs, "+
            "case when (SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0)))>0 then "+
            "round((((sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+sum(COALESCE(clf_approved_bm,0)))*100) "+
            "/(SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0))))::numeric,2) else 0 end "+
            "as PercentageApprovedMapped, "+
            "case when ((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0)))>0 then  "+
            "round((((sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+  "+
            "sum(COALESCE (clf_approved_bm,0)))*100)/((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+ "+
            "(COALESCE(tfp1.total_clf,0))))::numeric,2) else 0 end "+
            "PercentageApprovedOverall   "+
            "from user_role_rights_map u inner join user_category c on c.category_id=u.category_id  "+
            "inner join users_master usm on usm.user_id=u.user_id "+
            "inner join state_master s on s.state_id=u.state_id::int  "+
            "inner join district_master d on d.district_id::varchar=u.district_id "+
            "inner join block_master b on b.block_id::varchar=u.block_id "+
            "left join (select sp.user_id,count(case when is_locked!=0 then sp.user_id end )as shg_count,sum(case when activation_status=2 then 1 else 0 end)shg_activated,  "+
            "sum(case when approve_status=2 then 1 else 0 end)shg_approved,sum(case when approve_status=1 then 1 else 0 end)shg_pending,  "+
            "sum(case when uploaded_by is null then 1 else 0 end)shg_verification_pending,sum(case when is_verified in (3,9) then 1 else 0 end)shg_verified, "+
            "sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and is_edited!=1 "+
            "and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_approved_bm, "+
            "sum(case when uploaded_by is not null  and approve_status=3 and is_edited!=1 and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_rejected_bm, "+
            "sum(case when (approve_status=1 or is_edited=1) and is_locked!=0 then 1 else 0 end) shg_pending_bm, "+
            "sum(case when uploaded_by is null and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_pending_bk, "+
            "sum(case when uploaded_by is not null and is_locked=0  then 1 else 0 end) shg_incomplete_bk, "+
            "sum(case when nic_shg_code is not null and sp.is_locked!=0 then 1 else 0 end) shg_mapped_migrated, "+
            "sum(case when nic_shg_code is null and sp.is_locked!=0  then 1 else 0 end) shg_mapped_new "+
            "from shg_profile sp "+
            "inner join cbo_approval_audit  caa on sp.shg_id=caa.cbo_id and caa.cbo_type=0 and caa.member_id is null  "+
            "where is_active=true  group by sp.user_id) sp  "+
            "on sp.user_id=u.user_id and u.role_id='310' "+
            "left join (select user_id,count(*)as vo_count, "+
            "sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and user_id is not null then 1 else 0 end) vo_approved_bm, "+
            "sum(case when uploaded_by is not null  and approve_status=3 and user_id is not null then 1 else 0 end) vo_rejected_bm, "+
            "sum(case when uploaded_by is not null and approve_status=1 and user_id is not null then 1 else 0 end) vo_pending_bm, "+
            "sum(case when uploaded_by is null and user_id is not null then 1 else 0 end) vo_pending_bk, "+
            "sum(case when approve_status is null then 1 else 0 end) vo_incomplete_bk, "+
            "sum(case when vo_nic_code is not null then 1 else 0 end) vo_mapped_migrated, "+
            "sum(case when vo_nic_code is null then 1 else 0 end) vo_mapped_new "+
            "from federation_profile where cbo_type=1 and status is not null  and is_active=True  group by user_id) fp  "+
            "on fp.user_id=u.user_id and u.role_id='410'  "+
            "left join (select user_id,count(*)as clf_count, "+
            "sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and user_id is not null "+
            "then 1 else 0 end) clf_approved_bm, "+
            "sum(case when uploaded_by is not null  and approve_status=3 and user_id is not null then 1 else 0 end) clf_rejected_bm, "+
            "sum(case when uploaded_by is not null and approve_status=1 and user_id is not null then 1 else 0 end) clf_pending_bm, "+
            "sum(case when uploaded_by is null and user_id is not null then 1 else 0 end) clf_pending_bk, "+
            "sum(case when approve_status is null then 1 else 0 end) clf_incomplete_bk, "+
            "sum(case when vo_nic_code is not null then 1 else 0 end) clf_mapped_migrated, "+
            "sum(case when vo_nic_code is null then 1 else 0 end) clf_mapped_new "+
            "from federation_profile where is_active=true and cbo_type=2 and status=1  group by user_id) fp1  "+
            "on fp1.user_id=u.user_id and u.role_id='510' "+
            "left join (select COUNT(*) as total_shg from shg_profile sp  inner join cbo_approval_audit  caa on sp.shg_id=caa.cbo_id and caa.cbo_type=0 and caa.member_id is null where (?1 is null or block_id::varchar=?1) and (?2 is null or district_id::varchar=?2) and (?3 =- 1 or state_id::int=?3) and is_active=true and sp.is_locked!=0) tsp "+
            "on u.category_id::int=31  "+
            "left join (select COUNT(*) as total_vo from federation_profile vo "+
            "inner join cbo_approval_audit  caa on vo.federation_id=caa.cbo_id and caa.cbo_type= 1 "+
            "left join (select cbo_id,count(cbo_id)shg_cnt from cbo_mapping_details where cbo_level=1 and status=1 and is_active=true group by cbo_id)shg on vo.federation_id=shg.cbo_id  "+
            "left join (select cbo_id,count(cbo_id)ec_cnt from executive_member where cbo_level=1 and status=1 and is_active=true group by cbo_id)ec on vo.federation_id=ec.cbo_id  "+
            "where vo.cbo_type=1 and status is not null  and is_active=True  and (?1 is null or block_id::varchar=?1) and (?2 is null or district_id::varchar=?2) and (?3 =- 1 or state_id::int=?3) and is_active=true) tfp "+
            "on u.category_id::int=41 "+
            "left join (select COUNT(*) as total_clf from federation_profile fp  "+
            "inner join cbo_approval_audit  caa on fp.federation_id=caa.cbo_id and caa.cbo_type= 2  "+
            "left join ( select clf.cbo_id,sum(shg)shg,count(cbo_child_code)vo from cbo_mapping_details  "+
            "clf inner join (select cbo_id,count(cbo_child_code)shg from cbo_mapping_details where cbo_level=1 and status=1 and is_active=true group by cbo_id)shg on clf.cbo_child_code=shg.cbo_id where clf.cbo_level=2 "+
            "group by clf.cbo_id  )vo on fp.federation_id=vo.cbo_id left join (select cbo_id,count(cbo_id)ec_cnt from executive_member where cbo_level=2 and status=1 and is_active=true group by cbo_id)ec on fp.federation_id=ec.cbo_id  "+
            "where fp.cbo_type=2 and fp.status=1 and fp.is_active=True and (?1 is null or block_id::varchar=?1) and (?2 is null or district_id::varchar=?2) and (?3 =- 1 or state_id::int=?3) and is_active=true) tfp1 "+
            "on u.category_id::int=51 "+
            "Where  u.role_id is not null and u.role_id in ('310','410','510') and c.category_id::int<52 and (?1 is null or u.block_id::varchar=?1) and (?2 is null or u.district_id::varchar=?2) and (?3 =- 1 or u.state_id::int=?3) "+
            "group by u.category_id,s.state_name_en,c.category_name,total_shg,total_vo,total_clf order by "+
            "u.category_id::int ASC")
    List<Object[]> getSummaryReportSateWiseDetails(String blockId, String districtId, Integer stateId);

    @Query(nativeQuery = true, value="select s.state_name_en as State, "+
            "d.district_name_en as District, "+
            //"b.block_name_en as Block, "+
            "c.category_name as TypeofCBO, "+
            "count(CASE WHEN u.role_status=1 then u end ) as NoofBookkeepers ,  "+
            "count(sp)+count(fp)+count(fp1) as NoofMappedBookkeepers,  "+
            "((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0))) as TotalCBOCount, "+
            "(SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0))) as CBOMappedCount, "+
            "case when ((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0)))>0 then "+
            "round((((SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0)))*100)/((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0))))::numeric,2) else 0 end "+
            "as CBOMappedPercentage, "+
            "sum(COALESCE(shg_mapped_migrated,0))+sum(COALESCE(vo_mapped_migrated,0))+sum(COALESCE(clf_mapped_migrated,0)) as "+
            "CBOsMappedMigrated, "+
            "sum(COALESCE(shg_mapped_new,0))+sum(COALESCE(vo_mapped_new,0))+sum(COALESCE(clf_mapped_new,0)) as "+
            "NewCBOsMapped, "+
            "sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+sum(COALESCE(clf_approved_bm,0)) as "+
            "CBOsApprovedbyBM,"+
            "sum(COALESCE(shg_rejected_bm,0))+sum(COALESCE(vo_rejected_bm,0))+sum(COALESCE(clf_rejected_bm,0)) as "+
            "CBOsrejectedbyBM, "+
            "sum(COALESCE(shg_pending_bm,0))+sum(COALESCE(vo_pending_bm,0))+sum(COALESCE(clf_pending_bm,0)) as "+
            "CBOsPendingwithBM, "+
            "sum(COALESCE(shg_pending_bk,0))+sum(COALESCE(vo_pending_bk,0))+sum(COALESCE(clf_pending_bk,0)) as "+
            "CBOspendingwithBookkeeper, "+
            "sum(COALESCE(shg_incomplete_bk,0))+sum(COALESCE(vo_incomplete_bk,0))+sum(COALESCE(clf_incomplete_bk,0)) as "+
            "IncompleteCBOs, "+
            "case when (SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0)))>0 then "+
            "round((((sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+sum(COALESCE(clf_approved_bm,0)))*100) "+
            "/(SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0))))::numeric,2) else 0 end "+
            "PercentageApprovedMapped, "+
            "case when ((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0)))>0 then "+
            "round((((sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+ "+
            "sum(COALESCE (clf_approved_bm,0)))*100)/((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+ "+
            "(COALESCE(tfp1.total_clf,0))))::numeric,2) else 0 end "+
            "PercentageApprovedOverall   "+
            "from user_role_rights_map u inner join user_category c on c.category_id=u.category_id  "+
            "inner join users_master usm on usm.user_id=u.user_id  "+
            "inner join state_master s on s.state_id=u.state_id::int  "+
            "inner join district_master d on d.district_id::varchar=u.district_id "+
            "inner join block_master b on b.block_id::varchar=u.block_id "+
            "left join (select sp.user_id,count(case when is_locked!=0 then sp.user_id end )as shg_count ,sum(case when activation_status=2 then 1 else 0 end)shg_activated,  "+
            "sum(case when approve_status=2 then 1 else 0 end)shg_approved,sum(case when approve_status=1 then 1 else 0 end)shg_pending,  "+
            "sum(case when uploaded_by is null then 1 else 0 end)shg_verification_pending,sum(case when is_verified in (3,9) then 1 else 0 end)shg_verified, "+
            "sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and is_edited!=1  "+
            "and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_approved_bm , "+
            "sum(case when uploaded_by is not null  and approve_status=3 and is_edited!=1 and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_rejected_bm , "+
            "sum(case when (approve_status=1 or is_edited=1) and is_locked!=0 then 1 else 0 end) shg_pending_bm , "+
            "sum(case when uploaded_by is null and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_pending_bk, "+
            "sum(case when uploaded_by is not null and is_locked=0  then 1 else 0 end) shg_incomplete_bk, "+
            "sum(case when nic_shg_code is not null and is_locked!=0 then 1 else 0 end) shg_mapped_migrated, "+
            "sum(case when nic_shg_code is null and is_locked!=0 then 1 else 0 end) shg_mapped_new "+
            "from shg_profile sp inner join cbo_approval_audit  caa on sp.shg_id=caa.cbo_id and caa.cbo_type=0 and caa.member_id is null "+
            "where is_active=true  group by sp.user_id) sp  "+
            "on sp.user_id=u.user_id and u.role_id='310' "+
            "left join (select user_id,count(*) as vo_count, "+
            "sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and user_id is not null then 1 else 0 end) vo_approved_bm, "+
            "sum(case when uploaded_by is not null  and approve_status=3 and user_id is not null then 1 else 0 end) vo_rejected_bm, "+
            "sum(case when uploaded_by is not null and approve_status=1 and user_id is not null then 1 else 0 end) vo_pending_bm, "+
            "sum(case when uploaded_by is null and user_id is not null then 1 else 0 end) vo_pending_bk, "+
            "sum(case when approve_status is null then 1 else 0 end) vo_incomplete_bk, "+
            "sum(case when vo_nic_code is not null then 1 else 0 end) vo_mapped_migrated, "+
            "sum(case when vo_nic_code is null then 1 else 0 end) vo_mapped_new "+
            "from federation_profile where is_active=true and cbo_type=1  group by user_id) fp  "+
            "on fp.user_id=u.user_id and u.role_id='410'  "+
            "left join (select user_id,count(*) as clf_count, "+
            "sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and user_id is not null "+
            "then 1 else 0 end) clf_approved_bm, "+
            "sum(case when uploaded_by is not null  and approve_status=3 and user_id is not null then 1 else 0 end) clf_rejected_bm, "+
            "sum(case when uploaded_by is not null and approve_status=1 and user_id is not null then 1 else 0 end) clf_pending_bm, "+
            "sum(case when uploaded_by is null and user_id is not null then 1 else 0 end) clf_pending_bk, "+
            "sum(case when approve_status is null then 1 else 0 end) clf_incomplete_bk, "+
            "sum(case when vo_nic_code is not null then 1 else 0 end) clf_mapped_migrated, "+
            "sum(case when vo_nic_code is null then 1 else 0 end) clf_mapped_new "+
            "from federation_profile where is_active=true and cbo_type=2  group by user_id) fp1  "+
            "on fp1.user_id=u.user_id and u.role_id='510' "+
            "left join (select COUNT(*) as total_shg from shg_profile sp  inner join cbo_approval_audit  caa on sp.shg_id=caa.cbo_id and caa.cbo_type=0 and caa.member_id is null  where (?1 is null or block_id::varchar=?1) and (?2 is null or district_id::varchar=?2) and (?3 =- 1 or state_id::int=?3) and is_active=true and sp.is_locked!=0) tsp "+
            "on u.category_id::int=31  "+
            "left join (select COUNT(*) as total_vo from federation_profile vo  "+
            "inner join cbo_approval_audit  caa on vo.federation_id=caa.cbo_id and caa.cbo_type= 1  "+
            "left join (select cbo_id,count(cbo_id)shg_cnt from cbo_mapping_details where cbo_level=1 and status=1 and is_active=true group by cbo_id)shg on vo.federation_id=shg.cbo_id  "+
            "left join (select cbo_id,count(cbo_id)ec_cnt from executive_member where cbo_level=1 and status=1 and is_active=true group by cbo_id)ec on vo.federation_id=ec.cbo_id  "+
            "where vo.cbo_type=1 and status is not null  and is_active=True  and (?1 is null or block_id::varchar=?1) and (?2 is null or district_id::varchar=?2) and (?3 =- 1 or state_id::int=?3) and is_active=true) tfp "+
            "on u.category_id::int=41 "+
            "left join (select COUNT(*) as total_clf from federation_profile fp  "+
            "inner join cbo_approval_audit  caa on fp.federation_id=caa.cbo_id and caa.cbo_type= 2 "+
            "left join ( select clf.cbo_id,sum(shg)shg,count(cbo_child_code)vo from cbo_mapping_details  "+
            "clf inner join (select cbo_id,count(cbo_child_code)shg from cbo_mapping_details where cbo_level=1 and status=1 and is_active=true group by cbo_id)shg on clf.cbo_child_code=shg.cbo_id where clf.cbo_level=2  "+
            "group by clf.cbo_id )vo on fp.federation_id=vo.cbo_id left join (select cbo_id,count(cbo_id)ec_cnt from executive_member where cbo_level=2 and status=1 and is_active=true group by cbo_id)ec on fp.federation_id=ec.cbo_id  "+
            "where fp.cbo_type=2 and fp.status=1 and fp.is_active=True  and (?1 is null or block_id::varchar=?1) and (?2 is null or district_id::varchar=?2) and (?3 =- 1 or state_id::int=?3) and is_active=true) tfp1 "+
            "on u.category_id::int=51 "+
            "Where  u.role_id is not null and u.role_id in ('310','410','510') and c.category_id::int<52 and (?1 is null or u.block_id::varchar=?1) and (?2 is null or u.district_id::varchar=?2) and (?3 =- 1 or u.state_id::int=?3) "+
            "group by u.category_id,s.state_name_en,d.district_name_en,c.category_name,total_shg,total_vo,total_clf order by "+
            "u.category_id::int ASC")
    List<Object[]> getSummaryReportDistrictDetails(String blockId, String districtId, Integer stateId);

    @Query(nativeQuery = true,value = "select s.state_name_en as State, d.district_name_en as District, b.block_name_en as Block,  " +
            " c.category_name as TypeofCBO, count(CASE WHEN u.role_status=1 then u end ) as NoofBookkeepers ,  count(sp)+count(fp)+count(fp1)  " +
            " as NoofMappedBookkeepers,  ((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0)) " +
            " +(COALESCE(tfp1.total_clf,0))) as TotalCBOCount, (SUM(COALESCE(sp.shg_count,0))+ " +
            " SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0))) as CBOMappedCount,  " +
            " case when ((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+ " +
            " (COALESCE(tfp1.total_clf,0)))>0 then round((((SUM(COALESCE(sp.shg_count,0))+ " +
            " SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0)))*100)/((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+(COALESCE(tfp1.total_clf,0))))::numeric,2) else 0 end as CBOMappedPercentage, " +
            " sum(COALESCE(shg_mapped_migrated,0))+sum(COALESCE(vo_mapped_migrated,0))+ " +
            " sum(COALESCE(clf_mapped_migrated,0)) as CBOsMappedMigrated, sum(COALESCE(shg_mapped_new,0))+ " +
            " sum(COALESCE(vo_mapped_new,0))+sum(COALESCE(clf_mapped_new,0)) as NewCBOsMapped,  " +
            " sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+ " +
            " sum(COALESCE(clf_approved_bm,0)) as CBOsApprovedbyBM,sum(COALESCE(shg_rejected_bm,0))+ " +
            " sum(COALESCE(vo_rejected_bm,0))+sum(COALESCE(clf_rejected_bm,0)) as CBOsrejectedbyBM,  " +
            " sum(COALESCE(shg_pending_bm,0))+sum(COALESCE(vo_pending_bm,0))+sum(COALESCE(clf_pending_bm,0)) " +
            " as CBOsPendingwithBM, sum(COALESCE(shg_pending_bk,0))+sum(COALESCE(vo_pending_bk,0))+ " +
            " sum(COALESCE(clf_pending_bk,0)) as CBOspendingwithBookkeeper, sum(COALESCE(shg_incomplete_bk,0))+sum(COALESCE(vo_incomplete_bk,0))+sum(COALESCE(clf_incomplete_bk,0)) as IncompleteCBOs, case when (SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0)))>0 then  round((((sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+sum(COALESCE(clf_approved_bm,0)))*100) /(SUM(COALESCE(sp.shg_count,0))+SUM(COALESCE(fp.vo_count,0))+SUM(COALESCE(fp1.clf_count,0))))::numeric,2) else 0 end PercentageApprovedMapped, case when ((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+ (COALESCE(tfp1.total_clf,0)))>0 then round((((sum(COALESCE(shg_approved_bm,0))+sum(COALESCE(vo_approved_bm,0))+ sum(COALESCE (clf_approved_bm,0)))*100)/((COALESCE(tsp.total_shg,0))+(COALESCE(tfp.total_vo,0))+ (COALESCE(tfp1.total_clf,0))))::numeric,2) else 0 end PercentageApprovedOverall   from user_role_rights_map u inner join user_category c on c.category_id=u.category_id  inner join users_master usm on usm.user_id=u.user_id  inner join state_master s on s.state_id=u.state_id::int  inner join district_master d on d.district_id::varchar=u.district_id inner join block_master b on b.block_id::varchar=u.block_id  " +
            "  left join (select user_id,count(*)as clf_count, sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and user_id is not null then 1 else 0 end) clf_approved_bm, sum(case when uploaded_by is not null  and approve_status=3 and user_id is not null then 1 else 0 end) clf_rejected_bm, sum(case when approve_status=1 then 1 else 0 end) clf_pending_bm, sum(case when uploaded_by is null and user_id is not null then 1 else 0 end) clf_pending_bk, sum(case when approve_status is null then 1 else 0 end) clf_incomplete_bk, sum(case when vo_nic_code is not null then 1 else 0 end) clf_mapped_migrated, sum(case when vo_nic_code is null then 1 else 0 end) clf_mapped_new from federation_profile where is_active=true and cbo_type=2  group by user_id) fp1  on fp1.user_id=u.user_id and u.role_id='510' " +
            " left join (select user_id,count(*)as vo_count, sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and user_id is not null then 1 else 0 end) vo_approved_bm, sum(case when uploaded_by is not null  and approve_status=3 and user_id is not null then 1 else 0 end) vo_rejected_bm, sum(case when approve_status=1 then 1 else 0 end) vo_pending_bm, sum(case when uploaded_by is null and user_id is not null then 1 else 0 end) vo_pending_bk, sum(case when approve_status is null then 1 else 0 end) vo_incomplete_bk, sum(case when vo_nic_code is not null then 1 else 0 end) vo_mapped_migrated, sum(case when vo_nic_code is null then 1 else 0 end) vo_mapped_new from federation_profile where is_active=true and cbo_type=1  group by user_id) fp  on fp.user_id=u.user_id and u.role_id='410'  " +
            " left join (select sp.user_id,count(case when is_locked!=0 then sp.user_id end )as shg_count,sum(case when activation_status=2 then 1 else 0 end)shg_activated,  sum(case when approve_status=2 then 1 else 0 end)shg_approved,sum(case when approve_status=1 then 1 else 0 end)shg_pending,  sum(case when uploaded_by is null then 1 else 0 end)shg_verification_pending,sum(case when is_verified in (3,9) then 1 else 0 end)shg_verified, sum(case when uploaded_by is not null and activation_status=2 and approve_status=2 and is_edited!=1 " +
            " and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_approved_bm ,sum(case when uploaded_by is not null  and approve_status=3 and is_edited!=1 and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_rejected_bm , sum(case when (approve_status=1 or is_edited=1) and is_locked!=0 then 1 else 0 end) shg_pending_bm , sum(case when uploaded_by is null and is_locked!=0 and sp.user_id is not null then 1 else 0 end) shg_pending_bk, " +
            " sum(case when uploaded_by is not null and is_locked=0  then 1 else 0 end) shg_incomplete_bk, " +
            " sum(case when nic_shg_code is not null and is_locked!=0 then 1 else 0 end) shg_mapped_migrated, " +
            " sum(case when nic_shg_code is null and is_locked!=0 then 1 else 0 end) shg_mapped_new from shg_profile sp " +
            " inner join cbo_approval_audit  caa on sp.shg_id=caa.cbo_id and caa.cbo_type=0 and caa.member_id is null  " +
            " where sp.is_active=true  and sp.is_locked!=0  group by sp.user_id) sp  on sp.user_id=u.user_id and u.role_id='310'  " +
            " left join (select COUNT(*) as total_shg from shg_profile sp  inner join cbo_approval_audit  caa on sp.shg_id=caa.cbo_id and caa.cbo_type=0 and caa.member_id is null " +
            " where sp.is_locked!=0 and sp.is_active=true and ( ?1 is null or block_id::varchar= ?1)  "+
            " and ( ?2 is null or district_id::varchar= ?2) and (?3 =- 1 or state_id::int=?3)  " +
            " ) tsp on u.category_id::int=31  " +
            " left join (select COUNT(*) " +
            " as total_vo from federation_profile vo  " +
            " inner join cbo_approval_audit  caa on vo.federation_id=caa.cbo_id and caa.cbo_type= 1  " +
            " left join (select cbo_id,count(cbo_id)shg_cnt from cbo_mapping_details where cbo_level=1 and status=1 and is_active=true group by cbo_id)shg on vo.federation_id=shg.cbo_id  " +
            " left join (select cbo_id,count(cbo_id)ec_cnt from executive_member where cbo_level=1 and status=1 and is_active=true group by cbo_id)ec on vo.federation_id=ec.cbo_id  " +
            " where vo.cbo_type=1 and status is not null  and is_active=True  " +
            " and ( ?1 is null or block_id::varchar= ?1)  " +
            " and ( ?2 is null or district_id::varchar= ?2)  " +
            " and (?3 =- 1 or state_id::int=?3) ) tfp  " +
            " on u.category_id::int=41 " +
            " left join (select COUNT(*) " +
            " as total_clf from federation_profile fp  " +
            " inner join cbo_approval_audit  caa on fp.federation_id=caa.cbo_id and caa.cbo_type= 2 " +
            " left join ( select clf.cbo_id,sum(shg)shg,count(cbo_child_code)vo from cbo_mapping_details " +
            " clf inner join (select cbo_id,count(cbo_child_code)shg from cbo_mapping_details where cbo_level=1 and status=1 and is_active=true group by cbo_id)shg on clf.cbo_child_code=shg.cbo_id where clf.cbo_level=2 " +
            " group by clf.cbo_id  )vo on fp.federation_id=vo.cbo_id left join (select cbo_id,count(cbo_id)ec_cnt from executive_member where cbo_level=2 and status=1 and is_active=true group by cbo_id)ec on fp.federation_id=ec.cbo_id  " +
            " where fp.cbo_type=2 and fp.status=1 and fp.is_active=True  " +
            " and (?1 is null or block_id::varchar= ?1)  " +
            " and ( ?2 is null or district_id::varchar= ?2) " +
            " and (?3 =- 1 or state_id::int=?3) ) tfp1 on u.category_id::int=51  " +
            " Where  u.role_id is not null and u.role_id in ('310','410','510') " +
            " and c.category_id::int<52 and s.is_active=true  and (?1 is null or u.block_id::varchar=?1)  " +
            " and (?2 is null or u.district_id::varchar=?2) and (?3 =- 1 or u.state_id::int=?3)  " +
            " group by u.category_id,s.state_name_en,d.district_name_en,b.block_name_en, " +
            " c.category_name,total_shg,total_vo,total_clf order by u.category_id::int ASC")
    List<Object[]> getSummaryReportDetails(String blockId,String district, Integer stateId);

    @Query(nativeQuery = true, value="select s.state_name_en as State, d.district_name_en as District, b.block_name_en as Block, p.panchayat_name_en as GP, "+
            " v.village_name_en as Village, "+
            "sp.shg_code as SHGCode,sp.shg_name as SHGName, um.user_id as UserId,um.user_name as UserName,  "+
            "CASE WHEN sp.uploaded_by is not null and sp.activation_status=2 and (sp.approve_status=2 and sp.is_edited!=1) "+
            "and sp.user_id is not null THEN 'ApprovedbyBM'  "+
            "WHEN sp.uploaded_by is not null and (sp.approve_status=3 and sp.is_edited!=1) and sp.user_id is not null THEN 'RejectedbyBM'  "+
            "WHEN sp.uploaded_by is not null and (sp.approve_status=1 or sp.is_edited=1) "+
            "and sp.is_locked!=0 and sp.user_id is not null THEN  'PendingwithBM'  "+
            "WHEN sp.uploaded_by is null and sp.user_id is not null THEN 'PendingwithBookkeeper'  "+
            "WHEN sp.user_id is null THEN '-' END "+
            "as Approvedstatus,  "+
            "CASE WHEN sp.status = 1 THEN 'Active'  "+
            "ELSE 'Inactive' END as SHGStatus, "+
            "CASE WHEN sp.nic_shg_code is null THEN 'Yes'  "+
            "WHEN sp.nic_shg_code is not null THEN 'No'  "+
            "END as IsNewSHG  "+
            "from shg_profile sp inner join cbo_approval_audit  caa on sp.shg_id=caa.cbo_id and caa.cbo_type=0 and caa.member_id is null "+
            "inner join users_master um on um.user_id=sp.user_id "+
            "inner join state_master s on s.state_id=sp.state_id::int "+
            "inner join district_master d on d.district_id=sp.district_id::int "+
            "inner join block_master b on b.block_id=sp.block_id::int  "+
            "inner join panchayat_master p on p.panchayat_id=sp.panchayat_id::int "+
            "inner join village_master v on v.village_id=sp.village_id::int "+
            "where sp.is_locked!=0 and sp.block_id=?1  and (?2 = -1 or sp.village_id=?2) and (?3 = -1 or sp.panchayat_id=?3) and sp.is_active=true")
    List<Object[]> getShgDetails(Integer blockId,Integer villageId,Integer panchayatId);
    @Query(nativeQuery = true, value="select s.state_name_en as State, d.district_name_en as District, b.block_name_en as Block, p.panchayat_name_en as GP, "+
            "v.village_name_en as Village, "+
            "sp.shg_code as SHGCode,sp.shg_name as SHGName,mp.member_code as MemberCode, mp.member_name  "+
            "as MemberName, um.user_id as UserId,um.user_name as UserName,   "+
            "CASE WHEN mp.uploaded_by is not null and mp.mem_activation_status=2 and mp.approve_status=2 THEN 'ApprovedbyBM' "+
            "WHEN mp.uploaded_by is not null and mp.approve_status=3 THEN 'RejectedbyBM' "+
            "WHEN mp.uploaded_by is not null and mp.approve_status=1 THEN 'PendingwithBM' "+
            "WHEN mp.uploaded_by is null THEN 'PendingwithBookkeeper' END "+
            " as Approvedstatus, CASE WHEN mp.status = 1 THEN 'Active' "+
            " ELSE 'Inactive' END as MemberStatus from shg_profile sp  "+
            "inner join member_profile mp on mp.cbo_id=sp.shg_id inner join cbo_approval_audit  caa on mp.member_id=caa.member_id and caa.cbo_type=0 and caa.member_id is not null "+
            "inner join users_master um on um.user_id=sp.user_id "+
            "inner join state_master s on s.state_id=sp.state_id::int "+
            "inner join district_master d on d.district_id=sp.district_id::int "+
            "inner join block_master b on b.block_id=sp.block_id::int "+
            "inner join panchayat_master p on p.panchayat_id=sp.panchayat_id::int "+
            "inner join village_master v on v.village_id=sp.village_id::int "+
            "where sp.is_locked!=0 and sp.block_id=?1 and (?2 = -1 or sp.panchayat_id=?2) and(?3 = -1 or sp.village_id=?3)")
    List<Object[]> getMemberDetails( Integer blockId,Integer panchayatId,Integer villageId);

    @Query(nativeQuery = true, value="select s.state_name_en as State, r.role_name as UserRoleName, count(CASE WHEN u.role_status=1 then u end ) as Count from "+
            " user_role_rights_map u "+
            " inner join roles_master r on r.role_id=u.role_id " +
            " inner join users_master usm on usm.user_id=u.user_id " +
//            "and usm.status!='0' "+
            " inner join state_master s on s.state_id=u.state_id::int where (?1 = -1 or u.state_id::int=?1) and (?2 is null or u.district_id=?2) and (?3 is null or u.block_id=?3) and r.role_id::int<900 "+
            " group by u.role_id,s.state_name_en,r.role_name order by u.role_id::int ASC")
    List<Object[]> getUserConsolidateData(Integer state_id,String district_id, String block_id);
    @Query(nativeQuery = true, value="select s.state_name_en as State, d.district_name_en as District, b.block_name_en as Block, p.panchayat_name_en as GP, "+
            "sp.federation_code as VOCode,sp.federation_name as VOName, um.user_id as UserId,um.user_name as UserName,  "+
            "CASE WHEN sp.uploaded_by is not null and sp.activation_status=2 and sp.approve_status=2  "+
            "and sp.user_id is not null THEN 'ApprovedbyBM' "+
            " WHEN sp.uploaded_by is not null and sp.approve_status=3 and sp.user_id is not null THEN 'RejectedbyBM' "+
            "WHEN sp.uploaded_by is not null and sp.approve_status=1 and sp.user_id is not null THEN 'PendingwithBM' "+
            "WHEN sp.uploaded_by is null and sp.user_id is not null THEN 'PendingwithBookkeeper'  "+
            " WHEN sp.user_id is null THEN '-' END "+
            "as Approvedstatus,  CASE WHEN sp.status = 1 THEN 'Active' "+
            " ELSE 'Inactive' END as VOStatus,  "+
            "CASE WHEN sp.vo_nic_code is null THEN 'Yes' "+
            " WHEN sp.vo_nic_code is not null THEN 'No' "+
            "END as IsNewVO from federation_profile sp "+
            "inner join users_master um on um.user_id=sp.user_id "+
            "inner join state_master s on s.state_id=sp.state_id::int "+
            "inner join district_master d on d.district_id=sp.district_id::int "+
            "inner join block_master b on b.block_id=sp.block_id::int "+
            "inner join panchayat_master p on p.panchayat_id=sp.panchayat_id::int "+
            "where sp.cbo_type=1 and sp.block_id=?1 and (?2 = -1 or sp.panchayat_id=?2) and sp.is_active=true")
    List<Object[]> getVoDetails(Integer blockId,Integer panchayatId);

    @Query(nativeQuery = true, value="select s.state_name_en as State, d.district_name_en as District, b.block_name_en as Block, "+
            "sp.federation_code as CLFCode,sp.federation_name as CLFName, um.user_id as UserId,um.user_name as UserName,  "+
            "CASE WHEN sp.uploaded_by is not null and sp.activation_status=2 and sp.approve_status=2 "+
            "and sp.user_id is not null THEN 'ApprovedbyBM'   "+
            "WHEN sp.uploaded_by is not null and sp.approve_status=3 and sp.user_id is not null THEN 'RejectedbyBM'  "+
            "WHEN sp.uploaded_by is not null and sp.approve_status=1 and sp.user_id is not null THEN 'PendingwithBM'  "+
            "WHEN sp.uploaded_by is null and sp.user_id is not null THEN 'PendingwithBookkeeper'   "+
            "WHEN sp.user_id is null THEN '-' END  "+
            "as Approvedstatus,  "+
            "CASE WHEN sp.status = 1 THEN 'Active'  "+
            "ELSE 'Inactive' END as CLFStatus,  "+
            "CASE WHEN sp.vo_nic_code is null THEN 'Yes' "+
            "WHEN sp.vo_nic_code is not null THEN 'No' "+
            "END as IsNewCLF from federation_profile sp  "+
            "inner join users_master um on um.user_id=sp.user_id "+
            "inner join state_master s on s.state_id=sp.state_id::int "+
            "inner join district_master d on d.district_id=sp.district_id::int "+
            "inner join block_master b on b.block_id=sp.block_id::int "+
            "where sp.cbo_type=2 and sp.block_id=?1 and sp.is_active=true")
    List<Object[]> getClfDetails(Integer blockId);
    @Query(nativeQuery = true, value="select "+
            "s.state_name_en as State, d.district_name_en as District, b.block_name_en as Block, panchayat_name  as GP,village_name as Village,"+
            "um.user_id as UserId,um.user_name as UserName, r.role_name as UserRoleName ,"+
            "(COALESCE(sp.shg_count,0)+COALESCE(fp.vo_count,0)+COALESCE(fp1.clf_count,0)) as CBOMappedCount, "+
            "CASE WHEN um.status != '0' THEN 'Active' ELSE 'Inactive' END as Status " +
            "from users_master um "+
            "inner join  user_role_rights_map  ur on um.user_id=ur.user_id "+
            "left join (select user_id,role_id,string_agg(distinct panchayat_name_en,',') panchayat_name from (select role_id,user_id,regexp_split_to_table(panchayat_id, ',')panch_id from user_role_rights_map) "+
            "a inner join panchayat_master p on p.panchayat_id::varchar=a.panch_id group by user_id,role_id) panch on ur.user_id=panch.user_id and ur.role_id=panch.role_id "+
            "left join (select user_id,role_id,string_agg(distinct village_name_en,',') village_name from (select role_id,user_id,regexp_split_to_table(village_id, ',')vill_id from user_role_rights_map) "+
            "a inner join village_master v on v.village_id::varchar=a.vill_id group by user_id,role_id) vill on ur.user_id=vill.user_id and ur.role_id=vill.role_id "+
            "inner join state_master s on s.state_id=ur.state_id::int "+
            "inner join district_master d on d.district_id=ur.district_id::int "+
            "inner join block_master b on b.block_id=ur.block_id::int "+
            "inner join roles_master r on r.role_id=ur.role_id "+
            "left join (select user_id,count(*) as shg_count from shg_profile group by user_id) sp "+
            "on sp.user_id=ur.user_id and ur.role_id::int=310 "+
            "left join (select user_id,count(*) as vo_count from federation_profile where cbo_type=1 group by user_id) fp "+
            "on fp.user_id=ur.user_id and ur.role_id::int=410 "+
            "left join (select user_id,count(*) as clf_count from federation_profile where cbo_type=2 group by user_id) fp1 "+
            "on fp1.user_id=ur.user_id and ur.role_id::int=510 "+
            "where (?1 = -1 or ur.state_id::int=?1) and (?2 is null or ur.district_id=?2) and (?3 is null or ur.block_id=?3) and (?4 is null or ur.panchayat_id=?4) and (?5 is null or ur.village_id=?5) and ur.category_id::int <62 "+
            "order by ur.role_id::int ASC")
    List<Object[]> getUserBKDetails(Integer state_id,String district_id, String block_id,String panchayat_id,String village_id);


    @Query(nativeQuery = true, value="select s.state_name_en as State, d.district_name_en as District, b.block_name_en as Block , "+
            "um.user_id as UserId,um.user_name as UserName, r.role_name as UserRoleName, "+
            "CASE WHEN um.status != '0' THEN 'Active' ELSE 'Inactive' END as Status " +
            "from users_master um "+
            "inner join  user_role_rights_map  ur on um.user_id=ur.user_id "+
            "inner join state_master s on s.state_id=ur.state_id "+
            "inner join district_master d on d.district_id::varchar=ur.district_id "+
            "inner join block_master b on b.block_id::varchar=ur.block_id "+
            "inner join roles_master r on r.role_id=ur.role_id "+
            "where (?1 = -1 or ur.state_id::int=?1) and (?2 is null or ur.district_id=?2) and (?3 is null or ur.block_id=?3) and ur.category_id::int >=62 ORDER by ur.role_id ASC")
    List<Object[]> getUserBPMDetails(Integer stateId,String districtId,String blockId);

}
