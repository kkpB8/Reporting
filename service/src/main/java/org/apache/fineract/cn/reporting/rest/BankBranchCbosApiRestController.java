package org.apache.fineract.cn.reporting.rest;
import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.repository.BranchDetEntity;
import org.apache.fineract.cn.reporting.internal.service.BankBranchCbosApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bank")

public class BankBranchCbosApiRestController {
    private final Logger logger;
    private final BankBranchCbosApiService bankBranchCbosApiService;

    @Autowired
    public BankBranchCbosApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                           final BankBranchCbosApiService bankBranchCbosApiService) {
        super();
        this.logger = logger;
        this.bankBranchCbosApiService = bankBranchCbosApiService;
    }
    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-details",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseBankBranchCbos>> fetchBankBranchList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                     @RequestParam("fromDate") String fromDate,
                                                                     @RequestParam("toDate") String toDate,
                                                                     @RequestParam("stateId") Integer stateId,
                                                                     @RequestParam("districtId") Integer districtId,
                                                                     @RequestParam("blockId") Integer blockId,
                                                                     @RequestParam("bankId") Integer bankId,
                                                                     @RequestParam("branchId") Integer branchId) {
        if (geographicalFlag != null) {
            return ResponseEntity.ok(
                    this.bankBranchCbosApiService.fetchBankBranchList(geographicalFlag, fromDate, toDate, stateId, districtId, blockId, bankId, branchId));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-det",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseBankDeatils>> fetchBankList(@RequestParam("stateId") Integer stateId,
                                                            @RequestParam(value = "geographicalFlag", defaultValue = "1") int geographicalFlag) {
        if (stateId != null) {
            return ResponseEntity.ok(
                    this.bankBranchCbosApiService.fetchBankList(stateId, geographicalFlag));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/branch-det",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseBranchDet>> fetchBranchList(@RequestParam("bankId") Integer bankId,
                                                            @RequestParam(value = "geographicalFlag",defaultValue = "2") int geographicalFlag){
        if (bankId != null) {
            return ResponseEntity.ok(
                    this.bankBranchCbosApiService.fetchBranchList(bankId, geographicalFlag));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }



    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-wise-cbo-accounts",
//            method = RequestMethod.POST,
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
//    ResponseEntity<List<ResponseBankWiseCbo>> fetchBankWiseCboList(@RequestBody RequestBankWiseCbo requestBankWiseCbo) {
    ResponseEntity<List<ResponseBankWiseCbo>> fetchBankWiseCboList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                   @RequestParam("fromDate") String fromDate,
                                                                   @RequestParam("toDate") String toDate,
                                                                   @RequestParam("stateId") Integer stateId,
                                                                   @RequestParam("districtId") Integer districtId,
                                                                   @RequestParam("blockId") Integer blockId,
                                                                   @RequestParam("bankTypeId") Integer bankTypeId,
                                                                   @RequestParam("bankId") Integer bankId,
                                                                   @RequestParam("branchId") Integer branchId) {
        if (geographicalFlag != null) {
            return ResponseEntity.ok(
                    this.bankBranchCbosApiService.fetchBankWiseCboList(geographicalFlag, fromDate, toDate, stateId, districtId, blockId,bankTypeId, bankId,  branchId));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
    }
}