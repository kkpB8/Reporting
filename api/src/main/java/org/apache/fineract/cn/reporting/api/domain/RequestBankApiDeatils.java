package org.apache.fineract.cn.reporting.api.domain;
public class RequestBankApiDeatils {
    private Integer stateId;
    private Integer flag;
    private Integer geographicalFlag;
    private Integer bankId;


    public Integer getStateId() {
        return stateId;
    }


    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }
}
