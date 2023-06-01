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
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.service.SavingApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/saving")
public class SavingApiRestController extends BaseController{

    private final Logger logger;
    private final SavingApiService savingApiService;


    @Autowired
    public SavingApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                   final SavingApiService savingApiService) {
        super();
        this.logger = logger;
        this.savingApiService = savingApiService;
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @PostMapping("/shg-saving")
    public ResponseEntity<GlobalApiResponse<List<ShgSavingResponses>>> getShgSaving(@RequestBody RequestSavingShgReport requestLoanShgReport) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
             this.savingApiService.getShgSaving(requestLoanShgReport.getStateId(),requestLoanShgReport.getDistrictId(),requestLoanShgReport.getBlockId(),requestLoanShgReport.getPanchayatId(),requestLoanShgReport.getVillageId(),requestLoanShgReport.getFromDate(),requestLoanShgReport.getToDate(),requestLoanShgReport.getShgId(),requestLoanShgReport.getVoId(),requestLoanShgReport.getClfId())));

    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @PostMapping("/shg-saving1")
    public ResponseEntity<GlobalApiResponse<List<ShgSavingResponses>>> getShgSaving1(@RequestBody RequestLoanShgReport requestShgSavingReport) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                savingApiService.getShgSaving1(requestShgSavingReport.getStateId(),requestShgSavingReport.getDistrictId(),requestShgSavingReport.getBlockId(),requestShgSavingReport.getPanchayatId(),requestShgSavingReport.getVillageId(),requestShgSavingReport.getFromDate(),requestShgSavingReport.getToDate(),requestShgSavingReport.getShgId(),requestShgSavingReport.getVoId(),requestShgSavingReport.getClfId(),requestShgSavingReport.getGeoGraphicalLevel())));

    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @PostMapping("/vo-saving")
    public ResponseEntity<GlobalApiResponse<List<ResponseForVoSaving>>> getVoSaving(@RequestBody RequestLoanShgReport requestShgSavingReport) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",savingApiService.getVoSaving(requestShgSavingReport.getStateId(),requestShgSavingReport.getDistrictId(),requestShgSavingReport.getBlockId(),requestShgSavingReport.getPanchayatId(),requestShgSavingReport.getFromDate(),requestShgSavingReport.getToDate(),requestShgSavingReport.getVoId(),requestShgSavingReport.getClfId(),requestShgSavingReport.getGeoGraphicalLevel())));

    }

    /*@Permittable(value= AcceptedTokenType.GUEST)
    @PostMapping("/shg-meeting")
    public ResponseEntity<List<ShgMeetingResponse>> getShgMeeting(@RequestBody RequestLoanShgReport requestShgMeeting) {
        return  ResponseEntity.ok(savingApiService.getShgMeeting(requestShgMeeting.getStateId(),requestShgMeeting.getDistrictId(),requestShgMeeting.getBlockId(),requestShgMeeting.getPanchayatId(),requestShgMeeting.getVillageId(),
                requestShgMeeting.getFromDate(),requestShgMeeting.getToDate(),requestShgMeeting.getShgId(),requestShgMeeting.getVoId(),
                requestShgMeeting.getClfId(),requestShgMeeting.getGeoGraphicalLevel()));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @PostMapping("/vo-meeting")
    public ResponseEntity<List<VoMeetingResponse>> getVoMeeting(@RequestBody RequestLoanShgReport requestVoMeeting) {
        return  ResponseEntity.ok(savingApiService.getVoMeeting(requestVoMeeting.getStateId(),requestVoMeeting.getDistrictId(),requestVoMeeting.getBlockId(),requestVoMeeting.getPanchayatId(),requestVoMeeting.getVillageId(),
                requestVoMeeting.getFromDate(),requestVoMeeting.getToDate(),requestVoMeeting.getShgId(),requestVoMeeting.getVoId(),
                requestVoMeeting.getClfId(),requestVoMeeting.getGeoGraphicalLevel()));
    }*/


}
