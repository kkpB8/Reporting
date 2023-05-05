package org.apache.fineract.cn.reporting.rest;


import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.ServiceSocialMobilizations;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/social-api")
public class SocialMobilizationsApiRestController {

    private final Logger logger;
    private final ServiceSocialMobilizations serviceSocialMobilizations;

    @Autowired
    public SocialMobilizationsApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final ServiceSocialMobilizations serviceSocialMobilizations) {
        super();
        this.logger = logger;
        this.serviceSocialMobilizations = serviceSocialMobilizations;
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/socialnewapi",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseSocialMobilization>> fetchSocialMobilizationList(@RequestParam("stateId") Integer stateId, @RequestParam ("districtId")Integer districtId, @RequestParam("blockId") Integer blockId,@RequestParam("panchayatId") Integer panchayatId, @RequestParam ("villageId") Integer villageId, @RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate, @RequestParam("geographicalFlag") Integer geographicalFlag) {
     /*   if ((requestSocialMobilization.getGeographicalFlag() != null) && (requestSocialMobilization.getFromDate() != null) && (requestSocialMobilization.getToDate()!=null)) {
            return ResponseEntity.ok(
                    this.serviceSocialMobilizations.fetchShgInitiationList(requestSocialMobilization));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }
      */
        if (geographicalFlag != null && fromDate !=null && toDate!=null) {
            return ResponseEntity.ok(
                    this.serviceSocialMobilizations.fetchSocialMobilizationList(stateId,districtId,blockId,panchayatId,villageId,fromDate,toDate,geographicalFlag));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }
}

/*
    ResponseEntity<List<ResponseBranchDet>> fetchBranchList(@RequestParam("bankId") Integer bankId,
                                                            @RequestParam(value = "geographicalFlag",defaultValue = "2") int geographicalFlag){
        if (bankId != null) {
private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer panchayatId;
    private Integer villageId;
    private String fromDate;
    private String toDate;
    private Integer geographicalFlag;


 */