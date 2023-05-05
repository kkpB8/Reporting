package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.BlockSaturationsRequest;
import org.apache.fineract.cn.reporting.api.domain.BlockSaturationsResponse;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;

import org.apache.fineract.cn.reporting.internal.repository.BlockSaturationsEntity;
import org.apache.fineract.cn.reporting.internal.repository.BlockSaturationsRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
//@Service
public class BlockSaturationsApiRestService {
/*
        private final Logger logger;
        private final BlockSaturationsRepository blockSaturationsRepository;

        @Autowired
        public BlockSaturationsApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                     final BlockSaturationsRepository blockSaturationsRepository) {
            super();
            this.logger = logger;
            this.blockSaturationsRepository = blockSaturationsRepository;
        }

            public List<BlockSaturationsResponse> fetchBlockSaturationsList(BlockSaturationsRequest blockSaturationsRequest) {
            if(blockSaturationsRequest.getStateId() == null){
                blockSaturationsRequest.setStateId(-1);
            }
            if(blockSaturationsRequest.getFromDate() == null){
                blockSaturationsRequest.setFromDate("null");
            }
            if(blockSaturationsRequest.getToDate()== null){
                blockSaturationsRequest.setToDate("null");
            }
            if(blockSaturationsRequest.getGeographicalFlag()==null){
                blockSaturationsRequest.setGeographicalFlag(-1);
            }

            List<BlockSaturationsResponse> blockSaturationsResponseList = new ArrayList<>();
            List<BlockSaturationsEntity>blockSaturationsEntityList;
                blockSaturationsEntityList = blockSaturationsRepository.
                    findByFilter(
                            blockSaturationsRequest.getStateId(),
                            blockSaturationsRequest.getDistrictId(),
                            blockSaturationsRequest.getBlockId(),
                            blockSaturationsRequest.getGeographicalFlag(),
                            blockSaturationsRequest.getFromDate(),
                            blockSaturationsRequest.getToDate()
                    );

                blockSaturationsEntityList.forEach(blockSaturationsEntity ->
            {
                BlockSaturationsResponse blockSaturationsResponse = CommonApiMapper.map(blockSaturationsEntity);
                blockSaturationsResponseList.add(blockSaturationsResponse);
            });
            return blockSaturationsResponseList;
        }
 */
    }