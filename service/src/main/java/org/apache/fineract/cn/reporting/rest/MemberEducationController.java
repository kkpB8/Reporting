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
import org.apache.fineract.cn.reporting.api.domain.InactiveCbosRequest;
import org.apache.fineract.cn.reporting.api.domain.InactiveCbosResponse;
import org.apache.fineract.cn.reporting.api.domain.MemberEducationReponse;
import org.apache.fineract.cn.reporting.api.domain.MemberEducationRequest;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.InactiveCboServiceClass;
import org.apache.fineract.cn.reporting.internal.service.MemberEducationService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/member")
public class MemberEducationController extends BaseController{
    private final Logger logger;
    private final MemberEducationService memberEducationService;


    @Autowired
    public MemberEducationController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                 final MemberEducationService memberEducationService) {
        super();
        this.logger = logger;
        this.memberEducationService = memberEducationService;
    }


    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/education",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<MemberEducationReponse>>> getGeoData(@RequestBody MemberEducationRequest request,
                                                                              HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String loctype=request.getLocation_type();
        String dto=request.getState_id();
        String dfrom =request.getDistrict_id();
        String sid=request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.memberEducationService.getmembereducation(loctype,dto,dfrom,sid,tenantIdentifier)));
    }
}
