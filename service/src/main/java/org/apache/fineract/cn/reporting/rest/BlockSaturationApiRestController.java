package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BlockSaturationRequest;
import org.apache.fineract.cn.reporting.api.domain.BlockSaturationResponse;
import org.apache.fineract.cn.reporting.api.domain.ShgByEachTypeRequest;
import org.apache.fineract.cn.reporting.api.domain.ShgByEachTypeResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BlockSaturationApiService;
import org.apache.fineract.cn.reporting.internal.service.GeographicalCoverageApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/block")
    public class BlockSaturationApiRestController {
        private final Logger logger;
        private final BlockSaturationApiService blockSaturationApiService;


        @Autowired
        public BlockSaturationApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                                     final BlockSaturationApiService blockSaturationApiService) {
            super();
            this.logger = logger;
            this.blockSaturationApiService = blockSaturationApiService;
        }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/blockSaturation",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<BlockSaturationResponse>> getBlockSaturationeData(@RequestBody BlockSaturationRequest request,
                                                                       @RequestHeader Map<String, String> headers) {
        if (headers.get("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String location_type = request.getLocation_type();
        String date_to = request.getDate_to();
        String date_from = request.getDate_from();
        String state_id = request.getState_id();
        String district_id = request.getDistrict_id();
        String tenantIdentifier = headers.get("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.blockSaturationApiService.getBlockSaturationData(location_type, date_to, date_from, state_id, district_id, tenantIdentifier));
    }
}
