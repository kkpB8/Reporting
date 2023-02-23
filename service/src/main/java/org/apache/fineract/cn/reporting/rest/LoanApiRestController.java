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
package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.RequestLoanShgReport;
import org.apache.fineract.cn.reporting.api.domain.ResponseForVoSaving;
import org.apache.fineract.cn.reporting.api.domain.ResponseLoanShgReport;
import org.apache.fineract.cn.reporting.internal.service.LoanReportService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loanReport")
public class LoanApiRestController {
    private final Logger logger;
    private final LoanReportService loanReportService;

    public LoanApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, LoanReportService loanReportService) {
        this.logger = logger;
        this.loanReportService = loanReportService;
    }


    @Permittable(value= AcceptedTokenType.GUEST)
    @PostMapping("/shg-loan")
    public ResponseEntity<List<ResponseLoanShgReport>> getShgLoan(@RequestBody RequestLoanShgReport requestLoanShgReport) {
        return ResponseEntity.ok(loanReportService.getshgLoanReport(requestLoanShgReport.getStateId(),requestLoanShgReport.getDistrictId(),requestLoanShgReport.getBlockId(),requestLoanShgReport.getPanchayatId(),requestLoanShgReport.getVillageId(),requestLoanShgReport.getFromDate(),requestLoanShgReport.getToDate(),requestLoanShgReport.getShgId(),requestLoanShgReport.getVoId(),requestLoanShgReport.getClfId(),requestLoanShgReport.getGeoGraphicalLevel()));
    }


}
