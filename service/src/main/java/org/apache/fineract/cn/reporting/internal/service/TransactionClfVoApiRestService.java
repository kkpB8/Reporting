package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BankAccountDetailsResponse;
import org.apache.fineract.cn.reporting.api.domain.TransactionClfVoResponse;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Service
@org.springframework.transaction.annotation.Transactional
public class TransactionClfVoApiRestService {
        private final Logger logger;
        private final PGFunctionProcedureService pgFunctionProcedureService;

        @Autowired
        public TransactionClfVoApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                            final PGFunctionProcedureService pgFunctionProcedureService) {
            super();
            this.logger = logger;
            this.pgFunctionProcedureService = pgFunctionProcedureService;
        }

        public List<TransactionClfVoResponse> getClfVoData(Integer village_id, String tenantIdentifier) {
            return pgFunctionProcedureService.fn_transaction_clf_vo_data(village_id,tenantIdentifier);
        }
}

