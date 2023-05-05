package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.ResponseBankBranchCbos;
import org.apache.fineract.cn.reporting.api.domain.ResponseBankDeatils;
import org.apache.fineract.cn.reporting.api.domain.ResponseBranchDet;
import org.apache.fineract.cn.reporting.api.domain.TransactionClfVoResponse;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TransactionClfVosApiRestService {

    private final Logger logger;
    private final TrClfVosRepository trClfVosRepository;


    @Autowired
    public TransactionClfVosApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                           final TrClfVosRepository trClfVosRepository) {
        super();
        this.logger = logger;
        this.trClfVosRepository = trClfVosRepository;

    }

    public List<TransactionClfVoResponse> getTransactionClfVo(Integer village_id) {
        List<TransactionClfVoResponse> transactionClfVoResponseList = new ArrayList<>();
        List<TrClfVoEntity> trClfVoEntityList;
        trClfVoEntityList = trClfVosRepository.
                fetclfvoList(village_id);

        trClfVoEntityList.forEach(trClfVoEntity ->
        {
            TransactionClfVoResponse transactionClfVoResponse = CommonApiMapper.map(trClfVoEntity);
            transactionClfVoResponseList.add(transactionClfVoResponse);
        });
        return transactionClfVoResponseList;
    }
}
