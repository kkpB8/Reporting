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
import org.apache.fineract.cn.reporting.internal.service.SavingReportService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/saving-report")
public class SavingReportController {
    private final Logger logger;
    private final SavingReportService savingReportService;

    public SavingReportController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, SavingReportService savingReportService) {
        this.logger = logger;
        this.savingReportService = savingReportService;
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @GetMapping("/shg-saving")
    public ResponseEntity<?> getShgSaving(@RequestParam("locationType") String locationType, @RequestParam(value = "locationId",defaultValue = "1") int locationId,
                                          @RequestParam(value="fromDate",defaultValue = "2016-10") String fromDate,@RequestParam(value="toDate",defaultValue = "2021-07") String toDate) {
        return ResponseEntity.ok(savingReportService.getShgSaving(locationType,locationId,fromDate,toDate));
    }


}
