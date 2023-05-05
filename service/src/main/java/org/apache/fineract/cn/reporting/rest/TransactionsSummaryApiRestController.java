package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.TransactionSummary;
import org.apache.fineract.cn.reporting.api.domain.TransactionsSummaryRequest;
import org.apache.fineract.cn.reporting.api.domain.TransactionsSummarysRequest;
import org.apache.fineract.cn.reporting.api.domain.VoTransactionSummary;
import org.apache.fineract.cn.reporting.internal.service.TransactionsSummaryApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report-vo")
public class TransactionsSummaryApiRestController {

        private final Logger logger;
        private final TransactionsSummaryApiService transactionsSummaryApiService;


        @Autowired
        public TransactionsSummaryApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                                   final TransactionsSummaryApiService transactionsSummaryApiService) {
            super();
            this.logger = logger;
            this.transactionsSummaryApiService = transactionsSummaryApiService;
        }
    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/transactionapi",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<TransactionSummary>> fetchShgTransactionsSummaryList1(@RequestBody TransactionsSummaryRequest transactionsSummaryRequest) {
        return ResponseEntity.ok(
                this.transactionsSummaryApiService.fetchShgTransactionsSummaryList1(transactionsSummaryRequest));
    }
    @Permittable(value= AcceptedTokenType.GUEST)
    @RequestMapping(
            value = "/get-vosapi-meeting",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public
    @ResponseBody
    ResponseEntity<List<VoTransactionSummary>> fetchVoMeetingsSummaryList(@RequestBody TransactionsSummarysRequest transactionsSummarysRequest) {
        return ResponseEntity.ok(
                this.transactionsSummaryApiService.fetchVoTransactionsSummarysList1(transactionsSummarysRequest));
    }

}