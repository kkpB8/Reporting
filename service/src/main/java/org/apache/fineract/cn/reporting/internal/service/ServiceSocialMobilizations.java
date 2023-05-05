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
import org.apache.fineract.cn.reporting.api.domain.ResponseSocialMobilization;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceSocialMobilizations {
    private final Logger logger;
    private final SocialMobalizationsRepository socialMobalizationsRepository;

    @Autowired
    public ServiceSocialMobilizations(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                      final SocialMobalizationsRepository socialMobalizationsRepository) {
        super();
        this.logger = logger;
        this.socialMobalizationsRepository = socialMobalizationsRepository;

    }

    public List<ResponseSocialMobilization> fetchSocialMobilizationList(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, String fromDate, String toDate, Integer geographicalFlag) {

        if (geographicalFlag == null) {
            geographicalFlag = -1;
        }
        if (fromDate == null) {
            fromDate = "null";
        }
        if (toDate == null) {
            toDate = "null";
        }
        if (stateId == null) {
            stateId = -1;
        }
        if (districtId == null) {
            districtId = -1;
        }
        if (blockId == null) {
            blockId = -1;
        }
        if (panchayatId == null) {
            panchayatId = -1;
        }
        if (villageId == null) {
            villageId = -1;
        }

        List<ResponseSocialMobilization> responseSocialMobilizationList = new ArrayList<ResponseSocialMobilization>();
        List<SocialMobalizationEntity> socialMobalizationEntityList;
        socialMobalizationEntityList = socialMobalizationsRepository.
                findByFilter(stateId, districtId, blockId, panchayatId, villageId, fromDate, toDate, geographicalFlag);

        socialMobalizationEntityList.forEach(socialMobalizationEntity ->
        {
            ResponseSocialMobilization responseSocialMobilization = CommonApiMapper.map(socialMobalizationEntity);
            responseSocialMobilizationList.add(responseSocialMobilization);
        });
        return responseSocialMobilizationList;
    }
}

