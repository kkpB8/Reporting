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
@RequestMapping("/meetings-api")
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
                value = "/meetings-api-details",
                method = RequestMethod.POST,
                consumes = MediaType.ALL_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
        )
        public
        @ResponseBody
        ResponseEntity<List<MeetingApiRestResponse>> fetchMeetingList(@RequestBody MeetingApiRestRequest meetingApiRestRequest) {
            if (meetingApiRestRequest.getGeographicalFlag() != null) {
                return ResponseEntity.ok(
                        this.meetingApiRestService.fetchMeetingList(meetingApiRestRequest));
            } else {
                throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
            }
        }
}
