package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BankBranchCboApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/banks-branchs")
public class BankBranchCboApiRestController {
    private final Logger logger;
    private final BankBranchCboApiRestService bankBranchCboApiRestService;

    @Autowired
    public BankBranchCboApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                          final BankBranchCboApiRestService bankBranchCboApiRestService) {
        super();
        this.logger = logger;
        this.bankBranchCboApiRestService = bankBranchCboApiRestService;
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-detailss",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public
    @ResponseBody
    ResponseEntity<List<ResponseBankApiDeatils>> fetchBankDetailsList(RequestBankApiDeatils requestBankApiDeatils) {
        if (requestBankApiDeatils.getGeographicalFlag() == 1 && requestBankApiDeatils.getStateId() == 10 && requestBankApiDeatils.getFlag() == 1) {
            return ResponseEntity.ok(
                    this.bankBranchCboApiRestService.fetchBankDetailsList(requestBankApiDeatils));
        } else if (requestBankApiDeatils.getGeographicalFlag() == 2 && requestBankApiDeatils.getFlag() == 2 && requestBankApiDeatils.getBankId() != null) {

            return ResponseEntity.ok(
                    this.bankBranchCboApiRestService.fetchBankDetailsList(requestBankApiDeatils));
        } else {
            throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
   }
}
    /*
        public
        @ResponseBody
        ResponseEntity<List<ResponseBranchApiDeatils>> fetchBranchDetailsList (RequestBranchApiDeatils
        requestBranchApiDeatils){

            if (requestBranchApiDeatils.getGeographicalFlag() == 2 && requestBranchApiDeatils.getFlag() == 2 && requestBranchApiDeatils.getBankId() != null) {
                return ResponseEntity.ok(
                        this.bankBranchCboApiRestService.fetchBranchDetailsList(requestBranchApiDeatils));
            }
            return null;
        }
    }

     */
/*

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-detailsss",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<ResponseBranchApiDeatils>> fetchBranchDetailsList(RequestBranchApiDeatils
                                                                                  requestBranchApiDeatils) {

        if (requestBranchApiDeatils.getGeographicalFlag() == 2 && requestBranchApiDeatils.getFlag() == 2 && requestBranchApiDeatils.getBankId() != null) {
                return ResponseEntity.ok(
                        this.bankBranchCboApiRestService.fetchBranchDetailsList(requestBranchApiDeatils));
            }
        return null;
 */
//&& requestBranchApiDeatils.getStateId() == 10








