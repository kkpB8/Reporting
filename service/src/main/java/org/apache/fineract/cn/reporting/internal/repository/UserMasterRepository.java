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

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMasterEntity, Long> {

  UserMasterEntity findByUserId(final String userId);

  @Query("SELECT CASE WHEN COUNT(u) > 0 THEN 'true' ELSE 'false' END FROM UserMasterEntity u WHERE u.userId = :userId")
  Boolean existsByUserId(@Param("userId") final String userId);

  Page<UserMasterEntity> findByStatusNot(final String status, final Pageable pageable);

  Page<UserMasterEntity> findByUserIdContainingOrUserNameContainingOrEmailIdContaining(
          final String userId, final String userName, final String emailId, final Pageable pageable);

  Page<UserMasterEntity> findByStatusNotAndUserIdContainingOrUserNameContainingOrEmailIdContaining(
          final String status, final String userId, final String userName, final String emailId, final Pageable pageable);

  Page<UserMasterEntity> findByMobileNoContaining(final String mobileNo, final Pageable pageable);

}
