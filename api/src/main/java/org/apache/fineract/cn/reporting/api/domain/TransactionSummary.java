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

import javax.persistence.Column;
import java.math.BigInteger;


public class TransactionSummary {

    private BigInteger id ;
    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer panchayatId;
    private Integer villageId;
    private String stateName;
    private String districtName;
    private String blockName;
    private String panchayatName;
    private String villageName;
    private Integer shgId;
    private BigInteger voId;
    private BigInteger clfId;
    private String shgName;
    private String voName;
    private String clfName;
    private String yearMonth;
    private Integer geographicalLevel;
    private Integer totalShg;
    private Integer shgMappedMonth;
    private Integer totalShgFormed;
    private Integer totalShgMember;
    private Integer totalMeetingConducted;
    private BigInteger totalSavingsCollectionCompulsoryExpected;
    private BigInteger totalActualCompulsorySavings;
    private BigInteger totalActualVoluntarySavings;
    private Integer numberOfMemberContributingVoluntary;
    private Integer numberOfMemberPenalised;
    private Integer totalPenality;
    private String memberpenaltylist;
    private Integer noOfMembersSavedComp;
    private Integer totalMembersAvailingLoans;
    private Integer totalNumberOfLoans;
    private BigInteger totalAmountOfLoans;
    private Integer totalLoansLT20k;
    private Integer totalLoans20kTo50k;
    private Integer totalLoans50kTo1lac;
    private Integer totalLoans1lacTo2lac50k;
    private Integer totalLoans2lac50kTo5lac;
    private Integer totalLoans5lacTo10lac;
    private Integer totalLoansGT10lac;
    private Integer totalConsumptionsLoans;
    private BigInteger totalAmountOfConsumptionsLoans;
    private Integer totalAgricultureLoans;
    private BigInteger totalAmountOfAgricultureLoans;
    private Integer totalLivestockFisheriesLoans;
    private BigInteger totalAmountOfLivestockFisheriesLoans;
    private Integer totalNtfpLoans;
    private BigInteger totalAmountOfNtfpLoans;
    private Integer totalNonFarmLoans;
    private BigInteger totalAmountOfNonFarmLoans;
    private Integer totalLoansDemanded;
    private Integer totalLoansSuppliedSameDay;
    private Integer totalLoansSuppliedLt1w;
    private Integer totalLoansSupplied1wTo2w;
    private Integer totalLoansSupplied1To2month;
    private Integer totalLoansSupplied2To3month;
    private Integer totalLoansSuppliedGT3month;
    private BigInteger totalLoansPrincipleDemand;
    private BigInteger totalLoansRepaid;
    private Integer totalLoansRepaymentWithinPeriod;
    private Integer totalLoansRepayment1monthDelay;
    private Integer totalLoansRepayment2monthDelay;
    private Integer totalLoansRepayment3monthDelay;
    private Integer totalLoansRepaymentGT3monthDelay;
    private Integer noCboWhoConductedMtg;
    private Integer noMeetingScheduled;
    private Integer totalAttendanceInMtg;
    private Integer totalAttendanceLt50P;
    private Integer totalAttendance50pTo70p;
    private Integer totalAttendance70pTo90p;
    private Integer totalAttendanceGt90p;
    private Integer flag;
    private Short meetingFrequency;
    private Integer shgConductingMeeting;
    private Integer shgSave50;
    private Integer shgSave50to70;
    private Integer shgSave70to90;
    private Integer shgSave90;
    private Integer noOfMeeting;
    private Integer expectedAmt;
    private Integer amtCollected;
    private Integer amtVoluntary;
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getPanchayatName() {
        return panchayatName;
    }

    public void setPanchayatName(String panchayatName) {
        this.panchayatName = panchayatName;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public String getVoName() {
        return voName;
    }

    public void setVoName(String voName) {
        this.voName = voName;
    }

    public String getClfName() {
        return clfName;
    }

    public void setClfName(String clfName) {
        this.clfName = clfName;
    }
    public Integer getTotalShgFormed() {
        return totalShgFormed;
    }

    public void setTotalShgFormed(Integer totalShgFormed) {
        this.totalShgFormed = totalShgFormed;
    }

    public Integer getShgMappedMonth() {
        return shgMappedMonth;
    }

    public void setShgMappedMonth(Integer shgMappedMonth) {
        this.shgMappedMonth = shgMappedMonth;
    }
    public Integer getNoOfMeeting() {
        return noOfMeeting;
    }

    public void setNoOfMeeting(Integer noOfMeeting) {
        this.noOfMeeting = noOfMeeting;
    }

    public Integer getExpectedAmt() {
        return expectedAmt;
    }

    public void setExpectedAmt(Integer expectedAmt) {
        this.expectedAmt = expectedAmt;
    }

    public Integer getAmtCollected() {
        return amtCollected;
    }

    public void setAmtCollected(Integer amtCollected) {
        this.amtCollected = amtCollected;
    }

    public Integer getAmtVoluntary() {
        return amtVoluntary;
    }

    public void setAmtVoluntary(Integer amtVoluntary) {
        this.amtVoluntary = amtVoluntary;
    }

    public Integer getShgSave50() {
        return shgSave50;
    }

    public void setShgSave50(Integer shgSave50) {
        this.shgSave50 = shgSave50;
    }

    public Integer getShgSave50to70() {
        return shgSave50to70;
    }

    public void setShgSave50to70(Integer shgSave50to70) {
        this.shgSave50to70 = shgSave50to70;
    }

    public Integer getShgSave70to90() {
        return shgSave70to90;
    }

    public void setShgSave70to90(Integer shgSave70to90) {
        this.shgSave70to90 = shgSave70to90;
    }
    public Integer getShgConductingMeeting() {
        return shgConductingMeeting;
    }

    public void setShgConductingMeeting(Integer shgConductingMeeting) {
        this.shgConductingMeeting = shgConductingMeeting;
    }
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Integer getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Integer panchayatId) {
        this.panchayatId = panchayatId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getShgId() {
        return shgId;
    }

    public void setShgId(Integer shgId) {
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

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getGeographicalLevel() {
        return geographicalLevel;
    }

    public void setGeographicalLevel(Integer geographicalLevel) {
        this.geographicalLevel = geographicalLevel;
    }

    public Integer getTotalShg() {
        return totalShg;
    }

    public void setTotalShg(Integer totalShg) {
        this.totalShg = totalShg;
    }

    public Integer getTotalShgMember() {
        return totalShgMember;
    }

    public void setTotalShgMember(Integer totalShgMember) {
        this.totalShgMember = totalShgMember;
    }

    public Integer getTotalMeetingConducted() {
        return totalMeetingConducted;
    }

    public void setTotalMeetingConducted(Integer totalMeetingConducted) {
        this.totalMeetingConducted = totalMeetingConducted;
    }

    public BigInteger getTotalSavingsCollectionCompulsoryExpected() {
        return totalSavingsCollectionCompulsoryExpected;
    }

    public void setTotalSavingsCollectionCompulsoryExpected(BigInteger totalSavingsCollectionCompulsoryExpected) {
        this.totalSavingsCollectionCompulsoryExpected = totalSavingsCollectionCompulsoryExpected;
    }

    public BigInteger getTotalActualCompulsorySavings() {
        return totalActualCompulsorySavings;
    }

    public void setTotalActualCompulsorySavings(BigInteger totalActualCompulsorySavings) {
        this.totalActualCompulsorySavings = totalActualCompulsorySavings;
    }

    public BigInteger getTotalActualVoluntarySavings() {
        return totalActualVoluntarySavings;
    }

    public void setTotalActualVoluntarySavings(BigInteger totalActualVoluntarySavings) {
        this.totalActualVoluntarySavings = totalActualVoluntarySavings;
    }

    public Integer getNumberOfMemberContributingVoluntary() {
        return numberOfMemberContributingVoluntary;
    }

    public void setNumberOfMemberContributingVoluntary(Integer numberOfMemberContributingVoluntary) {
        this.numberOfMemberContributingVoluntary = numberOfMemberContributingVoluntary;
    }

    public Integer getNumberOfMemberPenalised() {
        return numberOfMemberPenalised;
    }

    public void setNumberOfMemberPenalised(Integer numberOfMemberPenalised) {
        this.numberOfMemberPenalised = numberOfMemberPenalised;
    }

    public Integer getTotalPenality() {
        return totalPenality;
    }

    public void setTotalPenality(Integer totalPenality) {
        this.totalPenality = totalPenality;
    }

    public String getMemberpenaltylist() {
        return memberpenaltylist;
    }

    public void setMemberpenaltylist(String memberpenaltylist) {
        this.memberpenaltylist = memberpenaltylist;
    }

    public Integer getNoOfMembersSavedComp() {
        return noOfMembersSavedComp;
    }

    public void setNoOfMembersSavedComp(Integer noOfMembersSavedComp) {
        this.noOfMembersSavedComp = noOfMembersSavedComp;
    }

    public Integer getTotalMembersAvailingLoans() {
        return totalMembersAvailingLoans;
    }

    public void setTotalMembersAvailingLoans(Integer totalMembersAvailingLoans) {
        this.totalMembersAvailingLoans = totalMembersAvailingLoans;
    }

    public Integer getTotalNumberOfLoans() {
        return totalNumberOfLoans;
    }

    public void setTotalNumberOfLoans(Integer totalNumberOfLoans) {
        this.totalNumberOfLoans = totalNumberOfLoans;
    }

    public BigInteger getTotalAmountOfLoans() {
        return totalAmountOfLoans;
    }

    public void setTotalAmountOfLoans(BigInteger totalAmountOfLoans) {
        this.totalAmountOfLoans = totalAmountOfLoans;
    }

    public Integer getTotalLoansLT20k() {
        return totalLoansLT20k;
    }

    public void setTotalLoansLT20k(Integer totalLoansLT20k) {
        this.totalLoansLT20k = totalLoansLT20k;
    }

    public Integer getTotalLoans20kTo50k() {
        return totalLoans20kTo50k;
    }

    public void setTotalLoans20kTo50k(Integer totalLoans20kTo50k) {
        this.totalLoans20kTo50k = totalLoans20kTo50k;
    }

    public Integer getTotalLoans50kTo1lac() {
        return totalLoans50kTo1lac;
    }

    public void setTotalLoans50kTo1lac(Integer totalLoans50kTo1lac) {
        this.totalLoans50kTo1lac = totalLoans50kTo1lac;
    }

    public Integer getTotalLoans1lacTo2lac50k() {
        return totalLoans1lacTo2lac50k;
    }

    public void setTotalLoans1lacTo2lac50k(Integer totalLoans1lacTo2lac50k) {
        this.totalLoans1lacTo2lac50k = totalLoans1lacTo2lac50k;
    }

    public Integer getTotalLoans2lac50kTo5lac() {
        return totalLoans2lac50kTo5lac;
    }

    public void setTotalLoans2lac50kTo5lac(Integer totalLoans2lac50kTo5lac) {
        this.totalLoans2lac50kTo5lac = totalLoans2lac50kTo5lac;
    }

    public Integer getTotalLoans5lacTo10lac() {
        return totalLoans5lacTo10lac;
    }

    public void setTotalLoans5lacTo10lac(Integer totalLoans5lacTo10lac) {
        this.totalLoans5lacTo10lac = totalLoans5lacTo10lac;
    }

    public Integer getTotalLoansGT10lac() {
        return totalLoansGT10lac;
    }

    public void setTotalLoansGT10lac(Integer totalLoansGT10lac) {
        this.totalLoansGT10lac = totalLoansGT10lac;
    }

    public Integer getTotalConsumptionsLoans() {
        return totalConsumptionsLoans;
    }

    public void setTotalConsumptionsLoans(Integer totalConsumptionsLoans) {
        this.totalConsumptionsLoans = totalConsumptionsLoans;
    }

    public BigInteger getTotalAmountOfConsumptionsLoans() {
        return totalAmountOfConsumptionsLoans;
    }

    public void setTotalAmountOfConsumptionsLoans(BigInteger totalAmountOfConsumptionsLoans) {
        this.totalAmountOfConsumptionsLoans = totalAmountOfConsumptionsLoans;
    }

    public Integer getTotalAgricultureLoans() {
        return totalAgricultureLoans;
    }

    public void setTotalAgricultureLoans(Integer totalAgricultureLoans) {
        this.totalAgricultureLoans = totalAgricultureLoans;
    }

    public BigInteger getTotalAmountOfAgricultureLoans() {
        return totalAmountOfAgricultureLoans;
    }

    public void setTotalAmountOfAgricultureLoans(BigInteger totalAmountOfAgricultureLoans) {
        this.totalAmountOfAgricultureLoans = totalAmountOfAgricultureLoans;
    }

    public Integer getTotalLivestockFisheriesLoans() {
        return totalLivestockFisheriesLoans;
    }

    public void setTotalLivestockFisheriesLoans(Integer totalLivestockFisheriesLoans) {
        this.totalLivestockFisheriesLoans = totalLivestockFisheriesLoans;
    }

    public BigInteger getTotalAmountOfLivestockFisheriesLoans() {
        return totalAmountOfLivestockFisheriesLoans;
    }

    public void setTotalAmountOfLivestockFisheriesLoans(BigInteger totalAmountOfLivestockFisheriesLoans) {
        this.totalAmountOfLivestockFisheriesLoans = totalAmountOfLivestockFisheriesLoans;
    }

    public Integer getTotalNtfpLoans() {
        return totalNtfpLoans;
    }

    public void setTotalNtfpLoans(Integer totalNtfpLoans) {
        this.totalNtfpLoans = totalNtfpLoans;
    }

    public BigInteger getTotalAmountOfNtfpLoans() {
        return totalAmountOfNtfpLoans;
    }

    public void setTotalAmountOfNtfpLoans(BigInteger totalAmountOfNtfpLoans) {
        this.totalAmountOfNtfpLoans = totalAmountOfNtfpLoans;
    }

    public Integer getTotalNonFarmLoans() {
        return totalNonFarmLoans;
    }

    public void setTotalNonFarmLoans(Integer totalNonFarmLoans) {
        this.totalNonFarmLoans = totalNonFarmLoans;
    }

    public BigInteger getTotalAmountOfNonFarmLoans() {
        return totalAmountOfNonFarmLoans;
    }

    public void setTotalAmountOfNonFarmLoans(BigInteger totalAmountOfNonFarmLoans) {
        this.totalAmountOfNonFarmLoans = totalAmountOfNonFarmLoans;
    }

    public Integer getTotalLoansDemanded() {
        return totalLoansDemanded;
    }

    public void setTotalLoansDemanded(Integer totalLoansDemanded) {
        this.totalLoansDemanded = totalLoansDemanded;
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

    public Integer getTotalLoansSuppliedGT3month() {
        return totalLoansSuppliedGT3month;
    }

    public void setTotalLoansSuppliedGT3month(Integer totalLoansSuppliedGT3month) {
        this.totalLoansSuppliedGT3month = totalLoansSuppliedGT3month;
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

    public Integer getTotalLoansRepayment1monthDelay() {
        return totalLoansRepayment1monthDelay;
    }

    public void setTotalLoansRepayment1monthDelay(Integer totalLoansRepayment1monthDelay) {
        this.totalLoansRepayment1monthDelay = totalLoansRepayment1monthDelay;
    }

    public Integer getTotalLoansRepayment2monthDelay() {
        return totalLoansRepayment2monthDelay;
    }

    public void setTotalLoansRepayment2monthDelay(Integer totalLoansRepayment2monthDelay) {
        this.totalLoansRepayment2monthDelay = totalLoansRepayment2monthDelay;
    }

    public Integer getTotalLoansRepayment3monthDelay() {
        return totalLoansRepayment3monthDelay;
    }

    public void setTotalLoansRepayment3monthDelay(Integer totalLoansRepayment3monthDelay) {
        this.totalLoansRepayment3monthDelay = totalLoansRepayment3monthDelay;
    }

    public Integer getTotalLoansRepaymentGT3monthDelay() {
        return totalLoansRepaymentGT3monthDelay;
    }

    public void setTotalLoansRepaymentGT3monthDelay(Integer totalLoansRepaymentGT3monthDelay) {
        this.totalLoansRepaymentGT3monthDelay = totalLoansRepaymentGT3monthDelay;
    }

    public Integer getNoCboWhoConductedMtg() {
        return noCboWhoConductedMtg;
    }

    public void setNoCboWhoConductedMtg(Integer noCboWhoConductedMtg) {
        this.noCboWhoConductedMtg = noCboWhoConductedMtg;
    }

    public Integer getNoMeetingScheduled() {
        return noMeetingScheduled;
    }

    public void setNoMeetingScheduled(Integer noMeetingScheduled) {
        this.noMeetingScheduled = noMeetingScheduled;
    }

    public Integer getTotalAttendanceInMtg() {
        return totalAttendanceInMtg;
    }

    public void setTotalAttendanceInMtg(Integer totalAttendanceInMtg) {
        this.totalAttendanceInMtg = totalAttendanceInMtg;
    }

    public Integer getTotalAttendanceLt50P() {
        return totalAttendanceLt50P;
    }

    public void setTotalAttendanceLt50P(Integer totalAttendanceLt50P) {
        this.totalAttendanceLt50P = totalAttendanceLt50P;
    }

    public Integer getTotalAttendance50pTo70p() {
        return totalAttendance50pTo70p;
    }

    public void setTotalAttendance50pTo70p(Integer totalAttendance50pTo70p) {
        this.totalAttendance50pTo70p = totalAttendance50pTo70p;
    }

    public Integer getTotalAttendance70pTo90p() {
        return totalAttendance70pTo90p;
    }

    public void setTotalAttendance70pTo90p(Integer totalAttendance70pTo90p) {
        this.totalAttendance70pTo90p = totalAttendance70pTo90p;
    }

    public Integer getTotalAttendanceGt90p() {
        return totalAttendanceGt90p;
    }

    public void setTotalAttendanceGt90p(Integer totalAttendanceGt90p) {
        this.totalAttendanceGt90p = totalAttendanceGt90p;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Short getMeetingFrequency() {
        return meetingFrequency;
    }

    public void setMeetingFrequency(Short meetingFrequency) {
        this.meetingFrequency = meetingFrequency;
    }
    public Integer getShgSave90() {
        return shgSave90;
    }

    public void setShgSave90(Integer shgSave90) {
        this.shgSave90 = shgSave90;
    }

}

