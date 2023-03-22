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

    public List<ResponseSocialMobilization> fetchShgInitiationList(RequestSocialMobilization requestSocialMobilization) {
        if(requestSocialMobilization.getStateId() == null){
            requestSocialMobilization.setStateId(-1);
        }
        if(requestSocialMobilization.getDistrictId() == null){
            requestSocialMobilization.setDistrictId(-1);
        }
        if(requestSocialMobilization.getBlockId() == null){
            requestSocialMobilization.setBlockId(-1);
        }
//        String fromDate1 = null;
//        String toDate1 = null;
//        String toDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
//        if (requestSocialMobilization.getFromDate() != null && requestSocialMobilization.getToDate() != null) {
//            fromDate1 = DateUtils.longConvertToYearMonth(requestSocialMobilization.getFromDate());
//            toDate1 = DateUtils.longConvertToYearMonth(requestSocialMobilization.getToDate());
//        }
//        if (requestSocialMobilization.getFromDate() == null && requestSocialMobilization.getToDate() == null) {
//            fromDate1 = "1970-01";
//            toDate1 = toDate2;
//        }
//        if (requestSocialMobilization.getFromDate() == null && requestSocialMobilization.getToDate() != null) {
//            fromDate1 = "1970-01";
//            toDate1 = DateUtils.longConvertToYearMonth(requestSocialMobilization.getToDate());
//        }
//        if (requestSocialMobilization.getFromDate() != null && requestSocialMobilization.getToDate() == null) {
//            fromDate1 = DateUtils.longConvertToYearMonth(requestSocialMobilization.getFromDate());
//            toDate1 = toDate2;
//        }

        if(requestSocialMobilization.getVillageId() == null){
            requestSocialMobilization.setVillageId(-1);
        }
        if(requestSocialMobilization.getPanchayatId() == null){
            requestSocialMobilization.setPanchayatId(-1);
        }
        if(requestSocialMobilization.getFromDate() == null){
            requestSocialMobilization.setFromDate("null");
        }
        if(requestSocialMobilization.getToDate()== null){
            requestSocialMobilization.setToDate("null");
        }
        if(requestSocialMobilization.getGeographicalFlag()==null){
            requestSocialMobilization.setGeographicalFlag(-1);
        }

        List<ResponseSocialMobilization> responseSocialMobilizationList = new ArrayList<>();
        List<SocialMobalizationEntity> socialMobalizationEntityList;
        socialMobalizationEntityList = socialMobalizationRepository.
                findByFilter(
                        requestSocialMobilization.getStateId(),
                        requestSocialMobilization.getDistrictId(),
                        requestSocialMobilization.getBlockId(),
                        requestSocialMobilization.getVillageId(),
                        requestSocialMobilization.getPanchayatId(),
                        requestSocialMobilization.getFromDate(),
                        requestSocialMobilization.getToDate(),
                        requestSocialMobilization.getGeographicalFlag()
                );

        socialMobalizationEntityList.forEach(socialMobalizationEntity ->
        {
            ResponseSocialMobilization responseSocialMobilization = CommonApiMapper.map(socialMobalizationEntity);
            responseSocialMobilizationList.add(responseSocialMobilization);
        });
        return responseSocialMobilizationList;
    }
}
