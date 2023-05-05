package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BlockSaturationsRequest;
import org.apache.fineract.cn.reporting.api.domain.BlockSaturationsResponse;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BlockSaturationsApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@RestController
//@RequestMapping("/blocks")
public class BlockSaturationsApiRestController {
/*
        private final Logger logger;
        private final BlockSaturationsApiRestService blockSaturationsApiRestService;

        @Autowired
        public BlockSaturationsApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final BlockSaturationsApiRestService blockSaturationsApiRestService) {
            super();
            this.logger = logger;
            this.blockSaturationsApiRestService = blockSaturationsApiRestService;
        }

        @Permittable(value= AcceptedTokenType.GUEST)
        @RequestMapping(
                value = "/block-saturation",
                method = RequestMethod.POST,
                consumes = MediaType.ALL_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
        )
        public
        @ResponseBody
        ResponseEntity<List<BlockSaturationsResponse>> fetchBlockSaturationsList(@RequestBody BlockSaturationsRequest blockSaturationsRequest) {
            if (blockSaturationsRequest.getGeographicalFlag() != null) {
                return ResponseEntity.ok(
                        this.blockSaturationsApiRestService.fetchBlockSaturationsList(blockSaturationsRequest));
            } else {
                throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
  }

 */
}
