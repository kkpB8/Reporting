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
package org.apache.fineract.cn.reporting.internal.mapper;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.modelmapper.ModelMapper;
//import org.lokos.reporting.internal.repository.*;


public class CommonApiMapper {


  private CommonApiMapper() {
    super();
  }

  //COMMON APISs MAPPER STARTS

  public static LookUpMaster map(final LookUpMasterEntity lookUpMasterEntity) {
    ModelMapper modelMapper = new ModelMapper();
    LookUpMaster lookUpMaster =
            modelMapper.map(lookUpMasterEntity, LookUpMaster.class);
    return lookUpMaster;
  }

  public static TransactionSummary map(final TransactionSummaryEntity transactionSummaryEntity) {
    ModelMapper modelMapper = new ModelMapper();
    TransactionSummary transactionSummary =
            modelMapper.map(transactionSummaryEntity, TransactionSummary.class);
    return transactionSummary;

  }

  public static VoTransactionSummary map(final VoTransactionSummaryEntity voTransactionSummaryEntity) {
    ModelMapper modelMapper = new ModelMapper();
    VoTransactionSummary voTransactionSummary =
            modelMapper.map(voTransactionSummaryEntity, VoTransactionSummary.class);
    return voTransactionSummary;
  }

  public static ProfileReportResponse map(final ProfileReportEntity profileReportEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ProfileReportResponse ProfileReportResponse =
            modelMapper.map(profileReportEntity, ProfileReportResponse.class);
    return ProfileReportResponse;

  }
  public static ResponseSocialMobilization map(final SocialMobalizationEntity socialMobalizationEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseSocialMobilization ResponseSocialMobilization =
            modelMapper.map(socialMobalizationEntity, ResponseSocialMobilization.class);
    return ResponseSocialMobilization;
  }


}