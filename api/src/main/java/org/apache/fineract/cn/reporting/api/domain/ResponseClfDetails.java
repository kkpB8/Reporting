package org.apache.fineract.cn.reporting.api.domain;

public class ResponseClfDetails {

    private String state;

    private String district;

    private String block;

//    private String gp;

//    private String village;

    private String clfCode;

    private String clfName;

    private String userId;

    private String userName;

//    private String activationStatus;

    private String approvedStatus;

//    private String voStatus;
    private String clfStatus;
    private String isNewClf;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

//    public String getGp() {
//        return gp;
//    }
//
//    public void setGp(String gp) {
//        this.gp = gp;
//    }
//
//    public String getVillage() {
//        return village;
//    }
//
//    public void setVillage(String village) {
//        this.village = village;
//    }

//    public Long getClfCode() {
//        return clfCode;
//    }
//
//    public void setClfCode(Long clfCode) {
//        this.clfCode = clfCode;
//    }

    public String getClfCode() {
        return clfCode;
    }

    public void setClfCode(String clfCode) {
        this.clfCode = clfCode;
    }

    public String getClfStatus() {
        return clfStatus;
    }

    public void setClfStatus(String clfStatus) {
        this.clfStatus = clfStatus;
    }

    public String getClfName() {
        return clfName;
    }

    public void setClfName(String clfName) {
        this.clfName = clfName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public String getActivationStatus() {
//        return activationStatus;
//    }
//
//    public void setActivationStatus(String activationStatus) {
//        this.activationStatus = activationStatus;
//    }

    public String getApprovedStatus() {
        return approvedStatus;
    }

    public void setApprovedStatus(String approvedStatus) {
        this.approvedStatus = approvedStatus;
    }

//    public String getVoStatus() {
//        return voStatus;
//    }
//
//    public void setVoStatus(String voStatus) {
//        this.voStatus = voStatus;
//    }

    public String getIsNewClf() {
        return isNewClf;
    }

    public void setIsNewClf(String isNewClf) {
        this.isNewClf = isNewClf;
    }
}
