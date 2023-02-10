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
import org.apache.fineract.cn.reporting.api.domain.AccountDataResponse;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NumberOfAccountDataServiceClass {
    private final Logger logger;
    private final  PGFunctionProcedureService  numberofaccountdataservice;
    @Autowired
    public NumberOfAccountDataServiceClass(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final PGFunctionProcedureService numberofaccountdataservice) {
        super();
        this.logger = logger;
        this.numberofaccountdataservice = numberofaccountdataservice;
    }
    public List<AccountDataResponse> getnumberofaccountdata(String locationtype, String state_id, String district_id,
                                                                    String block_id, String tenantIdentifier) {
        return numberofaccountdataservice.fn_Numberofaccount(locationtype,state_id, district_id, block_id, tenantIdentifier);
    }
}
