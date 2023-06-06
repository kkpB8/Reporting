package org.apache.fineract.cn.reporting.api.domain;

import javax.persistence.Column;
import java.math.BigInteger;

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
//    private Integer intBlock0to3;
//    private Integer intBlock3to6;
//    private Integer intBlock6to10;
//    private Integer intBlockMore10;
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
//    private Integer intBlockZero3sat;
//    private Integer intBlockThree6Sat;
//    private Integer intBlockSix10Sat;
//    private Integer intBlockMore10Sat;

//    public Integer getIntBlockZero3sat() {
//        return intBlockZero3sat;
//    }
//
//    public void setIntBlockZero3sat(Integer intBlockZero3sat) {
//        this.intBlockZero3sat = intBlockZero3sat;
//    }
//
//    public Integer getIntBlockThree6Sat() {
//        return intBlockThree6Sat;
//    }
//
//    public void setIntBlockThree6Sat(Integer intBlockThree6Sat) {
//        this.intBlockThree6Sat = intBlockThree6Sat;
//    }
//
//    public Integer getIntBlockSix10Sat() {
//        return intBlockSix10Sat;
//    }
//
//    public void setIntBlockSix10Sat(Integer intBlockSix10Sat) {
//        this.intBlockSix10Sat = intBlockSix10Sat;
//    }
//
//    public Integer getIntBlockMore10Sat() {
//        return intBlockMore10Sat;
//    }
//
//    public void setIntBlockMore10Sat(Integer intBlockMore10Sat) {
//        this.intBlockMore10Sat = intBlockMore10Sat;
//    }

    public Integer getMemActivated() {
        return memActivated;
    }

    public void setMemActivated(Integer memActivated) {
        this.memActivated = memActivated;
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

    public Integer getShgActivated() {
        return shgActivated;
    }

    public void setShgActivated(Integer shgActivated) {
        this.shgActivated = shgActivated;
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

    public Integer getMemMobile() {
        return memMobile;
    }

    public void setMemMobile(Integer memMobile) {
        this.memMobile = memMobile;
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

    public Integer getIsSaturated() {
        return isSaturated;
    }

    public void setIsSaturated(Integer isSaturated) {
        this.isSaturated = isSaturated;
    }

//    public Integer getIntBlock0to3() {
//        return intBlock0to3;
//    }
//
//    public void setIntBlock0to3(Integer intBlock0to3) {
//        this.intBlock0to3 = intBlock0to3;
//    }
//
//    public Integer getIntBlock3to6() {
//        return intBlock3to6;
//    }
//
//    public void setIntBlock3to6(Integer intBlock3to6) {
//        this.intBlock3to6 = intBlock3to6;
//    }
//
//    public Integer getIntBlock6to10() {
//        return intBlock6to10;
//    }
//
//    public void setIntBlock6to10(Integer intBlock6to10) {
//        this.intBlock6to10 = intBlock6to10;
//    }
//
//    public Integer getIntBlockMore10() {
//        return intBlockMore10;
//    }
//
//    public void setIntBlockMore10(Integer intBlockMore10) {
//        this.intBlockMore10 = intBlockMore10;
//    }
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

//    private Integer shgAggregation;
//
//    private Integer shgOther;
//    public Integer getShgAggregation() {
//        return shgAggregation;
//    }
//
//    public void setShgAggregation(Integer shgAggregation) {
//        this.shgAggregation = shgAggregation;
//    }
//
//    public Integer getShgOther() {
//        return shgOther;
//    }
//
//    public void setShgOther(Integer shgOther) {
//        this.shgOther = shgOther;
//    }
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
}
