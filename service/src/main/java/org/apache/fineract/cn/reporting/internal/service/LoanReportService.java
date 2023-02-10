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
import org.apache.fineract.cn.reporting.api.domain.RequestLoanShgReport;
import org.apache.fineract.cn.reporting.api.domain.ResponseLoanShgReport;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.repository.LoanReportRepository;
import org.apache.fineract.cn.reporting.internal.repository.ReportingSavingRepository;
import org.springframework.stereotype.Service;


import java.math.BigInteger;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.util.List;

@Service
public class LoanReportService {
    private final LoanReportRepository loanReportRepository;

    public LoanReportService(LoanReportRepository loanReportRepository){
     this.loanReportRepository = loanReportRepository;
    }


       public List<ResponseLoanShgReport> getshgLoanReport(Integer stateId, Integer districtId, Integer blockId, Integer panchayatId, Integer villageId, Long fromDate, Long toDate, BigInteger shgId, BigInteger voId, BigInteger clfId, Integer geoGraphicalLevel) {
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
        List<ResponseLoanShgReport> responseLoanShgReportList = new ArrayList<>();
        List<Object[]> loanShgReportList;
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

        loanShgReportList = loanReportRepository.getLoanShgReportDetails( stateId,   districtId, blockId,  panchayatId,villageId,  fromDate1,  toDate1,shgId,voId,clfId,geoGraphicalLevel);
        if (loanShgReportList != null && loanShgReportList.size() > 0) {
            for (Object[] loanShgReports : loanShgReportList) {
                ResponseLoanShgReport responseLoanShgReport = new ResponseLoanShgReport();
                if (loanShgReports[0] != null) {
                    responseLoanShgReport.setState(((Number)loanShgReports[0]).intValue());
                }
                if (loanShgReports[1] != null) {
                    responseLoanShgReport.setNoOfShgs(((Number)loanShgReports[1]).intValue());
                }
                if (loanShgReports[2] != null) {
                    responseLoanShgReport.setNoOfMembers(((Number)loanShgReports[2]).intValue());
                }
                if (loanShgReports[3] != null) {
                    responseLoanShgReport.setNoOfMembersAvailingLoan(((Number)loanShgReports[3]).intValue());
                }
                if (loanShgReports[4] != null) {
                    responseLoanShgReport.setNoOfLoans(((Number)loanShgReports[4]).intValue());
                }
                if (loanShgReports[5] != null) {
                    responseLoanShgReport.setAmountOfLoans(new BigInteger(loanShgReports[5].toString()));
                }
                if (loanShgReports[6] != null) {
                    responseLoanShgReport.setDistrict(((Number)loanShgReports[6]).intValue());
                }
                if (loanShgReports[7] != null) {
                    responseLoanShgReport.setBlock(((Number)loanShgReports[7]).intValue());
                }
                if (loanShgReports[8] != null) {
                    responseLoanShgReport.setPanchayat(((Number)loanShgReports[8]).intValue());
                }
                if (loanShgReports[9] != null) {
                    responseLoanShgReport.setVillage(((Number)loanShgReports[9]).intValue());
                }
                if (loanShgReports[10] != null) {
                    responseLoanShgReport.setTotalConsuptionLoans(((Number)loanShgReports[10]).intValue());
                }
                if (loanShgReports[11] != null) {
                    responseLoanShgReport.setTotalAmountConsuptionLoans(new BigInteger(loanShgReports[11].toString()));
                }
                if (loanShgReports[12] != null) {
                    responseLoanShgReport.setTotalAgricultureLoans(((Number)loanShgReports[12]).intValue());
                }
                if (loanShgReports[13] != null) {
                    responseLoanShgReport.setTotalAmountAgricultureLoans(new BigInteger(loanShgReports[13].toString()));
                }
                if (loanShgReports[14] != null) {
                    responseLoanShgReport.setTotalLivestockFisheriesLoans(((Number)loanShgReports[14]).intValue());
                }
                if (loanShgReports[15] != null) {
                    responseLoanShgReport.setTotalAmountLivestockFisheriesLoans(new BigInteger(loanShgReports[15].toString()));
                }
                if (loanShgReports[16] != null) {
                    responseLoanShgReport.setTotalNtfpLoans(((Number)loanShgReports[16]).intValue());
                }
                if (loanShgReports[17] != null) {
                    responseLoanShgReport.setTotalAmountNtfpLoans(new BigInteger(loanShgReports[17].toString()));
                }
                if (loanShgReports[18] != null) {
                    responseLoanShgReport.setTotalNonFarmLoans(((Number)loanShgReports[18]).intValue());
                }
                if (loanShgReports[19] != null) {
                    responseLoanShgReport.setTotalAmountNonFarmLoans(new BigInteger(loanShgReports[19].toString()));
                }
                if (loanShgReports[20] != null) {
                    responseLoanShgReport.setTotalLoansLt20K(((Number)loanShgReports[20]).intValue());
                }
                if (loanShgReports[21] != null) {
                    responseLoanShgReport.setTotalLoans20KTo50k(((Number)loanShgReports[21]).intValue());
                }
                if (loanShgReports[22] != null) {
                    responseLoanShgReport.setTotalLoans50KTo1Lac(((Number)loanShgReports[22]).intValue());
                }
                if (loanShgReports[23] != null) {
                    responseLoanShgReport.setTotalLoans1LacTo2Lac50k(((Number)loanShgReports[23]).intValue());
                }
                if (loanShgReports[24] != null) {
                    responseLoanShgReport.setTotalLoans2Lac50kTo5Lac(((Number)loanShgReports[24]).intValue());
                }
                if (loanShgReports[25] != null) {
                    responseLoanShgReport.setTotalLoans5LacTo10Lac(((Number)loanShgReports[25]).intValue());
                }
                if (loanShgReports[26] != null) {
                    responseLoanShgReport.setTotalLoansgt10Lac(((Number)loanShgReports[26]).intValue());
                }
                if (loanShgReports[27] != null) {
                    responseLoanShgReport.setShgId(new BigInteger(loanShgReports[27].toString()));
                }
                if (loanShgReports[28] != null) {
                    responseLoanShgReport.setVoId(new BigInteger(loanShgReports[28].toString()));
                }
                if (loanShgReports[29] != null) {
                    responseLoanShgReport.setClfId(new BigInteger(loanShgReports[29].toString()));
                }
                if (loanShgReports[30] != null) {
                    responseLoanShgReport.setTotalLoansDemand(((Number)loanShgReports[30]).intValue());
                }
                if (loanShgReports[31] != null) {
                    responseLoanShgReport.setTotalLoansSuppliedSameDay(((Number)loanShgReports[31]).intValue());
                }
                if (loanShgReports[32] != null) {
                    responseLoanShgReport.setTotalLoansSuppliedLt1w(((Number)loanShgReports[32]).intValue());
                }
                if (loanShgReports[33] != null) {
                    responseLoanShgReport.setTotalLoansSupplied1wTo2w(((Number)loanShgReports[33]).intValue());
                }
                if (loanShgReports[34] != null) {
                    responseLoanShgReport.setTotalLoansSupplied1To2month(((Number)loanShgReports[34]).intValue());
                }
                if (loanShgReports[35] != null) {
                    responseLoanShgReport.setTotalLoansSupplied2To3month(((Number)loanShgReports[35]).intValue());
                }
                if (loanShgReports[36] != null) {
                    responseLoanShgReport.setTotalLoansSuppliedGt3month(((Number)loanShgReports[36]).intValue());
                }
                if (loanShgReports[37] != null) {
                    responseLoanShgReport.setTotalLoansPrincipleDemand(new BigInteger(loanShgReports[37].toString()));
                }
                if (loanShgReports[38] != null) {
                    responseLoanShgReport.setTotalLoansRepaid(new BigInteger(loanShgReports[38].toString()));
                }
                if (loanShgReports[39] != null) {
                    responseLoanShgReport.setTotalLoansRepaymentWithinPeriod(((Number)loanShgReports[39]).intValue());
                }
                if (loanShgReports[40] != null) {
                    responseLoanShgReport.setTotalLoansRepayment1MonthDelay(((Number)loanShgReports[40]).intValue());
                }
                if (loanShgReports[41] != null) {
                    responseLoanShgReport.setTotalLoansRepayment2MonthDelay(((Number)loanShgReports[41]).intValue());
                }
                if (loanShgReports[42] != null) {
                    responseLoanShgReport.setTotalLoansRepayment3MonthDelay(((Number)loanShgReports[42]).intValue());
                }
                if (loanShgReports[43] != null) {
                    responseLoanShgReport.setTotalLoansRepaymentGt3MonthDelay(((Number)loanShgReports[43]).intValue());
                }
                if (loanShgReports[44] != null) {
                    responseLoanShgReport.setYearMonth(loanShgReports[44].toString());
                }
                responseLoanShgReportList.add(responseLoanShgReport);
             }
        } else {
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
           return responseLoanShgReportList;
       }
}



