package org.apache.fineract.cn.reporting.api.domain;

public class ResponseShgDetails {
    private String state;

    private String district;

    private String block;

    private String gp;

    private String village;

    private String shgCode;

    private String shgName;

    private String userId;

    private String userName;

    private String activationStatus;

    private String approvedStatus;

    private String shgStatus;

    private String isNewShg;

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

    public String getShgCode() {
        return shgCode;
    }

    public void setShgCode(String shgCode) {
        this.shgCode = shgCode;
    }

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
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

    public String getShgStatus() {
        return shgStatus;
    }

    public void setShgStatus(String shgStatus) {
        this.shgStatus = shgStatus;
    }

    public String getIsNewShg() {
        return isNewShg;
    }

    public void setIsNewShg(String isNewShg) {
        this.isNewShg = isNewShg;
    }
}
