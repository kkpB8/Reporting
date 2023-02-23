/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.reporting.internal.service;


import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.ProfileReportRequest;
import org.apache.fineract.cn.reporting.api.domain.ProfileReportResponse;
import org.apache.fineract.cn.reporting.api.domain.ResponseMissionUnitLevel;
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
@org.springframework.transaction.annotation.Transactional
public class ProfileReportService<profileReportEntity> {
    private final Logger logger;
    private final ProfileReportRepository profileReportRepository;

    @Autowired
    public ProfileReportService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                final ProfileReportRepository profileReportRepository) {
        super();
        this.logger = logger;
        this.profileReportRepository = profileReportRepository;

    }

    public List<ProfileReportResponse> fetchProfileReportSummaryList(ProfileReportRequest profileReportRequest) {
        if(profileReportRequest.getStateId() == null){
            profileReportRequest.setStateId(-1);
        }
        if(profileReportRequest.getDistrictId() == null){
            profileReportRequest.setDistrictId(-1);
        }

        if(profileReportRequest.getBlockId() == null){
            profileReportRequest.setBlockId(-1);
        }
        if(profileReportRequest.getPanchayatId() == null){
            profileReportRequest.setPanchayatId(-1);
        }
        if(profileReportRequest.getVillageId() == null){
            profileReportRequest.setVillageId(-1);
        }

        List<ProfileReportResponse> profileReportResponseList = new ArrayList<>();
        List<ProfileReportEntity> profileReportEntityList;
        profileReportEntityList = profileReportRepository.
                findByFilter(
                        profileReportRequest.getStateId(),
                        profileReportRequest.getDistrictId(),
                        profileReportRequest.getBlockId(),
                        profileReportRequest.getPanchayatId(),
                        profileReportRequest.getVillageId(),
                        profileReportRequest.getGeographicalFlag()

                );

        profileReportEntityList.forEach(profileReportEntity ->
        {
            ProfileReportResponse profileReportResponse = CommonApiMapper.map(profileReportEntity);
            profileReportResponseList.add(profileReportResponse);
        });
        return profileReportResponseList;
    }

    public List<ResponseMissionUnitLevel> fetchStateWiseMissionLevelReportList(Integer stateId) {
        List<ResponseMissionUnitLevel> responseMissionUnitLevelList = new ArrayList<>();
        List<Object[]> objectList =     profileReportRepository.fetchStateWiseMissionLevelReport(stateId);
        if(objectList != null){
            for(Object[] object :objectList) {
                ResponseMissionUnitLevel responseMissionUnitLevel = new ResponseMissionUnitLevel();
                if (object[0] != null) {
                    responseMissionUnitLevel.setState(object[0].toString());
                }
                if (object[1] != null) {
                    responseMissionUnitLevel.setStateId(new Integer(object[1].toString()));
                }
                if (object[2] != null) {
                    responseMissionUnitLevel.setStateAdmin(new BigInteger(object[2].toString()));
                }
                if (object[3] != null) {
                    responseMissionUnitLevel.setStateManager(new BigInteger(object[3].toString()));
                }
                if (object[4] != null) {
                    responseMissionUnitLevel.setStateThematicUser(new BigInteger(object[4].toString()));
                }
                if (object[5] != null) {
                    responseMissionUnitLevel.setDistrictCount(new BigInteger(object[5].toString()));
                }
                if (object[6] != null) {
                    responseMissionUnitLevel.setStateId(new Integer(object[6].toString()));
                }
                if (object[7] != null) {
                    responseMissionUnitLevel.setDistrictAdmin(new BigInteger(object[7].toString()));
                }
                if (object[8] != null) {
                    responseMissionUnitLevel.setDistrictManager(new BigInteger(object[8].toString()));
                }
                if (object[9] != null) {
                    responseMissionUnitLevel.setDistrictThematicUser(new BigInteger(object[9].toString()));
                }
                if (object[10] != null) {
                    responseMissionUnitLevel.setBlockCount(new BigInteger(object[10].toString()));
                }
                if (object[11] != null) {
                    responseMissionUnitLevel.setStateId(new Integer(object[11].toString()));
                }
                if (object[12] != null) {
                    responseMissionUnitLevel.setBlockAdmin(new BigInteger(object[12].toString()));
                }
                if (object[13] != null) {
                    responseMissionUnitLevel.setBlockManager(new BigInteger(object[13].toString()));
                }
                if (object[14] != null) {
                    responseMissionUnitLevel.setBlockThematicUser(new BigInteger(object[14].toString()));
                }
                responseMissionUnitLevelList.add(responseMissionUnitLevel);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseMissionUnitLevelList;
    }

    public List<ResponseMissionUnitLevel> fetchDistrictWiseMissionLevelReportList(Integer stateId,Integer districtId) {
        List<ResponseMissionUnitLevel> responseMissionUnitLevelList = new ArrayList<>();
        if(stateId == null){
            stateId=-1;
        }
        if(districtId == null){
            districtId=-1;
        }
        List<Object[]> objectList =     profileReportRepository.fetchDistrictWiseMissionLevelReport(stateId,districtId);

        if(objectList != null){
            for(Object[] object :objectList) {
                ResponseMissionUnitLevel responseMissionUnitLevel = new ResponseMissionUnitLevel();
                if (object[0] != null) {
                    responseMissionUnitLevel.setState(object[0].toString());
                }
                if (object[1] != null) {
                    responseMissionUnitLevel.setDistrict(object[1].toString());
                }
                if (object[2] != null) {
                    responseMissionUnitLevel.setStateId(new Integer (object[2].toString()));
                }
                if (object[3] != null) {
                    responseMissionUnitLevel.setDistrictAdmin(new BigInteger(object[3].toString()));
                }
                if (object[4] != null) {
                    responseMissionUnitLevel.setDistrictManager(new BigInteger (object[4].toString()));
                }
                if (object[5] != null) {
                    responseMissionUnitLevel.setDistrictThematicUser(new BigInteger (object[5].toString()));
                }
                if (object[6] != null) {
                    responseMissionUnitLevel.setBlockCount(new BigInteger(object[6].toString()));
                }
                if (object[7] != null) {
                    responseMissionUnitLevel.setDistrictId(new Integer (object[7].toString()));
                }
                if (object[8] != null) {
                    responseMissionUnitLevel.setBlockAdmin(new BigInteger (object[8].toString()));
                }
                if (object[9] != null) {
                    responseMissionUnitLevel.setBlockManager(new BigInteger(object[9].toString()));
                }
                if (object[10] != null) {
                    responseMissionUnitLevel.setBlockThematicUser(new BigInteger (object[10].toString()));
                }
               responseMissionUnitLevelList.add(responseMissionUnitLevel);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseMissionUnitLevelList;
    }


    public List<ResponseMissionUnitLevel> fetchBlockWiseMissionLevelReportList(Integer stateId, Integer districtId,Integer blockId) {
        List<ResponseMissionUnitLevel> responseMissionUnitLevelList = new ArrayList<>();
        if(stateId == null){
            stateId=-1;
        }
        if(districtId == null){
            districtId=-1;
        }
        if(blockId == null){
            blockId=-1;
        }
        List<Object[]> objectList =     profileReportRepository.fetchBlockWiseMissionLevelReport(stateId,districtId,blockId);
        if(objectList != null){
            for(Object[] object : objectList) {
                ResponseMissionUnitLevel responseMissionUnitLevel = new ResponseMissionUnitLevel();
                if (object[0] != null) {
                    responseMissionUnitLevel.setState(object[0].toString());
                }
                if (object[1] != null) {
                    responseMissionUnitLevel.setDistrict(object[1].toString());
                }
                if (object[2] != null) {
                    responseMissionUnitLevel.setDistrictId(new Integer(object[2].toString()));
                }
                if (object[3] != null) {
                    responseMissionUnitLevel.setBlock(object[3].toString());
                }
                if (object[4] != null) {
                    responseMissionUnitLevel.setBlockId(new Integer(object[4].toString()));
                }
                if (object[5] != null) {
                    responseMissionUnitLevel.setBlockAdmin(new BigInteger (object[5].toString()));
                }
                if (object[6] != null) {
                    responseMissionUnitLevel.setBlockManager(new BigInteger (object[6].toString()));
                }
                if (object[7] != null) {
                    responseMissionUnitLevel.setBlockThematicUser(new BigInteger (object[7].toString()));
                }
              responseMissionUnitLevelList.add(responseMissionUnitLevel);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseMissionUnitLevelList;

    }
}



