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
            throw new BadRequestError(CustomStatus.INVALID_GEOGRAPHICAL_FLAG_MSG);
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

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/summaryReport",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseSummaryReportsDetail>>> getSummaryReportDetails(@RequestParam(value="stateId",required=false) final Integer stateId,
                                                                                                  @RequestParam(value="districtId",required=false) final String districtId,
                                                                                                  @RequestParam(value="blockId",required=false) final String blockId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getSummaryReportDetail(stateId,districtId,blockId)));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/shgDetails",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseShgDetails>>> getShgDetails(@RequestParam(value="stateId") final Integer stateId,
                                                                              @RequestParam(value="districtId",required=false) final Integer districtId,
                                                                              @RequestParam(value="blockId") final Integer blockId,
                                                                              @RequestParam(value="villageId",required=false) final Integer villageId,
                                                                              @RequestParam(value="panchayatId",required=false) final Integer panchayatId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getShgDetail(stateId,districtId,blockId,villageId,panchayatId)));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/memberDetails",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseMemberDetails>>> getMemberDetails(@RequestParam(value="stateId") final Integer stateId,
                                                                                    @RequestParam(value="districtId",required=false) final Integer districtId,
                                                                                    @RequestParam(value="blockId") final Integer blockId,
                                                                                    @RequestParam(value="panchayatId",required=false) final Integer panchayatId,
                                                                                    @RequestParam(value="villageId",required=false) final Integer villageId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getMemberDetail(stateId,districtId,blockId,panchayatId,villageId)));
    }
    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/getUserConsolidate",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseUserConsolidate>>> getUserConsolidate(@RequestParam(value="stateId",required=false) final Integer stateId,
                                                                                        @RequestParam(value="districtId",required=false) final String districtId,
                                                                                        @RequestParam(value="blockId",required=false) final String blockId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getUserConsolidateData(stateId,districtId,blockId)));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/voDetails",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseVODetails>>> getVODetails(@RequestParam(value="stateId") final Integer stateId,
                                                                            @RequestParam(value="districtId",required=false) final Integer districtId,
                                                                            @RequestParam(value="blockId") final Integer blockId,
                                                                            @RequestParam(value="panchayatId",required=false) final Integer panchayatId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getVODetail(stateId,districtId,blockId,panchayatId)));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/clfDetails",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseClfDetails>>> getClfDetails(@RequestParam(value="stateId") final Integer stateId,
                                                                              @RequestParam(value="districtId",required=false) final Integer districtId,
                                                                              @RequestParam(value="blockId") final Integer blockId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getClfDetail(stateId,districtId,blockId)));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/userBKDetails",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseUserBKDetails>>> getUserBKDetails(@RequestParam(value="stateId") final Integer stateId,
                                                                                    @RequestParam(value="districtId",required=false) final String districtId,
                                                                                    @RequestParam(value="blockId") final String blockId,
                                                                                    @RequestParam(value="panchayatId",required=false) final String panchayatId,
                                                                                    @RequestParam(value="villageId",required=false) final String villageId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getUserBKDetails(stateId,districtId,blockId,panchayatId,villageId)));
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/userBPMDetails",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseUserBPMDetails>>> getUserBPMDetails(@RequestParam(value="stateId") final Integer stateId,
                                                                                      @RequestParam(value="districtId",required=false) final String districtId,
                                                                                      @RequestParam(value="blockId") final String blockId) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.profileReportService.getUserBPMDetails(stateId,districtId,blockId)));
    }

}
