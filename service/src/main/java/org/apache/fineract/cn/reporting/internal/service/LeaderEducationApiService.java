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
package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.GeographicalCoverage;
import org.apache.fineract.cn.reporting.api.domain.LeaderEducationResponse;
import org.apache.fineract.cn.reporting.api.domain.LeaderLiveliHoodResponse;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@org.springframework.transaction.annotation.Transactional
public class LeaderEducationApiService {

        private final Logger logger;
        private final PGFunctionProcedureService pgFunctionProcedureService;
        @Autowired
        public LeaderEducationApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                              final PGFunctionProcedureService pgFunctionProcedureService) {
            super();
            this.logger = logger;
            this.pgFunctionProcedureService = pgFunctionProcedureService;
        }

    public List<LeaderEducationResponse> getLeaderEducationData(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                                String block_id, String tenantIdentifier) {
        return pgFunctionProcedureService.fn_leadereducationdetails(location_type,date_to,date_from, state_id, district_id, block_id, tenantIdentifier);
    }
        public List<LeaderLiveliHoodResponse> getLeaderData(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                            String block_id, String tenantIdentifier) {
            return pgFunctionProcedureService.fn_leaderlivelihoodactivity(location_type,date_to,date_from, state_id, district_id, block_id, tenantIdentifier);
        }
}
