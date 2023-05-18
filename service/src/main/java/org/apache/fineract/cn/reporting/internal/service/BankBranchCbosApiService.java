package org.apache.fineract.cn.reporting.internal.service;
import jnr.ffi.annotations.In;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
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

public class BankBranchCbosApiService {

        private final Logger logger;
        private final BankBranchCbosRepository bankBranchCbosRepository;
        private final BankDetailsRepository bankDetailsRepository;
        private final BranchDetRepository branchDetRepository;
        private final BankWiseCboRepository bankWiseCboRepository;
//    BankBranch

        @Autowired
        public BankBranchCbosApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                        final BankBranchCbosRepository bankBranchCbosRepository,
                                        final BankDetailsRepository bankDetailsRepository,
                                        final BranchDetRepository branchDetRepository,
                                        final BankWiseCboRepository bankWiseCboRepository) {
            super();
            this.logger = logger;
            this.bankBranchCbosRepository = bankBranchCbosRepository;
            this.bankDetailsRepository = bankDetailsRepository;
            this.branchDetRepository = branchDetRepository;
            this.bankWiseCboRepository = bankWiseCboRepository;
        }
        public List<ResponseBankBranchCbos> fetchBankBranchList(Integer geographicalFlag, String fromDate, String toDate, Integer stateId,
                                                                Integer districtId, Integer blockId,Integer bankId,
                                                                Integer branchId) {
            if(geographicalFlag == null){
                geographicalFlag = -1;
            }
            if(fromDate == null){
                fromDate = "null";
            }
            if(toDate == null){
                toDate = "null";
            }
            if(stateId == null){
                stateId = -1;
            }
            if(districtId == null){
                districtId = -1;
            }
            if(blockId == null){
                blockId = -1;
            }
            if(bankId == null){
                bankId = -1;
            }
            if(branchId == null){
                branchId = -1;
            }

            List<ResponseBankBranchCbos> responseBankBranchCbosList = new ArrayList<>();
            List<BankBranchCbosEntity> bankBranchCbosEntityList;
            bankBranchCbosEntityList = bankBranchCbosRepository.
                    findByFilter(geographicalFlag, fromDate, toDate, stateId, districtId, blockId, bankId, branchId);
            bankBranchCbosEntityList.forEach(bankBranchCbosEntity ->
            {
                ResponseBankBranchCbos responseBankBranchCbos = CommonApiMapper.map(bankBranchCbosEntity);
                responseBankBranchCbosList.add(responseBankBranchCbos);
            });
            return responseBankBranchCbosList;
        }

    public List<ResponseBranchDet> fetchBranchList(Integer geographicalFlag, Integer stateId,Integer bankId) {
        List<ResponseBranchDet> responseBranchDetList = new ArrayList<>();
        List<Object[]>  objectList =objectList =  branchDetRepository.fetchBranchList(geographicalFlag, stateId, bankId);
        if(objectList != null){
            for(Object[] object :objectList) {
                ResponseBranchDet responseBranchDet = new ResponseBranchDet();
                if (object[0] != null) {
                    responseBranchDet.setBranchId(new Integer(object[0].toString()));
                }
                if (object[1] != null) {
                    responseBranchDet.setBranchName(object[1].toString());
                }
                responseBranchDetList.add(responseBranchDet);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseBranchDetList;
    }

    public List<ResponseBankWiseCbo> fetchBankWiseCboList(Integer geographicalFlag, String fromDate, String toDate, Integer stateId,
                                                          Integer districtId, Integer blockId, Integer bankTypeId, Integer bankId,
                                                          Integer branchId) {
        if(geographicalFlag == null){
            geographicalFlag = -1;
        }
        if(fromDate == null){
            fromDate = "null";
        }
        if(toDate == null){
            toDate = "null";
        }
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = -1;
        }
        if(blockId == null){
            blockId = -1;
        }
        if(bankTypeId == null){
            bankTypeId = -1;
        }
        if(bankId == null){
            bankId = -1;
        }
        if(branchId == null){
            branchId = -1;
        }

        List<ResponseBankWiseCbo> responseBankWiseCboList = new ArrayList<>();
        List<BankWiseCboEntity> bankWiseCboEntityList;
        bankWiseCboEntityList = bankWiseCboRepository.
                fetchBankWiseCbo(geographicalFlag, fromDate, toDate, stateId, districtId, blockId,bankTypeId, bankId,  branchId);

        bankWiseCboEntityList.forEach(bankWiseCboEntity ->
        {
            ResponseBankWiseCbo responseBankWiseCbo = CommonApiMapper.map(bankWiseCboEntity);
            responseBankWiseCboList.add(responseBankWiseCbo);
        });
        return responseBankWiseCboList;
    }

    public List<ResponseBankDeatils> fetchBank(Integer geographicalFlag, Integer stateId) {
        List<ResponseBankDeatils> responseBankDeatilsList = new ArrayList<>();
        List<Object[]> objectList  = bankDetailsRepository.fetchBankList(geographicalFlag, stateId);
        if(objectList != null){
            for(Object[] object :objectList) {
                ResponseBankDeatils responseBankDeatils = new ResponseBankDeatils();
                if (object[0] != null) {
                    responseBankDeatils.setBankId(new Integer(object[0].toString()));
                }
                if (object[1] != null) {
                    responseBankDeatils.setBankName(object[1].toString());
                }
                responseBankDeatilsList.add(responseBankDeatils);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseBankDeatilsList;
    }

}
