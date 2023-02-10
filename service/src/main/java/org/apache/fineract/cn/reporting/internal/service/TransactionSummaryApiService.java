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
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
@org.springframework.transaction.annotation.Transactional
public class TransactionSummaryApiService {

  private final Logger logger;
  private final TransactionSummaryRepository transactionSummaryRepository;
    private final VoTransactionSummaryRepository voTransactionSummaryRepository;
  @Autowired
  public TransactionSummaryApiService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                      final TransactionSummaryRepository transactionSummaryRepository,final VoTransactionSummaryRepository voTransactionSummaryRepository) {
    super();
    this.logger = logger;
    this.transactionSummaryRepository = transactionSummaryRepository;
    this.voTransactionSummaryRepository = voTransactionSummaryRepository;
  }

    public List<TransactionSummary> fetchShgTransactionSummaryList(TransactionSummaryRequest transactionSummaryRequest) {
        String yearMonth = null;
        String orderBy1 = null;
        String fromDate1 = null;
        String toDate1 = null;
        if(transactionSummaryRequest.getQtrhalfYearFlag() != null){
           // String year =transactionSummaryRequest.getYear();
            //String quaterHalf = transactionSummaryRequest.getQtrhalfYearFlag();
            yearMonth=transactionSummaryRequest.getQtrhalfYearFlag();
//            if(quaterHalf.equals("Q1")){
//                yearMonth = year+"-"+"01";
//            }if(quaterHalf.equals("Q2")){
//                yearMonth = year+"-"+"02";
//            }if(quaterHalf.equals("Q3")){
//                yearMonth = year+"-"+"03";
//            }if(quaterHalf.equals("Q4")){
//                yearMonth = year+"-"+"04";
//            }if(quaterHalf.equals("h1")){
//                yearMonth = year+"-"+"01";
//            }if(quaterHalf.equals("h2")){
//                yearMonth = year+"-"+"02";
//            }

        } else {



            String toDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
            if (transactionSummaryRequest.getFromDate() != null && transactionSummaryRequest.getToDate() != null) {
                fromDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getFromDate());
                toDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getToDate());
            }
            if (transactionSummaryRequest.getFromDate() == null && transactionSummaryRequest.getToDate() == null) {
                fromDate1 = "1970-01";
                toDate1 = toDate2;
            }
            if (transactionSummaryRequest.getFromDate() == null && transactionSummaryRequest.getToDate() != null) {
                fromDate1 = "1970-01";
                toDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getToDate());
            }
            if (transactionSummaryRequest.getFromDate() != null && transactionSummaryRequest.getToDate() == null) {
                fromDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getFromDate());
                toDate1 = toDate2;
            }
        }
      // List<ResponseLoanShgReport> responseLoanShgReportList = new ArrayList<>();
       //List<Object[]> loanShgReportList;
       String orderBy=" c.yearMonth ASC";
       if(transactionSummaryRequest.getStateId() == null){
          transactionSummaryRequest.setStateId(-1);
       }else{
         orderBy= " c.yearMonth,c.stateId ASC";
       }
       if(transactionSummaryRequest.getDistrictId() == null){
          transactionSummaryRequest.setDistrictId(-1);
       }else{
           orderBy= " c.yearMonth,c.districtId ASC";
       }

       if(transactionSummaryRequest.getBlockId() == null){
          transactionSummaryRequest.setBlockId(-1);
       }else{
           orderBy= "c.yearMonth ASC";
       }
       if(transactionSummaryRequest.getPanchayatId() == null){
          transactionSummaryRequest.setPanchayatId(-1);
       }else{
           orderBy= " c.yearMonth,c.panchayateId ASC";
       }
       if(transactionSummaryRequest.getVillageId() == null){
          transactionSummaryRequest.setVillageId(-1);
       }else{
           orderBy= " c.yearMonth,c.villageId ASC";
       }
        if(transactionSummaryRequest.getClfId() == null){
            transactionSummaryRequest.setClfId(new BigInteger("-1"));
        }else{
            orderBy= " c.yearMonth,c.clfId ASC";
        }
       if(transactionSummaryRequest.getVoId() == null){
          transactionSummaryRequest.setVoId(new BigInteger("-1"));
       }else{
           orderBy= " c.yearMonth,c.voId ASC";
       }
       if(transactionSummaryRequest.getShgId() == null){
            transactionSummaryRequest.setShgId(new BigInteger("-1"));
        }else{
           orderBy= " c.yearMonth,c.shgId ASC";
       }
        /*if(yearMonth == null){
            yearMonth=null;
        }else{
            orderBy=" c.yearMonth,year_month ASC";
        }*/

       if(transactionSummaryRequest.getGeoGraphicalLevel() == null){
          throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
       }
        List<TransactionSummary> transactionSummaryList = new ArrayList<TransactionSummary>();
        List<TransactionSummaryEntity> transactionSummaryEntityList;
       if(yearMonth == null) {
         transactionSummaryEntityList = transactionSummaryRepository.
                   findByFilter(
                           transactionSummaryRequest.getStateId(),
                           transactionSummaryRequest.getDistrictId(),
                           transactionSummaryRequest.getBlockId(),
                           transactionSummaryRequest.getPanchayatId(),
                           transactionSummaryRequest.getVillageId(),
                           fromDate1,
                           toDate1,
                           transactionSummaryRequest.getShgId(),
                           transactionSummaryRequest.getVoId(),
                           transactionSummaryRequest.getClfId(),
                           transactionSummaryRequest.getGeoGraphicalLevel(),
                           transactionSummaryRequest.getFlag(),
                           yearMonth,
                           orderBy
                           //orderBy1
                   );
       }else{
               transactionSummaryEntityList = transactionSummaryRepository.
                       findByFilter1(
                               transactionSummaryRequest.getStateId(),
                               transactionSummaryRequest.getDistrictId(),
                               transactionSummaryRequest.getBlockId(),
                               transactionSummaryRequest.getPanchayatId(),
                               transactionSummaryRequest.getVillageId(),
                               fromDate1,
                               toDate1,
                               transactionSummaryRequest.getShgId(),
                               transactionSummaryRequest.getVoId(),
                               transactionSummaryRequest.getClfId(),
                               transactionSummaryRequest.getGeoGraphicalLevel(),
                               transactionSummaryRequest.getFlag(),
                               yearMonth,
                               orderBy
                       );
           }


       transactionSummaryEntityList.forEach(transactionSummaryEntity ->
        {
           TransactionSummary transactionSummary = CommonApiMapper.map(transactionSummaryEntity);
           transactionSummaryList.add(transactionSummary);
        });
        return transactionSummaryList;
    }

    public List<VoTransactionSummary> fetchVoTransactionSummaryList(TransactionSummaryRequest transactionSummaryRequest) {
        String fromDate1 = null;
        String toDate1 =null;
        String toDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        if(transactionSummaryRequest.getFromDate() != null && transactionSummaryRequest.getToDate() != null) {
            fromDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getFromDate());
            toDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getToDate());
        }if(transactionSummaryRequest.getFromDate() == null && transactionSummaryRequest.getToDate() == null){
            fromDate1 = "1970-01";
            toDate1 = toDate2;
        }if(transactionSummaryRequest.getFromDate() == null  && transactionSummaryRequest.getToDate() != null){
            fromDate1 = "1970-01";
            toDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getToDate());
        }if(transactionSummaryRequest.getFromDate() != null  && transactionSummaryRequest.getToDate() == null){
            fromDate1 = DateUtils.longConvertToYearMonth(transactionSummaryRequest.getFromDate());
            toDate1 = toDate2;
        }
        String orderBy=" c.yearMonth ASC";
        if(transactionSummaryRequest.getStateId() == null){
            transactionSummaryRequest.setStateId(-1);
        }else{
            orderBy= " c.yearMonth,stateId ASC";
        }
        if(transactionSummaryRequest.getDistrictId() == null){
            transactionSummaryRequest.setDistrictId(-1);
        }else{
            orderBy= " c.yearMonth,districtId ASC";
        }
        if(transactionSummaryRequest.getBlockId() == null){
            transactionSummaryRequest.setBlockId(-1);
        }else{
            orderBy= " c.yearMonth,blockId ASC";
        }
        if(transactionSummaryRequest.getPanchayatId() == null){
            transactionSummaryRequest.setPanchayatId(-1);
        }else{
            orderBy= " c.yearMonth,panchayatId ASC";
        }
        if(transactionSummaryRequest.getVoId() == null){
            transactionSummaryRequest.setVoId(new BigInteger("-1"));
        }else{
            orderBy= " c.yearMonth,voId ASC";
        }
        if(transactionSummaryRequest.getClfId() == null){
            transactionSummaryRequest.setClfId(new BigInteger("-1"));
        }else{
            orderBy= " c.yearMonth,clfId ASC";
        }
        if(transactionSummaryRequest.getGeoGraphicalLevel() == null){
            throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
        }
        List<VoTransactionSummary> voTransactionSummaryList = new ArrayList<VoTransactionSummary>();
        List<VoTransactionSummaryEntity> voTransactionSummaryEntityList = voTransactionSummaryRepository.
                findByFilter(
                        transactionSummaryRequest.getStateId(),
                        transactionSummaryRequest.getDistrictId(),
                        transactionSummaryRequest.getBlockId(),
                        transactionSummaryRequest.getPanchayatId(),
                        fromDate1,
                        toDate1,
                        transactionSummaryRequest.getVoId(),
                        transactionSummaryRequest.getClfId(),
                        transactionSummaryRequest.getGeoGraphicalLevel(),
                        orderBy
                );
        voTransactionSummaryEntityList.forEach(voTransactionSummaryEntity ->
        {
            VoTransactionSummary voTransactionSummary = CommonApiMapper.map(voTransactionSummaryEntity);
            voTransactionSummaryList.add(voTransactionSummary);
        });
        return voTransactionSummaryList;
    }
}
