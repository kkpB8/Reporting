package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BankAccountDetailsResponse;
import org.apache.fineract.cn.reporting.api.domain.BankBranchNameResponse;
import org.apache.fineract.cn.reporting.api.domain.BankNameDataResponse;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankNameDataService {
    private final Logger logger;
    private final PGFunctionProcedureService pgFunctionProcedureService;

    @Autowired
    public BankNameDataService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                        final PGFunctionProcedureService pgFunctionProcedureService) {
        super();
        this.logger = logger;
        this.pgFunctionProcedureService = pgFunctionProcedureService;
    }

    public List<BankNameDataResponse> getBankNameData(String tenantIdentifier) {
        return pgFunctionProcedureService.fn_getbanknamedata(tenantIdentifier);
    }

    public List<BankBranchNameResponse> getBankBranchNameData(String bank_code, String cbo_Id, String tenantIdentifier) {
        return pgFunctionProcedureService.fn_getbankbranchnamedata(bank_code,cbo_Id,tenantIdentifier);
    }
}
