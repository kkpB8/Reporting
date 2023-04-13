package org.apache.fineract.cn.reporting.internal.service;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class BankBranchCbosApiService {

        private final Logger logger;
        private final BankBranchCbosRepository bankBranchCbosRepository;
        private final BankDetailsRepository bankDetailsRepository;
        private final BranchDetRepository branchDetRepository;
//    BankBranch

        @Autowired
        public BankBranchCbosApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                        final BankBranchCbosRepository bankBranchCbosRepository,
                                        final BankDetailsRepository bankDetailsRepository,
                                        final BranchDetRepository branchDetRepository) {
            super();
            this.logger = logger;
            this.bankBranchCbosRepository = bankBranchCbosRepository;
            this.bankDetailsRepository = bankDetailsRepository;
            this.branchDetRepository = branchDetRepository;
        }
        public List<ResponseBankBranchCbos> fetchBankBranchList(RequestBankBranchCbos requestBankBranchCbos) {
            if(requestBankBranchCbos.getStateId() == null){
                requestBankBranchCbos.setStateId(-1);
            }
            if(requestBankBranchCbos.getDistrictId() == null){
                requestBankBranchCbos.setDistrictId(-1);
            }
            if(requestBankBranchCbos.getBlockId() == null){
                requestBankBranchCbos.setBlockId(-1);
            }
            if(requestBankBranchCbos.getBankId() == null){
                requestBankBranchCbos.setBankId(-1);
            }
            if(requestBankBranchCbos.getBranchId()== null){
                requestBankBranchCbos.setBranchId(-1);
            }
            if(requestBankBranchCbos.getFromDate() == null){
                requestBankBranchCbos.setFromDate("null");
            }
            if(requestBankBranchCbos.getToDate()== null) {
                requestBankBranchCbos.setToDate("null");
            }
            if(requestBankBranchCbos.getGeographicalFlag()==null){
                requestBankBranchCbos.setGeographicalFlag(-1);
            }


            List<ResponseBankBranchCbos> responseBankBranchCbosList = new ArrayList<>();
            List<BankBranchCbosEntity> bankBranchCbosEntityList;
            bankBranchCbosEntityList = bankBranchCbosRepository.
                    findByFilter(
                            requestBankBranchCbos.getStateId(),
                            requestBankBranchCbos.getDistrictId(),
                            requestBankBranchCbos.getBlockId(),
                            requestBankBranchCbos.getBankId(),
                            requestBankBranchCbos.getBranchId(),
                            requestBankBranchCbos.getFromDate(),
                            requestBankBranchCbos.getToDate(),
                            requestBankBranchCbos.getGeographicalFlag()

                    );

            bankBranchCbosEntityList.forEach(bankBranchCbosEntity ->
            {
                ResponseBankBranchCbos responseBankBranchCbos = CommonApiMapper.map(bankBranchCbosEntity);
                responseBankBranchCbosList.add(responseBankBranchCbos);
            });
            return responseBankBranchCbosList;
        }
// Fetch Bank Lists
//    public List<ResponseBankDeatils> fetchBankList(Integer stateId, Integer geographicalFlag)
//            {
//            return bankDetailsRepository.fetchBanksList(stateId, geographicalFlag);
//        }

    public List<ResponseBankDeatils> fetchBankList(Integer stateId, Integer geographicalFlag) {
        List<ResponseBankDeatils> responseBankDeatilsList = new ArrayList<>();
        List<BankDetailsEntity> bankDetailsEntityList;
        bankDetailsEntityList = bankDetailsRepository.
                fetchBanksList(stateId, geographicalFlag);
        bankDetailsEntityList.forEach(bankDetailsEntity ->
        {
            ResponseBankDeatils responseBankDeatils = CommonApiMapper.map(bankDetailsEntity);
            responseBankDeatilsList.add(responseBankDeatils);
        });
        return responseBankDeatilsList;
    }

// Fetch Branch Lists
//    public List<BranchDetEntity> fetchBranchList(Integer bankId, Integer geographicalFlag)
//    {
//        return branchDetRepository.fetchBranchList(bankId, geographicalFlag);
//    }
    public List<ResponseBranchDet> fetchBranchList(Integer bankId, Integer geographicalFlag) {
        List<ResponseBranchDet> responseBranchDetList = new ArrayList<>();
        List<BranchDetEntity> branchDetEntityList;
//        if(bankId != null){
//            bankId = -1;
//        }
//        if(geographicalFlag != null){
//            geographicalFlag = -1;
//        }
        branchDetEntityList = branchDetRepository.
                fetchBranchList(bankId, geographicalFlag);

        branchDetEntityList.forEach(branchDetEntity ->
        {
            ResponseBranchDet responseBranchDet = CommonApiMapper.map(branchDetEntity);
            responseBranchDetList.add(responseBranchDet);
        });
        return responseBranchDetList;
    }
}