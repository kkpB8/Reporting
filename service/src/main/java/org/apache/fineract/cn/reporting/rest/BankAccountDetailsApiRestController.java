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

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/bankDetail")
public class BankAccountDetailsApiRestController {


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
    ResponseEntity<List<BankAccountDetailsResponse>> getBankAccountData(@RequestBody BankAccountDetailsRequest request,
                                                                        @RequestHeader Map<String, String> headers) {
        if (headers.get("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headers.get("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.bankAccountDetailsApiService.getBankAccountData(location_type, state_id, district_id, block_id, tenantIdentifier));
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
    ResponseEntity<List<BankWiseCboDataResponse>> getBank_wisecboData(@RequestBody BankWiseCboDataRequest request,
                                                                     @RequestHeader Map<String, String> headers) {
        if (headers.get("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String bank_id=request.getBank_id();
        String branch_id=request.getBranch_id();
        String tenantIdentifier = headers.get("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.bankAccountDetailsApiService.getBankwisecboData(location_type, state_id, district_id, block_id, bank_id, branch_id, tenantIdentifier));
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
    ResponseEntity<List<MemberBankAccountDetailsResponse>> getMemberBankAccountData(@RequestBody MemberBankAccountDetailsRequest request,
                                                                                    @RequestHeader Map<String, String> headers) {
        if (headers.get("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headers.get("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.bankAccountDetailsApiService.getMemberBankAccountData(location_type, state_id, district_id, block_id, tenantIdentifier));
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
    ResponseEntity<List<BankWiseCboAccountResponse>> getBankCbowisedetail(@RequestBody BankWiseCboAccountRequest request,
                                                                          @RequestHeader Map<String, String> headers) {
        if (headers.get("X-Tenant-Identifier") == null) {
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
        String tenantIdentifier = headers.get("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.bankAccountDetailsApiService.getBankWiseCbodetail(location_type,state_id,district_id,block_id,btid,bank_id,branch_id,tenantIdentifier));
    }
}