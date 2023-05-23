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
import org.apache.fineract.cn.reporting.internal.Error.*;
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
public class ProfileReportApiRestController extends  BaseController{

    private final Logger logger;
    private final ProfileReportService profileReportService;

    @Autowired
    public ProfileReportApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final ProfileReportService profileReportService) {
        super();
        this.logger = logger;
        this.profileReportService = profileReportService;
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/get-profile-report",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ProfileReportResponse>>> fetchProfileReportSummaryList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                              @RequestParam("yearMonth") String yearMonth,
                                                                              @RequestParam("stateId") Integer stateId,
                                                                              @RequestParam("districtId") Integer districtId,
                                                                              @RequestParam("blockId") Integer blockId,
                                                                              @RequestParam("panchayatId") Integer panchayatId,
                                                                              @RequestParam("villageId") Integer villageId) {
        if (geographicalFlag != null) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.profileReportService.fetchProfileReportSummaryList(geographicalFlag, yearMonth, stateId, districtId, blockId, panchayatId, villageId)));
        } else {
            throw new BadRequestError("Invalid geographical flag, please give geographical flag");
        }
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/get-mission-level-report",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseMissionUnitLevel>>> fetchResponseMissionUnitLevelList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                                     @RequestParam("stateId") Integer stateId,
                                                                                     @RequestParam("districtId") Integer districtId,
                                                                                     @RequestParam("blockId") Integer blockId) {
        if (geographicalFlag == 1) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.profileReportService.fetchStateWiseMissionLevelReportList(stateId)));
        }
        if (geographicalFlag == 2) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.profileReportService.fetchDistrictWiseMissionLevelReportList(stateId, districtId)));
        }
        if (geographicalFlag == 3) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.profileReportService.fetchBlockWiseMissionLevelReportList(stateId, districtId, blockId)));
        } else {
            throw new BadRequestError(CustomStatus.INVALID_GEOGRAPHICAL_FLAG_MSGS);
        }
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/get-block-saturation",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseBs>>> fetchList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                               @RequestParam("stateId") Integer stateId,
                                               @RequestParam("districtId") Integer districtId,
                                               @RequestParam("yearMonth") String yearMonth) {
        if (geographicalFlag == 1) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.profileReportService.fetchBlockSaturation(yearMonth, stateId)));
        }
        if (geographicalFlag == 2) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.profileReportService.fetchBlockSaturationList(yearMonth, stateId, districtId)));
        } else {
            throw new BadRequestError(CustomStatus.INVALID_GEOGRAPHICAL_FLAGS_MSG);
        }
    }
}
