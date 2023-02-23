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

import org.apache.fineract.cn.reporting.api.domain.ResponseMissionUnitLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface ProfileReportRepository extends JpaRepository<ProfileReportEntity, BigInteger>  {

    @Query("FROM  ProfileReportEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(-1 = :panchayatId or c.panchayatId=:panchayatId) and " +
            "(-1 = :villageId or c.villageId=:villageId) and " +
            "(c.geographicalFlag=:geographicalFlag)")
            List<ProfileReportEntity> findByFilter(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("panchayatId") final Integer panchayatId,
            @Param("villageId") final Integer villageId,
            @Param("geographicalFlag") final Integer geographicalFlag
    );


    @Query(nativeQuery = true, value="select State_name_en State,su.*,distcnt,du.*,blockcnt,bu.* from state_master s  " +
    "inner join (select state_id,count(case when role_id='890' then 1 end)SA,count(case when role_id='870' then 1 end)SM ,count(case when role_id='850' then 1 end)ST from user_role_rights_map group by state_id)su on s.state_id=su.state_id " +
    "inner join (select state_id,count(district_id)DistCnt from district_master group by state_id)d on s.state_id=d.state_id " +
    "inner join (select state_id,count(case when role_id='790' then 1 end)DA,count(case when role_id='770' then 1 end)DM ,count(case when role_id='750' then 1 end)DT from user_role_rights_map group by state_id)du on s.state_id=du.state_id " +
    "inner join (select state_id,count(block_id)BlockCnt from block_master group by state_id)b on s.state_id=b.state_id " +
    "inner join (select state_id,count(case when role_id='690' then 1 end)BA,count(case when role_id='670' then 1 end)BM ,count(case when role_id='650' then 1 end)BT from user_role_rights_map group by state_id)bu on s.state_id=bu.state_id where s.state_id=?1")
    List<Object[]> fetchStateWiseMissionLevelReport(Integer stateId);

    @Query(nativeQuery = true, value="select State_name_en State,district_name_en District ,du.*,blockcnt,bu.* from state_master s " +
            "inner join   district_master  d on s.state_id=d.state_id " +
            "inner join (select state_id,count(case when role_id='790' then 1 end)DA,count(case when role_id='770' then 1 end)DM ,count(case when role_id='750' then 1 end)DT from user_role_rights_map group by state_id)du on s.state_id=du.state_id " +
            "inner join (select district_id,count(block_id)BlockCnt from block_master group by district_id)b on d.district_id=b.district_id " +
            "inner join (select district_id,count(case when role_id='690' then 1 end)BA,count(case when role_id='670' then 1 end)BM ,count(case when role_id='650' then 1 end)BT from user_role_rights_map group by district_id)bu on  " +
            "d.district_id::varchar=bu.district_id  where (?1 = -1 or s.state_id=?1) and (?2 = -1 or d.district_id=?2)")
    List<Object[]> fetchDistrictWiseMissionLevelReport(Integer stateId,Integer districtId);

    @Query(nativeQuery = true, value="select State_name_en State,district_name_en District ,d.district_id as districtId ,block_name_en as  Block,bu.* from state_master s " +
    "inner join   district_master  d on s.state_id=d.state_id " +
    "inner join  block_master  b on d.district_id=b.district_id " +
    "inner join (select block_id,count(case when role_id='690' then 1 end)BA,count(case when role_id='670' then 1 end)BM ,count(case when role_id='650' then 1 end)BT from user_role_rights_map group by block_id)bu on " +
    "b.block_id::varchar =bu.block_id where (?1 = -1 or s.state_id=?1) and (?2 = -1 or d.district_id=?2) and (?3 =-1 or b.block_id=?3)")
   List<Object[]> fetchBlockWiseMissionLevelReport(Integer stateId,Integer districtId ,Integer blockId);
}
