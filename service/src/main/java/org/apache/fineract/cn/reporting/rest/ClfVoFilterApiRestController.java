package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.ClfVoFilterApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clf-vo")
public class ClfVoFilterApiRestController {

        private final Logger logger;
        private final ClfVoFilterApiRestService clfVoFilterApiRestService;
        @Autowired
        public ClfVoFilterApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final  ClfVoFilterApiRestService clfVoFilterApiRestService) {
            super();
            this.logger = logger;
            this.clfVoFilterApiRestService = clfVoFilterApiRestService;
        }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/clf-det",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ClfVoFilterResponse>>ClfFilterList() {

            return ResponseEntity.ok(
                    this.clfVoFilterApiRestService.ClfFilterList());
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/vo-det",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<VoFilterResponse>> VoFilterList(@RequestParam("cboId") Integer cboId) {
        if (cboId != null) {
            return ResponseEntity.ok(
                    this.clfVoFilterApiRestService.VoFilterList(cboId));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }
}

