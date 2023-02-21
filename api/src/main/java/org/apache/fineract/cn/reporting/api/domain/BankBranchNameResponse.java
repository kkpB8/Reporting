package org.apache.fineract.cn.reporting.api.domain;

public class BankBranchNameResponse {
    private String bank_code;
    private String bank_name;

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_branch_code() {
        return bank_branch_code;
    }

    public void setBank_branch_code(String bank_branch_code) {
        this.bank_branch_code = bank_branch_code;
    }

    public String getBank_branch_name() {
        return bank_branch_name;
    }

    public void setBank_branch_name(String bank_branch_name) {
        this.bank_branch_name = bank_branch_name;
    }

    private String bank_branch_code;
    private String bank_branch_name;
}
