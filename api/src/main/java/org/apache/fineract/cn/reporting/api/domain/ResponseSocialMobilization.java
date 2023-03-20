package org.apache.fineract.cn.reporting.api.domain;

public class ResponseSocialMobilization {

    private Integer totalRuralHouseholds;

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

    private Integer targetRuralHouseholds;
    private Integer shgMem;

}
