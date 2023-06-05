package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.GeographicalCoverageRequest;
import org.apache.fineract.cn.reporting.api.domain.SocialMobilizationRequest;
import org.apache.fineract.cn.reporting.api.domain.SocialMoblizationResponse;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.SocialMobilizationApiService;
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
@RequestMapping("/social")
public class SocialMobilizationRestController extends  BaseController{

    private final Logger logger;
    private final SocialMobilizationApiService socialMobilizationApiService;


    @Autowired
    public SocialMobilizationRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                            final SocialMobilizationApiService socialMobilizationApiService) {
        super();
        this.logger = logger;
        this.socialMobilizationApiService = socialMobilizationApiService;
    }


    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/social-moblization",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<SocialMoblizationResponse>>> getSocialMoblizationData(@RequestBody SocialMobilizationRequest request,
                                                                                                HttpServletRequest headerRequest) {
        if(headerRequest.getHeader("X-Tenant-Identifier")==null){
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String loctype = request.getLoctype();
        String dto = request.getDto();
        String dfrom = request.getDfrom();
        String sid = request.getSid();
        String did = request.getDid();
        String bid = request.getBid();
        String tenantIdentifier = headerRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                this.socialMobilizationApiService.getSocialMoblizationData(loctype,dto,dfrom,sid,did,bid,tenantIdentifier)));
    }

}