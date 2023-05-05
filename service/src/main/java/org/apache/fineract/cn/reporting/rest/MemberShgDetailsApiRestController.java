package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.RequestLoanShgReport;
import org.apache.fineract.cn.reporting.api.domain.ResponseLoanShgReport;
import org.apache.fineract.cn.reporting.api.domain.ResponseMemberAttendanceDetails;
import org.apache.fineract.cn.reporting.api.domain.ResponseMemberShgDetails;
import org.apache.fineract.cn.reporting.internal.service.MemberShgDetailsApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memberapi")
public class MemberShgDetailsApiRestController {
        private final Logger logger;
        private final MemberShgDetailsApiRestService memberShgDetailsApiRestService;

        @Autowired
        public MemberShgDetailsApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final MemberShgDetailsApiRestService memberShgDetailsApiRestService) {
            super();
            this.logger = logger;
            this.memberShgDetailsApiRestService = memberShgDetailsApiRestService;
        }

        @Permittable(value= AcceptedTokenType.GUEST)
        @RequestMapping(
                value = "/member-new-api",
                method = RequestMethod.GET,
                consumes = MediaType.ALL_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
        )
        public
        @ResponseBody
        ResponseEntity<List<ResponseMemberShgDetails>> getMemberDetails(@RequestParam(value = "stateId", defaultValue = "10") Integer stateId, @RequestParam (value = "districtId", defaultValue = "170")Integer districtId, @RequestParam(value = "blockId", defaultValue = "3644") Integer blockId) {
            return ResponseEntity.ok(
                    this.memberShgDetailsApiRestService.getMemberDetails(stateId, districtId, blockId));
        }

    @Permittable(value= AcceptedTokenType.GUEST)
    @GetMapping("/member-attendance")
    public ResponseEntity<List<ResponseMemberShgDetails>> getShgVoAttendance(@RequestParam(value = "stateId", defaultValue = "10") Integer stateId, @RequestParam (value = "districtId", defaultValue = "170")Integer districtId, @RequestParam(value = "blockId", defaultValue = "3644") Integer blockId) {
        return ResponseEntity.ok(memberShgDetailsApiRestService.getShgVoAttendance(stateId, districtId, blockId));
    }


    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/member-attendance-new",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseMemberAttendanceDetails>> getMemberAttendenceDetails(@RequestParam(value = "voId", defaultValue = "199") Integer voId) {
        return ResponseEntity.ok(
                this.memberShgDetailsApiRestService.getMemberAttendenceDetails(voId));
    }

}
