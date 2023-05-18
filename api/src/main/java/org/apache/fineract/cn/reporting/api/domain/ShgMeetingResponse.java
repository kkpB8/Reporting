package org.apache.fineract.cn.reporting.api.domain;

public class ShgMeetingResponse {
    private String bkName;
    private Integer villageId;
    private Integer shgsMapped;
    private Integer shgUpdated;
    public String getBkName() {
        return bkName;
    }

    public void setBkName(String bkName) {
        this.bkName = bkName;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getShgsMapped() {
        return shgsMapped;
    }

    public void setShgsMapped(Integer shgsMapped) {
        this.shgsMapped = shgsMapped;
    }

    public Integer getShgUpdated() {
        return shgUpdated;
    }

    public void setShgUpdated(Integer shgUpdated) {
        this.shgUpdated = shgUpdated;
    }

}
