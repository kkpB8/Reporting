package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.MeetingApiRestRequest;
import org.apache.fineract.cn.reporting.api.domain.MeetingApiRestResponse;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.MeetingApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shgbysc")
public class MeetingApiRestController {

        private final Logger logger;
        private final MeetingApiRestService meetingApiRestService;

        @Autowired
        public MeetingApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final MeetingApiRestService meetingApiRestService) {
            super();
            this.logger = logger;
            this.meetingApiRestService = meetingApiRestService;
        }

        @Permittable(value= AcceptedTokenType.GUEST)
        @RequestMapping(
                value = "/mem-shg-sc",
                method = RequestMethod.GET,
                consumes = MediaType.ALL_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
        )
        public
        @ResponseBody
        ResponseEntity<List<MeetingApiRestResponse>> fetchSHGSCList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                      @RequestParam("fromDate") String fromDate,
                                                                      @RequestParam("toDate") String toDate,
                                                                      @RequestParam("stateId") Integer stateId,
                                                                      @RequestParam("districtId") Integer districtId,
                                                                      @RequestParam("blockId") Integer blockId,
                                                                      @RequestParam("panchayatId") Integer panchayatId,
                                                                      @RequestParam("villageId") Integer villageId,
                                                                      @RequestParam("shgId") Integer shgId,
                                                                      @RequestParam("voId") Integer voId,
                                                                      @RequestParam("clfId") Integer clfId) {
            if (geographicalFlag != null) {
                return ResponseEntity.ok(
                        this.meetingApiRestService.fetchSHGSCList(geographicalFlag, fromDate, toDate, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId));
            } else {
                throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
            }

        }
}
