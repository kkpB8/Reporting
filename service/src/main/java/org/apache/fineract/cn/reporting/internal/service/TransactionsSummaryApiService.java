package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.TransactionSummary;
import org.apache.fineract.cn.reporting.api.domain.TransactionsSummaryRequest;
import org.apache.fineract.cn.reporting.api.domain.TransactionsSummarysRequest;
import org.apache.fineract.cn.reporting.api.domain.VoTransactionSummary;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
@org.springframework.transaction.annotation.Transactional
public class TransactionsSummaryApiService {


        private final Logger logger;
        private final TransactionsSummaryRepository transactionsSummaryRepository;
        private final TransactionsSummarysRepository transactionsSummarysRepository;
        @Autowired
        public TransactionsSummaryApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                            final TransactionsSummaryRepository transactionsSummaryRepository,final TransactionsSummarysRepository transactionsSummarysRepository) {
            super();
            this.logger = logger;
            this.transactionsSummaryRepository = transactionsSummaryRepository;
            this.transactionsSummarysRepository = transactionsSummarysRepository;
        }


    public List<TransactionSummary> fetchShgTransactionsSummaryList1(TransactionsSummaryRequest transactionsSummaryRequest) {
        if(transactionsSummaryRequest.getStateId() == null){
            transactionsSummaryRequest.setStateId(-1);
        }
        if(transactionsSummaryRequest.getDistrictId() == null){
            transactionsSummaryRequest.setDistrictId(-1);
        }
        if(transactionsSummaryRequest.getBlockId() == null){
            transactionsSummaryRequest.setBlockId(-1);
        }
        if(transactionsSummaryRequest.getFromDate() == null){
            transactionsSummaryRequest.setFromDate(null);
        }
        if(transactionsSummaryRequest.getToDate()== null){
            transactionsSummaryRequest.setToDate(null);
        }
        if(transactionsSummaryRequest.getGeographicalFlag()==null){
            transactionsSummaryRequest.setGeographicalFlag(-1);
        }

        List<TransactionSummary> transationsummaryList = new ArrayList<>();
        List<TransactionsSummaryEntity> transactionsSummaryEntityList;
        transactionsSummaryEntityList = transactionsSummaryRepository.
                findByFilter2(
                        transactionsSummaryRequest.getStateId(),
                        transactionsSummaryRequest.getDistrictId(),
                        transactionsSummaryRequest.getBlockId(),
                        transactionsSummaryRequest.getFromDate(),
                        transactionsSummaryRequest.getToDate(),
                        transactionsSummaryRequest.getGeographicalFlag()
                );

        transactionsSummaryEntityList.forEach(transactionsSummaryEntity ->
        {
            TransactionSummary transactionSummary = CommonApiMapper.map(transactionsSummaryEntity);
            transationsummaryList.add(transactionSummary);
        });
        return transationsummaryList;
    }

    public List<VoTransactionSummary> fetchVoTransactionsSummarysList1(TransactionsSummarysRequest transactionsSummarysRequest) {
        if(transactionsSummarysRequest.getStateId() == null){
            transactionsSummarysRequest.setStateId(-1);
        }
        if(transactionsSummarysRequest.getDistrictId() == null){
            transactionsSummarysRequest.setDistrictId(-1);
        }
        if(transactionsSummarysRequest.getBlockId() == null){
            transactionsSummarysRequest.setBlockId(-1);
        }
        if(transactionsSummarysRequest.getPanchayatId() == null){
            transactionsSummarysRequest.setPanchayatId(-1);
        }
        if(transactionsSummarysRequest.getVoId() == null){
            transactionsSummarysRequest.setVoId(new BigInteger("-1"));
        }
        if(transactionsSummarysRequest.getClfId() == null){
            transactionsSummarysRequest.setClfId(new BigInteger("-1"));
        }
        if(transactionsSummarysRequest.getFromDate() == null){
            transactionsSummarysRequest.setFromDate(null);
        }
        if(transactionsSummarysRequest.getToDate()== null){
            transactionsSummarysRequest.setToDate(null);
        }
        if(transactionsSummarysRequest.getGeographicalFlag()==null){
            transactionsSummarysRequest.setGeographicalFlag(-1);
        }

        List<VoTransactionSummary> transationsummaryList = new ArrayList<>();
        List<TransactionsSummarysEntity> transactionsSummarysEntityList;
        transactionsSummarysEntityList = transactionsSummarysRepository.
                findByFilter4(
                        transactionsSummarysRequest.getStateId(),
                        transactionsSummarysRequest.getDistrictId(),
                        transactionsSummarysRequest.getBlockId(),
                        transactionsSummarysRequest.getPanchayatId(),
                        transactionsSummarysRequest.getVoId(),
                        transactionsSummarysRequest.getClfId(),
                        transactionsSummarysRequest.getFromDate(),
                        transactionsSummarysRequest.getToDate(),
                        transactionsSummarysRequest.getGeographicalFlag()
                );

        transactionsSummarysEntityList.forEach(transactionsSummarysEntity ->
        {
            VoTransactionSummary voTransactionSummary = CommonApiMapper.map(transactionsSummarysEntity);
            transationsummaryList.add(voTransactionSummary);
        });
        return transationsummaryList;
    }
}