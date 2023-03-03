package org.apache.fineract.cn.reporting.api.domain;

public class TblSummaryResponse {

    private String geographical_flag;
    private String state_id;
    private String district_id;
    private String block_id;
    private String panchayat_id;
    private String village_id;
    private String state_name;
    private String district_name;
    private String block_name;
    private String panchayat_name;
    private String village_name;
    private String year_month;
    private String totaldistrict;
    private String totalblock;
    private String totalvillage;
    private String totalpanchayat;
    private String coveragedistrict;
    private String coverageblock;
    private String coveragevillage;
    private String coveragepanchayat;
    private String perdistrict;
    private String perblock;
    private String perpanchayat;
    private String pervillage;
    private String approved_shg;
    private String inactive_shg;
    private String inactive_shg_members;
    private String approved_vo;
    private String inactive_vo;
    private String approved_clf;
    private String inactive_clf;
    private String novos;
    private String banklinkage;
    private String assestver;
    private String livlihoodprom;
    private String monitoring;
    private String socialaction;
    private String special;
    private String total;
    private  String total_shg;
    private String target_shg_members;
    private String total_vo;
    private String total_vo_shg;
    private String total_vo_members;
    private String total_clf;
    private String total_clf_vo;
    private String total_clf_shg;
    private String total_clf_members;
    private String noclfs;
    private String banklinkage_clf;
    private String assestver_clf;
    private String livlihoodprom_clf;
    private String monitoring_clf;
    private String socialaction_clf;
    private String special_clf;
    private String clf_total;
    private String noofshg_les;
    private String noofleaders;
    private String illiterate;

    public String getNoofshg_les() {
        return noofshg_les;
    }

    public void setNoofshg_les(String noofshg_les) {
        this.noofshg_les = noofshg_les;
    }

    public String getNoofleaders() {
        return noofleaders;
    }

    public void setNoofleaders(String noofleaders) {
        this.noofleaders = noofleaders;
    }

    public String getIlliterate() {
        return illiterate;
    }

    public void setIlliterate(String illiterate) {
        this.illiterate = illiterate;
    }

    public String getFunctionallit() {
        return functionallit;
    }

    public void setFunctionallit(String functionallit) {
        this.functionallit = functionallit;
    }

    public String getPrimaryupto5() {
        return primaryupto5;
    }

    public void setPrimaryupto5(String primaryupto5) {
        this.primaryupto5 = primaryupto5;
    }

    public String getMiddleupto8() {
        return middleupto8;
    }

    public void setMiddleupto8(String middleupto8) {
        this.middleupto8 = middleupto8;
    }

    public String getSrsec12() {
        return srsec12;
    }

    public void setSrsec12(String srsec12) {
        this.srsec12 = srsec12;
    }

    public String getVoctraining() {
        return voctraining;
    }

    public void setVoctraining(String voctraining) {
        this.voctraining = voctraining;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    private String functionallit;
    private String primaryupto5;
    private String middleupto8;
    private String srsec12;
    private String voctraining;
    private String others;
    public String getNoclfs() {
        return noclfs;
    }

    public void setNoclfs(String noclfs) {
        this.noclfs = noclfs;
    }

    public String getBanklinkage_clf() {
        return banklinkage_clf;
    }

    public void setBanklinkage_clf(String banklinkage_clf) {
        this.banklinkage_clf = banklinkage_clf;
    }

    public String getAssestver_clf() {
        return assestver_clf;
    }

    public void setAssestver_clf(String assestver_clf) {
        this.assestver_clf = assestver_clf;
    }

    public String getLivlihoodprom_clf() {
        return livlihoodprom_clf;
    }

    public void setLivlihoodprom_clf(String livlihoodprom_clf) {
        this.livlihoodprom_clf = livlihoodprom_clf;
    }

    public String getMonitoring_clf() {
        return monitoring_clf;
    }

    public void setMonitoring_clf(String monitoring_clf) {
        this.monitoring_clf = monitoring_clf;
    }

    public String getSocialaction_clf() {
        return socialaction_clf;
    }

    public void setSocialaction_clf(String socialaction_clf) {
        this.socialaction_clf = socialaction_clf;
    }

    public String getSpecial_clf() {
        return special_clf;
    }

    public void setSpecial_clf(String special_clf) {
        this.special_clf = special_clf;
    }

    public String getClf_total() {
        return clf_total;
    }

    public void setClf_total(String clf_total) {
        this.clf_total = clf_total;
    }

    public String getTotal_shg() {
        return total_shg;
    }

    public void setTotal_shg(String total_shg) {
        this.total_shg = total_shg;
    }

    public String getTarget_shg_members() {
        return target_shg_members;
    }

    public void setTarget_shg_members(String target_shg_members) {
        this.target_shg_members = target_shg_members;
    }

    public String getTotal_vo() {
        return total_vo;
    }

    public void setTotal_vo(String total_vo) {
        this.total_vo = total_vo;
    }

    public String getTotal_vo_shg() {
        return total_vo_shg;
    }

    public void setTotal_vo_shg(String total_vo_shg) {
        this.total_vo_shg = total_vo_shg;
    }

    public String getTotal_vo_members() {
        return total_vo_members;
    }

    public void setTotal_vo_members(String total_vo_members) {
        this.total_vo_members = total_vo_members;
    }

    public String getTotal_clf() {
        return total_clf;
    }

    public void setTotal_clf(String total_clf) {
        this.total_clf = total_clf;
    }

    public String getTotal_clf_vo() {
        return total_clf_vo;
    }

    public void setTotal_clf_vo(String total_clf_vo) {
        this.total_clf_vo = total_clf_vo;
    }

    public String getTotal_clf_shg() {
        return total_clf_shg;
    }

    public void setTotal_clf_shg(String total_clf_shg) {
        this.total_clf_shg = total_clf_shg;
    }

    public String getTotal_clf_members() {
        return total_clf_members;
    }

    public void setTotal_clf_members(String total_clf_members) {
        this.total_clf_members = total_clf_members;
    }

    public String getGeographical_flag() {
        return geographical_flag;
    }

    public void setGeographical_flag(String geographical_flag) {
        this.geographical_flag = geographical_flag;
    }

    public String getState_id() {
        return state_id;
    }

    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    public String getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(String district_id) {
        this.district_id = district_id;
    }

    public String getBlock_id() {
        return block_id;
    }

    public void setBlock_id(String block_id) {
        this.block_id = block_id;
    }

    public String getPanchayat_id() {
        return panchayat_id;
    }

    public void setPanchayat_id(String panchayat_id) {
        this.panchayat_id = panchayat_id;
    }

    public String getVillage_id() {
        return village_id;
    }

    public void setVillage_id(String village_id) {
        this.village_id = village_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getBlock_name() {
        return block_name;
    }

    public void setBlock_name(String block_name) {
        this.block_name = block_name;
    }

    public String getPanchayat_name() {
        return panchayat_name;
    }

    public void setPanchayat_name(String panchayat_name) {
        this.panchayat_name = panchayat_name;
    }

    public String getVillage_name() {
        return village_name;
    }

    public void setVillage_name(String village_name) {
        this.village_name = village_name;
    }

    public String getYear_month() {
        return year_month;
    }

    public void setYear_month(String year_month) {
        this.year_month = year_month;
    }

    public String getTotaldistrict() {
        return totaldistrict;
    }

    public void setTotaldistrict(String totaldistrict) {
        this.totaldistrict = totaldistrict;
    }

    public String getTotalblock() {
        return totalblock;
    }

    public void setTotalblock(String totalblock) {
        this.totalblock = totalblock;
    }

    public String getTotalvillage() {
        return totalvillage;
    }

    public void setTotalvillage(String totalvillage) {
        this.totalvillage = totalvillage;
    }

    public String getTotalpanchayat() {
        return totalpanchayat;
    }

    public void setTotalpanchayat(String totalpanchayat) {
        this.totalpanchayat = totalpanchayat;
    }

    public String getCoveragedistrict() {
        return coveragedistrict;
    }

    public void setCoveragedistrict(String coveragedistrict) {
        this.coveragedistrict = coveragedistrict;
    }

    public String getCoverageblock() {
        return coverageblock;
    }

    public void setCoverageblock(String coverageblock) {
        this.coverageblock = coverageblock;
    }

    public String getCoveragevillage() {
        return coveragevillage;
    }

    public void setCoveragevillage(String coveragevillage) {
        this.coveragevillage = coveragevillage;
    }

    public String getCoveragepanchayat() {
        return coveragepanchayat;
    }

    public void setCoveragepanchayat(String coveragepanchayat) {
        this.coveragepanchayat = coveragepanchayat;
    }

    public String getPerdistrict() {
        return perdistrict;
    }

    public void setPerdistrict(String perdistrict) {
        this.perdistrict = perdistrict;
    }

    public String getPerblock() {
        return perblock;
    }

    public void setPerblock(String perblock) {
        this.perblock = perblock;
    }

    public String getPerpanchayat() {
        return perpanchayat;
    }

    public void setPerpanchayat(String perpanchayat) {
        this.perpanchayat = perpanchayat;
    }

    public String getPervillage() {
        return pervillage;
    }

    public void setPervillage(String pervillage) {
        this.pervillage = pervillage;
    }

    public String getApproved_shg() {
        return approved_shg;
    }

    public void setApproved_shg(String approved_shg) {
        this.approved_shg = approved_shg;
    }

    public String getInactive_shg() {
        return inactive_shg;
    }

    public void setInactive_shg(String inactive_shg) {
        this.inactive_shg = inactive_shg;
    }

    public String getInactive_shg_members() {
        return inactive_shg_members;
    }

    public void setInactive_shg_members(String inactive_shg_members) {
        this.inactive_shg_members = inactive_shg_members;
    }

    public String getApproved_vo() {
        return approved_vo;
    }

    public void setApproved_vo(String approved_vo) {
        this.approved_vo = approved_vo;
    }

    public String getInactive_vo() {
        return inactive_vo;
    }

    public void setInactive_vo(String inactive_vo) {
        this.inactive_vo = inactive_vo;
    }

    public String getApproved_clf() {
        return approved_clf;
    }

    public void setApproved_clf(String approved_clf) {
        this.approved_clf = approved_clf;
    }

    public String getInactive_clf() {
        return inactive_clf;
    }

    public void setInactive_clf(String inactive_clf) {
        this.inactive_clf = inactive_clf;
    }

    public String getNovos() {
        return novos;
    }

    public void setNovos(String novos) {
        this.novos = novos;
    }

    public String getBanklinkage() {
        return banklinkage;
    }

    public void setBanklinkage(String banklinkage) {
        this.banklinkage = banklinkage;
    }

    public String getAssestver() {
        return assestver;
    }

    public void setAssestver(String assestver) {
        this.assestver = assestver;
    }

    public String getLivlihoodprom() {
        return livlihoodprom;
    }

    public void setLivlihoodprom(String livlihoodprom) {
        this.livlihoodprom = livlihoodprom;
    }

    public String getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(String monitoring) {
        this.monitoring = monitoring;
    }

    public String getSocialaction() {
        return socialaction;
    }

    public void setSocialaction(String socialaction) {
        this.socialaction = socialaction;
    }


    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}