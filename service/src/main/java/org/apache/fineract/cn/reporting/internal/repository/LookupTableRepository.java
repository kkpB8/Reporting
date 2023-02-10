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
public interface LookupTableRepository extends JpaRepository<LookUpMasterEntity, BigInteger> {

    @Query("FROM LookUpMasterEntity c WHERE c.lookupCode = :lookupCode AND c.keyCode = :keyCode " +
            "AND c.languageId = :languageId")
    public LookUpMasterEntity findByLookUpCodeAndKeycodeAndLanguageId(@Param("lookupCode") final String lookupCode,@Param("keyCode") final String keyCode,
                                                                     @Param("languageId") final String languageId);


    @Query("FROM LookUpMasterEntity c WHERE c.languageId = :languageId")
    public List<LookUpMasterEntity>  findLookUpByLanguageId(@Param("languageId") final String languageId);

    /*@Query("FROM LookUpMasterEntity c WHERE c.key1 = :key1 AND c.languageId = :languageId " +
            "AND c.isActive = :isActive")*/
    public List<LookUpMasterEntity> findByKey1AndLanguageIdAndIsActive(@Param("key1") final Integer key1,
                                                          @Param("languageId") final String languageId,
                                                          @Param("isActive") final Boolean isActive);



    /*@Query("SELECT DISTINCT ON (c.key1) c.key1, c.key_value FROM LookUpMasterEntity c ORDER BY c.key1, c.key_value")
    public List<LookUpMasterEntity>  findLookUpUniqueKey();


    @Query("SELECT c.key_value FROM LookUpMasterEntity c WHERE c.key1 = :key1 AND c.languageId = :languageId AND c.isActive = :isActive")
    public  List<Object[]> findLookUpByKey1(@Param("key1") final Integer key1,
                                            @Param("languageId") final String languageId,
                                            @Param("isActive") final Boolean isActive);
*/}
