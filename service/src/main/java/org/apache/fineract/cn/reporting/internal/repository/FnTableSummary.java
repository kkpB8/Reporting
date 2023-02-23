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
import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface FnTableSummary extends JpaRepository<VoTransactionSummaryEntity,Long> {



    @Transactional
    @Modifying
    @Procedure(name = "fn_tbl_summary")
    //@Query(value="select public.fn_tbl_summary_users(?1,?2,?3,?4,?5);",nativeQuery = true)
    int fn_table_summary(@Param("geo_flag")Integer geo_flag, @Param("groupby")String groupby,
                          @Param("wherestr")String wherestr, @Param("insertstr")String insertstr, @Param("yrmn")String yrmn);


    @Transactional
    @Modifying
    @Procedure(name = "fn_tbl_summary_users")
   // @Query(value="select public.fn_tbl_summary_users(?1,?2,?3,?4,?5);",nativeQuery = true)
    int fn_table_summary_user(@Param("geo_flag")Integer geo_flag, @Param("groupby")String groupby,
                          @Param("wherestr")String wherestr, @Param("insertstr")String insertstr, @Param("yrmn")String yrmn);



}
