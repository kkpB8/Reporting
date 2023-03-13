package org.apache.fineract.cn.reporting.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class TblSummaryResponse {
    private String geographicalFlag;
    private String stateId;
    private String districtId;
    private String blockId;
    private String panchayatId;
    private String villageId;
    private String stateName;
    private String districtName;
    private String blockName;
    private String panchayatName;
    private String villageName;

    public String getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(String geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(String panchayatId) {
        this.panchayatId = panchayatId;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
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

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getTotalDistrict() {
        return totalDistrict;
    }

    public void setTotalDistrict(Integer totalDistrict) {
        this.totalDistrict = totalDistrict;
    }

    public Integer getTotalBlock() {
        return totalBlock;
    }

    public void setTotalBlock(Integer totalBlock) {
        this.totalBlock = totalBlock;
    }

    public Integer getTotalVillage() {
        return totalVillage;
    }

    public void setTotalVillage(Integer totalVillage) {
        this.totalVillage = totalVillage;
    }

    public Integer getTotalPanchayat() {
        return totalPanchayat;
    }

    public void setTotalPanchayat(Integer totalPanchayat) {
        this.totalPanchayat = totalPanchayat;
    }

    public Integer getCoverageDistrict() {
        return coverageDistrict;
    }

    public void setCoverageDistrict(Integer coverageDistrict) {
        this.coverageDistrict = coverageDistrict;
    }

    public Integer getCoverageBlock() {
        return coverageBlock;
    }

    public void setCoverageBlock(Integer coverageBlock) {
        this.coverageBlock = coverageBlock;
    }

    public Integer getCoverageVillage() {
        return coverageVillage;
    }

    public void setCoverageVillage(Integer coverageVillage) {
        this.coverageVillage = coverageVillage;
    }

    public Integer getCoveragePanchayat() {
        return coveragePanchayat;
    }

    public void setCoveragePanchayat(Integer coveragePanchayat) {
        this.coveragePanchayat = coveragePanchayat;
    }

    public Integer getPerDistrict() {
        return perDistrict;
    }

    public void setPerDistrict(Integer perDistrict) {
        this.perDistrict = perDistrict;
    }

    public Integer getPerBlock() {
        return perBlock;
    }

    public void setPerBlock(Integer perBlock) {
        this.perBlock = perBlock;
    }

    public Integer getPerPanchayat() {
        return perPanchayat;
    }

    public void setPerPanchayat(Integer perPanchayat) {
        this.perPanchayat = perPanchayat;
    }

    public Integer getPerVillage() {
        return perVillage;
    }

    public void setPerVillage(Integer perVillage) {
        this.perVillage = perVillage;
    }

    public Integer getApprovedShg() {
        return approvedShg;
    }

    public void setApprovedShg(Integer approvedShg) {
        this.approvedShg = approvedShg;
    }

    public Integer getInactiveShg() {
        return inactiveShg;
    }

    public void setInactiveShg(Integer inactiveShg) {
        this.inactiveShg = inactiveShg;
    }

    public Integer getInactiveShgMembers() {
        return inactiveShgMembers;
    }

    public void setInactiveShgMembers(Integer inactiveShgMembers) {
        this.inactiveShgMembers = inactiveShgMembers;
    }

    public Integer getApprovedVo() {
        return approvedVo;
    }

    public void setApprovedVo(Integer approvedVo) {
        this.approvedVo = approvedVo;
    }

    public Integer getInactiveVo() {
        return inactiveVo;
    }

    public void setInactiveVo(Integer inactiveVo) {
        this.inactiveVo = inactiveVo;
    }

    public Integer getApprovedClf() {
        return approvedClf;
    }

    public void setApprovedClf(Integer approvedClf) {
        this.approvedClf = approvedClf;
    }

    public Integer getInactiveClf() {
        return inactiveClf;
    }

    public void setInactiveClf(Integer inactiveClf) {
        this.inactiveClf = inactiveClf;
    }

    public Integer getNoVos() {
        return noVos;
    }

    public void setNoVos(Integer noVos) {
        this.noVos = noVos;
    }

    public Integer getBankLinkage() {
        return bankLinkage;
    }

    public void setBankLinkage(Integer bankLinkage) {
        this.bankLinkage = bankLinkage;
    }

    public Integer getAssesTver() {
        return assesTver;
    }

    public void setAssesTver(Integer assesTver) {
        this.assesTver = assesTver;
    }

    public Integer getLivliHoodProm() {
        return livliHoodProm;
    }

    public void setLivliHoodProm(Integer livliHoodProm) {
        this.livliHoodProm = livliHoodProm;
    }

    public Integer getMoniToring() {
        return moniToring;
    }

    public void setMoniToring(Integer moniToring) {
        this.moniToring = moniToring;
    }

    public Integer getSocialAction() {
        return socialAction;
    }

    public void setSocialAction(Integer socialAction) {
        this.socialAction = socialAction;
    }

    public Integer getSpeCial() {
        return speCial;
    }

    public void setSpeCial(Integer speCial) {
        this.speCial = speCial;
    }

    public Integer getToTal() {
        return toTal;
    }

    public void setToTal(Integer toTal) {
        this.toTal = toTal;
    }

    public Integer getTotalShg() {
        return totalShg;
    }

    public void setTotalShg(Integer totalShg) {
        this.totalShg = totalShg;
    }

    public Integer getTargetShgMembers() {
        return targetShgMembers;
    }

    public void setTargetShgMembers(Integer targetShgMembers) {
        this.targetShgMembers = targetShgMembers;
    }

    public Integer getTotalVo() {
        return totalVo;
    }

    public void setTotalVo(Integer totalVo) {
        this.totalVo = totalVo;
    }

    public Integer getTotalVoShg() {
        return totalVoShg;
    }

    public void setTotalVoShg(Integer totalVoShg) {
        this.totalVoShg = totalVoShg;
    }

    public Integer getTotalVoMembers() {
        return totalVoMembers;
    }

    public void setTotalVoMembers(Integer totalVoMembers) {
        this.totalVoMembers = totalVoMembers;
    }

    public Integer getTotalClf() {
        return totalClf;
    }

    public void setTotalClf(Integer totalClf) {
        this.totalClf = totalClf;
    }

    public Integer getTotalClfVo() {
        return totalClfVo;
    }

    public void setTotalClfVo(Integer totalClfVo) {
        this.totalClfVo = totalClfVo;
    }

    public Integer getTotalClfShg() {
        return totalClfShg;
    }

    public void setTotalClfShg(Integer totalClfShg) {
        this.totalClfShg = totalClfShg;
    }

    public Integer getTotalClfMembers() {
        return totalClfMembers;
    }

    public void setTotalClfMembers(Integer totalClfMembers) {
        this.totalClfMembers = totalClfMembers;
    }

    public Integer getNoClfs() {
        return noClfs;
    }

    public void setNoClfs(Integer noClfs) {
        this.noClfs = noClfs;
    }

    public Integer getBankLinkageClf() {
        return bankLinkageClf;
    }

    public void setBankLinkageClf(Integer bankLinkageClf) {
        this.bankLinkageClf = bankLinkageClf;
    }

    public Integer getAssesTverClf() {
        return assesTverClf;
    }

    public void setAssesTverClf(Integer assesTverClf) {
        this.assesTverClf = assesTverClf;
    }

    public Integer getLivliHoodPromClf() {
        return livliHoodPromClf;
    }

    public void setLivliHoodPromClf(Integer livliHoodPromClf) {
        this.livliHoodPromClf = livliHoodPromClf;
    }

    public Integer getMonitoringClf() {
        return monitoringClf;
    }

    public void setMonitoringClf(Integer monitoringClf) {
        this.monitoringClf = monitoringClf;
    }

    public Integer getSocialactionClf() {
        return socialactionClf;
    }

    public void setSocialactionClf(Integer socialactionClf) {
        this.socialactionClf = socialactionClf;
    }

    public Integer getSpecialClf() {
        return specialClf;
    }

    public void setSpecialClf(Integer specialClf) {
        this.specialClf = specialClf;
    }

    public Integer getClfTotal() {
        return clfTotal;
    }

    public void setClfTotal(Integer clfTotal) {
        this.clfTotal = clfTotal;
    }

    public Integer getTotalShgInit() {
        return totalShgInit;
    }

    public void setTotalShgInit(Integer totalShgInit) {
        this.totalShgInit = totalShgInit;
    }

    public Integer getTotalMembersInit() {
        return totalMembersInit;
    }

    public void setTotalMembersInit(Integer totalMembersInit) {
        this.totalMembersInit = totalMembersInit;
    }

    public Integer getCumlShg() {
        return cumlShg;
    }

    public void setCumlShg(Integer cumlShg) {
        this.cumlShg = cumlShg;
    }

    public Integer getCumlMember() {
        return cumlMember;
    }

    public void setCumlMember(Integer cumlMember) {
        this.cumlMember = cumlMember;
    }

    public Integer getNoofShgAge() {
        return noofShgAge;
    }

    public void setNoofShgAge(Integer noofShgAge) {
        this.noofShgAge = noofShgAge;
    }

    public Integer getThrShg() {
        return thrShg;
    }

    public void setThrShg(Integer thrShg) {
        this.thrShg = thrShg;
    }

    public Integer getSixShg() {
        return sixShg;
    }

    public void setSixShg(Integer sixShg) {
        this.sixShg = sixShg;
    }

    public Integer getNineShg() {
        return nineShg;
    }

    public void setNineShg(Integer nineShg) {
        this.nineShg = nineShg;
    }

    public Integer getOneShg() {
        return oneShg;
    }

    public void setOneShg(Integer oneShg) {
        this.oneShg = oneShg;
    }

    public Integer getMoreOneShg() {
        return moreOneShg;
    }

    public void setMoreOneShg(Integer moreOneShg) {
        this.moreOneShg = moreOneShg;
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

    public Integer getHouseHoldMobilized() {
        return houseHoldMobilized;
    }

    public void setHouseHoldMobilized(Integer houseHoldMobilized) {
        this.houseHoldMobilized = houseHoldMobilized;
    }

    private String yearMonth;
    private Integer totalDistrict;
    private Integer totalBlock;
    private Integer totalVillage;
    private Integer totalPanchayat;
    private Integer coverageDistrict;
    private Integer coverageBlock;
    private Integer coverageVillage;
    private Integer coveragePanchayat;
    private Integer perDistrict;
    private Integer perBlock;
    private Integer perPanchayat;
    private Integer perVillage;
    private Integer approvedShg;
    private Integer inactiveShg;
    private Integer inactiveShgMembers;
    private Integer approvedVo;
    private Integer inactiveVo;
    private Integer approvedClf;
    private Integer inactiveClf;
    private Integer noVos;
    private Integer bankLinkage;
    private Integer assesTver;
    private Integer livliHoodProm;
    private Integer moniToring;
    private Integer socialAction;
    private Integer speCial;
    private Integer toTal;
    private Integer totalShg;
    private Integer targetShgMembers;
    private Integer totalVo;
    private Integer totalVoShg;
    private Integer totalVoMembers;
    private Integer totalClf;
    private Integer totalClfVo;
    private Integer totalClfShg;
    private Integer totalClfMembers;
    private Integer noClfs;
    private Integer bankLinkageClf;
    private Integer assesTverClf;
    private Integer livliHoodPromClf;
    private Integer monitoringClf;
    private Integer socialactionClf;
    private Integer specialClf;
    private Integer clfTotal;
    private Integer totalShgInit;
    private Integer totalMembersInit;
    private Integer cumlShg;
    private Integer cumlMember;
    private Integer noofShgAge;
    private Integer thrShg;
    private Integer sixShg;
    private Integer nineShg;
    private Integer oneShg;
    private Integer moreOneShg;
    private Integer totalRuralHouseholds;
    private Integer targetRuralHouseholds;
    private  Integer houseHoldMobilized;
    private Integer noofShgLes;
    private Integer noofLeaders;

    public Integer getNoofShgLes() {
        return noofShgLes;
    }

    public void setNoofShgLes(Integer noofShgLes) {
        this.noofShgLes = noofShgLes;
    }

    public Integer getNoofLeaders() {
        return noofLeaders;
    }

    public void setNoofLeaders(Integer noofLeaders) {
        this.noofLeaders = noofLeaders;
    }

    public Integer getIlleTerate() {
        return illeTerate;
    }

    public void setIlleTerate(Integer illeTerate) {
        this.illeTerate = illeTerate;
    }

    public Integer getFunctionalLit() {
        return functionalLit;
    }

    public void setFunctionalLit(Integer functionalLit) {
        this.functionalLit = functionalLit;
    }

    public Integer getPrimaryUpto5() {
        return primaryUpto5;
    }

    public void setPrimaryUpto5(Integer primaryUpto5) {
        this.primaryUpto5 = primaryUpto5;
    }

    public Integer getMiddleUpto8() {
        return middleUpto8;
    }

    public void setMiddleUpto8(Integer middleUpto8) {
        this.middleUpto8 = middleUpto8;
    }

    public Integer getSrSec12() {
        return srSec12;
    }

    public void setSrSec12(Integer srSec12) {
        this.srSec12 = srSec12;
    }

    public Integer getVocTraining() {
        return vocTraining;
    }

    public void setVocTraining(Integer vocTraining) {
        this.vocTraining = vocTraining;
    }

    public Integer getoThers() {
        return oThers;
    }

    public void setoThers(Integer oThers) {
        this.oThers = oThers;
    }

    private Integer illeTerate;
    private Integer functionalLit;
    private Integer primaryUpto5;
    private Integer middleUpto8;
    private Integer srSec12;
    private Integer vocTraining;
    private Integer oThers;
    private Integer noofShgLa;
    private Integer noofLeadersLa;

    public Integer getNoofShgLa() {
        return noofShgLa;
    }

    public void setNoofShgLa(Integer noofShgLa) {
        this.noofShgLa = noofShgLa;
    }

    public Integer getNoofLeadersLa() {
        return noofLeadersLa;
    }

    public void setNoofLeadersLa(Integer noofLeadersLa) {
        this.noofLeadersLa = noofLeadersLa;
    }

    public Integer getAgriActivity() {
        return agriActivity;
    }

    public void setAgriActivity(Integer agriActivity) {
        this.agriActivity = agriActivity;
    }

    public Integer getLivestockFisheries() {
        return livestockFisheries;
    }

    public void setLivestockFisheries(Integer livestockFisheries) {
        this.livestockFisheries = livestockFisheries;
    }

    public Integer getNtFp() {
        return ntFp;
    }

    public void setNtFp(Integer ntFp) {
        this.ntFp = ntFp;
    }

    public Integer getNonFarm() {
        return nonFarm;
    }

    public void setNonFarm(Integer nonFarm) {
        this.nonFarm = nonFarm;
    }

    private Integer agriActivity;
    private Integer livestockFisheries;
    private Integer ntFp;
    private Integer nonFarm;
}