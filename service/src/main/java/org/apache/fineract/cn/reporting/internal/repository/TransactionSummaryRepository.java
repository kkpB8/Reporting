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
public interface TransactionSummaryRepository extends JpaRepository<TransactionSummaryEntity, BigInteger> {

    @Query("FROM TransactionSummaryEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(-1 = :panchayatId or c.panchayatId=:panchayatId) and " +
            "(-1 = :villageId or c.villageId=:villageId) and " +
            //"(:fromDate is null  or c.yearMonth>=:fromDate and :toDate is null or c.yearMonth<=:toDate) and " +
            "(c.yearMonth>=:fromDate and  c.yearMonth<=:toDate) and " +
            "(-1 = :shgId or c.shgId=:shgId) and " +
            "(-1 = :voId or c.voId=:voId) and " +
            "(-1 = :clfId or c.clfId=:clfId) and " +
            "(c.geographicalLevel=:geoGraphicalLevel) and " +
            "(c.flag=:flag) and " +
            //   "(:yearMonth is null or c.yearMonth=:yearMonth)  ")
            "(:yearMonth is null or c.yearMonth=:yearMonth) ORDER BY :orderBy")
    public List<TransactionSummaryEntity> findByFilter(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("panchayatId") final Integer panchayatId,
            @Param("villageId") final Integer villageId,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate,
            @Param("shgId") final BigInteger shgId,
            @Param("voId") final BigInteger voId,
            @Param("clfId") final BigInteger clfId,
            @Param("geoGraphicalLevel") final Integer geoGraphicalLevel,
            @Param("flag") final Integer flag,
            @Param("yearMonth") final String yearMonth,
            @Param("orderBy") final String orderBy
            // @Param("orderBy1") final String orderBy1
    );

    @Query("FROM TransactionSummaryEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(-1 = :panchayatId or c.panchayatId=:panchayatId) and " +
            "(-1 = :villageId or c.villageId=:villageId) and " +
            "(:fromDate is null  or c.yearMonth>=:fromDate and :toDate is null or c.yearMonth<=:toDate) and " +
           // "(c.yearMonth>=:fromDate and  c.yearMonth<=:toDate) and " +
            "(-1 = :shgId or c.shgId=:shgId) and " +
            "(-1 = :voId or c.voId=:voId) and " +
            "(-1 = :clfId or c.clfId=:clfId) and " +
            "(c.geographicalLevel=:geoGraphicalLevel) and " +
            "(c.flag=:flag) and " +
            "(:yearMonth is null or c.yearMonth=:yearMonth) ORDER BY :orderBy")
    public List<TransactionSummaryEntity> findByFilter1(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("panchayatId") final Integer panchayatId,
            @Param("villageId") final Integer villageId,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate,
            @Param("shgId") final BigInteger shgId,
            @Param("voId") final BigInteger voId,
            @Param("clfId") final BigInteger clfId,
            @Param("geoGraphicalLevel") final Integer geoGraphicalLevel,
            @Param("flag") final Integer flag,
            @Param("yearMonth") final String yearMonth,
            @Param("orderBy") final String orderBy
            // @Param("orderBy1") final String orderBy1
    );

    @Query("FROM TransactionSummaryEntity c WHERE " +
            "(c.geographicalLevel=:geoGraphicalLevel) and " +
            "(c.flag=:flag) and " +
            "(c.yearMonth>=:fromDate and  c.yearMonth<=:toDate) and " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(-1 = :panchayatId or c.panchayatId=:panchayatId) and " +
            "(-1 = :villageId or c.villageId=:villageId) and "+
            "(-1 = :shgId or c.shgId=:shgId) and " +
            "(-1 = :voId or c.voId=:voId) and " +
            "(-1 = :clfId or c.clfId=:clfId)")
            public List<TransactionSummaryEntity> findByFilter2(
            @Param("geoGraphicalLevel") final Integer geoGraphicalLevel,
            @Param("flag") final Integer flag,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate,
//            @Param("year") final String year,
//            @Param("qtrhalfyear") final String qtrhalfyear,
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("panchayatId") final Integer panchayatId,
            @Param("villageId") final Integer villageId,
            @Param("shgId") final BigInteger shgId,
            @Param("voId") final BigInteger voId,
            @Param("clfId") final BigInteger clfId
    );

    @Query(nativeQuery = true,value = "select  um.user_name B_K_Name,CAST(vm.village_id as int) village_id ,CAST(count(shg_id) as int) SHGsMapped, " +
            "CAST(count(CASE WHEN to_char(sp.updated_date,'YYYY-MM')='2023-04' then shg_id end) as int) as shgUpdated from village_master vm inner join shg_profile sp on vm.village_id=sp.village_id " +
            "inner join public.users_master um on " +
            "um.user_id=sp.user_id " +
            "where sp.status=1 and sp.is_active='true' and activation_status=2 and sp.user_id is not null " +
            "and (vm.village_id=?1) " +
            "group by vm.village_id,um.user_name")
    List<Object[]> fetchByVillageId(Integer villageId);

}