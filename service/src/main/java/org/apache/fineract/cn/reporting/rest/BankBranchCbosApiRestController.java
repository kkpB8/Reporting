package org.apache.fineract.cn.reporting.rest;
import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.RequestBankBranchCbos;
import org.apache.fineract.cn.reporting.api.domain.ResponseBankBranchCbos;
import org.apache.fineract.cn.reporting.api.domain.ResponseBankDeatils;
import org.apache.fineract.cn.reporting.api.domain.ResponseBranchDet;
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
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseBankBranchCbos>> fetchBankBranchList(@RequestBody RequestBankBranchCbos requestBankBranchCbos) {
        if (requestBankBranchCbos.getGeographicalFlag() != null) {
            return ResponseEntity.ok(
                    this.bankBranchCbosApiService.fetchBankBranchList(requestBankBranchCbos));
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
//        ResponseEntity<List<BankDetailsEntity>> fetchBankList(@RequestParam("stateId") Integer stateId,
//                                                          @RequestParam(value = "geographicalFlag",defaultValue = "1") int geographicalFlag){
        if (stateId != null) {
            return ResponseEntity.ok(
                    this.bankBranchCbosApiService.fetchBankList(stateId, geographicalFlag));
//                this.bankDetailsRepository.fetchBankList(stateId, geographicalFlag));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
//            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
//        return ResponseEntity.ok().body(responseBankDeatils);
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
}