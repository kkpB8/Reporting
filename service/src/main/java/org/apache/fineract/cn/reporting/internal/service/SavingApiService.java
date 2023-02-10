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
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.repository.ReportingSavingRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
@org.springframework.transaction.annotation.Transactional
public class SavingApiService {

    private final Logger logger;
    private final ReportingSavingRepository reportingRepo;

    @Autowired
    public SavingApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                            ReportingSavingRepository reportingRepo) {
        super();
        this.logger = logger;
        this.reportingRepo = reportingRepo;
    }


    DecimalFormat df = new DecimalFormat("0.00");


    public List<ShgSavingResponses> getShgSaving(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, String fromDate, String toDate, Integer shgId, BigInteger voId, BigInteger clfId) {
        ShgSavingResponses shgSavingResponse = null;
        List<ShgSavingResponses> shgSavingResponses = new ArrayList<>();
        List<Object[]> shgSavingList;
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
        if (fromDate == null) {
            fromDate = "1970-01";
        }
        if (toDate == null) {
            toDate = "2022-08";
        }
        if (shgId == null) {
            shgId = -1;
        }
        if (voId == null) {
            voId = new BigInteger("-1");
        }
        if (clfId == null) {
            clfId = new BigInteger("-1");
        }


        shgSavingList = reportingRepo.getSavingShgReportDetails(stateId, districtId, blockId, panchayatId, villageId, clfId, voId, shgId, fromDate, toDate);
        if (shgSavingList != null && shgSavingList.size() > 0) {
            for (Object[] savingShgReports : shgSavingList) {
                ShgSavingResponses responseSavingShgReport = new ShgSavingResponses();
                if (savingShgReports[0] != null) {
                    responseSavingShgReport.setState(((Number) savingShgReports[0]).intValue());
                }
                if (savingShgReports[1] != null) {
                    responseSavingShgReport.setDistrict(((Number) savingShgReports[1]).intValue());
                }
                if (savingShgReports[2] != null) {
                    responseSavingShgReport.setBlock(((Number) savingShgReports[2]).intValue());
                }
                if (savingShgReports[3] != null) {
                    responseSavingShgReport.setPanchayat(((Number) savingShgReports[3]).intValue());
                }
                if (savingShgReports[4] != null) {
                    responseSavingShgReport.setVillage(((Number) savingShgReports[4]).intValue());
                }
                if (savingShgReports[5] != null) {
                    responseSavingShgReport.setShg(((Number) savingShgReports[5]).intValue());
                }
                if (savingShgReports[6] != null) {
                    responseSavingShgReport.setVo(new BigInteger(savingShgReports[6].toString()));
                }
                if (savingShgReports[7] != null) {
                    responseSavingShgReport.setClf(new BigInteger(savingShgReports[7].toString()));
                }
                if (savingShgReports[8] != null) {
                    responseSavingShgReport.setGeographicalRegion(((Number) savingShgReports[8]).intValue());
                }

                if (savingShgReports[9] != null) {
                    responseSavingShgReport.setYearMonth(((String) savingShgReports[9]));
                }
                if (savingShgReports[10] != null) {
                    responseSavingShgReport.setNoOfShgs(((Number) savingShgReports[10]).intValue());
                }
                if (savingShgReports[11] != null) {
                    responseSavingShgReport.setNoOfMembers(((Number) savingShgReports[11]).intValue());
                }
                if (savingShgReports[12] != null) {
                    responseSavingShgReport.setExpectedAmount(new BigInteger(savingShgReports[12].toString()));
                }
                if (savingShgReports[13] != null) {
                    responseSavingShgReport.setAmountCollected(new BigInteger(savingShgReports[13].toString()));
                }
                if (savingShgReports[14] != null) {
                    responseSavingShgReport.setVoluntarySaving(new BigInteger(savingShgReports[14].toString()));
                }
                if (savingShgReports[15] != null) {
                    responseSavingShgReport.setNumberOfMemberPenalised(((Number) savingShgReports[15]).intValue());
                }
                if (savingShgReports[16] != null) {
                    responseSavingShgReport.setTotalPenaltyAmount(((Number) savingShgReports[16]).intValue());
                }
                if (savingShgReports[17] != null) {
                    responseSavingShgReport.setNumberOfMeetingConducted(((Number) savingShgReports[17]).intValue());
                }
                if (savingShgReports[18] != null) {
                    responseSavingShgReport.setNumberOfMemberContributingVoluntary(((Number) savingShgReports[18]).intValue());
                }
                if (savingShgReports[19] != null) {
                    responseSavingShgReport.setNumberOfCompulsorySaved(((Number) savingShgReports[19]).intValue());
                }
                shgSavingResponses.add(responseSavingShgReport);
            }
        } else {
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return shgSavingResponses;
    }


    public List<ShgSavingResponses> getShgSaving1(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, Long fromDate, Long toDate, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel) {
        String fromDate1 = null;
        String toDate1 = null;
        String toDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        if (fromDate != null && toDate != null) {
            fromDate1 = DateUtils.longConvertToYearMonth(fromDate);
            toDate1 = DateUtils.longConvertToYearMonth(toDate);
        }
        if (fromDate == null && toDate == null) {
            fromDate1 = "1970-01";
            toDate1 = toDate2;
        }
        if (fromDate == null && toDate != null) {
            fromDate1 = "1970-01";
            toDate1 = DateUtils.longConvertToYearMonth(toDate);
        }
        if (fromDate != null && toDate == null) {
            fromDate1 = DateUtils.longConvertToYearMonth(fromDate);
            toDate1 = toDate2;
        }
        List<ShgSavingResponses> responseShgSavingReportList = new ArrayList<>();
        List<Object[]> shgSavingList;
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
        if (shgId == null) {
            shgId = new BigInteger("-1");
        }
        if (voId == null) {
            voId = new BigInteger("-1");
        }
        if (clfId == null) {
            clfId = new BigInteger("-1");
        }
        if (geoGraphicalLevel == null) {
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
        shgSavingList = reportingRepo.getSavingShgReportDetails1(stateId, districtId, blockId, panchayatId, villageId, fromDate1, toDate1, shgId, voId, clfId, geoGraphicalLevel);
        if (shgSavingList != null && shgSavingList.size() > 0) {
            for (Object[] savingShgReports : shgSavingList) {
                ShgSavingResponses responseSavingShgReport = new ShgSavingResponses();
                if (savingShgReports[0] != null) {
                    responseSavingShgReport.setState(((Number) savingShgReports[0]).intValue());
                }
                if (savingShgReports[1] != null) {
                    responseSavingShgReport.setDistrict(((Number) savingShgReports[1]).intValue());
                }
                if (savingShgReports[2] != null) {
                    responseSavingShgReport.setBlock(((Number) savingShgReports[2]).intValue());
                }
                if (savingShgReports[3] != null) {
                    responseSavingShgReport.setPanchayat(((Number) savingShgReports[3]).intValue());
                }
                if (savingShgReports[4] != null) {
                    responseSavingShgReport.setVillage(((Number) savingShgReports[4]).intValue());
                }
                if (savingShgReports[5] != null) {
                    responseSavingShgReport.setShg(((Number) savingShgReports[5]).intValue());
                }
                if (savingShgReports[6] != null) {
                    responseSavingShgReport.setVo(new BigInteger(savingShgReports[6].toString()));
                }
                if (savingShgReports[7] != null) {
                    responseSavingShgReport.setClf(new BigInteger(savingShgReports[7].toString()));
                }
                if (savingShgReports[8] != null) {
                    responseSavingShgReport.setGeographicalRegion(((Number) savingShgReports[8]).intValue());
                }

                if (savingShgReports[9] != null) {
                    responseSavingShgReport.setYearMonth(((String) savingShgReports[9]));
                }
                if (savingShgReports[10] != null) {
                    responseSavingShgReport.setNoOfShgs(((Number) savingShgReports[10]).intValue());
                }
                if (savingShgReports[11] != null) {
                    responseSavingShgReport.setNoOfMembers(((Number) savingShgReports[11]).intValue());
                }
                if (savingShgReports[12] != null) {
                    responseSavingShgReport.setExpectedAmount(new BigInteger(savingShgReports[12].toString()));
                }
                if (savingShgReports[13] != null) {
                    responseSavingShgReport.setAmountCollected(new BigInteger(savingShgReports[13].toString()));
                }
                if (savingShgReports[14] != null) {
                    responseSavingShgReport.setVoluntarySaving(new BigInteger(savingShgReports[14].toString()));
                }
                if (savingShgReports[15] != null) {
                    responseSavingShgReport.setNumberOfMemberPenalised(((Number) savingShgReports[15]).intValue());
                }
                if (savingShgReports[16] != null) {
                    responseSavingShgReport.setTotalPenaltyAmount(((Number) savingShgReports[16]).intValue());
                }
                if (savingShgReports[17] != null) {
                    responseSavingShgReport.setNumberOfMeetingConducted(((Number) savingShgReports[17]).intValue());
                }
                if (savingShgReports[18] != null) {
                    responseSavingShgReport.setNumberOfMemberContributingVoluntary(((Number) savingShgReports[18]).intValue());
                }
                if (savingShgReports[19] != null) {
                    responseSavingShgReport.setNumberOfCompulsorySaved(((Number) savingShgReports[19]).intValue());
                }
                responseShgSavingReportList.add(responseSavingShgReport);
            }
        } else {
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseShgSavingReportList;
    }

    public List<ResponseForVoSaving> getVoSaving(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Long fromDate, Long toDate, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel) {
        String fromDate1 = null;
        String toDate1 = null;
        String toDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        if (fromDate != null && toDate != null) {
            fromDate1 = DateUtils.longConvertToYearMonth(fromDate);
            toDate1 = DateUtils.longConvertToYearMonth(toDate);
        }
        if (fromDate == null && toDate == null) {
            fromDate1 = "1970-01";
            toDate1 = toDate2;
        }
        if (fromDate == null && toDate != null) {
            fromDate1 = "1970-01";
            toDate1 = DateUtils.longConvertToYearMonth(toDate);
        }
        if (fromDate != null && toDate == null) {
            fromDate1 = DateUtils.longConvertToYearMonth(fromDate);
            toDate1 = toDate2;
        }
        List<ResponseForVoSaving> responseForVoSavingReportList = new ArrayList<>();
        List<Object[]> voSavingList;
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
        /*if(villageId == null){
            villageId = -1;
        }*/
      /*  if (shgId == null) {
            shgId = new BigInteger("-1");
        }*/
        if (voId == null) {
            voId = new BigInteger("-1");
        }
        if (clfId == null) {
            clfId = new BigInteger("-1");
        }
        if (geoGraphicalLevel == null) {
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
        voSavingList = reportingRepo.getSavingVoReportDetails(stateId, districtId, blockId, panchayatId, fromDate1, toDate1, voId, clfId, geoGraphicalLevel);
        if (voSavingList != null && voSavingList.size() > 0) {
            for (Object[] savingVoReports : voSavingList) {
                ResponseForVoSaving responseForVoSaving = new ResponseForVoSaving();
                if (savingVoReports[0] != null) {
                    responseForVoSaving.setState(((Number) savingVoReports[0]).intValue());
                }
                if (savingVoReports[1] != null) {
                    responseForVoSaving.setDistrict(((Number) savingVoReports[1]).intValue());
                }
                if (savingVoReports[2] != null) {
                    responseForVoSaving.setBlock(((Number) savingVoReports[2]).intValue());
                }
                if (savingVoReports[3] != null) {
                    responseForVoSaving.setPanchayat(((Number) savingVoReports[3]).intValue());
                }
                /*if (savingVoReports[4] != null) {
                    responseForVoSaving.setVillage(((Number)savingVoReports[4]).intValue());
                }*/
                if (savingVoReports[4] != null) {
                    responseForVoSaving.setVoId(new BigInteger(savingVoReports[4].toString()));
                }
                if (savingVoReports[5] != null) {
                    responseForVoSaving.setClfId(new BigInteger(savingVoReports[5].toString()));
                }
                if (savingVoReports[6] != null) {
                    responseForVoSaving.setNoOfVos(((Number) savingVoReports[6]).intValue());
                }
                if (savingVoReports[7] != null) {
                    responseForVoSaving.setNoOfMembers(((Number) savingVoReports[7]).intValue());
                }
                if (savingVoReports[8] != null) {
                    responseForVoSaving.setExpectedAmount(((Number) savingVoReports[8]).intValue());
                }
                if (savingVoReports[9] != null) {
                    responseForVoSaving.setAmountCollected(((Number) savingVoReports[9]).intValue());
                }
                if (savingVoReports[10] != null) {
                    responseForVoSaving.setTotalVoluntarySavingAmount(new BigInteger(savingVoReports[10].toString()));
                }
                if (savingVoReports[11] != null) {
                    responseForVoSaving.setNoOfBeingMemberPenalised(((Number) savingVoReports[11]).intValue());
                }
                if (savingVoReports[12] != null) {
                    responseForVoSaving.setTotalPenaltyAmount(((Number) savingVoReports[12]).intValue());
                }
                if (savingVoReports[13] != null) {
                    responseForVoSaving.setNoOfMeetingsConducted(((Number) savingVoReports[13]).intValue());
                }
                if (savingVoReports[14] != null) {
                    responseForVoSaving.setNoOfMemberContributingVoluntary(((Number) savingVoReports[14]).intValue());
                }
                if (savingVoReports[15] != null) {
                    responseForVoSaving.setNoOfCompulsorySaved(((Number) savingVoReports[15]).intValue());
                }
                if (savingVoReports[16] != null) {
                    responseForVoSaving.setGeographicalLevel(((Number) savingVoReports[16]).intValue());
                }
                if (savingVoReports[17] != null) {
                    responseForVoSaving.setYearMonth(savingVoReports[17].toString());
                }
                responseForVoSavingReportList.add(responseForVoSaving);
            }
        } else {
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseForVoSavingReportList;
    }

    /*public List<ShgMeetingResponse> getShgMeeting(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, Long fromDate, Long toDate, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel) {
   return ;
    }

    public List<VoMeetingResponse> getVoMeeting(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, Long fromDate, Long toDate, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel) {
    }*/


    public List<ResponseObjectTransSummary> getTransactionSummaryDetails(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, Long fromDate, Long toDate, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel) {
        String fromDate1 = null;
        String toDate1 =null;
        String toDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        if(fromDate != null && toDate != null) {
            fromDate1 = DateUtils.longConvertToYearMonth(fromDate);
            toDate1 = DateUtils.longConvertToYearMonth(toDate);
        }if(fromDate == null && toDate == null){
            fromDate1 = "1970-01";
            toDate1 = toDate2;
        }if(fromDate == null  && toDate != null){
            fromDate1 = "1970-01";
            toDate1 = DateUtils.longConvertToYearMonth(toDate);
        }if(fromDate != null  && toDate == null){
            fromDate1 = DateUtils.longConvertToYearMonth(fromDate);
            toDate1 = toDate2;
        }
        List<ResponseObjectTransSummary> responseTransSummaryReportList = new ArrayList<>();
        List<Object[]> objectTransSummaryReportList;
        if(stateId == null){
            stateId = -1;
        }
        if(districtId == null){
            districtId = -1;
        }
        if(blockId == null){
            blockId =-1;
        }
        if(panchayatId == null){
            panchayatId = -1;
        }
        if(villageId == null){
            villageId = -1;
        }
        if(shgId == null){
            shgId = new BigInteger("-1");
        }
        if(voId == null){
            voId = new BigInteger("-1");
        }
        if(clfId == null){
            clfId = new BigInteger("-1");
        }
        if(geoGraphicalLevel == null){
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }

        objectTransSummaryReportList = reportingRepo.getTransactionSummaryDetails( stateId,   districtId, blockId,  panchayatId,villageId,  fromDate1,  toDate1,shgId,voId,clfId,geoGraphicalLevel);
        if (objectTransSummaryReportList != null && objectTransSummaryReportList.size() > 0) {
            for (Object[] tranSummaryReports : objectTransSummaryReportList) {
                ResponseObjectTransSummary responseObjectTransSummaryReport = new ResponseObjectTransSummary();
                if (tranSummaryReports[0] != null) {
                    responseObjectTransSummaryReport.setState_id(((Number)tranSummaryReports[0]).intValue());
                }
                if (tranSummaryReports[1] != null) {
                    responseObjectTransSummaryReport.setDistrict_id(((Number)tranSummaryReports[1]).intValue());
                }
                if (tranSummaryReports[2] != null) {
                    responseObjectTransSummaryReport.setBlock_id(((Number)tranSummaryReports[2]).intValue());
                }
                if (tranSummaryReports[3] != null) {
                    responseObjectTransSummaryReport.setPanchayat_id(((Number)tranSummaryReports[3]).intValue());
                }
                if (tranSummaryReports[4] != null) {
                    responseObjectTransSummaryReport.setVillage_id(((Number)tranSummaryReports[4]).intValue());
                }
                if (tranSummaryReports[5] != null) {
                    responseObjectTransSummaryReport.setShg_id(new BigInteger(tranSummaryReports[5].toString()));
                }
                if (tranSummaryReports[6] != null) {
                    responseObjectTransSummaryReport.setVo_id(new BigInteger(tranSummaryReports[6].toString()));
                }
                if (tranSummaryReports[7] != null) {
                    responseObjectTransSummaryReport.setClf_id(new BigInteger(tranSummaryReports[7].toString()));
                }
                if (tranSummaryReports[8] != null) {
                    responseObjectTransSummaryReport.setYear_month(tranSummaryReports[8].toString());
                }
                if (tranSummaryReports[9] != null) {
                    responseObjectTransSummaryReport.setGeographical_level(((Number) tranSummaryReports[9]).intValue());
                }
                if (tranSummaryReports[10] != null) {
                    responseObjectTransSummaryReport.setTotal_shg(((Number)tranSummaryReports[10]).intValue());
                }
                if (tranSummaryReports[11] != null) {
                    responseObjectTransSummaryReport.setTotal_shg_member(((Number)tranSummaryReports[11]).intValue());
                }
                if (tranSummaryReports[12] != null) {
                    responseObjectTransSummaryReport.setTotal_meeting_conducted(((Number)tranSummaryReports[12]).intValue());
                }
                if (tranSummaryReports[13] != null) {
                    responseObjectTransSummaryReport.setTotal_savings_collection_compulsory_expected(((Number)tranSummaryReports[13]).intValue());
                }
                if (tranSummaryReports[14] != null) {
                    responseObjectTransSummaryReport.setTotal_actual_compulsory_savings(((Number)tranSummaryReports[14]).intValue());
                }

                if (tranSummaryReports[15] != null) {
                    responseObjectTransSummaryReport.setTotal_actual_voluntary_savings(((Number)tranSummaryReports[15]).intValue());
                }
                if (tranSummaryReports[16] != null) {
                    responseObjectTransSummaryReport.setNumber_of_member_contributing_voluntary(((Number)tranSummaryReports[11]).intValue());
                }
                if (tranSummaryReports[17] != null) {
                    responseObjectTransSummaryReport.setNumber_of_member_penalised(((Number)tranSummaryReports[17]).intValue());
                }
                if (tranSummaryReports[18] != null) {
                    responseObjectTransSummaryReport.setTotal_penality(((Number)tranSummaryReports[18]).intValue());
                }
                if (tranSummaryReports[19] != null) {
                    responseObjectTransSummaryReport.setMemberpenaltylist(((Number)tranSummaryReports[19]).intValue());
                }
                if (tranSummaryReports[20] != null) {
                    responseObjectTransSummaryReport.setNo_of_members_saved_comp(((Number)tranSummaryReports[20]).intValue());
                }
                if (tranSummaryReports[21] != null) {
                    responseObjectTransSummaryReport.setTotal_members_availing_loans(((Number)tranSummaryReports[21]).intValue());
                }
                if (tranSummaryReports[22] != null) {
                    responseObjectTransSummaryReport.setTotal_number_of_loans(((Number)tranSummaryReports[22]).intValue());
                }
                if (tranSummaryReports[23] != null) {
                    responseObjectTransSummaryReport.setTotal_amount_of_loans(new BigInteger(tranSummaryReports[23].toString()));
                }
                if (tranSummaryReports[24] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_lt_20k(((Number)tranSummaryReports[24]).intValue());
                }
                if (tranSummaryReports[25] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_20k_50k(((Number)tranSummaryReports[25]).intValue());
                }
                if (tranSummaryReports[26] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_50k_1lac(((Number)tranSummaryReports[26]).intValue());
                }
                if (tranSummaryReports[27] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_1lac_2lac50k(((Number)tranSummaryReports[27]).intValue());
                }
                if (tranSummaryReports[28] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_2lac50k_5lac(((Number)tranSummaryReports[28]).intValue());
                }
                if (tranSummaryReports[29] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_5lac_10lac(((Number)tranSummaryReports[29]).intValue());
                }
                if (tranSummaryReports[30] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_gt_10lac(((Number)tranSummaryReports[30]).intValue());
                }
                if (tranSummaryReports[31] != null) {
                    responseObjectTransSummaryReport.setTotal_consumptions_loans(((Number)tranSummaryReports[31]).intValue());
                }
                if (tranSummaryReports[32] != null) {
                    responseObjectTransSummaryReport.setTotal_amount_of_consumptions_loans(new BigInteger(tranSummaryReports[32].toString()));
                }
                if (tranSummaryReports[33] != null) {
                    responseObjectTransSummaryReport.setTotal_agriculture_loans(((Number)tranSummaryReports[33]).intValue());
                }

                if (tranSummaryReports[34] != null) {
                    responseObjectTransSummaryReport.setTotal_amount_of_agriculture_loans(new BigInteger(tranSummaryReports[34].toString()));
                }
                if (tranSummaryReports[35] != null) {
                    responseObjectTransSummaryReport.setTotal_livestock_fisheries_loans(((Number)tranSummaryReports[35]).intValue());
                }
                if (tranSummaryReports[36] != null) {
                    responseObjectTransSummaryReport.setTotal_amount_of_livestock_fisheries_loans(new BigInteger(tranSummaryReports[36].toString()));
                }
                if (tranSummaryReports[37] != null) {
                    responseObjectTransSummaryReport.setTotal_ntfp_loans(((Number)tranSummaryReports[37]).intValue());
                }
                if (tranSummaryReports[38] != null) {
                    responseObjectTransSummaryReport.setTotal_amount_of_ntfp_loans(new BigInteger(tranSummaryReports[38].toString()));
                }
                if (tranSummaryReports[39] != null) {
                    responseObjectTransSummaryReport.setTotal_non_farm_loans(((Number)tranSummaryReports[39]).intValue());
                }
                if (tranSummaryReports[40] != null) {
                    responseObjectTransSummaryReport.setTotal_amount_of_non_farm_loans(new BigInteger(tranSummaryReports[40].toString()));
                }
                if (tranSummaryReports[41] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_demanded(((Number)tranSummaryReports[41]).intValue());
                }
                if (tranSummaryReports[42] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_supplied_same_day(((Number)tranSummaryReports[42]).intValue());
                }
                if (tranSummaryReports[43] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_supplied_lt_1w(((Number)tranSummaryReports[43]).intValue());
                }
                if (tranSummaryReports[44] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_supplied_1w_2w(((Number)tranSummaryReports[44]).intValue());
                }
                if (tranSummaryReports[45] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_supplied_1_2month(((Number)tranSummaryReports[45]).intValue());
                }
                if (tranSummaryReports[46] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_supplied_2_3month(((Number)tranSummaryReports[46]).intValue());
                }
                if (tranSummaryReports[47] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_supplied_gt_3month(((Number)tranSummaryReports[47]).intValue());
                }
                if (tranSummaryReports[48] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_principle_demand(new BigInteger(tranSummaryReports[48].toString()));
                }
                if (tranSummaryReports[49] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_repaid(new BigInteger(tranSummaryReports[49].toString()));
                }
                if (tranSummaryReports[50] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_repayment_within_period(((Number)tranSummaryReports[50]).intValue());
                }
                if (tranSummaryReports[51] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_repayment_1month_delay(((Number)tranSummaryReports[51]).intValue());
                }
                if (tranSummaryReports[52] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_repayment_2month_delay(((Number)tranSummaryReports[52]).intValue());
                }
                if (tranSummaryReports[53] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_repayment_3month_delay(((Number)tranSummaryReports[53]).intValue());
                }
                if (tranSummaryReports[54] != null) {
                    responseObjectTransSummaryReport.setTotal_loans_repayment_gt_3month_delay(((Number)tranSummaryReports[54]).intValue());
                }
                if (tranSummaryReports[55] != null) {
                    responseObjectTransSummaryReport.setNo_cbo_who_conducted_mtg(((Number)tranSummaryReports[55]).intValue());
                }
                if (tranSummaryReports[56] != null) {
                    responseObjectTransSummaryReport.setNo_meeting_scheduled(((Number)tranSummaryReports[56]).intValue());
                }
                if (tranSummaryReports[57] != null) {
                    responseObjectTransSummaryReport.setTotal_attendance_in_mtg(((Number)tranSummaryReports[57]).intValue());
                }

                responseTransSummaryReportList.add(responseObjectTransSummaryReport);
            }
        } else {
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseTransSummaryReportList;
    }
}
