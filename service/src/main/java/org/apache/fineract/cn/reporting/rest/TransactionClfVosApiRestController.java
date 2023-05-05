package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;

import org.apache.fineract.cn.reporting.api.domain.TransactionClfVoResponse;

import org.apache.fineract.cn.reporting.internal.service.TransactionClfVosApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clfsvos")
public class TransactionClfVosApiRestController {

    private final Logger logger;
    private final TransactionClfVosApiRestService transactionClfVosApiRestService;

    @Autowired
    public TransactionClfVosApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                              final TransactionClfVosApiRestService transactionClfVosApiRestService) {
        super();
        this.logger = logger;
        this.transactionClfVosApiRestService = transactionClfVosApiRestService;
    }

    @Permittable(value = AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/clfsvos-details",
            method = RequestMethod.GET,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<TransactionClfVoResponse>> getTransactionClfVo(@RequestParam(value = "village_id", defaultValue = "178008") Integer village_id) {
        return ResponseEntity.ok(
                this.transactionClfVosApiRestService.getTransactionClfVo(village_id));
    }
}
