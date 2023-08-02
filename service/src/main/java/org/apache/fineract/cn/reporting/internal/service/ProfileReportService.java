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
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
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

    public List<ProfileReportResponse> fetchProfileReportSummaryList(Integer geographicalFlag,String yearMonth,Integer stateId,
                                                                     Integer districtId,Integer blockId,Integer panchayatId,Integer villageId) {
        if(geographicalFlag == null){
            geographicalFlag = -1;
        }
        if(yearMonth == null){
            yearMonth = "null";
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
        if(panchayatId == null){
            panchayatId = -1;
        }
        if(villageId == null){
            villageId = -1;
        }

        List<ProfileReportResponse> profileReportResponseList = new ArrayList<>();
        List<ProfileReportEntity> profileReportEntityList;
        profileReportEntityList = profileReportRepository.
                findByFilter(geographicalFlag, yearMonth, stateId, districtId, blockId, panchayatId, villageId);

        profileReportEntityList.forEach(profileReportEntity ->
        {
            ProfileReportResponse profileReportResponse = CommonApiMapper.map(profileReportEntity);
            profileReportResponseList.add(profileReportResponse);
        });
        return profileReportResponseList;
    }
    public List<ResponseMissionUnitLevel> fetchStateWiseMissionLevelReportList(Integer stateId) {
        if(stateId == null || stateId==0){
            stateId=-1;
        }
        List<ResponseMissionUnitLevel> responseMissionUnitLevelList = new ArrayList<>();
    List<Object[]> objectList =objectList = profileReportRepository.fetchStateWiseMissionLevelReport(stateId);
       /* try {*/

      /* }catch (Exception ex){
            System.out.println("---------------------------------------------------------------------------exception on this line --------------------------------------------------------------------------");
            objectList = profileReportRepository.fetchStateWiseMissionLevelReport(stateId);
        }*/
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
//                if (object[15] != null){
//                    responseMissionUnitLevel.setUpdatedDate(object[15].toString());
//                }
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
               /* if (object[3] != null) {
                    responseMissionUnitLevel.setDistrictId(new Integer (object[3].toString()));
                }*/
                if (object[4] != null) {
                    responseMissionUnitLevel.setDistrictAdmin(new BigInteger(object[4].toString()));
                }
                if (object[5] != null) {
                    responseMissionUnitLevel.setDistrictManager(new BigInteger (object[5].toString()));
                }
                if (object[6] != null) {
                    responseMissionUnitLevel.setDistrictThematicUser(new BigInteger (object[6].toString()));
                }
                if (object[7] != null) {
                    responseMissionUnitLevel.setBlockCount(new BigInteger(object[7].toString()));
                }

                if (object[8] != null) {
                    responseMissionUnitLevel.setBlockAdmin(new BigInteger (object[9].toString()));
                }
                if (object[10] != null) {
                    responseMissionUnitLevel.setBlockManager(new BigInteger(object[10].toString()));
                }
                if (object[11] != null) {
                    responseMissionUnitLevel.setBlockThematicUser(new BigInteger (object[11].toString()));
                }
                if (object[12] != null) {
                    responseMissionUnitLevel.setDistrictId(new Integer (object[12].toString()));
                }
//                if (object[13] != null) {
//                    responseMissionUnitLevel.setUpdatedDate(object[13].toString());
//                }
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
                if (object[3] != null) {
                    responseMissionUnitLevel.setBlock(object[3].toString());
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
                if(object[8] != null){
                    responseMissionUnitLevel.setStateId(new Integer(object[8].toString()));
                }
                if (object[2] != null) {
                    responseMissionUnitLevel.setDistrictId(new Integer(object[2].toString()));
                }
                if (object[4] != null) {
                    responseMissionUnitLevel.setBlockId(new Integer(object[4].toString()));
                }
//                if (object[11] != null) {
//                    responseMissionUnitLevel.setUpdatedDate(object[11].toString());
//                }
                responseMissionUnitLevelList.add(responseMissionUnitLevel);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseMissionUnitLevelList;
    }

    public List<ResponseBs>  fetchBlockSaturation(String yearMonth, Integer stateId) {
        List<ResponseBs> responseBsList = new ArrayList<>();
        if (yearMonth == null) {
            yearMonth = "null";
        }
        if (stateId == null){
            stateId = -1;
        }
        List<Object[]> objectList =     profileReportRepository.fetchBS(yearMonth, stateId);
        if(objectList != null){
            for(Object[] object : objectList) {
                ResponseBs responseBs = new ResponseBs();
                if (object[0] != null) {
                    responseBs.setStateId(new Integer (object[0].toString()));
                }
                if (object[1] != null) {
                    responseBs.setStateName(object[1].toString());
                }

                if (object[2] != null) {
                    responseBs.setIntBlockZero3(new Integer (object[2].toString()));
                }
                if (object[3] != null) {
                    responseBs.setIntBlockZero3sat(new Integer (object[3].toString()));
                }
                if (object[4] != null) {
                    responseBs.setIntBlockThree6(new Integer (object[4].toString()));
                }
                if (object[5] != null) {
                    responseBs.setIntBlockThree6sat(new Integer (object[5].toString()));
                }
                if (object[6] != null) {
                    responseBs.setIntBlockSix10(new Integer (object[6].toString()));
                }
                if (object[7] != null) {
                    responseBs.setIntBlockSix10sat(new Integer (object[7].toString()));
                }
                if (object[8] != null) {
                    responseBs.setIntBlockMore10(new Integer (object[8].toString()));
                }
                if (object[9] != null) {
                    responseBs.setIntBlockMore10sat(new Integer (object[9].toString()));
                }
//                if (object[10] != null) {
//                    responseBs.setUpdatedDate(object[10].toString());
//                }
                responseBsList.add(responseBs);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseBsList;
    }

    public List<ResponseBs>  fetchBlockSaturationList(String yearMonth, Integer stateId, Integer districtId) {
        List<ResponseBs> responseBsList = new ArrayList<>();
        if (yearMonth == null) {
            yearMonth = "null";
        }
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = -1;
        }
        List<Object[]> objectList = profileReportRepository.fetchBSlist(yearMonth, stateId, districtId);
        if(objectList != null){
            for(Object[] object : objectList) {
                ResponseBs responseBs = new ResponseBs();
                if (object[0] != null) {
                    responseBs.setStateId(new Integer (object[0].toString()));
                }
                if (object[1] != null) {
                    responseBs.setStateName(object[1].toString());
                }
                if (object[2] != null) {
                    responseBs.setDistrictId(new Integer (object[2].toString()));
                }
                if (object[3] != null) {
                    responseBs.setDistrictName(object[3].toString());
                }
                if (object[4] != null) {
                    responseBs.setIntBlockZero3(new Integer (object[4].toString()));
                }
                if (object[5] != null) {
                    responseBs.setIntBlockZero3sat(new Integer (object[5].toString()));
                }
                if (object[6] != null) {
                    responseBs.setIntBlockThree6(new Integer (object[6].toString()));
                }
                if (object[7] != null) {
                    responseBs.setIntBlockThree6sat(new Integer (object[7].toString()));
                }
                if (object[8] != null) {
                    responseBs.setIntBlockSix10(new Integer (object[8].toString()));
                }
                if (object[9] != null) {
                    responseBs.setIntBlockSix10sat(new Integer (object[9].toString()));
                }
                if (object[10] != null) {
                    responseBs.setIntBlockMore10(new Integer (object[10].toString()));
                }
                if (object[11] != null) {
                    responseBs.setIntBlockMore10sat(new Integer (object[11].toString()));
                }
//                if (object[12] != null) {
//                    responseBs.setUpdatedDate(object[12].toString());
//                }
                responseBsList.add(responseBs);
            }
        }else{
            throw  new RecordNotFoundException(CustomStatus.NO_RECORD_FOUND);
        }
        return responseBsList;
    }

    public List<ResponseSummaryReportsDetail> getSummaryReportDetail(Integer stateId, String districtId, String blockId) {
        List<ResponseSummaryReportsDetail> responseSummaryReportList = new ArrayList<>();
        List<Object[]> summaryReportList = null;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = null;
        }if(blockId == null){
            blockId =null;
        }
        if (stateId != null && districtId != null && blockId != null) {
            summaryReportList = profileReportRepository.getSummaryReportDetails(blockId, districtId, stateId);
            if (summaryReportList != null && summaryReportList.size() > 0) {
                for (Object[] summaryReport : summaryReportList) {
                    ResponseSummaryReportsDetail responseSummaryReport1 = new ResponseSummaryReportsDetail();
                    if (summaryReport[0] != null) {
                        responseSummaryReport1.setState(summaryReport[0].toString());
                    }
                    if (summaryReport[1] != null) {
                        responseSummaryReport1.setDistrict(summaryReport[1].toString());
                    }
                    if (summaryReport[2] != null) {
                        responseSummaryReport1.setBlock(summaryReport[2].toString());
                    }
                    if (summaryReport[3] != null) {
                        responseSummaryReport1.setTypeOfCBO(summaryReport[3].toString());
                    }
                    if (summaryReport[4] != null) {
                        responseSummaryReport1.setTotalNoOfBookKeepers(BigInteger.valueOf((Long) summaryReport[4]));
                    }
                    if (summaryReport[5] != null) {
                        responseSummaryReport1.setNoOfBookkeepersWithMappedCBO(BigInteger.valueOf((Long) summaryReport[5]));
                    }
                    if (summaryReport[6] != null) {
                        responseSummaryReport1.setTotalCBOCount(BigInteger.valueOf((Long) summaryReport[6]));
                    }
                    if (summaryReport[7] != null) {
                        responseSummaryReport1.setcBOMappedCount(((Number) summaryReport[7]).intValue());
                    }
                    if (summaryReport[8] != null) {
//                        Float x = ((Number) summaryReport[8]).floatValue();
                        responseSummaryReport1.setcBOMappedPercentage(summaryReport[8].toString());
                    }
                    if (summaryReport[9] != null) {
                        responseSummaryReport1.setcBOsMappedMigrated(((Number) summaryReport[9]).intValue());
                    }
                    if (summaryReport[10] != null) {
                        responseSummaryReport1.setNewCBOsMapped(((Number) summaryReport[10]).intValue());
                    }
                    if (summaryReport[11] != null) {
                        responseSummaryReport1.setcBOsApprovedbyBM(((Number) summaryReport[11]).intValue());
                    }
                    if (summaryReport[12] != null) {
                        responseSummaryReport1.setcBOsRejectedbyBM(((Number) summaryReport[12]).intValue());
                    }
                    if (summaryReport[13] != null) {
                        responseSummaryReport1.setCBOsPendingwithBM(((Number) summaryReport[13]).intValue());
                    }
                    if (summaryReport[14] != null) {
                        responseSummaryReport1.setCBOsPendingwithBookkeeper(((Number) summaryReport[14]).intValue());
                    }
                    if (summaryReport[15] != null) {
                        responseSummaryReport1.setIncompleteCBOs(((Number) summaryReport[15]).intValue());
                    }
                    if (summaryReport[16] != null) {
//                        Float x = ((Number) summaryReport[16]).floatValue();
                        responseSummaryReport1.setPercentageApprovedMapped(summaryReport[16].toString());
                    }
                    if (summaryReport[17] != null) {
//                        Float x = ((Number) summaryReport[17]).floatValue();
                        responseSummaryReport1.setPercentageApprovedOverall(summaryReport[17].toString());
                    }
                    responseSummaryReportList.add(responseSummaryReport1);
                }
            }else {
                throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
            }
            return responseSummaryReportList;
        }
        if (stateId != null && districtId == null && blockId == null) {
            summaryReportList = profileReportRepository.getSummaryReportSateWiseDetails(blockId, districtId, stateId);
            if (summaryReportList != null && summaryReportList.size() > 0) {
                for (Object[] summaryReport : summaryReportList) {
                    ResponseSummaryReportsDetail responseSummaryReport1 = new ResponseSummaryReportsDetail();
                    if (summaryReport[0] != null) {
                        responseSummaryReport1.setState(summaryReport[0].toString());
                    }
                    if (summaryReport[1] != null) {
                        responseSummaryReport1.setTypeOfCBO(summaryReport[1].toString());
                    }
                    if (summaryReport[2] != null) {
                        responseSummaryReport1.setTotalNoOfBookKeepers(BigInteger.valueOf((Long) summaryReport[2]));
                    }
                    if (summaryReport[3] != null) {
                        responseSummaryReport1.setNoOfBookkeepersWithMappedCBO(BigInteger.valueOf((Long) summaryReport[3]));
                    }
                    if (summaryReport[4] != null) {
                        responseSummaryReport1.setTotalCBOCount(BigInteger.valueOf((Long) summaryReport[4]));
                    }
                    if (summaryReport[5] != null) {
                        responseSummaryReport1.setcBOMappedCount(((Number) summaryReport[5]).intValue());
                    }
                    if (summaryReport[6] != null) {
                        responseSummaryReport1.setcBOMappedPercentage(summaryReport[6].toString());
                    }
                    if (summaryReport[7] != null) {
                        responseSummaryReport1.setcBOsMappedMigrated(((Number) summaryReport[7]).intValue());
                    }
                    if (summaryReport[8] != null) {
                        responseSummaryReport1.setNewCBOsMapped(((Number) summaryReport[8]).intValue());
                    }
                    if (summaryReport[9] != null) {
                        responseSummaryReport1.setcBOsApprovedbyBM(((Number) summaryReport[9]).intValue());
                    }
                    if (summaryReport[10] != null) {
                        responseSummaryReport1.setcBOsRejectedbyBM(((Number) summaryReport[10]).intValue());
                    }
                    if (summaryReport[11] != null) {
                        responseSummaryReport1.setCBOsPendingwithBM(((Number) summaryReport[11]).intValue());
                    }
                    if (summaryReport[12] != null) {
                        responseSummaryReport1.setCBOsPendingwithBookkeeper(((Number) summaryReport[12]).intValue());
                    }
                    if (summaryReport[13] != null) {
                        responseSummaryReport1.setIncompleteCBOs(((Number) summaryReport[13]).intValue());
                    }
                    if (summaryReport[14] != null) {
                        responseSummaryReport1.setPercentageApprovedMapped(summaryReport[14].toString());
                    }
                    if (summaryReport[15] != null) {
                        responseSummaryReport1.setPercentageApprovedOverall(summaryReport[15].toString());
                    }
                    responseSummaryReportList.add(responseSummaryReport1);
                }
            }else {
                throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
            }
            return responseSummaryReportList;
        }
        if (stateId != null && districtId != null && blockId == null) {
            summaryReportList = profileReportRepository.getSummaryReportDistrictDetails(blockId, districtId, stateId);
            if (summaryReportList != null && summaryReportList.size() > 0) {
                for (Object[] summaryReport : summaryReportList) {
                    ResponseSummaryReportsDetail responseSummaryReport1 = new ResponseSummaryReportsDetail();
                    if (summaryReport[0] != null) {
                        responseSummaryReport1.setState(summaryReport[0].toString());
                    }
                    if (summaryReport[1] != null) {
                        responseSummaryReport1.setDistrict(summaryReport[1].toString());
                    }
                    if (summaryReport[2] != null) {
                        responseSummaryReport1.setTypeOfCBO(summaryReport[2].toString());
                    }
                    if (summaryReport[3] != null) {
                        responseSummaryReport1.setTotalNoOfBookKeepers(BigInteger.valueOf((Long) summaryReport[3]));
                    }
                    if (summaryReport[4] != null) {
                        responseSummaryReport1.setNoOfBookkeepersWithMappedCBO(BigInteger.valueOf((Long) summaryReport[4]));
                    }
                    if (summaryReport[5] != null) {
                        responseSummaryReport1.setTotalCBOCount(BigInteger.valueOf((Long) summaryReport[5]));
                    }
                    if (summaryReport[6] != null) {
                        responseSummaryReport1.setcBOMappedCount(((Number) summaryReport[6]).intValue());
                    }
                    if (summaryReport[7] != null) {
                        responseSummaryReport1.setcBOMappedPercentage(summaryReport[7].toString());
                    }
                    if (summaryReport[8] != null) {
                        responseSummaryReport1.setcBOsMappedMigrated(((Number) summaryReport[8]).intValue());
                    }
                    if (summaryReport[9] != null) {
                        responseSummaryReport1.setNewCBOsMapped(((Number) summaryReport[9]).intValue());
                    }
                    if (summaryReport[10] != null) {
                        responseSummaryReport1.setcBOsApprovedbyBM(((Number) summaryReport[10]).intValue());
                    }
                    if (summaryReport[11] != null) {
                        responseSummaryReport1.setcBOsRejectedbyBM(((Number) summaryReport[11]).intValue());
                    }
                    if (summaryReport[12] != null) {
                        responseSummaryReport1.setCBOsPendingwithBM(((Number) summaryReport[12]).intValue());
                    }
                    if (summaryReport[13] != null) {
                        responseSummaryReport1.setCBOsPendingwithBookkeeper(((Number) summaryReport[13]).intValue());
                    }
                    if (summaryReport[14] != null) {
                        responseSummaryReport1.setIncompleteCBOs(((Number) summaryReport[14]).intValue());
                    }
                    if (summaryReport[15] != null) {
                        responseSummaryReport1.setPercentageApprovedMapped(summaryReport[15].toString());
                    }
                    if (summaryReport[16] != null) {
                        responseSummaryReport1.setPercentageApprovedOverall(summaryReport[16].toString());
                    }

                    responseSummaryReportList.add(responseSummaryReport1);
                }
            }else {
                throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
            }
        }
        return responseSummaryReportList;
    }

    public List<ResponseShgDetails> getShgDetail(Integer stateId,Integer districtId,Integer blockId,Integer villageId,Integer panchayatId) {
        List<ResponseShgDetails> responseShgDetailsList = new ArrayList<>();
        List<Object[]> shgDetailsList;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = -1;
        }if(blockId == null){
            blockId =-1;
        }if(villageId == null){
            villageId =-1;
        }
        if(panchayatId == null){
            panchayatId =-1;
        }
        shgDetailsList = profileReportRepository.getShgDetails(blockId,villageId,panchayatId);
        if (shgDetailsList != null && shgDetailsList.size() >0) {
            for (Object[] shgDetails : shgDetailsList) {
                ResponseShgDetails responseShgDetails1 = new ResponseShgDetails();
                if (shgDetails[0] != null) {
                    responseShgDetails1.setState(shgDetails[0].toString());
                }
                if (shgDetails[1] != null) {
                    responseShgDetails1.setDistrict(shgDetails[1].toString());
                }
                if (shgDetails[2] != null) {
                    responseShgDetails1.setBlock(shgDetails[2].toString());
                }
                if (shgDetails[3] != null) {
                    responseShgDetails1.setGp(shgDetails[3].toString());
                }
                if (shgDetails[4] != null) {
                    responseShgDetails1.setVillage(shgDetails[4].toString());
                }
                if (shgDetails[5] != null) {
                    responseShgDetails1.setShgCode(shgDetails[5].toString());
                }
                if (shgDetails[6] != null) {
                    responseShgDetails1.setShgName(shgDetails[6].toString());
                }
                if (shgDetails[7] != null) {
                    responseShgDetails1.setUserId(shgDetails[7].toString());
                }
                if (shgDetails[8] != null) {
                    responseShgDetails1.setUserName(shgDetails[8].toString());
                }
                if (shgDetails[9] != null) {
                    responseShgDetails1.setApprovedStatus(shgDetails[9].toString());
                }
                if (shgDetails[10] != null) {
                    responseShgDetails1.setShgStatus(shgDetails[10].toString());
                }
                if (shgDetails[11] != null) {
                    responseShgDetails1.setIsNewShg(shgDetails[11].toString());
                }
                responseShgDetailsList.add(responseShgDetails1);
            }
        }else{
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseShgDetailsList;
    }

    public List<ResponseMemberDetails> getMemberDetail(Integer stateId,Integer districtId, Integer blockId,Integer panchayatId,Integer villageId) {
        List<ResponseMemberDetails> responseMemberDetailsList = new ArrayList<>();
        List<Object[]> clfMemberDetailList;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = -1;
        }if(blockId == null){
            blockId =-1;
        }if(panchayatId == null){
            panchayatId =-1;
        }
        if(villageId == null){
            villageId =-1;
        }
        clfMemberDetailList = profileReportRepository.getMemberDetails(blockId,panchayatId,villageId);
        if (clfMemberDetailList != null && clfMemberDetailList.size() >0) {
            for (Object[] memberDetails : clfMemberDetailList) {
                ResponseMemberDetails responseMemberDetails1 = new ResponseMemberDetails();
                if (memberDetails[0] != null) {
                    responseMemberDetails1.setState(memberDetails[0].toString());
                }
                if (memberDetails[1] != null) {
                    responseMemberDetails1.setDistrict(memberDetails[1].toString());
                }
                if (memberDetails[2] != null) {
                    responseMemberDetails1.setBlock(memberDetails[2].toString());
                }
                if (memberDetails[3] != null) {
                    responseMemberDetails1.setGp(memberDetails[3].toString());
                }
                if (memberDetails[4] != null) {
                    responseMemberDetails1.setVillage(memberDetails[4].toString());
                }
                if (memberDetails[5] != null) {
                    responseMemberDetails1.setShgCode(memberDetails[5].toString());
                }
                if (memberDetails[6] != null) {
                    responseMemberDetails1.setShgName(memberDetails[6].toString());
                }
                if (memberDetails[7] != null) {
                    responseMemberDetails1.setMemberCode(memberDetails[7].toString());
                }
                if (memberDetails[8] != null) {
                    responseMemberDetails1.setMemberName(memberDetails[8].toString());
                }
                if (memberDetails[9] != null) {
                    responseMemberDetails1.setUserId(memberDetails[9].toString());
                }
                if (memberDetails[10] != null) {
                    responseMemberDetails1.setUserName(memberDetails[10].toString());
                }
                /*if (memberDetails[11] != null) {
                    responseMemberDetails1.setActivationStatus(memberDetails[11].toString());
                }*/
                if (memberDetails[11] != null) {
                    responseMemberDetails1.setApprovedStatus(memberDetails[11].toString());
                }
                if (memberDetails[12] != null) {
                    responseMemberDetails1.setMemberStatus(memberDetails[12].toString());
                }
                responseMemberDetailsList.add(responseMemberDetails1);
            }
        }else{
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseMemberDetailsList;
    }

    public List<ResponseUserConsolidate> getUserConsolidateData(Integer stateId,String districtId,String blockId) {
        List<ResponseUserConsolidate> responseUserConsolidateList = new ArrayList<>();
        List<Object[]> userConsolidateDataList;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = null;
        }if(blockId == null){
            blockId =null;
        }
        userConsolidateDataList = profileReportRepository.getUserConsolidateData(stateId,districtId,blockId);
        if (userConsolidateDataList != null && userConsolidateDataList.size() >0) {
            for (Object[] userConsolidate : userConsolidateDataList) {
                ResponseUserConsolidate responseUserConsolidate1 = new ResponseUserConsolidate();
                if (userConsolidate[0] != null) {
                    responseUserConsolidate1.setState(userConsolidate[0].toString());
                }
                if (userConsolidate[1] != null) {
                    responseUserConsolidate1.setUserRoleName(userConsolidate[1].toString());
                }
                if (userConsolidate[2] != null) {
                    responseUserConsolidate1.setCount((Long) (userConsolidate[2]));
                }
                responseUserConsolidateList.add(responseUserConsolidate1);
            }

        }else{
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseUserConsolidateList;
    }
    public List<ResponseVODetails> getVODetail(Integer stateId,Integer districtId,Integer blockId,Integer panchayatId) {
        List<ResponseVODetails> responseVoDetailsList = new ArrayList<>();
        List<Object[]> voDetailsList;

        if(stateId == null){
            stateId = -1;
        } if(districtId == null){
            districtId = -1;
        }if(blockId == null){
            blockId =-1;
        }if(panchayatId == null){
            panchayatId =-1;
        }
        voDetailsList = profileReportRepository.getVoDetails(blockId,panchayatId);
        if (voDetailsList != null && voDetailsList.size() >0) {
            for (Object[] voDetails : voDetailsList) {
                ResponseVODetails responseVODetails1 = new ResponseVODetails();
                if (voDetails[0] != null) {
                    responseVODetails1.setState(voDetails[0].toString());
                }
                if (voDetails[1] != null) {
                    responseVODetails1.setDistrict(voDetails[1].toString());
                }
                if (voDetails[2] != null) {
                    responseVODetails1.setBlock(voDetails[2].toString());
                }
                if (voDetails[3] != null) {
                    responseVODetails1.setGp(voDetails[3].toString());
                }
                if (voDetails[4] != null) {
                    responseVODetails1.setVoCode(Long.parseLong((String) voDetails[4]));
                }
                if (voDetails[5] != null) {
                    responseVODetails1.setVoName(voDetails[5].toString());
                }
                if (voDetails[6] != null) {
                    responseVODetails1.setUserId(voDetails[6].toString());
                }
                if (voDetails[7] != null) {
                    responseVODetails1.setUserName(voDetails[7].toString());
                }
                if (voDetails[8] != null) {
                    responseVODetails1.setApprovedStatus(voDetails[8].toString());
                }
                if (voDetails[9] != null) {
                    responseVODetails1.setVoStatus(voDetails[9].toString());
                }
                if (voDetails[10] != null) {
                    responseVODetails1.setIsNewVo(voDetails[10].toString());
                }
                responseVoDetailsList.add(responseVODetails1);
            }
        }else{
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseVoDetailsList;
    }


    public List<ResponseClfDetails> getClfDetail(Integer stateId,Integer districtId,Integer blockId) {
        List<ResponseClfDetails> responseClfDetailsList = new ArrayList<>();
        List<Object[]> clfDetailsList;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = -1;
        }if(blockId == null){
            blockId =-1;
        }
        clfDetailsList = profileReportRepository.getClfDetails(blockId);
        if (clfDetailsList != null && clfDetailsList.size() > 0) {
            for (Object[] clfDetails : clfDetailsList) {
                ResponseClfDetails responseClfDetails1 = new ResponseClfDetails();
                if (clfDetails[0] != null) {
                    responseClfDetails1.setState(clfDetails[0].toString());
                }
                if (clfDetails[1] != null) {
                    responseClfDetails1.setDistrict(clfDetails[1].toString());
                }
                if (clfDetails[2] != null) {
                    responseClfDetails1.setBlock(clfDetails[2].toString());
                }
                if (clfDetails[3] != null) {
                    responseClfDetails1.setClfCode((Long.parseLong((String)clfDetails[3])));
                }
                if (clfDetails[4] != null) {
                    responseClfDetails1.setClfName(clfDetails[4].toString());
                }
                if (clfDetails[5] != null) {
                    responseClfDetails1.setUserId(clfDetails[5].toString());
                }
                if (clfDetails[6] != null) {
                    responseClfDetails1.setUserName(clfDetails[6].toString());
                }
                /*if (clfDetails[7] != null) {
                    responseClfDetails1.setActivationStatus(clfDetails[7].toString());
                }*/
                if (clfDetails[7] != null) {
                    responseClfDetails1.setApprovedStatus(clfDetails[7].toString());
                }
                if (clfDetails[8] != null) {
                    responseClfDetails1.setVoStatus(clfDetails[8].toString());
                }
                if (clfDetails[9] != null) {
                    responseClfDetails1.setIsNewClf(clfDetails[9].toString());
                }
                responseClfDetailsList.add(responseClfDetails1);
            }
        }else{
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseClfDetailsList;
    }

    public List<ResponseUserBKDetails> getUserBKDetails(Integer stateId,String districtId,String blockId,String panchayatId, String villageId) {
        List<ResponseUserBKDetails> responseUserBKDetailsList = new ArrayList<>();
        List<Object[]> userBKDetailsList;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = null;
        }if(blockId == null){
            blockId =null;
        }if(panchayatId == null){
            panchayatId =null;
        }
        if(villageId == null){
            villageId =null;
        }
        userBKDetailsList = profileReportRepository.getUserBKDetails(stateId,districtId,blockId,panchayatId,villageId);
        if (userBKDetailsList != null && userBKDetailsList.size() >0) {
            for (Object[] userBKDetails : userBKDetailsList) {
                ResponseUserBKDetails userBKDetails1 = new ResponseUserBKDetails();
                if (userBKDetails[0] != null) {
                    userBKDetails1.setState(userBKDetails[0].toString());
                }
                if (userBKDetails[1] != null) {
                    userBKDetails1.setDistrict(userBKDetails[1].toString());
                }
                if (userBKDetails[2] != null) {
                    userBKDetails1.setBlock(userBKDetails[2].toString());
                }
                if (userBKDetails[3] != null) {
                    userBKDetails1.setGp(userBKDetails[3].toString());
                }
                if (userBKDetails[4] != null) {
                    userBKDetails1.setVillage(userBKDetails[4].toString());
                }
                if (userBKDetails[5] != null) {
                    userBKDetails1.setUserId(userBKDetails[5].toString());
                }
                if (userBKDetails[6] != null) {
                    userBKDetails1.setUserName(userBKDetails[6].toString());
                }
                if (userBKDetails[7] != null) {
                    userBKDetails1.setUserRoleName(userBKDetails[7].toString());
                }
                if (userBKDetails[8] != null) {
                    userBKDetails1.setCboMappedCount((Long) userBKDetails[8]);
                }
                if (userBKDetails[9] != null) {
                    userBKDetails1.setStatus(userBKDetails[9].toString());
                }
                responseUserBKDetailsList.add(userBKDetails1);
            }
        }else{
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseUserBKDetailsList;
    }

    public List<ResponseUserBPMDetails> getUserBPMDetails(Integer stateId,String districtId,String blockId) {
        List<ResponseUserBPMDetails> responseUserBPMDetailsList = new ArrayList<>();
        List<Object[]> userBPMDetailsList;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = null;
        }if(blockId == null){
            blockId =null;
        }
        userBPMDetailsList = profileReportRepository.getUserBPMDetails(stateId,districtId,blockId);
        if (userBPMDetailsList != null && userBPMDetailsList.size() >0) {
            for (Object[] userBPMDetails : userBPMDetailsList) {
                ResponseUserBPMDetails userBPMDetails1 = new ResponseUserBPMDetails();
                if (userBPMDetails[0] != null) {
                    userBPMDetails1.setState(userBPMDetails[0].toString());
                }
                if (userBPMDetails[1] != null) {
                    userBPMDetails1.setDistrict(userBPMDetails[1].toString());
                }
                if (userBPMDetails[2] != null) {
                    userBPMDetails1.setBlock(userBPMDetails[2].toString());
                }
                if (userBPMDetails[3] != null) {
                    userBPMDetails1.setUserId(userBPMDetails[3].toString());
                }
                if (userBPMDetails[4] != null) {
                    userBPMDetails1.setUserName(userBPMDetails[4].toString());
                }
                if (userBPMDetails[5] != null) {
                    userBPMDetails1.setUserRoleName(userBPMDetails[5].toString());
                }
                if (userBPMDetails[6] != null) {
                    userBPMDetails1.setStatus(userBPMDetails[6].toString());
                }
                responseUserBPMDetailsList.add(userBPMDetails1);
            }
        }else{
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseUserBPMDetailsList;
    }

}
