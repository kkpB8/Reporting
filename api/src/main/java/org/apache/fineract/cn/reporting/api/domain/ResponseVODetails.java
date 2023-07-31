package org.apache.fineract.cn.reporting.api.domain;

public class ResponseVODetails {
    private String state;

    private String district;

    private String block;

    private String gp;

    private String village;

    private Long voCode;

    private String voName;

    private String userId;

    private String userName;

    private String activationStatus;

    private String approvedStatus;

    private String voStatus;

    private String isNewVo;

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

    public String getGp() {
        return gp;
    }

    public void setGp(String gp) {
        this.gp = gp;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public Long getVoCode() {
        return voCode;
    }

    public void setVoCode(Long voCode) {
        this.voCode = voCode;
    }

    public String getVoName() {
        return voName;
    }

    public void setVoName(String voName) {
        this.voName = voName;
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

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    public String getApprovedStatus() {
        return approvedStatus;
    }

    public void setApprovedStatus(String approvedStatus) {
        this.approvedStatus = approvedStatus;
    }

    public String getVoStatus() {
        return voStatus;
    }

    public void setVoStatus(String voStatus) {
        this.voStatus = voStatus;
    }

    public String getIsNewVo() {
        return isNewVo;
    }

    public void setIsNewVo(String isNewVo) {
        this.isNewVo = isNewVo;
    }
}
