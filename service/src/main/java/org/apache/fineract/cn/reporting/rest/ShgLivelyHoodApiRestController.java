package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BankAccountDetailsApiService;
import org.apache.fineract.cn.reporting.internal.service.ShgLivelyHoodDetailsApiService;
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
@RequestMapping("/shgLivelyHood")
public class ShgLivelyHoodApiRestController extends BaseController{
    private final Logger logger;
    private final ShgLivelyHoodDetailsApiService shgLivelyHoodDetailsApiService;


    @Autowired
    public ShgLivelyHoodApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                          final ShgLivelyHoodDetailsApiService shgLivelyHoodDetailsApiService) {
        super();
        this.logger = logger;
        this.shgLivelyHoodDetailsApiService = shgLivelyHoodDetailsApiService;
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/shg-livelyhood-details",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ShgLivelyHoodDetailsResponse>>> getShgLivelyHoodData(@RequestBody ShgLivelyHoodDetailsRequest request,
                                                                                               HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.shgLivelyHoodDetailsApiService.getShgLivelyHoodData(location_type, state_id, district_id, block_id, tenantIdentifier)));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/member-livelyhood-details",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<MemberLivelyHoodResponse>>> getMemberLivelyHoodData(@RequestBody MemberLivelyHoodRequest request,
                                                                                              HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.shgLivelyHoodDetailsApiService.getMemberLivelyHoodData(location_type, state_id, district_id, block_id, tenantIdentifier)));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/shgBy-each-type",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ShgByEachTypeResponse>>> getShgByEachTypeData(@RequestBody ShgByEachTypeRequest request,
                                                                                        HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String date_to = request.getDate_to();
        String date_from = request.getDate_from();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.shgLivelyHoodDetailsApiService.getShgByEachTypeData(location_type, date_to, date_from, state_id, district_id, block_id, tenantIdentifier)));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/shgBy-social-category",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ShgBySocialCategoryResponse>>> getShgBySocialCategoryData(@RequestBody ShgBySocialCategoryRequest request,
                                                                                                    HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String category = request.getCategory();
        String location_type = request.getLocation_type();
        String date_to = request.getDate_to();
        String date_from = request.getDate_from();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String p_id = request.getP_id();
        String v_id = request.getV_id();
        String clf_id = request.getClf_id();
        String vo_id = request.getVo_id();
        String shg_id = request.getShg_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.shgLivelyHoodDetailsApiService.getShgBySocialCategoryData(category, location_type, date_to, date_from, state_id,
                        district_id, block_id, p_id, v_id, clf_id, vo_id, shg_id, tenantIdentifier)));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/shg-initiative",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ShgInitiativeResponse>>> getShgInitiativeData(@RequestBody ShgInitiativeRequest request,
                                                                                        HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String date_to = request.getDate_to();
        String date_from = request.getDate_from();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.shgLivelyHoodDetailsApiService.getShgInitiativeData(location_type, date_to, date_from, state_id, district_id, block_id, tenantIdentifier)));
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/shgBy-date",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ShgByDateResponse>>> getShgByDateData(@RequestBody ShgByDateRequest request,
                                                                                HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String date_to = request.getDate_to();
        String date_from = request.getDate_from();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String block_id = request.getBlock_id();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.shgLivelyHoodDetailsApiService.getShgByDateData(location_type, date_to, date_from, state_id, district_id, block_id, tenantIdentifier)));

    }
}
