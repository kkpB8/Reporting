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
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.CommonApiService;
import org.apache.fineract.cn.reporting.internal.service.TransactionSummaryApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/report1")
public class TransactionSummaryApiRestController {

  private final Logger logger;
  private final TransactionSummaryApiService transactionSummaryApiService;


  @Autowired
  public TransactionSummaryApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                             final TransactionSummaryApiService transactionSummaryApiService) {
    super();
    this.logger = logger;
    this.transactionSummaryApiService = transactionSummaryApiService;
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-shg-meeting",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<List<TransactionSummary>> fetchShgMeetingSummaryList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                      @RequestParam("flag") Integer flag,
                                                                      @RequestParam("fromDate") String fromDate,
                                                                      @RequestParam("toDate") String toDate,
                                                                      @RequestParam("stateId") Integer stateId,
                                                                      @RequestParam("districtId") Integer districtId,
                                                                      @RequestParam("blockId") Integer blockId,
                                                                      @RequestParam("panchayatId") Integer panchayatId,
                                                                      @RequestParam("villageId") Integer villageId,
                                                                      @RequestParam("shgId") BigInteger shgId,
                                                                      @RequestParam("voId") BigInteger voId,
                                                                      @RequestParam("clfId") BigInteger clfId) {
    return ResponseEntity.ok(
            this.transactionSummaryApiService.fetchShgTransactionsSummaryList(geographicalFlag, flag, fromDate, toDate, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId));
  }
//    return ResponseEntity.ok(
//            this.transactionSummaryApiService.fetchShgTransactionSummaryList(transactionSummaryRequest));
//  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-shg-saving",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<List<TransactionSummary>> fetchShgSavingSummaryList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                     @RequestParam("flag") Integer flag,
                                                                     @RequestParam("fromDate") String fromDate,
                                                                     @RequestParam("toDate") String toDate,
                                                                     @RequestParam("stateId") Integer stateId,
                                                                     @RequestParam("districtId") Integer districtId,
                                                                     @RequestParam("blockId") Integer blockId,
                                                                     @RequestParam("panchayatId") Integer panchayatId,
                                                                     @RequestParam("villageId") Integer villageId,
                                                                     @RequestParam("shgId") BigInteger shgId,
                                                                     @RequestParam("voId") BigInteger voId,
                                                                     @RequestParam("clfId") BigInteger clfId) {
    return ResponseEntity.ok(
            this.transactionSummaryApiService.fetchShgTransactionsSummaryList(geographicalFlag, flag, fromDate, toDate, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-shg-loan",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<List<TransactionSummary>> fetchShgLoanSummaryList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                   @RequestParam("flag") Integer flag,
                                                                   @RequestParam("fromDate") String fromDate,
                                                                   @RequestParam("toDate") String toDate,
                                                                   @RequestParam("stateId") Integer stateId,
                                                                   @RequestParam("districtId") Integer districtId,
                                                                   @RequestParam("blockId") Integer blockId,
                                                                   @RequestParam("panchayatId") Integer panchayatId,
                                                                   @RequestParam("villageId") Integer villageId,
                                                                   @RequestParam("shgId") BigInteger shgId,
                                                                   @RequestParam("voId") BigInteger voId,
                                                                   @RequestParam("clfId") BigInteger clfId) {
    return ResponseEntity.ok(
            this.transactionSummaryApiService.fetchShgTransactionsSummaryList(geographicalFlag, flag, fromDate, toDate, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId));
  }
//    return ResponseEntity.ok(
//            this.transactionSummaryApiService.fetchShgTransactionSummaryList(transactionSummaryRequest));
//  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-vo-meeting",
          method = RequestMethod.POST,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<List<VoTransactionSummary>> fetchVoMeetingSummaryList(@RequestBody TransactionSummaryRequest transactionSummaryRequest) {
    return ResponseEntity.ok(
            this.transactionSummaryApiService.fetchVoTransactionSummaryList(transactionSummaryRequest));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-vo-saving",
          method = RequestMethod.POST,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<List<VoTransactionSummary>> fetchVoSavingSummaryList(@RequestBody TransactionSummaryRequest transactionSummaryRequest) {
    return ResponseEntity.ok(
            this.transactionSummaryApiService.fetchVoTransactionSummaryList(transactionSummaryRequest));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-vo-loan",
          method = RequestMethod.POST,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<List<VoTransactionSummary>> fetchVoLoanSummaryList(@RequestBody TransactionSummaryRequest transactionSummaryRequest) {
    return ResponseEntity.ok(
            this.transactionSummaryApiService.fetchVoTransactionSummaryList(transactionSummaryRequest));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/shg-meeting-dd",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public List<ShgMeetingResponse> fetchBranchList(@RequestParam("villageId") Integer villageId) {
    return transactionSummaryApiService.fetchBranchList(villageId);
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/shg-subreports",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public List<SummaryTransactionSubReportsResponse> fetchSubReportsList(@RequestParam("villageId") Integer villageId,
                                                            @RequestParam("voId") Integer voId,
                                                            HttpServletRequest httpServletRequest) {
    if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
      this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
      throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
    }
   String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");
    return transactionSummaryApiService.fetchSubReportsList(villageId, voId, tenantIdentifier);
  }
}