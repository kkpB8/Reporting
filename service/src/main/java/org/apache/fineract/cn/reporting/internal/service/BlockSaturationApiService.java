package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BlockSaturationResponse;
import org.apache.fineract.cn.reporting.api.domain.MemberEducationReponse;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlockSaturationApiService {
    private final Logger logger;
    private final PGFunctionProcedureService pgFunctionProcedureService;
    @Autowired
    public BlockSaturationApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                  final PGFunctionProcedureService pgFunctionProcedureService) {
        super();
        this.logger = logger;
        this.pgFunctionProcedureService = pgFunctionProcedureService;
    }

    public List<BlockSaturationResponse> getBlockSaturationData(String location_type, String date_to, String date_from, String state_id, String district_id,
                                                               String tenantIdentifier) {
        return pgFunctionProcedureService.fn_blocksaturation(location_type, date_to, date_from, state_id, district_id, tenantIdentifier);
    }
}
