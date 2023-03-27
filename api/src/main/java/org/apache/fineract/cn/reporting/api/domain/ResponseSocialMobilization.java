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

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

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
    private Integer shgWithoutBankAccount;
    private Integer voWithBankAccount;
    private Integer voWithoutBankAccount;
    private Integer clfWithBankAccount;
    private Integer clfWithoutBankAccount;
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

    public Integer getShgOtherMonth() {
        return shgOtherMonth;
    }

    public void setShgOtherMonth(Integer shgOtherMonth) {
        this.shgOtherMonth = shgOtherMonth;
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

    public Integer getShgMemOtherMonth() {
        return shgMemOtherMonth;
    }

    public void setShgMemOtherMonth(Integer shgMemOtherMonth) {
        this.shgMemOtherMonth = shgMemOtherMonth;
    }

    private Integer shgOtherMonth;
    private Integer shgMemScMonth;
    private Integer shgMemStMonth;
    private Integer shgMemGenMonth;
    private Integer shgMemOtherMonth;
    public Integer getShgCount() {
        return shgCount;
    }

    public void setShgCount(Integer shgCount) {
        this.shgCount = shgCount;
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

    public Integer getShgWithoutBankAccount() {
        return shgWithoutBankAccount;
    }

    public void setShgWithoutBankAccount(Integer shgWithoutBankAccount) {
        this.shgWithoutBankAccount = shgWithoutBankAccount;
    }

    public Integer getVoWithBankAccount() {
        return voWithBankAccount;
    }

    public void setVoWithBankAccount(Integer voWithBankAccount) {
        this.voWithBankAccount = voWithBankAccount;
    }

    public Integer getVoWithoutBankAccount() {
        return voWithoutBankAccount;
    }

    public void setVoWithoutBankAccount(Integer voWithoutBankAccount) {
        this.voWithoutBankAccount = voWithoutBankAccount;
    }

    public Integer getClfWithBankAccount() {
        return clfWithBankAccount;
    }

    public void setClfWithBankAccount(Integer clfWithBankAccount) {
        this.clfWithBankAccount = clfWithBankAccount;
    }

    public Integer getClfWithoutBankAccount() {
        return clfWithoutBankAccount;
    }

    public void setClfWithoutBankAccount(Integer clfWithoutBankAccount) {
        this.clfWithoutBankAccount = clfWithoutBankAccount;
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
    public Integer getAgeBlock() {
        return ageBlock;
    }

    public void setAgeBlock(Integer ageBlock) {
        this.ageBlock = ageBlock;
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

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String  getPanchayatName() {
        return panchayatName;
    }

    public void setPanchayatName(String panchayatName) {
        this.panchayatName = panchayatName;
    }

}
