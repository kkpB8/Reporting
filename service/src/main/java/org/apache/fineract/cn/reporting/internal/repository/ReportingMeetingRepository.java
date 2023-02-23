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
import java.util.List;

public interface ReportingMeetingRepository extends JpaRepository<LookUpMasterEntity, BigInteger> {
    @Query(value="select * from get_location_master(?1,?2)",nativeQuery=true)
    List<Object[]> getLocationMasterByLocationTypeAndId(String locationType, int parentLocationId);

    @Query(value="select * from shg_meeting(?1,?2)",nativeQuery=true)
    List<Object[]> getShgMeetingData(String locationType, int locationId);

    @Query(value="select * from clf_meeting(?1,?2)",nativeQuery=true)
    List<Object[]> getClfMeetingData(String locationType, int locationId);

    @Query(value="select * from vo_meeting(?1,?2)",nativeQuery=true)
    List<Object[]> getVoMeetingData(String locationType, int locationId);

    @Query(value="select * from shg_meeting(?1,?2)",nativeQuery=true)
    List<Object[]> getShgMeetingDataNew(String locationType, int locationId);
    @Query(value="select * from vo_meeting_api_v4(?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery=true)
    List<Object[]> getVoMeeting(String stateName, String districtName, String blockName, String panchayatName, String villageName,
                                String fromYear, String fromMonth, String toYear, String toMonth );

    @Query(value="select * from shg_meeting_regularity_api_v5(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
    List<Object[]> geShgMeetingRegularity(String stateName, String districtName, String blockName, String panchayatName,
                                          String fromYear, String fromMonth, String toYear, String toMonth  );

    @Query(value="select * from shg_meeting_by_state_name_api_v6(?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery=true)
    List<Object[]> getShgMeeting(String stateName, String districtName, String blockName, String panchayatName, String villageName,
                                 String fromYear, String fromMonth, String toYear, String toMonth  );
    @Query(value="select * from shg_meeting_attendance_api_v3(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
    List<Object[]> getShgMeetingAttendance(String stateName, String districtName, String blockName, String panchayatName,
                                           String fromYear, String fromMonth, String toYear, String toMonth );
    @Query(value="select * from vo_meeting_regularity_api_v2(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
    List<Object[]> getVoMeetingRegularity(String stateName, String districtName, String blockName, String panchayatName,
                                          String fromYear, String fromMonth, String toYear, String toMonth  );

    @Query(value="select * from vo_meeting_attendence_api_v4(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
    List<Object[]> getVoMeetingAttendance(String stateName, String districtName, String blockName, String panchayatName,
                                          String fromYear, String fromMonth, String toYear, String toMonth );

    @Query(value="select state_name_en from state_master where state_id=?1 ",nativeQuery=true)
    String getStatName(Integer stateId);
    @Query(value="select district_name_en from district_master where district_id=?1",nativeQuery=true)
    String getDistrictName(Integer districtId);
    @Query(value="select block_name_en from block_master where block_id=?1",nativeQuery=true)
    String getBlockName(Integer blockId);
    @Query(value="select panchayat_name_en from panchayat_master where panchayat_id=?1",nativeQuery=true)
    String getPanchayatName(Integer panchayatId);
    @Query(value="select village_name_en from village_master where village_id=?1",nativeQuery=true)
    String getVillageName(Integer villageId);
    @Query(value="select um.id ,um.user_name ,SUM(CASE WHEN fp.updated_date  is not null  then 1 ELSE 0 END) as voupdated,\n" +
            "SUM(CASE WHEN fp.user_id is not null  then 1 ELSE 0 END) as totalmappedvo\n" +
            "from user_role_rights_map urrm \n" +
            "inner join federation_profile  fp on fp.user_id =urrm.user_id and urrm.role_id='410' \n" +
            "left join vo_mtg vm2  on vm2.cbo_id =fp.federation_id and To_CHAR(vm2.mtg_date,'YYYY-MM') \n" +
            "between ?2 and ?3\n" +
            "inner join village_master vm on vm.village_id=fp.village_id and vm.village_name_en=?1\n" +
            "inner join users_master um on um.user_id =urrm .user_id\n" +
            "group by um.id,um.user_name",nativeQuery=true)
    List<Object[]> getVoMeetingVillage(String villageName, String fromYears, String toYears);
    @Query(value=" select um.id ,um.user_name ,SUM(CASE WHEN sp.updated_date  is not null  then 1 ELSE 0 END) as shgupdated,\n" +
            "            SUM(CASE WHEN sp.user_id is not null  then 1 ELSE 0 END) as totalmappedshg\n" +
            "            from user_role_rights_map urrm\n" +
            "            inner join users_master um on um.user_id =urrm .user_id and urrm.role_id='310'\n" +
            "            left join shg_profile sp on sp.user_id =urrm.user_id  and To_CHAR(sp.created_date ,'YYYY-MM') between ?2 and ?3\n" +
            "            inner join village_master vm on vm.village_id=sp.village_id and vm.village_name_en=?1 \n" +
            "            group by um.id,um.user_name",nativeQuery=true)
    List<Object[]> getShgMeetingVillage(String villageName, String fromYears, String toYears);

    @Query(value="  select sp.shg_name,sp.meeting_frequency as meetingfrequency,\n" +
            "          (cast (CURRENT_DATE as date) -  cast(sp.created_date as date))/30 *sp.meeting_frequency as totalMeetingtobeconducted,\n" +
            "             count(smg.cbo_id) as totalConductedMeeting\n" +
            "                     from shg_profile sp \n" +
            "                     left join user_role_rights_map urrm on urrm .user_id =sp.user_id and urrm.role_id='310'\n" +
            "                     inner join village_master vm on vm.village_id =sp.village_id   and vm.village_name_en=?1\n" +
            "                     left join shg_mtg smg on smg.cbo_id=sp.shg_id and To_CHAR(smg.mtg_date,'YYYY-MM') \n" +
            "                     between ?2 and ?3\n" +
            "                     group by sp.shg_name,sp.created_date,sp.meeting_frequency  ",nativeQuery=true)
    List<Object[]> getShgMeetingRegularityVillage(String villageName, String fromYears, String toYears);
    @Query(value=" select initialdata.shg_name,totalmember,numberofmeetingconducted,totalattendance,cast (totalattendance as float)/cast((totalmember*numberofmeetingconducted) as numeric) *100\n" +
            "as totalmeetingpercent from (select sp.shg_id ,sp.shg_name,count(mp.cbo_id) as totalmember \n" +
            "from shg_profile sp \n" +
            "inner join user_role_rights_map urrm on urrm .user_id =sp.user_id and urrm.role_id='310'\n" +
            "inner join village_master vm on vm.village_id =sp.village_id   and vm.village_name_en=?1\n" +
            "inner join member_profile mp on mp.cbo_id=sp.shg_id  \n" +
            "group by sp.shg_id,sp.shg_name ) as initialdata\n" +
            "left join\n" +
            "(select sp.shg_id ,sp.shg_name,count(sm.cbo_id) as numberofmeetingconducted from shg_profile sp   \n" +
            "inner join shg_mtg sm on sm.cbo_id =sp.shg_id  and To_CHAR(sm.mtg_date,'YYYY-MM') \n" +
            "between ?2 and ?3\n" +
            "group by sp.shg_id,sp.shg_name ) as mtgdata\n" +
            "on initialdata.shg_id=mtgdata.shg_id \n" +
            "left join\n" +
            "(select sp.shg_id,sp.shg_name ,count(smd.mem_id) as totalattendance, (count(smd.mem_id)/(count(distinct(smd.mem_id))*count(distinct(smd.shg_mtg_uid)) ))*100 as totalmeetingpercent\n" +
            "from shg_profile sp \n" +
            "inner join  shg_mtg_det smd on sp.shg_id=smd.cbo_id  \n" +
            "group by sp.shg_id,sp.shg_name ) as attendance\n" +
            "on attendance.shg_id=initialdata.shg_id order by totalmeetingpercent asc",nativeQuery=true)
    List<Object[]> getShgMeetingAttendanceVillage(String villageName, String fromYears, String toYears);
    @Query(value=" select fp.federation_name , \n" +
            "fp.meeting_frequency,\n" +
            " (cast (CURRENT_DATE as date) -  cast(fp.created_date as date))/30 *fp.meeting_frequency as  totalMettingtobeconducted,\n" +
            "count(vm.cbo_id) as totalConductedMeeting\n" +
            "from village_master vm2 \n" +
            "left join federation_profile fp on fp.village_id  =vm2.village_id  and fp.cbo_type ='1' " +
            "and vm2.village_name_en=?1 " +
            "inner join user_role_rights_map urrm on urrm.user_id=fp.user_id and urrm.role_id ='410'\n" +
            "left join vo_mtg vm on vm.cbo_id =fp.federation_id and To_CHAR(vm.mtg_date,'YYYY-MM')\n" +
            "between ?2 and ?3\n" +
            "where fp.federation_name  is not null \n" +
            "group  by fp.federation_name,fp.created_date,fp.meeting_frequency,vm2.village_id ",nativeQuery=true)
    List<Object[]> getVoMeetingRegularityVillage(String villageName, String fromYears, String toYears);
    @Query(value=" select initialdata.federation_name,totalmember,totalmeeting, cast (totalattendance/(totalmember*totalmeeting)as float)*100 as attendancepercent from (select fp.federation_id ,fp.federation_name,count(em.cbo_id) as totalmember  from federation_profile fp \n" +
            "inner join executive_member em on fp.federation_id =em.cbo_id and fp.cbo_type =1 inner join" +
            " user_role_rights_map urrm on urrm.user_id=fp.user_id and urrm.role_id ='410'\n" +
            "left  join village_master vm2  on vm2.village_id  =fp.village_id and vm2.village_name_en=?1\n" +
            "group by federation_id,federation_name  \n" +
            "order by totalmember  desc) as initialdata\n" +
            "left join\n" +
            "(select fp.federation_id ,count(vm.cbo_id) as totalmeeting  from vo_mtg vm \n" +
            "left join federation_profile fp on fp.federation_id =vm.cbo_id  and fp.cbo_type =1 and To_CHAR(vm.mtg_date,'YYYY-MM')\n" +
            " between ?2 and ?3\n" +
            "group by fp.federation_id) as meetingfrequency\n" +
            "on initialdata.federation_id=meetingfrequency.federation_id\n" +
            "left join\n" +
            "(select vmd.cbo_id,count(vmd.mem_id) as totalattendance from vo_mtg_det vmd \n" +
            "  right join federation_profile fp2 on fp2.federation_id =vmd.cbo_id and fp2.cbo_type=1\n" +
            "  group by vmd.cbo_id \n" +
            ") as attendancedata\n" +
            "on attendancedata.cbo_id=initialdata.federation_id\n",nativeQuery=true)
    List<Object[]> getVoMeetingAttendanceVillage(String villageName, String fromYears, String toYears);

    @Query(value="select sm.state_name_en ,(case when sm.state_id <10 then LPAD(sm.state_id::varchar,'2','0') else sm.state_id::varchar end )\n" +
            " as locationid,sm.state_name_en as locationname,\n" +
            "count(distinct(sp.shg_id)) as totalshg,SUM(CASE WHEN sp.user_id is not null  then 1 ELSE 0 END) as \"totalmappedshg\",\n" +
            "count(smg.uid) as shgCondutingMeeting,\n" +
            "case when SUM(CASE WHEN sp.user_id is not null  then 1 ELSE 0 end)= 0 then round(cast(0.00 as numeric),2) else \n" +
            "round(cast((cast(count(smg.uid) as float)/cast(SUM(CASE WHEN sp.user_id is not null  then 1 ELSE 0 END)as float))*100 as numeric),2)  end as shgcondutingmeetingpercent\n" +
            "from state_master sm \n" +
            "left join shg_profile sp on sp.state_id=sm.state_id \n" +
            "left join shg_mtg smg on smg.cbo_id=sp.shg_id and To_CHAR(smg.mtg_date ,'YYYY-MM') between '2020-08' and '2022-09' \n" +
            "group by sm.state_name_en ,sm.state_id ",nativeQuery=true)
    List<Object[]> getshgtest();


    @Query(value="select * from shg_meeting_attendance_date_v2(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
    List<Object[]> getShgMeetingAttendanceNew(String stateName, String districtName, String blockName, String panchayatName,
                                              String fromYear, String fromMonth, String toYear, String toMonth);

    @Query(value="select * from shg_meeting_regularity_date_v3(?1,?2,?3,?4,?5,?6,?7,?8)",nativeQuery=true)
    List<Object[]> geShgMeetingRegularityPercent(String stateName, String districtName, String blockName, String panchayatName,
                                                 String fromYear, String fromMonth, String toYear, String toMonth  );

    @Query(value="select * from vo_meeting_regularity_date_v2(?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery=true)
    List<Object[]> getVoMeetingRegularityPercent(String stateName, String districtName, String blockName, String panchayatName,
                                                 String fromYear, String fromMonth, String toYear, String toMonth, Integer cboType  );

    @Query(value="select * from vo_meeting_attendance_date_v2(?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery=true)
    List<Object[]> getVoMeetingAttendancePercent(String stateName, String districtName, String blockName, String panchayatName,
                                                 String fromYear, String fromMonth, String toYear, String toMonth , Integer cboType);
    @Query(value="select * from shg_meeting_regularity_clf_vo_v1(?1,?2,?3,?4,?5)",nativeQuery=true)
    List<Object[]> geShgMeetingRegularityClfVo(Integer cboType, String fromYear, String fromMonth, String toYear, String toMonth);

    @Query(value="select * from shg_meeting_attendance_clf_vo_v1(?1,?2,?3,?4,?5,?6,?7)",nativeQuery=true)
    List<Object[]> geShgMeetingAttendanceClfVo(String blockName, String clfCode, String fromYear, String fromMonth, String toYear, String toMonth, Integer cboType);

    @Query(value="select * from shg_meeting_regularity_clf_vo_v2(?1,?2,?3,?4,?5,?6,?7)",nativeQuery=true)
    List<Object[]> geShgMeetingRegularityClfVo(Integer cboType, String blockName, String clfCode, String fromYear, String fromMonth, String toYear, String toMonth);


    @Query(value="  select sp.shg_name,sp.meeting_frequency as meetingfrequency,\n" +
            "                     (cast (CURRENT_DATE as date) -  cast(sp.created_date as date))/30 *sp.meeting_frequency as totalMeetingtobeconducted,\n" +
            "                        count(smg.cbo_id) as totalConductedMeeting\n" +
            "                              from shg_profile sp \n" +
            "                               inner join federation_profile fp on fp.federation_id =sp.parent_cbo_code and fp.federation_id=?1\n" +
            "                                left join shg_mtg smg on smg.cbo_id=sp.shg_id and To_CHAR(smg.mtg_date,'YYYY-MM') \n" +
            "                                between ?2 and ?3\n" +
            "                               group by sp.shg_name,sp.created_date,sp.meeting_frequency  ",nativeQuery=true)
    List<Object[]> getShgMeetingRegularityVo(Integer voId, String fromYears, String toYears);

    @Query(value=" select initialdata.shg_name,totalmember,coalesce(numberofmeetingconducted,0) as numberofmeetingconducted ,coalesce (totalattendance,0) as totalattendance ,coalesce (cast (totalattendance as float)/cast((totalmember*numberofmeetingconducted) as numeric) *100,0)\n" +
            " as totalmeetingpercent from (select sp.shg_id ,sp.shg_name,count(mp.cbo_id) as totalmember\n" +
            " from shg_profile sp " +
            "inner join federation_profile fp on fp.federation_id =sp.parent_cbo_code and fp.federation_id=?1\n" +
            "left join member_profile mp on mp.cbo_id=sp.shg_id  \n" +
            "group by sp.shg_id,sp.shg_name ) as initialdata\n" +
            "left join\n" +
            "(select sp.shg_id ,sp.shg_name,count(sm.cbo_id) as numberofmeetingconducted from shg_profile sp   \n" +
            "inner join shg_mtg sm on sm.cbo_id =sp.shg_id  and To_CHAR(sm.mtg_date,'YYYY-MM') \n" +
            "between ?2 and ?3\n" +
            "group by sp.shg_id,sp.shg_name ) as mtgdata\n" +
            "on initialdata.shg_id=mtgdata.shg_id \n" +
            "left join\n" +
            "(select sp.shg_id,sp.shg_name ,count(smd.mem_id) as totalattendance, (count(smd.mem_id)/(count(distinct(smd.mem_id))*count(distinct(smd.shg_mtg_uid)) ))*100 as totalmeetingpercent\n" +
            "from shg_profile sp \n" +
            "inner join  shg_mtg_det smd on sp.shg_id=smd.cbo_id  \n" +
            "group by sp.shg_id,sp.shg_name ) as attendance\n" +
            "on attendance.shg_id=initialdata.shg_id order by totalmeetingpercent asc",nativeQuery=true)
    List<Object[]> getShgMeetingAttendanceVo(Integer voId, String fromYears, String toYears);

    @Query(value=" select fp2.federation_id ,fp2.federation_name  as location_name,\n" +
            "fp2.meeting_frequency as meetingfrequency,\n" +
            "cast(sum(fp2.meeting_frequency) as int)as  totalMettingtobeconducted,\n" +
            "count(vm.cbo_id) as totalConductedMeeting\n" +
            "from federation_profile fp2 \n" +
            "left join vo_mtg vm on vm.cbo_id =fp2.federation_id  and To_CHAR(vm.mtg_date,'YYYY-MM')\n" +
            "between ?2 and ?3 where fp2.cbo_type='1' and fp2.parent_cbo_code=?1\n" +
            "group  by fp2.federation_id,fp2.federation_name ",nativeQuery=true)
    List<Object[]> getVoMeetingRegularityVo(Integer clfCode, String fromYears, String toYears);

    @Query(value=" select initialdata.federation_name,totalmember,coalesce (totalmeeting,0) as totalmeeting, coalesce (cast (totalattendance/(totalmember*totalmeeting)as float)*100,0) as attendancepercent from (select fp.federation_id ,fp.federation_name,count(em.cbo_id) as totalmember  from federation_profile fp\n" +
            "            left join executive_member em on fp.federation_id =em.cbo_id \n" +
            "            where fp.parent_cbo_code=?1 and fp.cbo_type=1\n" +
            "            group by federation_id,federation_name \n" +
            "            order by totalmember  desc) as initialdata\n" +
            "            left join\n" +
            "            (select fp.federation_id ,count(vm.cbo_id) as totalmeeting  from vo_mtg vm \n" +
            "            left join federation_profile fp on fp.federation_id =vm.cbo_id  and fp.cbo_type =1 and To_CHAR(vm.mtg_date,'YYYY-MM')\n" +
            "             between ?2 and ?3\n" +
            "            group by fp.federation_id) as meetingfrequency\n" +
            "            on initialdata.federation_id=meetingfrequency.federation_id\n" +
            "            left join\n" +
            "            (select vmd.cbo_id,count(vmd.mem_id) as totalattendance from vo_mtg_det vmd \n" +
            "              right join federation_profile fp2 on fp2.federation_id =vmd.cbo_id and fp2.cbo_type=1\n" +
            "              group by vmd.cbo_id )\n" +
            "             as attendancedata\n" +
            "            on attendancedata.cbo_id=initialdata.federation_id\n",nativeQuery=true)
    List<Object[]> getVoMeetingAttendanceVo(Integer clfcode, String fromYears, String toYears);

    @Query(value=" select 'clf' as locationtype,cast(locationid as varchar),location_name,totalfederation,\n" +
            "coalesce(fiftypercent,0) as fiftypercent,\n" +
            "coalesce(fiftyseventy,0) as fiftyseventy,\n" +
            "coalesce(seventyninety,0) as seventyninety,\n" +
            "coalesce(ninetypercent,0) as ninetypercent\n" +
            "from (select  fp2.federation_id as locationid,fp2.federation_name as location_name,count(fp.federation_id)  as totalfederation,\n" +
            "sum(fp2.meeting_frequency) as  totalMettingtobeconducted,\n" +
            "count(vm.cbo_id) as totalConductedMeeting\n" +
            "from federation_profile fp \n" +
            "inner join federation_profile fp2 on fp.parent_cbo_code=fp2.federation_id  and fp2.cbo_type=2\n" +
            "inner join block_master bm on bm.block_id=fp.block_id and bm.block_name_en =?1\n" +
            "left join vo_mtg vm on vm.cbo_id =fp.federation_id  and To_CHAR(vm.mtg_date,'YYYY-MM')\n" +
            " between ?2 and ?3\n" +
            "group  by fp2.federation_id,fp2.federation_name ) as initialdata\n" +
            "left join \n" +
            "(select federation_id as location_ids,\n" +
            "sum(case when meetingpercent<50 then 1 else 0 end) as fiftypercent,\n" +
            "sum(case when meetingpercent>50 and meetingpercent<70 then 1 else 0 end) as fiftyseventy,\n" +
            "sum(case when meetingpercent>70 and meetingpercent<90 then 1 else 0 end) as seventyninety,\n" +
            "sum(case when meetingpercent>90 then 1 else 0 end) as ninetypercent\n" +
            "from(select fp2.federation_id ,vm.uid,fp2.federation_name ,sum(fp2.meeting_frequency) as totalmeetingtobeconducted\n" +
            ",count(vm.uid) as conductedmeeting\n" +
            ",cast(count(vm.uid) as float)/nullif (cast(sum(fp2.meeting_frequency) as float),0)*100 as meetingpercent\n" +
            "from  federation_profile fp\n" +
            "inner join federation_profile fp2 on fp.parent_cbo_code=fp2.federation_id  and fp2.cbo_type=2\n" +
            "inner join block_master bm on bm.block_id=fp.block_id and bm.block_name_en =?1\n" +
            "left join vo_mtg vm  on vm.cbo_id =fp.federation_id  and To_CHAR(vm.mtg_date,'YYYY-MM')\n" +
            " between ?2 and ?3\n" +
            "group by fp2.federation_id ,vm.uid ,fp2.federation_name having count(vm.uid)>0) as data group by federation_id) as percentdata\n" +
            "on initialdata.locationid=percentdata.location_ids order by locationid asc",nativeQuery=true)
    List<Object[]> getVoMeetingRegularityClf(String blockName , String fromYears, String toYears);

    @Query(value=" select 'clf' as locationtype, cast (initialdata.location_id as varchar) \n" +
            "as locationid\n" +
            ",location_name,initialdata.totalfederation totalfedration,coalesce(fiftypercentcount,0) as fiftypercentcount,\n" +
            "coalesce(fiftyseventy,0) as fiftyseventy,\n" +
            "coalesce(seventyninety,0) as seventyninety,\n" +
            "coalesce(ninetypercent,0) as ninetypercent\n" +
            "from\n" +
            "(select  fp2.federation_id as location_id,fp2.federation_name as location_name,count(fp.federation_id)  as totalfederation\n" +
            "from federation_profile fp \n" +
            "inner join federation_profile fp2 on fp.parent_cbo_code=fp2.federation_id  and fp2.cbo_type=2\n" +
            "inner join block_master bm on bm.block_id=fp.block_id and bm.block_name_en =?1\n" +
            "group  by fp2.federation_id,fp2.federation_name\n" +
            ") as initialdata\n" +
            "left join\n" +
            "(select federation_id,sum(case when attendancepercent<50 then 1 else 0 end )as fiftypercentcount,\n" +
            "sum(case when attendancepercent>50 and attendancepercent<70 then 1 else 0 end) as fiftyseventy,\n" +
            "sum(case when attendancepercent>70 and attendancepercent<90 then 1 else 0 end) as seventyninety,\n" +
            "sum(case when attendancepercent>90 then 1 else 0 end) as ninetypercent\n" +
            "from(select fp2.federation_id,fp2.federation_name,\n" +
            "count(distinct(vmd.mem_id)) as totalAttendentMember,\n" +
            "cast(count(distinct(vmd.mem_id)) as float)/cast(count(distinct(vm.uid))*count(distinct(vmd2.mem_id)) as float)*100 as attendancepercent\n" +
            "from federation_profile fp \n" +
            "inner join federation_profile fp2 on fp.parent_cbo_code=fp2.federation_id  and fp2.cbo_type=2\n" +
            "left join vo_mtg vm on  vm.cbo_id=fp.federation_id and To_CHAR(vm.mtg_date,'YYYY-MM')\n" +
            " between ?2 and ?3 \n" +
            "left join vo_mtg_det vmd on vm.uid =vmd.vo_mtg_uid and vmd.attendance='1'\n" +
            "inner join vo_mtg_det vmd2 on vm.uid =vmd2.vo_mtg_uid\n" +
            "group by fp2.federation_id,fp2.federation_name) as data group by federation_id)as percentdata on initialdata.location_id=percentdata.federation_id order by locationid asc;\n",nativeQuery=true)
    List<Object[]> getVoMeetingAttendanceClf(String blockName , String fromYears, String toYears);
}
