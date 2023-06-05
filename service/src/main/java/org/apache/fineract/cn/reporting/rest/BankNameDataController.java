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
import org.apache.fineract.cn.reporting.api.domain.BankBranchNameResponse;
import org.apache.fineract.cn.reporting.api.domain.BankNameDataResponse;
import org.apache.fineract.cn.reporting.api.domain.BankWiseCboAccountRequest;
import org.apache.fineract.cn.reporting.api.domain.BankWiseCboAccountResponse;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BankAccountDetailsApiService;
import org.apache.fineract.cn.reporting.internal.service.BankNameDataService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Bankfilter")
public class BankNameDataController extends  BaseController {
    private final Logger logger;
    private final BankNameDataService bankNameDataService;


    @Autowired
    public BankNameDataController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                               final BankNameDataService bankNameDataService) {
        super();
        this.logger = logger;
        this.bankNameDataService =bankNameDataService;
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-name",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<BankNameDataResponse>>> getBanknamedata(HttpServletRequest httpServletRequest) {
        if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.bankNameDataService.getBankNameData(tenantIdentifier)));
    }


    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/branch-name",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<BankBranchNameResponse>>> getBankbranchnamedata(@RequestParam String bank_code, @RequestParam String stateId, HttpServletRequest httpServletRequest) {
        if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
//        String bank_code = httpServletRequest.getHeader("bank_code");
        String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.bankNameDataService.getBankBranchNameData(bank_code,stateId,tenantIdentifier)));
    }
}
