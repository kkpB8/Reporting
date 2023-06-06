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
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BankAccountDetailsApiService;
import org.apache.fineract.cn.reporting.internal.service.GeographicalCoverageApiService;
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
@RequestMapping("/bankDetail")
public class BankAccountDetailsApiRestController extends BaseController {


    private final Logger logger;
    private final BankAccountDetailsApiService bankAccountDetailsApiService;


    @Autowired
    public BankAccountDetailsApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                               final BankAccountDetailsApiService bankAccountDetailsApiService) {
        super();
        this.logger = logger;
        this.bankAccountDetailsApiService = bankAccountDetailsApiService;
    }


    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-details",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<BankAccountDetailsResponse>>> getBankAccountData(@RequestBody BankAccountDetailsRequest request,
                                                                                           HttpServletRequest headerRequest) {
        if (headerRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.bankAccountDetailsApiService.getBankAccountData(location_type, state_id, district_id, block_id, tenantIdentifier)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-wisecbo",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<BankWiseCboDataResponse>>> getBank_wisecboData(@RequestBody BankWiseCboDataRequest request,
                                                                                         HttpServletRequest headerRequest) {
        if (headerRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String bank_id=request.getBank_id();
        String branch_id=request.getBranch_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.bankAccountDetailsApiService.getBankwisecboData(location_type, state_id, district_id, block_id, bank_id, branch_id, tenantIdentifier)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/member-bank-details",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<MemberBankAccountDetailsResponse>>> getMemberBankAccountData(@RequestBody MemberBankAccountDetailsRequest request,
                                                                                                       HttpServletRequest headerRequest) {
        if (headerRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.bankAccountDetailsApiService.getMemberBankAccountData(location_type, state_id, district_id, block_id, tenantIdentifier)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-cbo-details",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<BankWiseCboAccountResponse>>> getBankCbowisedetail(@RequestBody BankWiseCboAccountRequest request,
                                                                                             HttpServletRequest headerRequest) {
        if (headerRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String btid = request.getBtid();
        String bank_id = request.getBank_id();
        String branch_id = request.getBranch_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.bankAccountDetailsApiService.getBankWiseCbodetail(location_type,state_id,district_id,block_id,btid,bank_id,branch_id,tenantIdentifier)));
    }
}