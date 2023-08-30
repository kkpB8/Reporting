package org.apache.fineract.cn.reporting.api.domain;

import javax.persistence.Column;

public class ResponseSocialMobilization {

    private Integer totalRuralHouseholds;
    private Integer targetRuralHouseholds;
    private Integer shgMem;
    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer villageId;
    private Integer panchayatId;
    private String stateName;
    private String districtName;
    private String blockName;
    private String villageName;
    private String panchayatName;
    private Integer ageBlock;
    private Integer shgFormedMonth;
    private Integer shgMembersJoinedMonth;
    private Integer voFormedMonth;
    private Integer voShgFormedMonth;
    private Integer voMemberFormedMonth;
    private Integer clfFormedMonth;
    private Integer clfMemberFormedMonth;
    private Integer clfShgFormedMonth;
    private Integer clfVoFormedMonth;
    private Integer shgApproved;
    private Integer shgInactiveMonth;
    private Integer shgInactiveMemberMonth;
    private Integer voApproved;
    private Integer voInactiveMonth;
    private Integer clfApproved;
    private Integer clfInactiveMonth;
    private Integer totalDistict;
    private Integer totalBlock;
    private Integer totalGP;
    private Integer totalVillage;
    private Integer totalDistrictCoverage;
    private Integer totalBlockCoverage;
    private Integer totalGPCoverage;
    private Integer totalVillageCoverage;
    private String yearMonth;
    private Integer illiterateMem;
    private Integer functionalLiteracyMem;
    private Integer educationUpto5;
    private Integer educationUpto8;
    private Integer educationUpto12;
    private Integer vocationalTrainingMem;
    private Integer otherEduMem;
    private Integer shgWithBankAccount;
    private Integer voWithBankAccount;
    private Integer clfWithBankAccount;
    private Integer shgBankAcount1;
    private Integer shgBankAcount2;
    private Integer memWithBankAccount;
    private Integer memWithAdhaar;
    private Integer memWithSecct;
    private Integer womenshgMonth;
    private Integer pvtgshgMonth;
    private Integer pwdshgMonth;
    private Integer elderlyshgMonth;
    private Integer othertypeshgMonth;
    private Integer clfbanklinkageMonth;
    private Integer clfassetverificationMonth;
    private Integer illiteratememLeaderMonth;
    private Integer functionalliteracymemLeaderMonth;
    private Integer educationupto5LeaderMonth;
    private Integer educationupto8LeaderMonth;
    private Integer educationupto12LeaderMonth;
    private Integer vocationalTrainingmemLeaderMonth;
    private Integer otheredumemLeaderMonth;
    private Integer shgLeaderMonth;
    private Integer shgCount;
    private Integer shgScMonth;
    private Integer shgStMonth;
    private Integer shgGenMonth;
    private Integer shgMemScMonth;
    private Integer shgMemStMonth;
    private Integer shgMemGenMonth;
    private Integer clflivelihoodpromoMonth;
    private Integer clfmonitoringMonth;
    private Integer clfsocialactionMonth;
    private Integer clfspecialMonth;
    private Integer vobanklinkageMonth;
    private Integer voassetverificationMonth;
    private Integer volivelihoodpromoMonth;
    private Integer vomonitoringMonth;
    private Integer vosocialactionMonth;
    private Integer vospecialMonth;
    private Integer monthsOld3Month;
    private Integer monthsOld6Month;
    private Integer monthsOld9Month;
    private Integer monthsOld12Month;
    private Integer monthsOld12MoreMonth;
    private Integer shgMemApproved;
    private Integer voCount;
    private Integer voMemApproved;
    private Integer clfCount;
    private Integer clfShg;
    private Integer clfMem;
    private Integer clfMemApproved;
    private Integer shgAgricultural;
    private Integer shgHorticulture;
    private Integer shgLivestock;
    private Integer shgFishery;
    private Integer shgNtfp;
    private Integer shgManufacturing;
    private Integer shgTrading;
    private Integer shgServices;
    private Integer shgCustomHiring;
    private Integer memAgricultural;
    private Integer memHorticulture;
    private Integer memLivestock;
    private Integer memFishery;
    private Integer memNtfp;
    private Integer memManufacturing;
    private Integer memTrading;
    private Integer memServices;
    private Integer shgLeaderAgricultural;
    private Integer shgLeaderHorticulture;
    private Integer shgLeaderLivestock;
    private Integer shgLeaderFishery;
    private Integer shgLeaderNtfp;
    private Integer shgLeaderManufacturing;
    private Integer shgLeaderTrading;
    private Integer shgLeaderServices;
    private Integer shgApprovedMonth;
    private Integer voApprovedMonth;
    private Integer clfApprovedMonth;
    private Integer wagesLeader;
    private Integer shgLeaderCaderService;
    private Integer shgLeaderOther;
    private Integer shgLiveAggregation;
    private Integer shgLiveOthers;
    private Integer memWages;
    private Integer memCaderService;
    private Integer memOthers;
    private Integer isSaturated;
    private Integer shgObcMonth;
    private Integer shgMemObcMonth;
    private Integer educationUptoGradAndAboveMonth;
    private Integer educationuptoGradandabveLeaderMonth;
    private Integer memMobile;
    private Integer monthOld12to24Month;
    private Integer monthsOld24to60Month;
    private Integer monthsOld60to120Month;
    private Integer monthsOld120MoreMonth;
    private Integer shgActivated;
    private Integer voActivated;
    private Integer clfActivated;
    private Integer memActivated;
    private Integer shgOtherMonth;
    private Integer shgMemOtherMonth;
    private Integer shgLastDay;
    private Integer memLastDay;
    private String updatedDate;
    private Integer shgFormed;
    private Integer shgMembers;
    private Integer shgTot;
    private Integer approvedNicShgBpm;
    private Integer pendingNicShgBpm;
    private Integer rejectedNicShgBpm;
    private Integer lokosShg;
    private Integer approvedLokosShgBpm;
    private Integer pendingLokosShgBpm;
    private Integer rejectedLokosShgBpm;
    private Integer nicMem;
    private Integer approveNicMem;
    private Integer pendingNicMem;
    private Integer rejectedNicMem;
    private Integer lokosMem;
    private Integer approveLokosMem;
    private Integer pendingLokosMem;
    private Integer rejectedLokosMem;
    private Integer nrlmPromotedBy;
    private Integer stateProjectPromotedBy;
    private Integer ngoPromotedBy;
    private Integer sgsyPromotedBy;
    private Integer otherPromotedBy;
    private Integer stateProjectCoopted;
    private Integer stateProjectNoncoopted;
    private Integer ngoCoopted;
    private Integer ngoNoncoopted;
    private Integer otherCoopted;
    private Integer otherNoncoopted;
    private Integer allShgwithBankAccount;
    private Integer allShgwithBankAccountMem;
    private Integer allShgWithoutMig;
    private Integer allMemWithoutMig;
    private Integer allShgWithoutLokos;
    private Integer allMemWithoutLokos;
    private Integer allShgActive;
    private Integer allMemActive;
    private Integer allShgInactiveMig;
    private Integer allMemInactiveMig;
    private Integer allShgInactiveLokos;
    private Integer allMemInactiveLokos;
    private Integer completeShgNicLokos;
    private Integer completeMemNicLokos;
    private Integer incompleteShgDue5MemNic;
    private Integer incompleteMemDue5MemNic;
    private Integer incompleteShgDue5MemLok;
    private Integer incompleteMemDue5MemLok;
    private Integer stateProjectReviwed;
    private Integer ngoNoncooptedReviwed;
    private Integer otherReviwed;
    private Integer allmemCount;
    private Integer allShgCount;
    private Integer allShgFormedMonth;
    private Integer allShgMembersJoinedMonth;
    private Integer totalShgMem;
    private Integer voMig;
    private Integer voShgMig;
    private Integer pendingNicVoBpm;
    private Integer approvedNicVoBpm;
    private Integer rejectedNicVoBpm;
    private Integer voLokos;
    private Integer voShgLokos;
    private Integer pendingLokVoBpm;
    private Integer approvedLokVoBpm;
    private Integer rejectedLokVoBpm;
    private Integer clfMig;
    private Integer clfVoMig;
    private Integer clfShgMig;
    private Integer pendingNicClfBpm;
    private Integer approvedNicClfBpm;
    private Integer rejectedNicClfBpm;
    private Integer clfLokos;
    private Integer clfVoLokos;
    private Integer clfShgLokos;
    private Integer pendingLokClfBpm;
    private Integer approvedLokClfBpm;
    private Integer rejectedLokClfBpm;
    private Integer pendingNicVoshgBpm;
    private Integer approvedNicVoshgBpm;
    private Integer rejectedNicVoshgBpm;
    private Integer pendingLokVoshgBpm;
    private Integer approvedLokVoshgBpm;
    private Integer rejectedLokVoshgBpm;
    private Integer pendingNicClfVoBpm;
    private Integer approvedNicClfVoBpm;
    private Integer rejectedNicClfVoBpm;
    private Integer pendingNicClfVoShgBpm;
    private Integer approvedNicClfVoShgBpm;
    private Integer rejectedNicClfVoShgBpm;
    private Integer pendingLokClfVoBpm;
    private Integer approvedLokClfVoBpm;
    private Integer rejectedLokClfVoBpm;
    private Integer pendingLokClfVoShgBpm;
    private Integer approvedLokClfVoShgBpm;
    private Integer rejectedLokClfVoShgBpm;
    private Integer memManrega;
    private Integer memPmay;
    private Integer memSecc;
    private Integer voUnderNrlm;
    private Integer voShgUnderNrlm;
    private Integer voUnderStateProject;
    private Integer voShgUnderStateProject;
    private Integer clfNrlm;
    private Integer clfVoNrlm;
    private Integer clfVoShgNrlm;
    private Integer clfStateProject;
    private Integer clfVoStateProject;
    private Integer clfVoShgStateProject;
    private Integer incompleteVoDue5ShgMig;
    private Integer incompleteVoShgDue5ShgMig;
    private Integer incompleteVoDue5ShgLokos;
    private Integer incompleteVoShgDue5ShgLokos;
    private Integer allVoInactiveMig;
    private Integer allVoShgInactiveMig;
    private Integer allVoInactiveLokos;
    private Integer allVoShgInactiveLokos;
    private Integer voMigWithoutBank;
    private Integer voShgMigWithoutBank;
    private Integer voLokosWithoutBank;
    private Integer voShgLokosWithoutBank;
    private Integer incompleteClfDue3VoMig;
    private Integer incompleteClfVoDue3VoMig;
    private Integer incompleteClfShgDue3VoMig;
    private Integer incompleteClfDue3VoLokos;
    private Integer incompleteClfVoDue3VoLokos;
    private Integer incompleteClfShgDue3VoLokos;
    private Integer allIncClfMig;
    private Integer allIncClfVoMig;
    private Integer allIncClfShgMig;
    private Integer allIncClfLokos;
    private Integer allIncClfVoLokos;
    private Integer allIncClfShgLokos;
    private Integer clfMigWithoutBank;
    private Integer clfVoMigWithoutBank;
    private Integer clfShgMigWithoutBank;
    private Integer clfLokosWithoutBank;
    private Integer clfVoLokosWithoutBank;
    private Integer clfShgLokosWithoutBank;
    private Integer memAge18;
    private Integer memAge18to25;
    private Integer memAge26to40;
    private Integer memAge41to50;
    private Integer menAge51to60;
    private Integer memAge61to70;
    private Integer memAge70;
    private Integer memAgeNull;
    private Integer totalBKActive;
    private Integer eBKAssigedtoShgActive;
    private Integer shgMappedWithBKActive;
    private Integer totalBKInactive;
    private Integer eBKAssigetoSHGInactive;
    private Integer shgMappedWithBKInactive;
    public Integer getTotalRuralHouseholds() {
        return totalRuralHouseholds;
    }

    public void setTotalRuralHouseholds(Integer totalRuralHouseholds) {
        this.totalRuralHouseholds = totalRuralHouseholds;
    }

    public Integer getTargetRuralHouseholds() {
        return targetRuralHouseholds;
    }

    public void setTargetRuralHouseholds(Integer targetRuralHouseholds) {
        this.targetRuralHouseholds = targetRuralHouseholds;
    }

    public Integer getShgMem() {
        return shgMem;
    }

    public void setShgMem(Integer shgMem) {
        this.shgMem = shgMem;
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

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Integer panchayatId) {
        this.panchayatId = panchayatId;
    }

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

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getPanchayatName() {
        return panchayatName;
    }

    public void setPanchayatName(String panchayatName) {
        this.panchayatName = panchayatName;
    }

    public Integer getAgeBlock() {
        return ageBlock;
    }

    public void setAgeBlock(Integer ageBlock) {
        this.ageBlock = ageBlock;
    }

    public Integer getShgFormedMonth() {
        return shgFormedMonth;
    }

    public void setShgFormedMonth(Integer shgFormedMonth) {
        this.shgFormedMonth = shgFormedMonth;
    }

    public Integer getShgMembersJoinedMonth() {
        return shgMembersJoinedMonth;
    }

    public void setShgMembersJoinedMonth(Integer shgMembersJoinedMonth) {
        this.shgMembersJoinedMonth = shgMembersJoinedMonth;
    }

    public Integer getVoFormedMonth() {
        return voFormedMonth;
    }

    public void setVoFormedMonth(Integer voFormedMonth) {
        this.voFormedMonth = voFormedMonth;
    }

    public Integer getVoShgFormedMonth() {
        return voShgFormedMonth;
    }

    public void setVoShgFormedMonth(Integer voShgFormedMonth) {
        this.voShgFormedMonth = voShgFormedMonth;
    }

    public Integer getVoMemberFormedMonth() {
        return voMemberFormedMonth;
    }

    public void setVoMemberFormedMonth(Integer voMemberFormedMonth) {
        this.voMemberFormedMonth = voMemberFormedMonth;
    }

    public Integer getClfFormedMonth() {
        return clfFormedMonth;
    }

    public void setClfFormedMonth(Integer clfFormedMonth) {
        this.clfFormedMonth = clfFormedMonth;
    }

    public Integer getClfMemberFormedMonth() {
        return clfMemberFormedMonth;
    }

    public void setClfMemberFormedMonth(Integer clfMemberFormedMonth) {
        this.clfMemberFormedMonth = clfMemberFormedMonth;
    }

    public Integer getClfShgFormedMonth() {
        return clfShgFormedMonth;
    }

    public void setClfShgFormedMonth(Integer clfShgFormedMonth) {
        this.clfShgFormedMonth = clfShgFormedMonth;
    }

    public Integer getClfVoFormedMonth() {
        return clfVoFormedMonth;
    }

    public void setClfVoFormedMonth(Integer clfVoFormedMonth) {
        this.clfVoFormedMonth = clfVoFormedMonth;
    }

    public Integer getShgApproved() {
        return shgApproved;
    }

    public void setShgApproved(Integer shgApproved) {
        this.shgApproved = shgApproved;
    }

    public Integer getShgInactiveMonth() {
        return shgInactiveMonth;
    }

    public void setShgInactiveMonth(Integer shgInactiveMonth) {
        this.shgInactiveMonth = shgInactiveMonth;
    }

    public Integer getShgInactiveMemberMonth() {
        return shgInactiveMemberMonth;
    }

    public void setShgInactiveMemberMonth(Integer shgInactiveMemberMonth) {
        this.shgInactiveMemberMonth = shgInactiveMemberMonth;
    }

    public Integer getVoApproved() {
        return voApproved;
    }

    public void setVoApproved(Integer voApproved) {
        this.voApproved = voApproved;
    }

    public Integer getVoInactiveMonth() {
        return voInactiveMonth;
    }

    public void setVoInactiveMonth(Integer voInactiveMonth) {
        this.voInactiveMonth = voInactiveMonth;
    }

    public Integer getClfApproved() {
        return clfApproved;
    }

    public void setClfApproved(Integer clfApproved) {
        this.clfApproved = clfApproved;
    }

    public Integer getClfInactiveMonth() {
        return clfInactiveMonth;
    }

    public void setClfInactiveMonth(Integer clfInactiveMonth) {
        this.clfInactiveMonth = clfInactiveMonth;
    }

    public Integer getTotalDistict() {
        return totalDistict;
    }

    public void setTotalDistict(Integer totalDistict) {
        this.totalDistict = totalDistict;
    }

    public Integer getTotalBlock() {
        return totalBlock;
    }

    public void setTotalBlock(Integer totalBlock) {
        this.totalBlock = totalBlock;
    }

    public Integer getTotalGP() {
        return totalGP;
    }

    public void setTotalGP(Integer totalGP) {
        this.totalGP = totalGP;
    }

    public Integer getTotalVillage() {
        return totalVillage;
    }

    public void setTotalVillage(Integer totalVillage) {
        this.totalVillage = totalVillage;
    }

    public Integer getTotalDistrictCoverage() {
        return totalDistrictCoverage;
    }

    public void setTotalDistrictCoverage(Integer totalDistrictCoverage) {
        this.totalDistrictCoverage = totalDistrictCoverage;
    }

    public Integer getTotalBlockCoverage() {
        return totalBlockCoverage;
    }

    public void setTotalBlockCoverage(Integer totalBlockCoverage) {
        this.totalBlockCoverage = totalBlockCoverage;
    }

    public Integer getTotalGPCoverage() {
        return totalGPCoverage;
    }

    public void setTotalGPCoverage(Integer totalGPCoverage) {
        this.totalGPCoverage = totalGPCoverage;
    }

    public Integer getTotalVillageCoverage() {
        return totalVillageCoverage;
    }

    public void setTotalVillageCoverage(Integer totalVillageCoverage) {
        this.totalVillageCoverage = totalVillageCoverage;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getIlliterateMem() {
        return illiterateMem;
    }

    public void setIlliterateMem(Integer illiterateMem) {
        this.illiterateMem = illiterateMem;
    }

    public Integer getFunctionalLiteracyMem() {
        return functionalLiteracyMem;
    }

    public void setFunctionalLiteracyMem(Integer functionalLiteracyMem) {
        this.functionalLiteracyMem = functionalLiteracyMem;
    }

    public Integer getEducationUpto5() {
        return educationUpto5;
    }

    public void setEducationUpto5(Integer educationUpto5) {
        this.educationUpto5 = educationUpto5;
    }

    public Integer getEducationUpto8() {
        return educationUpto8;
    }

    public void setEducationUpto8(Integer educationUpto8) {
        this.educationUpto8 = educationUpto8;
    }

    public Integer getEducationUpto12() {
        return educationUpto12;
    }

    public void setEducationUpto12(Integer educationUpto12) {
        this.educationUpto12 = educationUpto12;
    }

    public Integer getVocationalTrainingMem() {
        return vocationalTrainingMem;
    }

    public void setVocationalTrainingMem(Integer vocationalTrainingMem) {
        this.vocationalTrainingMem = vocationalTrainingMem;
    }

    public Integer getOtherEduMem() {
        return otherEduMem;
    }

    public void setOtherEduMem(Integer otherEduMem) {
        this.otherEduMem = otherEduMem;
    }

    public Integer getShgWithBankAccount() {
        return shgWithBankAccount;
    }

    public void setShgWithBankAccount(Integer shgWithBankAccount) {
        this.shgWithBankAccount = shgWithBankAccount;
    }

    public Integer getVoWithBankAccount() {
        return voWithBankAccount;
    }

    public void setVoWithBankAccount(Integer voWithBankAccount) {
        this.voWithBankAccount = voWithBankAccount;
    }

    public Integer getClfWithBankAccount() {
        return clfWithBankAccount;
    }

    public void setClfWithBankAccount(Integer clfWithBankAccount) {
        this.clfWithBankAccount = clfWithBankAccount;
    }

    public Integer getShgBankAcount1() {
        return shgBankAcount1;
    }

    public void setShgBankAcount1(Integer shgBankAcount1) {
        this.shgBankAcount1 = shgBankAcount1;
    }

    public Integer getShgBankAcount2() {
        return shgBankAcount2;
    }

    public void setShgBankAcount2(Integer shgBankAcount2) {
        this.shgBankAcount2 = shgBankAcount2;
    }

    public Integer getMemWithBankAccount() {
        return memWithBankAccount;
    }

    public void setMemWithBankAccount(Integer memWithBankAccount) {
        this.memWithBankAccount = memWithBankAccount;
    }

    public Integer getMemWithAdhaar() {
        return memWithAdhaar;
    }

    public void setMemWithAdhaar(Integer memWithAdhaar) {
        this.memWithAdhaar = memWithAdhaar;
    }

    public Integer getMemWithSecct() {
        return memWithSecct;
    }

    public void setMemWithSecct(Integer memWithSecct) {
        this.memWithSecct = memWithSecct;
    }

    public Integer getWomenshgMonth() {
        return womenshgMonth;
    }

    public void setWomenshgMonth(Integer womenshgMonth) {
        this.womenshgMonth = womenshgMonth;
    }

    public Integer getPvtgshgMonth() {
        return pvtgshgMonth;
    }

    public void setPvtgshgMonth(Integer pvtgshgMonth) {
        this.pvtgshgMonth = pvtgshgMonth;
    }

    public Integer getPwdshgMonth() {
        return pwdshgMonth;
    }

    public void setPwdshgMonth(Integer pwdshgMonth) {
        this.pwdshgMonth = pwdshgMonth;
    }

    public Integer getElderlyshgMonth() {
        return elderlyshgMonth;
    }

    public void setElderlyshgMonth(Integer elderlyshgMonth) {
        this.elderlyshgMonth = elderlyshgMonth;
    }

    public Integer getOthertypeshgMonth() {
        return othertypeshgMonth;
    }

    public void setOthertypeshgMonth(Integer othertypeshgMonth) {
        this.othertypeshgMonth = othertypeshgMonth;
    }

    public Integer getClfbanklinkageMonth() {
        return clfbanklinkageMonth;
    }

    public void setClfbanklinkageMonth(Integer clfbanklinkageMonth) {
        this.clfbanklinkageMonth = clfbanklinkageMonth;
    }

    public Integer getClfassetverificationMonth() {
        return clfassetverificationMonth;
    }

    public void setClfassetverificationMonth(Integer clfassetverificationMonth) {
        this.clfassetverificationMonth = clfassetverificationMonth;
    }

    public Integer getIlliteratememLeaderMonth() {
        return illiteratememLeaderMonth;
    }

    public void setIlliteratememLeaderMonth(Integer illiteratememLeaderMonth) {
        this.illiteratememLeaderMonth = illiteratememLeaderMonth;
    }

    public Integer getFunctionalliteracymemLeaderMonth() {
        return functionalliteracymemLeaderMonth;
    }

    public void setFunctionalliteracymemLeaderMonth(Integer functionalliteracymemLeaderMonth) {
        this.functionalliteracymemLeaderMonth = functionalliteracymemLeaderMonth;
    }

    public Integer getEducationupto5LeaderMonth() {
        return educationupto5LeaderMonth;
    }

    public void setEducationupto5LeaderMonth(Integer educationupto5LeaderMonth) {
        this.educationupto5LeaderMonth = educationupto5LeaderMonth;
    }

    public Integer getEducationupto8LeaderMonth() {
        return educationupto8LeaderMonth;
    }

    public void setEducationupto8LeaderMonth(Integer educationupto8LeaderMonth) {
        this.educationupto8LeaderMonth = educationupto8LeaderMonth;
    }

    public Integer getEducationupto12LeaderMonth() {
        return educationupto12LeaderMonth;
    }

    public void setEducationupto12LeaderMonth(Integer educationupto12LeaderMonth) {
        this.educationupto12LeaderMonth = educationupto12LeaderMonth;
    }

    public Integer getVocationalTrainingmemLeaderMonth() {
        return vocationalTrainingmemLeaderMonth;
    }

    public void setVocationalTrainingmemLeaderMonth(Integer vocationalTrainingmemLeaderMonth) {
        this.vocationalTrainingmemLeaderMonth = vocationalTrainingmemLeaderMonth;
    }

    public Integer getOtheredumemLeaderMonth() {
        return otheredumemLeaderMonth;
    }

    public void setOtheredumemLeaderMonth(Integer otheredumemLeaderMonth) {
        this.otheredumemLeaderMonth = otheredumemLeaderMonth;
    }

    public Integer getShgLeaderMonth() {
        return shgLeaderMonth;
    }

    public void setShgLeaderMonth(Integer shgLeaderMonth) {
        this.shgLeaderMonth = shgLeaderMonth;
    }

    public Integer getShgCount() {
        return shgCount;
    }

    public void setShgCount(Integer shgCount) {
        this.shgCount = shgCount;
    }

    public Integer getShgScMonth() {
        return shgScMonth;
    }

    public void setShgScMonth(Integer shgScMonth) {
        this.shgScMonth = shgScMonth;
    }

    public Integer getShgStMonth() {
        return shgStMonth;
    }

    public void setShgStMonth(Integer shgStMonth) {
        this.shgStMonth = shgStMonth;
    }

    public Integer getShgGenMonth() {
        return shgGenMonth;
    }

    public void setShgGenMonth(Integer shgGenMonth) {
        this.shgGenMonth = shgGenMonth;
    }

    public Integer getShgMemScMonth() {
        return shgMemScMonth;
    }

    public void setShgMemScMonth(Integer shgMemScMonth) {
        this.shgMemScMonth = shgMemScMonth;
    }

    public Integer getShgMemStMonth() {
        return shgMemStMonth;
    }

    public void setShgMemStMonth(Integer shgMemStMonth) {
        this.shgMemStMonth = shgMemStMonth;
    }

    public Integer getShgMemGenMonth() {
        return shgMemGenMonth;
    }

    public void setShgMemGenMonth(Integer shgMemGenMonth) {
        this.shgMemGenMonth = shgMemGenMonth;
    }

    public Integer getClflivelihoodpromoMonth() {
        return clflivelihoodpromoMonth;
    }

    public void setClflivelihoodpromoMonth(Integer clflivelihoodpromoMonth) {
        this.clflivelihoodpromoMonth = clflivelihoodpromoMonth;
    }

    public Integer getClfmonitoringMonth() {
        return clfmonitoringMonth;
    }

    public void setClfmonitoringMonth(Integer clfmonitoringMonth) {
        this.clfmonitoringMonth = clfmonitoringMonth;
    }

    public Integer getClfsocialactionMonth() {
        return clfsocialactionMonth;
    }

    public void setClfsocialactionMonth(Integer clfsocialactionMonth) {
        this.clfsocialactionMonth = clfsocialactionMonth;
    }

    public Integer getClfspecialMonth() {
        return clfspecialMonth;
    }

    public void setClfspecialMonth(Integer clfspecialMonth) {
        this.clfspecialMonth = clfspecialMonth;
    }

    public Integer getVobanklinkageMonth() {
        return vobanklinkageMonth;
    }

    public void setVobanklinkageMonth(Integer vobanklinkageMonth) {
        this.vobanklinkageMonth = vobanklinkageMonth;
    }

    public Integer getVoassetverificationMonth() {
        return voassetverificationMonth;
    }

    public void setVoassetverificationMonth(Integer voassetverificationMonth) {
        this.voassetverificationMonth = voassetverificationMonth;
    }

    public Integer getVolivelihoodpromoMonth() {
        return volivelihoodpromoMonth;
    }

    public void setVolivelihoodpromoMonth(Integer volivelihoodpromoMonth) {
        this.volivelihoodpromoMonth = volivelihoodpromoMonth;
    }

    public Integer getVomonitoringMonth() {
        return vomonitoringMonth;
    }

    public void setVomonitoringMonth(Integer vomonitoringMonth) {
        this.vomonitoringMonth = vomonitoringMonth;
    }

    public Integer getVosocialactionMonth() {
        return vosocialactionMonth;
    }

    public void setVosocialactionMonth(Integer vosocialactionMonth) {
        this.vosocialactionMonth = vosocialactionMonth;
    }

    public Integer getVospecialMonth() {
        return vospecialMonth;
    }

    public void setVospecialMonth(Integer vospecialMonth) {
        this.vospecialMonth = vospecialMonth;
    }

    public Integer getMonthsOld3Month() {
        return monthsOld3Month;
    }

    public void setMonthsOld3Month(Integer monthsOld3Month) {
        this.monthsOld3Month = monthsOld3Month;
    }

    public Integer getMonthsOld6Month() {
        return monthsOld6Month;
    }

    public void setMonthsOld6Month(Integer monthsOld6Month) {
        this.monthsOld6Month = monthsOld6Month;
    }

    public Integer getMonthsOld9Month() {
        return monthsOld9Month;
    }

    public void setMonthsOld9Month(Integer monthsOld9Month) {
        this.monthsOld9Month = monthsOld9Month;
    }

    public Integer getMonthsOld12Month() {
        return monthsOld12Month;
    }

    public void setMonthsOld12Month(Integer monthsOld12Month) {
        this.monthsOld12Month = monthsOld12Month;
    }

    public Integer getMonthsOld12MoreMonth() {
        return monthsOld12MoreMonth;
    }

    public void setMonthsOld12MoreMonth(Integer monthsOld12MoreMonth) {
        this.monthsOld12MoreMonth = monthsOld12MoreMonth;
    }

    public Integer getShgMemApproved() {
        return shgMemApproved;
    }

    public void setShgMemApproved(Integer shgMemApproved) {
        this.shgMemApproved = shgMemApproved;
    }

    public Integer getVoCount() {
        return voCount;
    }

    public void setVoCount(Integer voCount) {
        this.voCount = voCount;
    }

    public Integer getVoMemApproved() {
        return voMemApproved;
    }

    public void setVoMemApproved(Integer voMemApproved) {
        this.voMemApproved = voMemApproved;
    }

    public Integer getClfCount() {
        return clfCount;
    }

    public void setClfCount(Integer clfCount) {
        this.clfCount = clfCount;
    }

    public Integer getClfShg() {
        return clfShg;
    }

    public void setClfShg(Integer clfShg) {
        this.clfShg = clfShg;
    }

    public Integer getClfMem() {
        return clfMem;
    }

    public void setClfMem(Integer clfMem) {
        this.clfMem = clfMem;
    }

    public Integer getClfMemApproved() {
        return clfMemApproved;
    }

    public void setClfMemApproved(Integer clfMemApproved) {
        this.clfMemApproved = clfMemApproved;
    }

    public Integer getShgAgricultural() {
        return shgAgricultural;
    }

    public void setShgAgricultural(Integer shgAgricultural) {
        this.shgAgricultural = shgAgricultural;
    }

    public Integer getShgHorticulture() {
        return shgHorticulture;
    }

    public void setShgHorticulture(Integer shgHorticulture) {
        this.shgHorticulture = shgHorticulture;
    }

    public Integer getShgLivestock() {
        return shgLivestock;
    }

    public void setShgLivestock(Integer shgLivestock) {
        this.shgLivestock = shgLivestock;
    }

    public Integer getShgFishery() {
        return shgFishery;
    }

    public void setShgFishery(Integer shgFishery) {
        this.shgFishery = shgFishery;
    }

    public Integer getShgNtfp() {
        return shgNtfp;
    }

    public void setShgNtfp(Integer shgNtfp) {
        this.shgNtfp = shgNtfp;
    }

    public Integer getShgManufacturing() {
        return shgManufacturing;
    }

    public void setShgManufacturing(Integer shgManufacturing) {
        this.shgManufacturing = shgManufacturing;
    }

    public Integer getShgTrading() {
        return shgTrading;
    }

    public void setShgTrading(Integer shgTrading) {
        this.shgTrading = shgTrading;
    }

    public Integer getShgServices() {
        return shgServices;
    }

    public void setShgServices(Integer shgServices) {
        this.shgServices = shgServices;
    }

    public Integer getShgCustomHiring() {
        return shgCustomHiring;
    }

    public void setShgCustomHiring(Integer shgCustomHiring) {
        this.shgCustomHiring = shgCustomHiring;
    }

    public Integer getMemAgricultural() {
        return memAgricultural;
    }

    public void setMemAgricultural(Integer memAgricultural) {
        this.memAgricultural = memAgricultural;
    }

    public Integer getMemHorticulture() {
        return memHorticulture;
    }

    public void setMemHorticulture(Integer memHorticulture) {
        this.memHorticulture = memHorticulture;
    }

    public Integer getMemLivestock() {
        return memLivestock;
    }

    public void setMemLivestock(Integer memLivestock) {
        this.memLivestock = memLivestock;
    }

    public Integer getMemFishery() {
        return memFishery;
    }

    public void setMemFishery(Integer memFishery) {
        this.memFishery = memFishery;
    }

    public Integer getMemNtfp() {
        return memNtfp;
    }

    public void setMemNtfp(Integer memNtfp) {
        this.memNtfp = memNtfp;
    }

    public Integer getMemManufacturing() {
        return memManufacturing;
    }

    public void setMemManufacturing(Integer memManufacturing) {
        this.memManufacturing = memManufacturing;
    }

    public Integer getMemTrading() {
        return memTrading;
    }

    public void setMemTrading(Integer memTrading) {
        this.memTrading = memTrading;
    }

    public Integer getMemServices() {
        return memServices;
    }

    public void setMemServices(Integer memServices) {
        this.memServices = memServices;
    }

    public Integer getShgLeaderAgricultural() {
        return shgLeaderAgricultural;
    }

    public void setShgLeaderAgricultural(Integer shgLeaderAgricultural) {
        this.shgLeaderAgricultural = shgLeaderAgricultural;
    }

    public Integer getShgLeaderHorticulture() {
        return shgLeaderHorticulture;
    }

    public void setShgLeaderHorticulture(Integer shgLeaderHorticulture) {
        this.shgLeaderHorticulture = shgLeaderHorticulture;
    }

    public Integer getShgLeaderLivestock() {
        return shgLeaderLivestock;
    }

    public void setShgLeaderLivestock(Integer shgLeaderLivestock) {
        this.shgLeaderLivestock = shgLeaderLivestock;
    }

    public Integer getShgLeaderFishery() {
        return shgLeaderFishery;
    }

    public void setShgLeaderFishery(Integer shgLeaderFishery) {
        this.shgLeaderFishery = shgLeaderFishery;
    }

    public Integer getShgLeaderNtfp() {
        return shgLeaderNtfp;
    }

    public void setShgLeaderNtfp(Integer shgLeaderNtfp) {
        this.shgLeaderNtfp = shgLeaderNtfp;
    }

    public Integer getShgLeaderManufacturing() {
        return shgLeaderManufacturing;
    }

    public void setShgLeaderManufacturing(Integer shgLeaderManufacturing) {
        this.shgLeaderManufacturing = shgLeaderManufacturing;
    }

    public Integer getShgLeaderTrading() {
        return shgLeaderTrading;
    }

    public void setShgLeaderTrading(Integer shgLeaderTrading) {
        this.shgLeaderTrading = shgLeaderTrading;
    }

    public Integer getShgLeaderServices() {
        return shgLeaderServices;
    }

    public void setShgLeaderServices(Integer shgLeaderServices) {
        this.shgLeaderServices = shgLeaderServices;
    }

    public Integer getShgApprovedMonth() {
        return shgApprovedMonth;
    }

    public void setShgApprovedMonth(Integer shgApprovedMonth) {
        this.shgApprovedMonth = shgApprovedMonth;
    }

    public Integer getVoApprovedMonth() {
        return voApprovedMonth;
    }

    public void setVoApprovedMonth(Integer voApprovedMonth) {
        this.voApprovedMonth = voApprovedMonth;
    }

    public Integer getClfApprovedMonth() {
        return clfApprovedMonth;
    }

    public void setClfApprovedMonth(Integer clfApprovedMonth) {
        this.clfApprovedMonth = clfApprovedMonth;
    }

    public Integer getWagesLeader() {
        return wagesLeader;
    }

    public void setWagesLeader(Integer wagesLeader) {
        this.wagesLeader = wagesLeader;
    }

    public Integer getShgLeaderCaderService() {
        return shgLeaderCaderService;
    }

    public void setShgLeaderCaderService(Integer shgLeaderCaderService) {
        this.shgLeaderCaderService = shgLeaderCaderService;
    }

    public Integer getShgLeaderOther() {
        return shgLeaderOther;
    }

    public void setShgLeaderOther(Integer shgLeaderOther) {
        this.shgLeaderOther = shgLeaderOther;
    }

    public Integer getShgLiveAggregation() {
        return shgLiveAggregation;
    }

    public void setShgLiveAggregation(Integer shgLiveAggregation) {
        this.shgLiveAggregation = shgLiveAggregation;
    }

    public Integer getShgLiveOthers() {
        return shgLiveOthers;
    }

    public void setShgLiveOthers(Integer shgLiveOthers) {
        this.shgLiveOthers = shgLiveOthers;
    }

    public Integer getMemWages() {
        return memWages;
    }

    public void setMemWages(Integer memWages) {
        this.memWages = memWages;
    }

    public Integer getMemCaderService() {
        return memCaderService;
    }

    public void setMemCaderService(Integer memCaderService) {
        this.memCaderService = memCaderService;
    }

    public Integer getMemOthers() {
        return memOthers;
    }

    public void setMemOthers(Integer memOthers) {
        this.memOthers = memOthers;
    }

    public Integer getIsSaturated() {
        return isSaturated;
    }

    public void setIsSaturated(Integer isSaturated) {
        this.isSaturated = isSaturated;
    }

    public Integer getShgObcMonth() {
        return shgObcMonth;
    }

    public void setShgObcMonth(Integer shgObcMonth) {
        this.shgObcMonth = shgObcMonth;
    }

    public Integer getShgMemObcMonth() {
        return shgMemObcMonth;
    }

    public void setShgMemObcMonth(Integer shgMemObcMonth) {
        this.shgMemObcMonth = shgMemObcMonth;
    }

    public Integer getEducationUptoGradAndAboveMonth() {
        return educationUptoGradAndAboveMonth;
    }

    public void setEducationUptoGradAndAboveMonth(Integer educationUptoGradAndAboveMonth) {
        this.educationUptoGradAndAboveMonth = educationUptoGradAndAboveMonth;
    }

    public Integer getEducationuptoGradandabveLeaderMonth() {
        return educationuptoGradandabveLeaderMonth;
    }

    public void setEducationuptoGradandabveLeaderMonth(Integer educationuptoGradandabveLeaderMonth) {
        this.educationuptoGradandabveLeaderMonth = educationuptoGradandabveLeaderMonth;
    }

    public Integer getMemMobile() {
        return memMobile;
    }

    public void setMemMobile(Integer memMobile) {
        this.memMobile = memMobile;
    }

    public Integer getMonthOld12to24Month() {
        return monthOld12to24Month;
    }

    public void setMonthOld12to24Month(Integer monthOld12to24Month) {
        this.monthOld12to24Month = monthOld12to24Month;
    }

    public Integer getMonthsOld24to60Month() {
        return monthsOld24to60Month;
    }

    public void setMonthsOld24to60Month(Integer monthsOld24to60Month) {
        this.monthsOld24to60Month = monthsOld24to60Month;
    }

    public Integer getMonthsOld60to120Month() {
        return monthsOld60to120Month;
    }

    public void setMonthsOld60to120Month(Integer monthsOld60to120Month) {
        this.monthsOld60to120Month = monthsOld60to120Month;
    }

    public Integer getMonthsOld120MoreMonth() {
        return monthsOld120MoreMonth;
    }

    public void setMonthsOld120MoreMonth(Integer monthsOld120MoreMonth) {
        this.monthsOld120MoreMonth = monthsOld120MoreMonth;
    }

    public Integer getShgActivated() {
        return shgActivated;
    }

    public void setShgActivated(Integer shgActivated) {
        this.shgActivated = shgActivated;
    }

    public Integer getVoActivated() {
        return voActivated;
    }

    public void setVoActivated(Integer voActivated) {
        this.voActivated = voActivated;
    }

    public Integer getClfActivated() {
        return clfActivated;
    }

    public void setClfActivated(Integer clfActivated) {
        this.clfActivated = clfActivated;
    }

    public Integer getMemActivated() {
        return memActivated;
    }

    public void setMemActivated(Integer memActivated) {
        this.memActivated = memActivated;
    }

    public Integer getShgOtherMonth() {
        return shgOtherMonth;
    }

    public void setShgOtherMonth(Integer shgOtherMonth) {
        this.shgOtherMonth = shgOtherMonth;
    }

    public Integer getShgMemOtherMonth() {
        return shgMemOtherMonth;
    }

    public void setShgMemOtherMonth(Integer shgMemOtherMonth) {
        this.shgMemOtherMonth = shgMemOtherMonth;
    }

    public Integer getShgLastDay() {
        return shgLastDay;
    }

    public void setShgLastDay(Integer shgLastDay) {
        this.shgLastDay = shgLastDay;
    }

    public Integer getMemLastDay() {
        return memLastDay;
    }

    public void setMemLastDay(Integer memLastDay) {
        this.memLastDay = memLastDay;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Integer getShgFormed() {
        return shgFormed;
    }

    public void setShgFormed(Integer shgFormed) {
        this.shgFormed = shgFormed;
    }

    public Integer getShgMembers() {
        return shgMembers;
    }

    public void setShgMembers(Integer shgMembers) {
        this.shgMembers = shgMembers;
    }

    public Integer getShgTot() {
        return shgTot;
    }

    public void setShgTot(Integer shgTot) {
        this.shgTot = shgTot;
    }

    public Integer getApprovedNicShgBpm() {
        return approvedNicShgBpm;
    }

    public void setApprovedNicShgBpm(Integer approvedNicShgBpm) {
        this.approvedNicShgBpm = approvedNicShgBpm;
    }

    public Integer getPendingNicShgBpm() {
        return pendingNicShgBpm;
    }

    public void setPendingNicShgBpm(Integer pendingNicShgBpm) {
        this.pendingNicShgBpm = pendingNicShgBpm;
    }

    public Integer getRejectedNicShgBpm() {
        return rejectedNicShgBpm;
    }

    public void setRejectedNicShgBpm(Integer rejectedNicShgBpm) {
        this.rejectedNicShgBpm = rejectedNicShgBpm;
    }

    public Integer getLokosShg() {
        return lokosShg;
    }

    public void setLokosShg(Integer lokosShg) {
        this.lokosShg = lokosShg;
    }

    public Integer getApprovedLokosShgBpm() {
        return approvedLokosShgBpm;
    }

    public void setApprovedLokosShgBpm(Integer approvedLokosShgBpm) {
        this.approvedLokosShgBpm = approvedLokosShgBpm;
    }

    public Integer getPendingLokosShgBpm() {
        return pendingLokosShgBpm;
    }

    public void setPendingLokosShgBpm(Integer pendingLokosShgBpm) {
        this.pendingLokosShgBpm = pendingLokosShgBpm;
    }

    public Integer getRejectedLokosShgBpm() {
        return rejectedLokosShgBpm;
    }

    public void setRejectedLokosShgBpm(Integer rejectedLokosShgBpm) {
        this.rejectedLokosShgBpm = rejectedLokosShgBpm;
    }

    public Integer getNicMem() {
        return nicMem;
    }

    public void setNicMem(Integer nicMem) {
        this.nicMem = nicMem;
    }

    public Integer getApproveNicMem() {
        return approveNicMem;
    }

    public void setApproveNicMem(Integer approveNicMem) {
        this.approveNicMem = approveNicMem;
    }

    public Integer getPendingNicMem() {
        return pendingNicMem;
    }

    public void setPendingNicMem(Integer pendingNicMem) {
        this.pendingNicMem = pendingNicMem;
    }

    public Integer getRejectedNicMem() {
        return rejectedNicMem;
    }

    public void setRejectedNicMem(Integer rejectedNicMem) {
        this.rejectedNicMem = rejectedNicMem;
    }

    public Integer getLokosMem() {
        return lokosMem;
    }

    public void setLokosMem(Integer lokosMem) {
        this.lokosMem = lokosMem;
    }

    public Integer getApproveLokosMem() {
        return approveLokosMem;
    }

    public void setApproveLokosMem(Integer approveLokosMem) {
        this.approveLokosMem = approveLokosMem;
    }

    public Integer getPendingLokosMem() {
        return pendingLokosMem;
    }

    public void setPendingLokosMem(Integer pendingLokosMem) {
        this.pendingLokosMem = pendingLokosMem;
    }

    public Integer getRejectedLokosMem() {
        return rejectedLokosMem;
    }

    public void setRejectedLokosMem(Integer rejectedLokosMem) {
        this.rejectedLokosMem = rejectedLokosMem;
    }

    public Integer getNrlmPromotedBy() {
        return nrlmPromotedBy;
    }

    public void setNrlmPromotedBy(Integer nrlmPromotedBy) {
        this.nrlmPromotedBy = nrlmPromotedBy;
    }

    public Integer getStateProjectPromotedBy() {
        return stateProjectPromotedBy;
    }

    public void setStateProjectPromotedBy(Integer stateProjectPromotedBy) {
        this.stateProjectPromotedBy = stateProjectPromotedBy;
    }

    public Integer getNgoPromotedBy() {
        return ngoPromotedBy;
    }

    public void setNgoPromotedBy(Integer ngoPromotedBy) {
        this.ngoPromotedBy = ngoPromotedBy;
    }

    public Integer getSgsyPromotedBy() {
        return sgsyPromotedBy;
    }

    public void setSgsyPromotedBy(Integer sgsyPromotedBy) {
        this.sgsyPromotedBy = sgsyPromotedBy;
    }

    public Integer getOtherPromotedBy() {
        return otherPromotedBy;
    }

    public void setOtherPromotedBy(Integer otherPromotedBy) {
        this.otherPromotedBy = otherPromotedBy;
    }

    public Integer getStateProjectCoopted() {
        return stateProjectCoopted;
    }

    public void setStateProjectCoopted(Integer stateProjectCoopted) {
        this.stateProjectCoopted = stateProjectCoopted;
    }

    public Integer getStateProjectNoncoopted() {
        return stateProjectNoncoopted;
    }

    public void setStateProjectNoncoopted(Integer stateProjectNoncoopted) {
        this.stateProjectNoncoopted = stateProjectNoncoopted;
    }

    public Integer getNgoCoopted() {
        return ngoCoopted;
    }

    public void setNgoCoopted(Integer ngoCoopted) {
        this.ngoCoopted = ngoCoopted;
    }

    public Integer getNgoNoncoopted() {
        return ngoNoncoopted;
    }

    public void setNgoNoncoopted(Integer ngoNoncoopted) {
        this.ngoNoncoopted = ngoNoncoopted;
    }

    public Integer getOtherCoopted() {
        return otherCoopted;
    }

    public void setOtherCoopted(Integer otherCoopted) {
        this.otherCoopted = otherCoopted;
    }

    public Integer getOtherNoncoopted() {
        return otherNoncoopted;
    }

    public void setOtherNoncoopted(Integer otherNoncoopted) {
        this.otherNoncoopted = otherNoncoopted;
    }

    public Integer getAllShgwithBankAccount() {
        return allShgwithBankAccount;
    }

    public void setAllShgwithBankAccount(Integer allShgwithBankAccount) {
        this.allShgwithBankAccount = allShgwithBankAccount;
    }

    public Integer getAllShgwithBankAccountMem() {
        return allShgwithBankAccountMem;
    }

    public void setAllShgwithBankAccountMem(Integer allShgwithBankAccountMem) {
        this.allShgwithBankAccountMem = allShgwithBankAccountMem;
    }

    public Integer getAllShgWithoutMig() {
        return allShgWithoutMig;
    }

    public void setAllShgWithoutMig(Integer allShgWithoutMig) {
        this.allShgWithoutMig = allShgWithoutMig;
    }

    public Integer getAllMemWithoutMig() {
        return allMemWithoutMig;
    }

    public void setAllMemWithoutMig(Integer allMemWithoutMig) {
        this.allMemWithoutMig = allMemWithoutMig;
    }

    public Integer getAllShgWithoutLokos() {
        return allShgWithoutLokos;
    }

    public void setAllShgWithoutLokos(Integer allShgWithoutLokos) {
        this.allShgWithoutLokos = allShgWithoutLokos;
    }

    public Integer getAllMemWithoutLokos() {
        return allMemWithoutLokos;
    }

    public void setAllMemWithoutLokos(Integer allMemWithoutLokos) {
        this.allMemWithoutLokos = allMemWithoutLokos;
    }

    public Integer getAllShgActive() {
        return allShgActive;
    }

    public void setAllShgActive(Integer allShgActive) {
        this.allShgActive = allShgActive;
    }

    public Integer getAllMemActive() {
        return allMemActive;
    }

    public void setAllMemActive(Integer allMemActive) {
        this.allMemActive = allMemActive;
    }

    public Integer getAllShgInactiveMig() {
        return allShgInactiveMig;
    }

    public void setAllShgInactiveMig(Integer allShgInactiveMig) {
        this.allShgInactiveMig = allShgInactiveMig;
    }

    public Integer getAllMemInactiveMig() {
        return allMemInactiveMig;
    }

    public void setAllMemInactiveMig(Integer allMemInactiveMig) {
        this.allMemInactiveMig = allMemInactiveMig;
    }

    public Integer getAllShgInactiveLokos() {
        return allShgInactiveLokos;
    }

    public void setAllShgInactiveLokos(Integer allShgInactiveLokos) {
        this.allShgInactiveLokos = allShgInactiveLokos;
    }

    public Integer getAllMemInactiveLokos() {
        return allMemInactiveLokos;
    }

    public void setAllMemInactiveLokos(Integer allMemInactiveLokos) {
        this.allMemInactiveLokos = allMemInactiveLokos;
    }

    public Integer getCompleteShgNicLokos() {
        return completeShgNicLokos;
    }

    public void setCompleteShgNicLokos(Integer completeShgNicLokos) {
        this.completeShgNicLokos = completeShgNicLokos;
    }

    public Integer getCompleteMemNicLokos() {
        return completeMemNicLokos;
    }

    public void setCompleteMemNicLokos(Integer completeMemNicLokos) {
        this.completeMemNicLokos = completeMemNicLokos;
    }

    public Integer getIncompleteShgDue5MemNic() {
        return incompleteShgDue5MemNic;
    }

    public void setIncompleteShgDue5MemNic(Integer incompleteShgDue5MemNic) {
        this.incompleteShgDue5MemNic = incompleteShgDue5MemNic;
    }

    public Integer getIncompleteMemDue5MemNic() {
        return incompleteMemDue5MemNic;
    }

    public void setIncompleteMemDue5MemNic(Integer incompleteMemDue5MemNic) {
        this.incompleteMemDue5MemNic = incompleteMemDue5MemNic;
    }

    public Integer getIncompleteShgDue5MemLok() {
        return incompleteShgDue5MemLok;
    }

    public void setIncompleteShgDue5MemLok(Integer incompleteShgDue5MemLok) {
        this.incompleteShgDue5MemLok = incompleteShgDue5MemLok;
    }

    public Integer getIncompleteMemDue5MemLok() {
        return incompleteMemDue5MemLok;
    }

    public void setIncompleteMemDue5MemLok(Integer incompleteMemDue5MemLok) {
        this.incompleteMemDue5MemLok = incompleteMemDue5MemLok;
    }

    public Integer getStateProjectReviwed() {
        return stateProjectReviwed;
    }

    public void setStateProjectReviwed(Integer stateProjectReviwed) {
        this.stateProjectReviwed = stateProjectReviwed;
    }

    public Integer getNgoNoncooptedReviwed() {
        return ngoNoncooptedReviwed;
    }

    public void setNgoNoncooptedReviwed(Integer ngoNoncooptedReviwed) {
        this.ngoNoncooptedReviwed = ngoNoncooptedReviwed;
    }

    public Integer getOtherReviwed() {
        return otherReviwed;
    }

    public void setOtherReviwed(Integer otherReviwed) {
        this.otherReviwed = otherReviwed;
    }

    public Integer getAllmemCount() {
        return allmemCount;
    }

    public void setAllmemCount(Integer allmemCount) {
        this.allmemCount = allmemCount;
    }

    public Integer getAllShgCount() {
        return allShgCount;
    }

    public void setAllShgCount(Integer allShgCount) {
        this.allShgCount = allShgCount;
    }

    public Integer getAllShgFormedMonth() {
        return allShgFormedMonth;
    }

    public void setAllShgFormedMonth(Integer allShgFormedMonth) {
        this.allShgFormedMonth = allShgFormedMonth;
    }

    public Integer getAllShgMembersJoinedMonth() {
        return allShgMembersJoinedMonth;
    }

    public void setAllShgMembersJoinedMonth(Integer allShgMembersJoinedMonth) {
        this.allShgMembersJoinedMonth = allShgMembersJoinedMonth;
    }

    public Integer getTotalShgMem() {
        return totalShgMem;
    }

    public void setTotalShgMem(Integer totalShgMem) {
        this.totalShgMem = totalShgMem;
    }

    public Integer getVoMig() {
        return voMig;
    }

    public void setVoMig(Integer voMig) {
        this.voMig = voMig;
    }

    public Integer getVoShgMig() {
        return voShgMig;
    }

    public void setVoShgMig(Integer voShgMig) {
        this.voShgMig = voShgMig;
    }

    public Integer getPendingNicVoBpm() {
        return pendingNicVoBpm;
    }

    public void setPendingNicVoBpm(Integer pendingNicVoBpm) {
        this.pendingNicVoBpm = pendingNicVoBpm;
    }

    public Integer getApprovedNicVoBpm() {
        return approvedNicVoBpm;
    }

    public void setApprovedNicVoBpm(Integer approvedNicVoBpm) {
        this.approvedNicVoBpm = approvedNicVoBpm;
    }

    public Integer getRejectedNicVoBpm() {
        return rejectedNicVoBpm;
    }

    public void setRejectedNicVoBpm(Integer rejectedNicVoBpm) {
        this.rejectedNicVoBpm = rejectedNicVoBpm;
    }

    public Integer getVoLokos() {
        return voLokos;
    }

    public void setVoLokos(Integer voLokos) {
        this.voLokos = voLokos;
    }

    public Integer getVoShgLokos() {
        return voShgLokos;
    }

    public void setVoShgLokos(Integer voShgLokos) {
        this.voShgLokos = voShgLokos;
    }

    public Integer getPendingLokVoBpm() {
        return pendingLokVoBpm;
    }

    public void setPendingLokVoBpm(Integer pendingLokVoBpm) {
        this.pendingLokVoBpm = pendingLokVoBpm;
    }

    public Integer getApprovedLokVoBpm() {
        return approvedLokVoBpm;
    }

    public void setApprovedLokVoBpm(Integer approvedLokVoBpm) {
        this.approvedLokVoBpm = approvedLokVoBpm;
    }

    public Integer getRejectedLokVoBpm() {
        return rejectedLokVoBpm;
    }

    public void setRejectedLokVoBpm(Integer rejectedLokVoBpm) {
        this.rejectedLokVoBpm = rejectedLokVoBpm;
    }

    public Integer getClfMig() {
        return clfMig;
    }

    public void setClfMig(Integer clfMig) {
        this.clfMig = clfMig;
    }

    public Integer getClfVoMig() {
        return clfVoMig;
    }

    public void setClfVoMig(Integer clfVoMig) {
        this.clfVoMig = clfVoMig;
    }

    public Integer getClfShgMig() {
        return clfShgMig;
    }

    public void setClfShgMig(Integer clfShgMig) {
        this.clfShgMig = clfShgMig;
    }

    public Integer getPendingNicClfBpm() {
        return pendingNicClfBpm;
    }

    public void setPendingNicClfBpm(Integer pendingNicClfBpm) {
        this.pendingNicClfBpm = pendingNicClfBpm;
    }

    public Integer getApprovedNicClfBpm() {
        return approvedNicClfBpm;
    }

    public void setApprovedNicClfBpm(Integer approvedNicClfBpm) {
        this.approvedNicClfBpm = approvedNicClfBpm;
    }

    public Integer getRejectedNicClfBpm() {
        return rejectedNicClfBpm;
    }

    public void setRejectedNicClfBpm(Integer rejectedNicClfBpm) {
        this.rejectedNicClfBpm = rejectedNicClfBpm;
    }

    public Integer getClfLokos() {
        return clfLokos;
    }

    public void setClfLokos(Integer clfLokos) {
        this.clfLokos = clfLokos;
    }

    public Integer getClfVoLokos() {
        return clfVoLokos;
    }

    public void setClfVoLokos(Integer clfVoLokos) {
        this.clfVoLokos = clfVoLokos;
    }

    public Integer getClfShgLokos() {
        return clfShgLokos;
    }

    public void setClfShgLokos(Integer clfShgLokos) {
        this.clfShgLokos = clfShgLokos;
    }

    public Integer getPendingLokClfBpm() {
        return pendingLokClfBpm;
    }

    public void setPendingLokClfBpm(Integer pendingLokClfBpm) {
        this.pendingLokClfBpm = pendingLokClfBpm;
    }

    public Integer getApprovedLokClfBpm() {
        return approvedLokClfBpm;
    }

    public void setApprovedLokClfBpm(Integer approvedLokClfBpm) {
        this.approvedLokClfBpm = approvedLokClfBpm;
    }

    public Integer getRejectedLokClfBpm() {
        return rejectedLokClfBpm;
    }

    public void setRejectedLokClfBpm(Integer rejectedLokClfBpm) {
        this.rejectedLokClfBpm = rejectedLokClfBpm;
    }

    public Integer getPendingNicVoshgBpm() {
        return pendingNicVoshgBpm;
    }

    public void setPendingNicVoshgBpm(Integer pendingNicVoshgBpm) {
        this.pendingNicVoshgBpm = pendingNicVoshgBpm;
    }

    public Integer getApprovedNicVoshgBpm() {
        return approvedNicVoshgBpm;
    }

    public void setApprovedNicVoshgBpm(Integer approvedNicVoshgBpm) {
        this.approvedNicVoshgBpm = approvedNicVoshgBpm;
    }

    public Integer getRejectedNicVoshgBpm() {
        return rejectedNicVoshgBpm;
    }

    public void setRejectedNicVoshgBpm(Integer rejectedNicVoshgBpm) {
        this.rejectedNicVoshgBpm = rejectedNicVoshgBpm;
    }

    public Integer getPendingLokVoshgBpm() {
        return pendingLokVoshgBpm;
    }

    public void setPendingLokVoshgBpm(Integer pendingLokVoshgBpm) {
        this.pendingLokVoshgBpm = pendingLokVoshgBpm;
    }

    public Integer getApprovedLokVoshgBpm() {
        return approvedLokVoshgBpm;
    }

    public void setApprovedLokVoshgBpm(Integer approvedLokVoshgBpm) {
        this.approvedLokVoshgBpm = approvedLokVoshgBpm;
    }

    public Integer getRejectedLokVoshgBpm() {
        return rejectedLokVoshgBpm;
    }

    public void setRejectedLokVoshgBpm(Integer rejectedLokVoshgBpm) {
        this.rejectedLokVoshgBpm = rejectedLokVoshgBpm;
    }

    public Integer getPendingNicClfVoBpm() {
        return pendingNicClfVoBpm;
    }

    public void setPendingNicClfVoBpm(Integer pendingNicClfVoBpm) {
        this.pendingNicClfVoBpm = pendingNicClfVoBpm;
    }

    public Integer getApprovedNicClfVoBpm() {
        return approvedNicClfVoBpm;
    }

    public void setApprovedNicClfVoBpm(Integer approvedNicClfVoBpm) {
        this.approvedNicClfVoBpm = approvedNicClfVoBpm;
    }

    public Integer getRejectedNicClfVoBpm() {
        return rejectedNicClfVoBpm;
    }

    public void setRejectedNicClfVoBpm(Integer rejectedNicClfVoBpm) {
        this.rejectedNicClfVoBpm = rejectedNicClfVoBpm;
    }

    public Integer getPendingNicClfVoShgBpm() {
        return pendingNicClfVoShgBpm;
    }

    public void setPendingNicClfVoShgBpm(Integer pendingNicClfVoShgBpm) {
        this.pendingNicClfVoShgBpm = pendingNicClfVoShgBpm;
    }

    public Integer getApprovedNicClfVoShgBpm() {
        return approvedNicClfVoShgBpm;
    }

    public void setApprovedNicClfVoShgBpm(Integer approvedNicClfVoShgBpm) {
        this.approvedNicClfVoShgBpm = approvedNicClfVoShgBpm;
    }

    public Integer getRejectedNicClfVoShgBpm() {
        return rejectedNicClfVoShgBpm;
    }

    public void setRejectedNicClfVoShgBpm(Integer rejectedNicClfVoShgBpm) {
        this.rejectedNicClfVoShgBpm = rejectedNicClfVoShgBpm;
    }

    public Integer getPendingLokClfVoBpm() {
        return pendingLokClfVoBpm;
    }

    public void setPendingLokClfVoBpm(Integer pendingLokClfVoBpm) {
        this.pendingLokClfVoBpm = pendingLokClfVoBpm;
    }

    public Integer getApprovedLokClfVoBpm() {
        return approvedLokClfVoBpm;
    }

    public void setApprovedLokClfVoBpm(Integer approvedLokClfVoBpm) {
        this.approvedLokClfVoBpm = approvedLokClfVoBpm;
    }

    public Integer getRejectedLokClfVoBpm() {
        return rejectedLokClfVoBpm;
    }

    public void setRejectedLokClfVoBpm(Integer rejectedLokClfVoBpm) {
        this.rejectedLokClfVoBpm = rejectedLokClfVoBpm;
    }

    public Integer getPendingLokClfVoShgBpm() {
        return pendingLokClfVoShgBpm;
    }

    public void setPendingLokClfVoShgBpm(Integer pendingLokClfVoShgBpm) {
        this.pendingLokClfVoShgBpm = pendingLokClfVoShgBpm;
    }

    public Integer getApprovedLokClfVoShgBpm() {
        return approvedLokClfVoShgBpm;
    }

    public void setApprovedLokClfVoShgBpm(Integer approvedLokClfVoShgBpm) {
        this.approvedLokClfVoShgBpm = approvedLokClfVoShgBpm;
    }

    public Integer getRejectedLokClfVoShgBpm() {
        return rejectedLokClfVoShgBpm;
    }

    public void setRejectedLokClfVoShgBpm(Integer rejectedLokClfVoShgBpm) {
        this.rejectedLokClfVoShgBpm = rejectedLokClfVoShgBpm;
    }

    public Integer getMemManrega() {
        return memManrega;
    }

    public void setMemManrega(Integer memManrega) {
        this.memManrega = memManrega;
    }

    public Integer getMemPmay() {
        return memPmay;
    }

    public void setMemPmay(Integer memPmay) {
        this.memPmay = memPmay;
    }

    public Integer getMemSecc() {
        return memSecc;
    }

    public void setMemSecc(Integer memSecc) {
        this.memSecc = memSecc;
    }

    public Integer getVoUnderNrlm() {
        return voUnderNrlm;
    }

    public void setVoUnderNrlm(Integer voUnderNrlm) {
        this.voUnderNrlm = voUnderNrlm;
    }

    public Integer getVoShgUnderNrlm() {
        return voShgUnderNrlm;
    }

    public void setVoShgUnderNrlm(Integer voShgUnderNrlm) {
        this.voShgUnderNrlm = voShgUnderNrlm;
    }

    public Integer getVoUnderStateProject() {
        return voUnderStateProject;
    }

    public void setVoUnderStateProject(Integer voUnderStateProject) {
        this.voUnderStateProject = voUnderStateProject;
    }

    public Integer getVoShgUnderStateProject() {
        return voShgUnderStateProject;
    }

    public void setVoShgUnderStateProject(Integer voShgUnderStateProject) {
        this.voShgUnderStateProject = voShgUnderStateProject;
    }

    public Integer getClfNrlm() {
        return clfNrlm;
    }

    public void setClfNrlm(Integer clfNrlm) {
        this.clfNrlm = clfNrlm;
    }

    public Integer getClfVoNrlm() {
        return clfVoNrlm;
    }

    public void setClfVoNrlm(Integer clfVoNrlm) {
        this.clfVoNrlm = clfVoNrlm;
    }

    public Integer getClfVoShgNrlm() {
        return clfVoShgNrlm;
    }

    public void setClfVoShgNrlm(Integer clfVoShgNrlm) {
        this.clfVoShgNrlm = clfVoShgNrlm;
    }

    public Integer getClfStateProject() {
        return clfStateProject;
    }

    public void setClfStateProject(Integer clfStateProject) {
        this.clfStateProject = clfStateProject;
    }

    public Integer getClfVoStateProject() {
        return clfVoStateProject;
    }

    public void setClfVoStateProject(Integer clfVoStateProject) {
        this.clfVoStateProject = clfVoStateProject;
    }

    public Integer getClfVoShgStateProject() {
        return clfVoShgStateProject;
    }

    public void setClfVoShgStateProject(Integer clfVoShgStateProject) {
        this.clfVoShgStateProject = clfVoShgStateProject;
    }

    public Integer getIncompleteVoDue5ShgMig() {
        return incompleteVoDue5ShgMig;
    }

    public void setIncompleteVoDue5ShgMig(Integer incompleteVoDue5ShgMig) {
        this.incompleteVoDue5ShgMig = incompleteVoDue5ShgMig;
    }

    public Integer getIncompleteVoShgDue5ShgMig() {
        return incompleteVoShgDue5ShgMig;
    }

    public void setIncompleteVoShgDue5ShgMig(Integer incompleteVoShgDue5ShgMig) {
        this.incompleteVoShgDue5ShgMig = incompleteVoShgDue5ShgMig;
    }

    public Integer getIncompleteVoDue5ShgLokos() {
        return incompleteVoDue5ShgLokos;
    }

    public void setIncompleteVoDue5ShgLokos(Integer incompleteVoDue5ShgLokos) {
        this.incompleteVoDue5ShgLokos = incompleteVoDue5ShgLokos;
    }

    public Integer getIncompleteVoShgDue5ShgLokos() {
        return incompleteVoShgDue5ShgLokos;
    }

    public void setIncompleteVoShgDue5ShgLokos(Integer incompleteVoShgDue5ShgLokos) {
        this.incompleteVoShgDue5ShgLokos = incompleteVoShgDue5ShgLokos;
    }

    public Integer getAllVoInactiveMig() {
        return allVoInactiveMig;
    }

    public void setAllVoInactiveMig(Integer allVoInactiveMig) {
        this.allVoInactiveMig = allVoInactiveMig;
    }

    public Integer getAllVoShgInactiveMig() {
        return allVoShgInactiveMig;
    }

    public void setAllVoShgInactiveMig(Integer allVoShgInactiveMig) {
        this.allVoShgInactiveMig = allVoShgInactiveMig;
    }

    public Integer getAllVoInactiveLokos() {
        return allVoInactiveLokos;
    }

    public void setAllVoInactiveLokos(Integer allVoInactiveLokos) {
        this.allVoInactiveLokos = allVoInactiveLokos;
    }

    public Integer getAllVoShgInactiveLokos() {
        return allVoShgInactiveLokos;
    }

    public void setAllVoShgInactiveLokos(Integer allVoShgInactiveLokos) {
        this.allVoShgInactiveLokos = allVoShgInactiveLokos;
    }

    public Integer getVoMigWithoutBank() {
        return voMigWithoutBank;
    }

    public void setVoMigWithoutBank(Integer voMigWithoutBank) {
        this.voMigWithoutBank = voMigWithoutBank;
    }

    public Integer getVoShgMigWithoutBank() {
        return voShgMigWithoutBank;
    }

    public void setVoShgMigWithoutBank(Integer voShgMigWithoutBank) {
        this.voShgMigWithoutBank = voShgMigWithoutBank;
    }

    public Integer getVoLokosWithoutBank() {
        return voLokosWithoutBank;
    }

    public void setVoLokosWithoutBank(Integer voLokosWithoutBank) {
        this.voLokosWithoutBank = voLokosWithoutBank;
    }

    public Integer getVoShgLokosWithoutBank() {
        return voShgLokosWithoutBank;
    }

    public void setVoShgLokosWithoutBank(Integer voShgLokosWithoutBank) {
        this.voShgLokosWithoutBank = voShgLokosWithoutBank;
    }

    public Integer getIncompleteClfDue3VoMig() {
        return incompleteClfDue3VoMig;
    }

    public void setIncompleteClfDue3VoMig(Integer incompleteClfDue3VoMig) {
        this.incompleteClfDue3VoMig = incompleteClfDue3VoMig;
    }

    public Integer getIncompleteClfVoDue3VoMig() {
        return incompleteClfVoDue3VoMig;
    }

    public void setIncompleteClfVoDue3VoMig(Integer incompleteClfVoDue3VoMig) {
        this.incompleteClfVoDue3VoMig = incompleteClfVoDue3VoMig;
    }

    public Integer getIncompleteClfShgDue3VoMig() {
        return incompleteClfShgDue3VoMig;
    }

    public void setIncompleteClfShgDue3VoMig(Integer incompleteClfShgDue3VoMig) {
        this.incompleteClfShgDue3VoMig = incompleteClfShgDue3VoMig;
    }

    public Integer getIncompleteClfDue3VoLokos() {
        return incompleteClfDue3VoLokos;
    }

    public void setIncompleteClfDue3VoLokos(Integer incompleteClfDue3VoLokos) {
        this.incompleteClfDue3VoLokos = incompleteClfDue3VoLokos;
    }

    public Integer getIncompleteClfVoDue3VoLokos() {
        return incompleteClfVoDue3VoLokos;
    }

    public void setIncompleteClfVoDue3VoLokos(Integer incompleteClfVoDue3VoLokos) {
        this.incompleteClfVoDue3VoLokos = incompleteClfVoDue3VoLokos;
    }

    public Integer getIncompleteClfShgDue3VoLokos() {
        return incompleteClfShgDue3VoLokos;
    }

    public void setIncompleteClfShgDue3VoLokos(Integer incompleteClfShgDue3VoLokos) {
        this.incompleteClfShgDue3VoLokos = incompleteClfShgDue3VoLokos;
    }

    public Integer getAllIncClfMig() {
        return allIncClfMig;
    }

    public void setAllIncClfMig(Integer allIncClfMig) {
        this.allIncClfMig = allIncClfMig;
    }

    public Integer getAllIncClfVoMig() {
        return allIncClfVoMig;
    }

    public void setAllIncClfVoMig(Integer allIncClfVoMig) {
        this.allIncClfVoMig = allIncClfVoMig;
    }

    public Integer getAllIncClfShgMig() {
        return allIncClfShgMig;
    }

    public void setAllIncClfShgMig(Integer allIncClfShgMig) {
        this.allIncClfShgMig = allIncClfShgMig;
    }

    public Integer getAllIncClfLokos() {
        return allIncClfLokos;
    }

    public void setAllIncClfLokos(Integer allIncClfLokos) {
        this.allIncClfLokos = allIncClfLokos;
    }

    public Integer getAllIncClfVoLokos() {
        return allIncClfVoLokos;
    }

    public void setAllIncClfVoLokos(Integer allIncClfVoLokos) {
        this.allIncClfVoLokos = allIncClfVoLokos;
    }

    public Integer getAllIncClfShgLokos() {
        return allIncClfShgLokos;
    }

    public void setAllIncClfShgLokos(Integer allIncClfShgLokos) {
        this.allIncClfShgLokos = allIncClfShgLokos;
    }

    public Integer getClfMigWithoutBank() {
        return clfMigWithoutBank;
    }

    public void setClfMigWithoutBank(Integer clfMigWithoutBank) {
        this.clfMigWithoutBank = clfMigWithoutBank;
    }

    public Integer getClfVoMigWithoutBank() {
        return clfVoMigWithoutBank;
    }

    public void setClfVoMigWithoutBank(Integer clfVoMigWithoutBank) {
        this.clfVoMigWithoutBank = clfVoMigWithoutBank;
    }

    public Integer getClfShgMigWithoutBank() {
        return clfShgMigWithoutBank;
    }

    public void setClfShgMigWithoutBank(Integer clfShgMigWithoutBank) {
        this.clfShgMigWithoutBank = clfShgMigWithoutBank;
    }

    public Integer getClfLokosWithoutBank() {
        return clfLokosWithoutBank;
    }

    public void setClfLokosWithoutBank(Integer clfLokosWithoutBank) {
        this.clfLokosWithoutBank = clfLokosWithoutBank;
    }

    public Integer getClfVoLokosWithoutBank() {
        return clfVoLokosWithoutBank;
    }

    public void setClfVoLokosWithoutBank(Integer clfVoLokosWithoutBank) {
        this.clfVoLokosWithoutBank = clfVoLokosWithoutBank;
    }

    public Integer getClfShgLokosWithoutBank() {
        return clfShgLokosWithoutBank;
    }

    public void setClfShgLokosWithoutBank(Integer clfShgLokosWithoutBank) {
        this.clfShgLokosWithoutBank = clfShgLokosWithoutBank;
    }

    public Integer getMemAge18() {
        return memAge18;
    }

    public void setMemAge18(Integer memAge18) {
        this.memAge18 = memAge18;
    }

    public Integer getMemAge18to25() {
        return memAge18to25;
    }

    public void setMemAge18to25(Integer memAge18to25) {
        this.memAge18to25 = memAge18to25;
    }

    public Integer getMemAge26to40() {
        return memAge26to40;
    }

    public void setMemAge26to40(Integer memAge26to40) {
        this.memAge26to40 = memAge26to40;
    }

    public Integer getMemAge41to50() {
        return memAge41to50;
    }

    public void setMemAge41to50(Integer memAge41to50) {
        this.memAge41to50 = memAge41to50;
    }

    public Integer getMenAge51to60() {
        return menAge51to60;
    }

    public void setMenAge51to60(Integer menAge51to60) {
        this.menAge51to60 = menAge51to60;
    }

    public Integer getMemAge61to70() {
        return memAge61to70;
    }

    public void setMemAge61to70(Integer memAge61to70) {
        this.memAge61to70 = memAge61to70;
    }

    public Integer getMemAge70() {
        return memAge70;
    }

    public void setMemAge70(Integer memAge70) {
        this.memAge70 = memAge70;
    }

    public Integer getMemAgeNull() {
        return memAgeNull;
    }

    public void setMemAgeNull(Integer memAgeNull) {
        this.memAgeNull = memAgeNull;
    }

    public Integer getTotalBKActive() {
        return totalBKActive;
    }

    public void setTotalBKActive(Integer totalBKActive) {
        this.totalBKActive = totalBKActive;
    }

    public Integer geteBKAssigedtoShgActive() {
        return eBKAssigedtoShgActive;
    }

    public void seteBKAssigedtoShgActive(Integer eBKAssigedtoShgActive) {
        this.eBKAssigedtoShgActive = eBKAssigedtoShgActive;
    }

    public Integer getShgMappedWithBKActive() {
        return shgMappedWithBKActive;
    }

    public void setShgMappedWithBKActive(Integer shgMappedWithBKActive) {
        this.shgMappedWithBKActive = shgMappedWithBKActive;
    }

    public Integer getTotalBKInactive() {
        return totalBKInactive;
    }

    public void setTotalBKInactive(Integer totalBKInactive) {
        this.totalBKInactive = totalBKInactive;
    }

    public Integer geteBKAssigetoSHGInactive() {
        return eBKAssigetoSHGInactive;
    }

    public void seteBKAssigetoSHGInactive(Integer eBKAssigetoSHGInactive) {
        this.eBKAssigetoSHGInactive = eBKAssigetoSHGInactive;
    }

    public Integer getShgMappedWithBKInactive() {
        return shgMappedWithBKInactive;
    }

    public void setShgMappedWithBKInactive(Integer shgMappedWithBKInactive) {
        this.shgMappedWithBKInactive = shgMappedWithBKInactive;
    }
}
