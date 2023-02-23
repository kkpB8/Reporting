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

import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.ServiceConstants;

import org.apache.fineract.cn.reporting.api.domain.LookUpMaster;
import org.apache.fineract.cn.reporting.internal.repository.LookUpMasterEntity;
import org.apache.fineract.cn.reporting.internal.repository.LookupTableRepository;
//import org.lokos.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@org.springframework.transaction.annotation.Transactional
public class CommonApiService {

  private final Logger logger;
  private final LookupTableRepository lookupTableRepository;
  @Autowired
  public CommonApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                          final LookupTableRepository lookupTableRepository) {
    super();
    this.logger = logger;
    this.lookupTableRepository = lookupTableRepository;
  }

    public List<LookUpMaster> fetchLookupMaster() {
        //SET LOOKUP DATA STARTS
        List<LookUpMaster> lookUpMasterList = new ArrayList<LookUpMaster>();
        List<LookUpMasterEntity> lookUpTableEntityList = lookupTableRepository.findAll();
        lookUpTableEntityList.forEach(lookUpTableEntityTemp ->
        {
            if(lookUpTableEntityTemp.getActive().equals(Boolean.TRUE)){
                LookUpMaster lookUpMaster = CommonApiMapper.map(lookUpTableEntityTemp);
                lookUpMasterList.add(lookUpMaster);
            }
        });
        return lookUpMasterList;
    }

}
