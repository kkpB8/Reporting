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
import org.apache.fineract.cn.reporting.api.domain.ReportRequestDto;
import org.apache.fineract.cn.reporting.api.domain.ShgVoClfRequestDto;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.service.MettingReportsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/report")
public class MettingReportController extends  BaseController{

    private final MettingReportsService reportingServices;

    public MettingReportController(MettingReportsService reportingServices) {
        this.reportingServices = reportingServices;
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
                "success for report"));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/shg-meeting")
    public ResponseEntity<GlobalApiResponse<List<?>>> getShgMeetingTest(@RequestBody ReportRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.reportingServices.getShgMeeting(reportRequestDto)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/shg-meeting-village")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingVillage(@RequestParam("villageName") String villageName,@RequestParam(value="fromDate",defaultValue = "2010") String fromYear,@RequestParam(value = "fromMonth",defaultValue = "01") String fromMonth,@RequestParam(value = "toYear",defaultValue = "2022") String toYear,@RequestParam(value = "toMonth",defaultValue = "08") String toMonth) {
        System.out.println("Hello");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                reportingServices.getShgMeetingVillage(villageName,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/shg-meeting-regularity-village-percent")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingRegularityVillagePercent(@RequestBody ReportRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                reportingServices.getShgMeetingRegularity(reportRequestDto)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/shg-meeting-regularity-village")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingRegularityVillage(@RequestParam("villageName") String villageName,@RequestParam(value="fromDate",defaultValue = "2010") String fromYear,@RequestParam(value = "fromMonth",defaultValue = "01") String fromMonth,@RequestParam(value = "toYear",defaultValue = "2022") String toYear,@RequestParam(value = "toMonth",defaultValue = "08") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",this.reportingServices.getShgMeetingRegularityVillage(villageName,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/shg-meeting-regularity-vo")
    public ResponseEntity<GlobalApiResponse<List<?>>> getShgMeetingRegularityVo(@RequestParam("voCode") Integer voCode,@RequestParam(value="fromYear",defaultValue = "2010") String fromYear,@RequestParam(value = "fromMonth",defaultValue = "01") String fromMonth,@RequestParam(value = "toYear",defaultValue = "2022") String toYear,@RequestParam(value = "toMonth",defaultValue = "08") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200", reportingServices.getShgMeetingRegularityVo(voCode, fromYear, fromMonth, toYear, toMonth)));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/shg-meeting-regularity-clf-vo")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingRegularityClfVo(@RequestBody ShgVoClfRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getShgMeetingRegularityClfVo(reportRequestDto)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/shg-meeting-attendance-percent")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingAttendDancePercent(@RequestBody ReportRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getShgMeetingAttendance(reportRequestDto)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/shg-meeting-attendance-clf-vo")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingAttendanceClfVo(@RequestBody ShgVoClfRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getShgMeetingAttendanceClfVo(reportRequestDto)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/shg-meeting-attendance-village")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingAttendanceVillage(@RequestParam("villageName") String villageName,@RequestParam(value="fromDate",defaultValue = "2010") String fromYear,@RequestParam(value = "fromMonth",defaultValue = "01") String fromMonth,@RequestParam(value = "toYear",defaultValue = "2022") String toYear,@RequestParam(value = "toMonth",defaultValue = "08") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getShgMeetingAttendanceVillage(villageName,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/shg-meeting-attendance-vo")
    public ResponseEntity<GlobalApiResponse<?>> getShgMeetingAttendanceVo(@RequestParam("voCode") Integer voCode,@RequestParam(value="fromDate",defaultValue = "2010") String fromYear,@RequestParam(value = "fromMonth",defaultValue = "01") String fromMonth,@RequestParam(value = "toYear",defaultValue = "2022") String toYear,@RequestParam(value = "toMonth",defaultValue = "08") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getShgMeetingAttendanceVo(voCode, fromYear, fromMonth, toYear, toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/vo-meeting")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeeting(@RequestBody ReportRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeeting(reportRequestDto)));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/vo-meeting-regularity-village-percent")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingRegularityVillagePercent(@RequestBody ReportRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingRegularity(reportRequestDto)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/vo-meeting-regularity-vo")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingRegularityVo(@RequestParam("clfcode") Integer clfCode,@RequestParam("fromYear") String fromYear,@RequestParam("fromMonth") String fromMonth,@RequestParam("toYear") String toYear,@RequestParam("toMonth") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingRegularityVo(clfCode,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/vo-meeting-regularity-clf")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingRegularityClf(@RequestParam("blockName") String blockname,@RequestParam("fromYear") String fromYear,@RequestParam("fromMonth") String fromMonth,@RequestParam("toYear") String toYear,@RequestParam("toMonth") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingRegularityClf(blockname,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @PostMapping("/vo-meeting-attendance-village-percent")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingAttendanceVillagePercent(@RequestBody ReportRequestDto reportRequestDto) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingAttendance(reportRequestDto)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/vo-meeting-attendance-clf")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingAttendanceClf(@RequestParam("blockName") String blockname,@RequestParam("fromYear") String fromYear,@RequestParam("fromMonth") String fromMonth,@RequestParam("toYear") String toYear,@RequestParam("toMonth") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingAttendanceClf(blockname,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/vo-meeting-attendance-vo")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingAttendanceVo(@RequestParam("clfcode") Integer clfCode,@RequestParam("fromYear") String fromYear,@RequestParam("fromMonth") String fromMonth,@RequestParam("toYear") String toYear,@RequestParam("toMonth") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingAttendanceVo(clfCode,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/vo-meeting-attendance-village")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingAttendanceVillage(@RequestParam("villageName") String villageName,@RequestParam("fromYear") String fromYear,@RequestParam("fromMonth") String fromMonth,@RequestParam("toYear") String toYear,@RequestParam("toMonth") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingAttendanceVillage(villageName,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/vo-meeting-village")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingVillage(@RequestParam("villageName") String villageName,@RequestParam("fromYear") String fromYear,@RequestParam("fromMonth") String fromMonth,@RequestParam("toYear") String toYear,@RequestParam("toMonth") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingVillage(villageName,fromYear,fromMonth,toYear,toMonth)));
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @GetMapping("/vo-meeting-regularity-village")
    public ResponseEntity<GlobalApiResponse<?>> getVoMeetingRegularityVillage(@RequestParam("villageName") String villageName,@RequestParam("fromYear") String fromYear,@RequestParam("fromMonth") String fromMonth,@RequestParam("toYear") String toYear,@RequestParam("toMonth") String toMonth) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",reportingServices.getVoMeetingRegularityVillage(villageName,fromYear,fromMonth,toYear,toMonth)));
    }

}