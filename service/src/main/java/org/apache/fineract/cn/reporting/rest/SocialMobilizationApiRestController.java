package org.apache.fineract.cn.reporting.rest;


import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;

import org.apache.fineract.cn.reporting.internal.service.ServiceSocialMobilization;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/socialMobilization")
public class SocialMobilizationApiRestController {

    private final Logger logger;
    private final ServiceSocialMobilization serviceSocialMobilization;

    @Autowired
    public SocialMobilizationApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final ServiceSocialMobilization serviceSocialMobilization) {
        super();
        this.logger = logger;
        this.serviceSocialMobilization = serviceSocialMobilization;
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/social-mobilization",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseSocialMobilization>> fetchShgInitiationList(@RequestBody RequestSocialMobilization requestSocialMobilization) {
        if ((requestSocialMobilization.getGeographicalFlag() != null) && (requestSocialMobilization.getFromDate() != null) && (requestSocialMobilization.getToDate()!=null)) {
            return ResponseEntity.ok(
                    this.serviceSocialMobilization.fetchShgInitiationList(requestSocialMobilization));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }
}
