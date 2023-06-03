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
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.service.CommonApiService;
import org.apache.fineract.cn.reporting.api.domain.LookUpMaster;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/master")
public class CommonApiRestController extends BaseController {

  private final Logger logger;
  private final CommonApiService commonApiService;


  @Autowired
  public CommonApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                 final CommonApiService commonApiService) {
    super();
    this.logger = logger;
    this.commonApiService = commonApiService;
  }

  @Permittable(value= AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/test",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<String>> getTest(@RequestHeader Map<String, String> headers) {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            "success"));
  }
  //VIEW ALL LOOKUP MASTER 30-12-2020
  @Permittable(value= AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/getLookupMaster",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<List<LookUpMaster>>> fetchLookupMaster() {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.commonApiService.fetchLookupMaster()));
  }


}
