package org.apache.fineract.cn.reporting.api.domain;

public class RequestBankBranchs {

    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer bankTypeId;
    private Integer bankId;
    private Integer branchId;
    private String fromDate;
    private String toDate;
    private Integer geographicalFlag;


//        response :  geo_flag , (state_id,district_id,block_id)--null allows in these 3 fields
//1) bank_type_id ,
//                2) bank_id,
//                3) branch_id,


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

}
