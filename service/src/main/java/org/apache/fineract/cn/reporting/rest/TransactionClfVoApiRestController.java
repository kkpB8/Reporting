package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BankAccountDetailsRequest;
import org.apache.fineract.cn.reporting.api.domain.BankAccountDetailsResponse;
import org.apache.fineract.cn.reporting.api.domain.TransactionClfVoResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.BankAccountDetailsApiService;
import org.apache.fineract.cn.reporting.internal.service.TransactionClfVoApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
@RequestMapping("/tr-clf")
public class TransactionClfVoApiRestController {


    private final Logger logger;
    private final TransactionClfVoApiRestService transactionClfVoApiRestService;


    @Autowired
    public TransactionClfVoApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                             final TransactionClfVoApiRestService transactionClfVoApiRestService) {
        super();
        this.logger = logger;
        this.transactionClfVoApiRestService = transactionClfVoApiRestService;
    }


    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/tr-clf-vo",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<TransactionClfVoResponse>> getTransactionClfVo(@RequestParam(value = "village_id", defaultValue = "178008") Integer village_id, HttpServletRequest httpServletRequest) {
        if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
            this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
        }
        String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");
        return ResponseEntity.ok(
                this.transactionClfVoApiRestService.getClfVoData(village_id,tenantIdentifier));
    }
}

