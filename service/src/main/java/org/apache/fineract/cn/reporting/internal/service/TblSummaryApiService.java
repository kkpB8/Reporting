package org.apache.fineract.cn.reporting.internal.service;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.TblSummaryResponse;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@org.springframework.transaction.annotation.Transactional
public class TblSummaryApiService {
    private final Logger logger;
    private final PGFunctionProcedureService pgFunctionProcedureService;
    @Autowired
    public TblSummaryApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                              final PGFunctionProcedureService pgFunctionProcedureService) {
        super();
        this.logger = logger;
        this.pgFunctionProcedureService = pgFunctionProcedureService;
    }

    public List<TblSummaryResponse> gettbl_summarydata(String reportName, String locationType, String dateTo, String dateFrom, String stateId, String districtId,
                                                       String blockId, String panchayatId, String villageId, String bankTypeId, String bankType, String bankCode, String branchCode, String clf, String vo, String shg, String tenantIdentifier) {
        return pgFunctionProcedureService.fn_gettblsummarydata(reportName,locationType,dateTo
                ,dateFrom,stateId, districtId, blockId,panchayatId,villageId,bankTypeId,bankType,bankCode,branchCode,clf,vo,shg, tenantIdentifier);
    }
}
