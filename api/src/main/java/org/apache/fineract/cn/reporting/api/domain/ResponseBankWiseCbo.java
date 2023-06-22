package org.apache.fineract.cn.reporting.api.domain;

public class ResponseBankWiseCbo {
    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private String stateName;
    private String districtName;
    private String blockName;
    private Integer bankTypeId;
    private Integer bankId;
    private Integer branchId;
    private String fromDate;
    private String toDate;
    private Integer geographicalFlag;
    private Integer shgBank;
    private Integer voBank;
    private Integer clfBank;
    private String bankTypeName;
    private String bankName;
    private String branchName;
    private String yearMonth;

    private String updatedDate;
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

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getBankTypeId() {
        return bankTypeId;
    }

    public void setBankTypeId(Integer bankTypeId) {
        this.bankTypeId = bankTypeId;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Integer getShgBank() {
        return shgBank;
    }

    public void setShgBank(Integer shgBank) {
        this.shgBank = shgBank;
    }

    public Integer getVoBank() {
        return voBank;
    }

    public void setVoBank(Integer voBank) {
        this.voBank = voBank;
    }

    public Integer getClfBank() {
        return clfBank;
    }

    public void setClfBank(Integer clfBank) {
        this.clfBank = clfBank;
    }

    public String getBankTypeName() {
        return bankTypeName;
    }

    public void setBankTypeName(String bankTypeName) {
        this.bankTypeName = bankTypeName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}
