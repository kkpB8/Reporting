package org.apache.fineract.cn.reporting.rest;
import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.*;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BankBranchCbosApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/bank")

public class BankBranchCbosApiRestController extends  BaseController{
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
    ResponseEntity<GlobalApiResponse<List<ResponseBankBranchCbos>>> fetchBankBranchList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                     @RequestParam("fromDate") String fromDate,
                                                                     @RequestParam("toDate") String toDate,
                                                                     @RequestParam("stateId") Integer stateId,
                                                                     @RequestParam("districtId") Integer districtId,
                                                                     @RequestParam("blockId") Integer blockId,
                                                                     @RequestParam("bankId") Integer bankId,
                                                                     @RequestParam("branchId") Integer branchId) {
        if (geographicalFlag != null) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                      this.bankBranchCbosApiService.fetchBankBranchList(geographicalFlag, fromDate, toDate, stateId, districtId, blockId, bankId, branchId)));

        } else {
            throw new BadRequestError(CustomStatus.INVALID_GEOGRAPHICAL_FLAG_MSG);
        }

    }
   // geographicalFlagErrors


    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-det",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseBankDeatils>>> fetchBankList( @RequestParam(value = "geographicalFlag", defaultValue = "1") int geographicalFlag,
                                                             @RequestParam("stateId") Integer stateId) {
        if (stateId != null) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                            this.bankBranchCbosApiService.fetchBank(geographicalFlag, stateId)));

        } else {
            throw new BadRequestError(CustomStatus.INVALID_STATE_ID_MSG);
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
    ResponseEntity<GlobalApiResponse<List<ResponseBranchDet>>> fetchBranchList(
            @RequestParam(value = "geographicalFlag",defaultValue = "2") int geographicalFlag,
            @RequestParam("stateId") Integer stateId,
            @RequestParam("bankId") Integer bankId){
        if (bankId != null) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.bankBranchCbosApiService.fetchBranchList(geographicalFlag, stateId, bankId)));
        } else {
            throw new BadRequestError(CustomStatus.INVALID_BANK_ID_MSG);
        }
    }



    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-wise-cbo-accounts",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<GlobalApiResponse<List<ResponseBankWiseCbo>>> fetchBankWiseCboList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                   @RequestParam("fromDate") String fromDate,
                                                                   @RequestParam("toDate") String toDate,
                                                                   @RequestParam("stateId") Integer stateId,
                                                                   @RequestParam("districtId") Integer districtId,
                                                                   @RequestParam("blockId") Integer blockId,
                                                                   @RequestParam("bankTypeId") Integer bankTypeId,
                                                                   @RequestParam("bankId") Integer bankId,
                                                                   @RequestParam("branchId") Integer branchId) {
        if (geographicalFlag != null) {
            return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
                    this.bankBranchCbosApiService.fetchBankWiseCboList(geographicalFlag, fromDate, toDate, stateId, districtId, blockId,bankTypeId, bankId,  branchId)));
        } else {
            throw new BadRequestError(CustomStatus.INVALID_GEOGRAPHICAL_FLAG_MSG);
        }
    }
}