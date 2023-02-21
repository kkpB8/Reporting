package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BankBranchNameResponse;
import org.apache.fineract.cn.reporting.api.domain.BankNameDataResponse;
import org.apache.fineract.cn.reporting.api.domain.BankWiseCboAccountRequest;
import org.apache.fineract.cn.reporting.api.domain.BankWiseCboAccountResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BankAccountDetailsApiService;
import org.apache.fineract.cn.reporting.internal.service.BankNameDataService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/Bankfilter")
public class BankNameDataController {
    private final Logger logger;
    private final BankNameDataService bankNameDataService;


    @Autowired
    public BankNameDataController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                               final BankNameDataService bankNameDataService) {
        super();
        this.logger = logger;
        this.bankNameDataService =bankNameDataService;
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/bank-name",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<BankNameDataResponse>> getBanknamedata(HttpServletRequest httpServletRequest) {
        if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.bankNameDataService.getBankNameData(tenantIdentifier));
    }


    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/branch-name",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<BankBranchNameResponse>> getBankbranchnamedata(@RequestParam String bank_code, HttpServletRequest httpServletRequest) {
        if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
//        String bank_code = httpServletRequest.getHeader("bank_code");
        String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.bankNameDataService.getBankBranchNameData(bank_code,tenantIdentifier));
    }
}
