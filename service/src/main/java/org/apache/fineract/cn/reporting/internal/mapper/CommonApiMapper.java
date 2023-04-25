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
  public static ResponseBankBranchCbos map(final BankBranchCbosEntity bankBranchCbosEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseBankBranchCbos responseBankBranchCbos =
            modelMapper.map(bankBranchCbosEntity, ResponseBankBranchCbos.class);
    return responseBankBranchCbos;
  }

  public static ResponseBankDeatils map(final BankDetailsEntity bankDetailsEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseBankDeatils responseBankDeatils =
            modelMapper.map(bankDetailsEntity, ResponseBankDeatils.class);
    return responseBankDeatils;
  }

  public static ResponseBranchDet map(final BranchDetEntity branchDetEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseBranchDet responseBranchDet =
            modelMapper.map(branchDetEntity, ResponseBranchDet.class);
    return responseBranchDet;
  }

  public static MeetingApiRestResponse map(final MeetingApiRestEntity meetingApiRestEntity) {
    ModelMapper modelMapper = new ModelMapper();
    MeetingApiRestResponse meetingApiRestResponse =
            modelMapper.map(meetingApiRestEntity, MeetingApiRestResponse.class);
    return meetingApiRestResponse;
  }

  public static ResponseBankWiseCbo map(final BankWiseCboEntity bankWiseCboEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseBankWiseCbo responseBankWiseCbo =
            modelMapper.map(bankWiseCboEntity, ResponseBankWiseCbo.class);
    return responseBankWiseCbo;
  }


  public static MenuMasterResponse map(final MenuMasterEntity menuMasterEntity) {
    ModelMapper modelMapper = new ModelMapper();
    MenuMasterResponse menuMasterResponse =
            modelMapper.map(menuMasterEntity, MenuMasterResponse.class);
    return menuMasterResponse;
  }

  public static VoFilterResponse map(final VoFilterEntity voFilterEntity) {
    ModelMapper modelMapper = new ModelMapper();
    VoFilterResponse voFilterResponse =
            modelMapper.map(voFilterEntity, VoFilterResponse.class);
    return voFilterResponse;
  }

  public static ClfVoFilterResponse map(final ClfVoFilterEntity clfVoFilterEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ClfVoFilterResponse clfVoFilterResponse =
            modelMapper.map(clfVoFilterEntity, ClfVoFilterResponse.class);
    return clfVoFilterResponse;
  }
  /*
  public static ResponseBankApiDeatils map(final BankDetailApiEntity bankDetailApiEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseBankApiDeatils responseBankApiDeatils =
            modelMapper.map(bankDetailApiEntity, ResponseBankApiDeatils.class);
    return responseBankApiDeatils;
  }

   */

  public static TransactionSummary map(final TransactionsSummaryEntity transactionsSummaryEntity) {
    ModelMapper modelMapper = new ModelMapper();
    TransactionSummary transactionSummary =
            modelMapper.map(transactionsSummaryEntity, TransactionSummary.class);
    return transactionSummary;
  }

  public static VoTransactionSummary map(final TransactionsSummarysEntity transactionsSummarysEntity) {
    ModelMapper modelMapper = new ModelMapper();
    VoTransactionSummary voTransactionSummary =
            modelMapper.map(transactionsSummarysEntity, VoTransactionSummary.class);
    return voTransactionSummary;
  }

  public static ResponseBankApiDeatils map(final BankDetailApiEntity bankDetailApiEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseBankApiDeatils responseBankApiDeatils =
            modelMapper.map(bankDetailApiEntity, ResponseBankApiDeatils.class);
    return responseBankApiDeatils;
  }


  public static ResponseBranchApiDeatils map(final BranchDetailApiEntity branchDetailApiEntity) {
    ModelMapper modelMapper = new ModelMapper();
    ResponseBranchApiDeatils responseBranchApiDeatils =
            modelMapper.map(branchDetailApiEntity, ResponseBranchApiDeatils.class);
    return responseBranchApiDeatils;
  }


}