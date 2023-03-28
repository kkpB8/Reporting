package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Cacheable(value = false)
@Table(name = "tbl_summary")
public class SocialMobalizationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private BigInteger id ;
    @Column(name="totalruralhouseholds")
    private Integer totalRuralHouseholds;
    @Column(name = "targetruralhouseholds")
    private Integer targetRuralHouseholds;
    public Integer getShgMem() {
        return shgMem;
    }
    public void setShgMem(Integer shgMem) {
        this.shgMem = shgMem;
    }
    @Column(name = "shg_mem")
    private Integer shgMem;
    @Column(name = "geographical_flag")
    private Integer geographicalFlag;
    @Column(name = "state_id")
    private Integer stateId;
    @Column(name = "district_id")
    private Integer districtId;
    @Column(name = "block_id")
    private Integer blockId;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "district_name")
    private String districtName;
    @Column(name = "block_name")
    private String blockName;
    @Column(name = "age_block")
    private Integer ageBlock;
    @Column(name = "shg_formed_month")
    private Integer shgFormedMonth;
    @Column(name = "shg_members_joined_month")
    private Integer shgMembersJoinedMonth;
    @Column(name = "vo_formed_month")
    private Integer voFormedMonth;
    @Column(name = "vo_shg_formed_month")
    private Integer voShgFormedMonth;
    @Column(name = "vo_member_formed_month")
    private Integer voMemberFormedMonth;
    @Column(name = "clf_formed_month")
    private Integer clfFormedMonth;
    @Column(name = "clf_member_formed_month")
    private Integer clfMemberFormedMonth;
    @Column(name = "clf_shg_formed_month")
    private Integer clfShgFormedMonth;
    @Column(name = "clf_vo_formed_month")
    private Integer clfVoFormedMonth;
    @Column(name = "shg_approved")
    private Integer shgApproved;
    @Column(name = "shg_inactive_month")
    private Integer shgInactiveMonth;
    @Column(name = "shg_inactive_member_month")
    private Integer shgInactiveMemberMonth;
    @Column(name = "vo_approved")
    private Integer voApproved;
    @Column(name = "vo_inactive_month")
    private Integer voInactiveMonth;
    @Column(name = "clf_approved")
    private Integer clfApproved;
    @Column(name = "clf_inactive_month")
    private Integer clfInactiveMonth;
    @Column(name = "village_id")
    private Integer villageId;
    @Column(name = "panchayat_id")
    private Integer panchayatId;
    @Column(name = "village_name")
    private String villageName;
    @Column(name = "panchayat_name")
    private String panchayatName;
    @Column(name = "year_month")
    private String yearMonth;
    @Column(name = "totaldistict")
    private Integer totalDistict;
    @Column(name = "totalblock")
    private Integer totalBlock;
    @Column(name = "totalgp")
    private Integer totalGP;
    @Column(name = "totalvillage")
    private Integer totalVillage;
    @Column(name = "totaldistrictcoverage")
    private Integer totalDistrictCoverage;
    @Column(name = "totalblockcoverage")
    private Integer totalBlockCoverage;
    @Column(name = "totalgpcoverage")
    private Integer totalGPCoverage;

    @Column(name = "totalvillagecoverage")
    private Integer totalVillageCoverage;

    @Column(name = "illiteratemem_month")
    private Integer illiterateMem;
    @Column(name = "functionalliteracymem_month")
    private Integer functionalLiteracyMem;
    @Column(name = "educationupto5_month")
    private Integer educationUpto5;
    @Column(name = "educationupto8_month")
    private Integer educationUpto8;
    @Column(name = "educationupto12_month")
    private Integer educationUpto12;
    @Column(name = "vocationaltrainingmem_month")
    private Integer vocationalTrainingMem;
    @Column(name = "otheredumem_month")
    private Integer otherEduMem;
    @Column(name = "shgwithbankaccount")
    private Integer shgWithBankAccount;
    @Column(name = "shgwithoutbankaccount")
    private Integer shgWithoutBankAccount;
    @Column(name = "vowithbankaccount")
    private Integer voWithBankAccount;
    @Column(name = "vowithoutbankaccount")
    private Integer voWithoutBankAccount;
    @Column(name = "clfwithbankaccount")
    private Integer clfWithBankAccount;
    @Column(name = "clfwithoutbankaccount")
    private Integer clfWithoutBankAccount;
    @Column(name = "shgbankacount1")
    private Integer shgBankAcount1;
    @Column(name = "shgbankacount2")
    private Integer shgBankAcount2;
    @Column(name = "memwithbankaccount")
    private Integer memWithBankAccount;
    @Column(name = "memwithadhaar")
    private Integer memWithAdhaar;
    @Column(name = "memwithsecct")
    private Integer memWithSecct;
    @Column(name = "womenshg_month")
    private Integer womenshgMonth;
    @Column(name = "pvtgshg_month")
    private Integer pvtgshgMonth;
    @Column(name = "pwdshg_month")
    private Integer pwdshgMonth;
    @Column(name = "elderlyshg_month")
    private Integer elderlyshgMonth;
    @Column(name = "othertypeshg_month")
    private Integer othertypeshgMonth;
    @Column(name = "clfbanklinkage_month")
    private Integer clfbanklinkageMonth;
    @Column(name = "clfassetverification_month")
    private Integer clfassetverificationMonth;
    @Column(name = "clflivelihoodpromo_month")
    private Integer clflivelihoodpromoMonth;
    @Column(name = "clfmonitoring_month")
    private Integer clfmonitoringMonth;
    @Column(name = "clfsocialaction_month")
    private Integer clfsocialactionMonth;
    @Column(name = "clfspecial_month")
    private Integer clfspecialMonth;
    @Column(name = "vobanklinkage_month")
    private Integer vobanklinkageMonth;
    @Column(name = "voassetverification_month")
    private Integer voassetverificationMonth;
    @Column(name = "volivelihoodpromo_month")
    private Integer volivelihoodpromoMonth;
    @Column(name = "vomonitoring_month")
    private Integer vomonitoringMonth;
    @Column(name = "vosocialaction_month")
    private Integer vosocialactionMonth;
    @Column(name = "vospecial_month")
    private Integer vospecialMonth;
    @Column(name = "illiteratemem_leader_month")
    private Integer illiteratememLeaderMonth;
    @Column(name = "functionalliteracymem_leader_month")
    private Integer functionalliteracymemLeaderMonth;
    @Column(name = "educationupto5_leader_month")
    private Integer educationupto5LeaderMonth;
    @Column(name = "educationupto8_leader_month")
    private Integer educationupto8LeaderMonth;
    @Column(name = "educationupto12_leader_month")
    private Integer educationupto12LeaderMonth;
    @Column(name = "vocationaltrainingmem_leader_month")
    private Integer vocationalTrainingmemLeaderMonth;
    @Column(name = "otheredumem_leader_month")
    private Integer otheredumemLeaderMonth;
    @Column(name = "shg_leader_month")
    private Integer shgLeaderMonth;
    @Column(name = "shg_count")
    private Integer shgCount;
    @Column(name = "shg_sc_month")
    private Integer shgScMonth;
    @Column(name = "shg_st_month")
    private Integer shgStMonth;
    @Column(name = "shg_gen_month")
    private Integer shgGenMonth;
    @Column(name = "shg_other_month")
    private Integer shgOtherMonth;
    @Column(name = "shg_mem_sc_month")
    private Integer shgMemScMonth;
    @Column(name = "shg_mem_st_month")
    private Integer shgMemStMonth;
    @Column(name = "shg_mem_gen_month")
    private Integer shgMemGenMonth;
    @Column(name = "monthsOld_3_month")
    private Integer monthsOld3Month;
    @Column(name = "monthsOld_6_month")
    private Integer monthsOld6Month;
    @Column(name = "monthsOld_9_month")
    private Integer monthsOld9Month;
    @Column(name = "monthsOld_12_month")
    private Integer monthsOld12Month;
    @Column(name = "monthsOld_12More_month")
    private Integer monthsOld12MoreMonth;
    @Column(name = "shg_mem_approved")
    private Integer shgMemApproved;
    @Column(name = "vo_count")
    private Integer voCount;
    @Column(name = "vo_mem_approved")
    private Integer voMemApproved;
    @Column(name = "clf_count")
    private Integer clfCount;
    @Column(name = "clf_shg")
    private Integer clfShg;
    @Column(name = "clf_mem")
    private Integer clfMem;
    @Column(name = "clf_mem_approved")
    private Integer clfMemApproved;


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

    @Column(name = "shg_mem_other_month")
    private Integer shgMemOtherMonth;
    public Integer getShgCount() {
        return shgCount;
    }

    public void setShgCount(Integer shgCount) {
        this.shgCount = shgCount;
    }
    public Integer getShgLeaderMonth() {
        return shgLeaderMonth;
    }

    public void setShgLeaderMonth(Integer shgLeaderMonth) {
        this.shgLeaderMonth = shgLeaderMonth;
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

    public String getPanchayatName() {
        return panchayatName;
    }

    public void setPanchayatName(String panchayatName) {
        this.panchayatName = panchayatName;
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
    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
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

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }
}

