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
package org.apache.fineract.cn.reporting.api.domain;

import java.math.BigInteger;

public class ResponseLoanVoReport {

    private Integer state;
    private Integer district;
    private Integer block;
    private Integer panchayat;
    private Integer village;
    private Integer noOfShgs;
    private Integer noOfMembers;
    private Integer noOfMembersAvailingLoan;
    private Integer noOfLoans;
    private BigInteger amountOfLoans;
    private Integer totalConsuptionLoans;
    private BigInteger totalAmountConsuptionLoans;
    private Integer totalAgricultureLoans;
    private BigInteger totalAmountAgricultureLoans;
    private Integer totalLivestockFisheriesLoans;
    private BigInteger totalAmountLivestockFisheriesLoans;
    private Integer totalNtfpLoans;
    private BigInteger totalAmountNtfpLoans;
    private Integer totalNonFarmLoans;
    private BigInteger totalAmountNonFarmLoans;
    private Integer totalLoansLt20K;
    private Integer totalLoans20KTo50k;
    private Integer totalLoans50KTo1Lac;
    private Integer totalLoans1LacTo2Lac50k;
    private Integer totalLoans2Lac50kTo5Lac;
    private Integer totalLoans5LacTo10Lac;
    private Integer totalLoansgt10Lac;
    private BigInteger shgId;
    private BigInteger voId;
    private BigInteger clfId;
    private Integer totalLoansDemand;
    private Integer totalLoansSuppliedSameDay;
    private Integer totalLoansSuppliedLt1w;
    private Integer totalLoansSupplied1wTo2w;
    private Integer totalLoansSupplied1To2month;
    private Integer totalLoansSupplied2To3month;
    private Integer totalLoansSuppliedGt3month;
    private BigInteger totalLoansPrincipleDemand;
    private BigInteger totalLoansRepaid;
    private Integer totalLoansRepaymentWithinPeriod;
    private Integer totalLoansRepayment1MonthDelay;
    private Integer totalLoansRepayment2MonthDelay;
    private Integer totalLoansRepayment3MonthDelay;
    private Integer totalLoansRepaymentGt3MonthDelay;
    private String yearMonth;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getPanchayat() {
        return panchayat;
    }

    public void setPanchayat(Integer panchayat) {
        this.panchayat = panchayat;
    }

    public Integer getVillage() {
        return village;
    }

    public void setVillage(Integer village) {
        this.village = village;
    }

    public Integer getNoOfShgs() {
        return noOfShgs;
    }

    public void setNoOfShgs(Integer noOfShgs) {
        this.noOfShgs = noOfShgs;
    }

    public Integer getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(Integer noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public Integer getNoOfMembersAvailingLoan() {
        return noOfMembersAvailingLoan;
    }

    public void setNoOfMembersAvailingLoan(Integer noOfMembersAvailingLoan) {
        this.noOfMembersAvailingLoan = noOfMembersAvailingLoan;
    }

    public Integer getNoOfLoans() {
        return noOfLoans;
    }

    public void setNoOfLoans(Integer noOfLoans) {
        this.noOfLoans = noOfLoans;
    }

    public BigInteger getAmountOfLoans() {
        return amountOfLoans;
    }

    public void setAmountOfLoans(BigInteger amountOfLoans) {
        this.amountOfLoans = amountOfLoans;
    }

    public Integer getTotalConsuptionLoans() {
        return totalConsuptionLoans;
    }

    public void setTotalConsuptionLoans(Integer totalConsuptionLoans) {
        this.totalConsuptionLoans = totalConsuptionLoans;
    }

    public BigInteger getTotalAmountConsuptionLoans() {
        return totalAmountConsuptionLoans;
    }

    public void setTotalAmountConsuptionLoans(BigInteger totalAmountConsuptionLoans) {
        this.totalAmountConsuptionLoans = totalAmountConsuptionLoans;
    }

    public Integer getTotalAgricultureLoans() {
        return totalAgricultureLoans;
    }

    public void setTotalAgricultureLoans(Integer totalAgricultureLoans) {
        this.totalAgricultureLoans = totalAgricultureLoans;
    }

    public BigInteger getTotalAmountAgricultureLoans() {
        return totalAmountAgricultureLoans;
    }

    public void setTotalAmountAgricultureLoans(BigInteger totalAmountAgricultureLoans) {
        this.totalAmountAgricultureLoans = totalAmountAgricultureLoans;
    }

    public Integer getTotalLivestockFisheriesLoans() {
        return totalLivestockFisheriesLoans;
    }

    public void setTotalLivestockFisheriesLoans(Integer totalLivestockFisheriesLoans) {
        this.totalLivestockFisheriesLoans = totalLivestockFisheriesLoans;
    }

    public BigInteger getTotalAmountLivestockFisheriesLoans() {
        return totalAmountLivestockFisheriesLoans;
    }

    public void setTotalAmountLivestockFisheriesLoans(BigInteger totalAmountLivestockFisheriesLoans) {
        this.totalAmountLivestockFisheriesLoans = totalAmountLivestockFisheriesLoans;
    }

    public Integer getTotalNtfpLoans() {
        return totalNtfpLoans;
    }

    public void setTotalNtfpLoans(Integer totalNtfpLoans) {
        this.totalNtfpLoans = totalNtfpLoans;
    }

    public BigInteger getTotalAmountNtfpLoans() {
        return totalAmountNtfpLoans;
    }

    public void setTotalAmountNtfpLoans(BigInteger totalAmountNtfpLoans) {
        this.totalAmountNtfpLoans = totalAmountNtfpLoans;
    }

    public Integer getTotalNonFarmLoans() {
        return totalNonFarmLoans;
    }

    public void setTotalNonFarmLoans(Integer totalNonFarmLoans) {
        this.totalNonFarmLoans = totalNonFarmLoans;
    }

    public BigInteger getTotalAmountNonFarmLoans() {
        return totalAmountNonFarmLoans;
    }

    public void setTotalAmountNonFarmLoans(BigInteger totalAmountNonFarmLoans) {
        this.totalAmountNonFarmLoans = totalAmountNonFarmLoans;
    }

    public Integer getTotalLoansLt20K() {
        return totalLoansLt20K;
    }

    public void setTotalLoansLt20K(Integer totalLoansLt20K) {
        this.totalLoansLt20K = totalLoansLt20K;
    }

    public Integer getTotalLoans20KTo50k() {
        return totalLoans20KTo50k;
    }

    public void setTotalLoans20KTo50k(Integer totalLoans20KTo50k) {
        this.totalLoans20KTo50k = totalLoans20KTo50k;
    }

    public Integer getTotalLoans50KTo1Lac() {
        return totalLoans50KTo1Lac;
    }

    public void setTotalLoans50KTo1Lac(Integer totalLoans50KTo1Lac) {
        this.totalLoans50KTo1Lac = totalLoans50KTo1Lac;
    }

    public Integer getTotalLoans1LacTo2Lac50k() {
        return totalLoans1LacTo2Lac50k;
    }

    public void setTotalLoans1LacTo2Lac50k(Integer totalLoans1LacTo2Lac50k) {
        this.totalLoans1LacTo2Lac50k = totalLoans1LacTo2Lac50k;
    }

    public Integer getTotalLoans2Lac50kTo5Lac() {
        return totalLoans2Lac50kTo5Lac;
    }

    public void setTotalLoans2Lac50kTo5Lac(Integer totalLoans2Lac50kTo5Lac) {
        this.totalLoans2Lac50kTo5Lac = totalLoans2Lac50kTo5Lac;
    }

    public Integer getTotalLoans5LacTo10Lac() {
        return totalLoans5LacTo10Lac;
    }

    public void setTotalLoans5LacTo10Lac(Integer totalLoans5LacTo10Lac) {
        this.totalLoans5LacTo10Lac = totalLoans5LacTo10Lac;
    }

    public Integer getTotalLoansgt10Lac() {
        return totalLoansgt10Lac;
    }

    public void setTotalLoansgt10Lac(Integer totalLoansgt10Lac) {
        this.totalLoansgt10Lac = totalLoansgt10Lac;
    }

    public BigInteger getShgId() {
        return shgId;
    }

    public void setShgId(BigInteger shgId) {
        this.shgId = shgId;
    }

    public BigInteger getVoId() {
        return voId;
    }

    public void setVoId(BigInteger voId) {
        this.voId = voId;
    }

    public BigInteger getClfId() {
        return clfId;
    }

    public void setClfId(BigInteger clfId) {
        this.clfId = clfId;
    }

    public Integer getTotalLoansDemand() {
        return totalLoansDemand;
    }

    public void setTotalLoansDemand(Integer totalLoansDemand) {
        this.totalLoansDemand = totalLoansDemand;
    }

    public Integer getTotalLoansSuppliedSameDay() {
        return totalLoansSuppliedSameDay;
    }

    public void setTotalLoansSuppliedSameDay(Integer totalLoansSuppliedSameDay) {
        this.totalLoansSuppliedSameDay = totalLoansSuppliedSameDay;
    }

    public Integer getTotalLoansSuppliedLt1w() {
        return totalLoansSuppliedLt1w;
    }

    public void setTotalLoansSuppliedLt1w(Integer totalLoansSuppliedLt1w) {
        this.totalLoansSuppliedLt1w = totalLoansSuppliedLt1w;
    }

    public Integer getTotalLoansSupplied1wTo2w() {
        return totalLoansSupplied1wTo2w;
    }

    public void setTotalLoansSupplied1wTo2w(Integer totalLoansSupplied1wTo2w) {
        this.totalLoansSupplied1wTo2w = totalLoansSupplied1wTo2w;
    }

    public Integer getTotalLoansSupplied1To2month() {
        return totalLoansSupplied1To2month;
    }

    public void setTotalLoansSupplied1To2month(Integer totalLoansSupplied1To2month) {
        this.totalLoansSupplied1To2month = totalLoansSupplied1To2month;
    }

    public Integer getTotalLoansSupplied2To3month() {
        return totalLoansSupplied2To3month;
    }

    public void setTotalLoansSupplied2To3month(Integer totalLoansSupplied2To3month) {
        this.totalLoansSupplied2To3month = totalLoansSupplied2To3month;
    }

    public Integer getTotalLoansSuppliedGt3month() {
        return totalLoansSuppliedGt3month;
    }

    public void setTotalLoansSuppliedGt3month(Integer totalLoansSuppliedGt3month) {
        this.totalLoansSuppliedGt3month = totalLoansSuppliedGt3month;
    }

    public BigInteger getTotalLoansPrincipleDemand() {
        return totalLoansPrincipleDemand;
    }

    public void setTotalLoansPrincipleDemand(BigInteger totalLoansPrincipleDemand) {
        this.totalLoansPrincipleDemand = totalLoansPrincipleDemand;
    }

    public BigInteger getTotalLoansRepaid() {
        return totalLoansRepaid;
    }

    public void setTotalLoansRepaid(BigInteger totalLoansRepaid) {
        this.totalLoansRepaid = totalLoansRepaid;
    }

    public Integer getTotalLoansRepaymentWithinPeriod() {
        return totalLoansRepaymentWithinPeriod;
    }

    public void setTotalLoansRepaymentWithinPeriod(Integer totalLoansRepaymentWithinPeriod) {
        this.totalLoansRepaymentWithinPeriod = totalLoansRepaymentWithinPeriod;
    }

    public Integer getTotalLoansRepayment1MonthDelay() {
        return totalLoansRepayment1MonthDelay;
    }

    public void setTotalLoansRepayment1MonthDelay(Integer totalLoansRepayment1MonthDelay) {
        this.totalLoansRepayment1MonthDelay = totalLoansRepayment1MonthDelay;
    }

    public Integer getTotalLoansRepayment2MonthDelay() {
        return totalLoansRepayment2MonthDelay;
    }

    public void setTotalLoansRepayment2MonthDelay(Integer totalLoansRepayment2MonthDelay) {
        this.totalLoansRepayment2MonthDelay = totalLoansRepayment2MonthDelay;
    }

    public Integer getTotalLoansRepayment3MonthDelay() {
        return totalLoansRepayment3MonthDelay;
    }

    public void setTotalLoansRepayment3MonthDelay(Integer totalLoansRepayment3MonthDelay) {
        this.totalLoansRepayment3MonthDelay = totalLoansRepayment3MonthDelay;
    }

    public Integer getTotalLoansRepaymentGt3MonthDelay() {
        return totalLoansRepaymentGt3MonthDelay;
    }

    public void setTotalLoansRepaymentGt3MonthDelay(Integer totalLoansRepaymentGt3MonthDelay) {
        this.totalLoansRepaymentGt3MonthDelay = totalLoansRepaymentGt3MonthDelay;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }
}
