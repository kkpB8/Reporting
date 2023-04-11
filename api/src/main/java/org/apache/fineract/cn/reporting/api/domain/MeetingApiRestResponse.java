package org.apache.fineract.cn.reporting.api.domain;

public class MeetingApiRestResponse {

    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer villageId;
    private Integer panchayatId;
    private Integer totalShgFormed;
    private Integer shgConductedMeeting;
    private Integer geographicalLevel;
    private String yearMonth;
    private Integer shgId;
    private Integer voId;
    private Integer clfId;

    public Integer getShgId() {
        return shgId;
    }

    public void setShgId(Integer shgId) {
        this.shgId = shgId;
    }

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public Integer getClfId() {
        return clfId;
    }

    public void setClfId(Integer clfId) {
        this.clfId = clfId;
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

    public Integer getTotalShgFormed() {
        return totalShgFormed;
    }

    public void setTotalShgFormed(Integer totalShgFormed) {
        this.totalShgFormed = totalShgFormed;
    }

    public Integer getShgConductedMeeting() {
        return shgConductedMeeting;
    }

    public void setShgConductedMeeting(Integer shgConductedMeeting) {
        this.shgConductedMeeting = shgConductedMeeting;
    }

    public Integer getGeographicalLevel() {
        return geographicalLevel;
    }

    public void setGeographicalLevel(Integer geographicalLevel) {
        this.geographicalLevel = geographicalLevel;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }
}




