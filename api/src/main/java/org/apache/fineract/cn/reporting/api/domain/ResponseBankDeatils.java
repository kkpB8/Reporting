package org.apache.fineract.cn.reporting.api.domain;

public class ResponseBankDeatils {
    private Integer bankId;
    private String bankName;
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }


}
