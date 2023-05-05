package org.apache.fineract.cn.reporting.api.domain;

import java.math.BigInteger;

public class ResponseBankApiDeatils {
        private Integer bankId;
        private String bankName;
        private Integer branchId;
        private String branchName;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

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