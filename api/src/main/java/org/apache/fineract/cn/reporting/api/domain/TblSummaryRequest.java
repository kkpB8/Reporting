package org.apache.fineract.cn.reporting.api.domain;

public class TblSummaryRequest {
    private  String reportName;
    private String locationType;
    private String dateTo;

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
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

    public String getBankTypeId() {
        return bankTypeId;
    }

    public void setBankTypeId(String bankTypeId) {
        this.bankTypeId = bankTypeId;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getClf() {
        return clf;
    }

    public void setClf(String clf) {
        this.clf = clf;
    }

    public String getVo() {
        return vo;
    }

    public void setVo(String vo) {
        this.vo = vo;
    }

    public String getShg() {
        return shg;
    }

    public void setShg(String shg) {
        this.shg = shg;
    }

    private  String dateFrom;
    private String stateId;
    private String districtId;
    private String blockId;
    private String panchayatId;
    private String villageId;
    private String bankTypeId;
    private String bankType;
    private String bankCode;
    private String branchCode;
    private String clf;
    private String vo;
    private String shg;
}
