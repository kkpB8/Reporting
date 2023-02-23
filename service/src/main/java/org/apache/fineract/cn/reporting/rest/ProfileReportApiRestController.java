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
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.ProfileReportService;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profileReport")
public class ProfileReportApiRestController {

    private final Logger logger;
    private final ProfileReportService profileReportService;

    @Autowired
    public ProfileReportApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,final  ProfileReportService profileReportService) {
        super();
        this.logger = logger;
        this.profileReportService = profileReportService;
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/get-profile-report",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ProfileReportResponse>> fetchProfileReportSummaryList(@RequestBody ProfileReportRequest profileReportRequest) {
        if (profileReportRequest.getGeographicalFlag() != null) {
            return ResponseEntity.ok(
                    this.profileReportService.fetchProfileReportSummaryList(profileReportRequest));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/get-mission-level-report",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity <List <ResponseMissionUnitLevel>> fetchResponseMissionUnitLevelList(@RequestBody ProfileReportRequest profileReportRequest) {
        if (profileReportRequest.getGeographicalFlag() ==1) {
            return ResponseEntity.ok(
                    this.profileReportService.fetchStateWiseMissionLevelReportList(profileReportRequest.getStateId()));
        }
        if(profileReportRequest.getGeographicalFlag() ==2) {
            return ResponseEntity.ok(
                    this.profileReportService.fetchDistrictWiseMissionLevelReportList(profileReportRequest.getStateId(),profileReportRequest.getDistrictId()));
        }
       if(profileReportRequest.getGeographicalFlag() == 3){
            return ResponseEntity.ok(
                    this.profileReportService.fetchBlockWiseMissionLevelReportList(profileReportRequest.getStateId(),profileReportRequest.getDistrictId(),profileReportRequest.getBlockId()));
        }
        else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }
}
