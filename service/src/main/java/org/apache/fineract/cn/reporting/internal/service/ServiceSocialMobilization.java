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
import jnr.ffi.annotations.In;
import org.apache.fineract.cn.reporting.DateUtils;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.RequestSocialMobilization;
import org.apache.fineract.cn.reporting.api.domain.ResponseSocialMobilization;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceSocialMobilization {
    private final Logger logger;
    private final SocialMobalizationRepository socialMobalizationRepository;

    @Autowired
    public ServiceSocialMobilization(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                     final SocialMobalizationRepository socialMobalizationRepository) {
        super();
        this.logger = logger;
        this.socialMobalizationRepository = socialMobalizationRepository;

    }

    public List<ResponseSocialMobilization> fetchShgInitiationsList(RequestSocialMobilization requestSocialMobilization) {

        if(requestSocialMobilization.getGeographicalFlag()==null){
            requestSocialMobilization.setGeographicalFlag(-1);
        }
        if(requestSocialMobilization.getFromDate() == null){
            requestSocialMobilization.setFromDate("null");
        }
        if(requestSocialMobilization.getToDate()== null){
            requestSocialMobilization.setToDate("null");
        }
        if(requestSocialMobilization.getStateId() == null){
            requestSocialMobilization.setStateId(-1);
        }
        if(requestSocialMobilization.getDistrictId() == null){
            requestSocialMobilization.setDistrictId(-1);
        }
        if(requestSocialMobilization.getBlockId() == null){
            requestSocialMobilization.setBlockId(-1);
        }
        if(requestSocialMobilization.getPanchayatId() == null){
            requestSocialMobilization.setPanchayatId(-1);
        }
        if(requestSocialMobilization.getVillageId() == null){
            requestSocialMobilization.setVillageId(-1);
        }

        List<ResponseSocialMobilization> responseSocialMobilizationList = new ArrayList<>();
        List<SocialMobalizationEntity> socialMobalizationEntityList;
        socialMobalizationEntityList = socialMobalizationRepository.
                findByFilter(
                        requestSocialMobilization.getGeographicalFlag(),
                        requestSocialMobilization.getFromDate(),
                        requestSocialMobilization.getToDate(),
                        requestSocialMobilization.getStateId(),
                        requestSocialMobilization.getDistrictId(),
                        requestSocialMobilization.getBlockId(),
                        requestSocialMobilization.getPanchayatId(),
                        requestSocialMobilization.getVillageId()
                );

        socialMobalizationEntityList.forEach(socialMobalizationEntity ->
        {
            ResponseSocialMobilization responseSocialMobilization = CommonApiMapper.map(socialMobalizationEntity);
            responseSocialMobilizationList.add(responseSocialMobilization);
        });
        return responseSocialMobilizationList;
    }

    public List<ResponseSocialMobilization> fetchShgInitiationList(Integer geographicalFlag, String fromDate, String toDate, Integer stateId, Integer districtId,
                                                                   Integer blockId, Integer panchayatId, Integer villageId) {

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
        if(panchayatId == null){
            panchayatId = -1;
        }
        if(villageId == null){
            villageId = -1;
        }

        List<ResponseSocialMobilization> responseSocialMobilizationList = new ArrayList<>();
        List<SocialMobalizationEntity> socialMobalizationEntityList;
        socialMobalizationEntityList = socialMobalizationRepository.
                findByFilter1(geographicalFlag, fromDate, toDate, stateId, districtId, blockId, panchayatId, villageId);

        String finalToDate = toDate;
        socialMobalizationEntityList.forEach(socialMobalizationEntity ->
        {
            if(socialMobalizationEntity.getYearMonth().equals(finalToDate)){
                socialMobalizationEntity.setShgActivated(socialMobalizationEntity.getShgActivated());
            }else {
                socialMobalizationEntity.setShgActivated(0);
            }
            if(socialMobalizationEntity.getYearMonth().equals(finalToDate)){
                socialMobalizationEntity.setVoActivated(socialMobalizationEntity.getVoActivated());
            }else {
                socialMobalizationEntity.setVoActivated(0);
            }
            if(socialMobalizationEntity.getYearMonth().equals(finalToDate)){
                socialMobalizationEntity.setClfActivated(socialMobalizationEntity.getClfActivated());
            }else {
                socialMobalizationEntity.setClfActivated(0);
            }
            if(socialMobalizationEntity.getYearMonth().equals(finalToDate)){
                socialMobalizationEntity.setMemActivated(socialMobalizationEntity.getMemActivated());
            }else {
                socialMobalizationEntity.setMemActivated(0);
            }
            if(socialMobalizationEntity.getYearMonth().equals(finalToDate)){
                socialMobalizationEntity.setShgLastDay(socialMobalizationEntity.getShgLastDay());
            } else {
                socialMobalizationEntity.setShgLastDay(0);
            }
            if(socialMobalizationEntity.getYearMonth().equals(finalToDate)){
                socialMobalizationEntity.setMemLastDay(socialMobalizationEntity.getMemLastDay());
            } else {
                socialMobalizationEntity.setMemLastDay(0);
            }
            ResponseSocialMobilization responseSocialMobilization = CommonApiMapper.map(socialMobalizationEntity);
            responseSocialMobilizationList.add(responseSocialMobilization);
        });
        return responseSocialMobilizationList;
    }
}
