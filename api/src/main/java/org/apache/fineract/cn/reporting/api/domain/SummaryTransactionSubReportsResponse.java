package org.apache.fineract.cn.reporting.api.domain;

public class SummaryTransactionSubReportsResponse {
    private Integer shgId;
    private String shgName;
    private Integer shgMem;
    private Integer totalAttendance;
    private Integer totalMeetingHeld;
    private Integer expectedAmt;
    private Integer amtCollected;
    private Integer amtVoluntary;
    private Integer totalNumberofLoans;
    private Integer totalMembersAvailingLoans;

    public Integer getShgId() {
        return shgId;
    }

    public void setShgId(Integer shgId) {
        this.shgId = shgId;
    }

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public Integer getShgMem() {
        return shgMem;
    }

    public void setShgMem(Integer shgMem) {
        this.shgMem = shgMem;
    }

    public Integer getTotalAttendance() {
        return totalAttendance;
    }

    public void setTotalAttendance(Integer totalAttendance) {
        this.totalAttendance = totalAttendance;
    }

    public Integer getTotalMeetingHeld() {
        return totalMeetingHeld;
    }

    public void setTotalMeetingHeld(Integer totalMeetingHeld) {
        this.totalMeetingHeld = totalMeetingHeld;
    }

    public Integer getExpectedAmt() {
        return expectedAmt;
    }

    public void setExpectedAmt(Integer expectedAmt) {
        this.expectedAmt = expectedAmt;
    }

    public Integer getAmtCollected() {
        return amtCollected;
    }

    public void setAmtCollected(Integer amtCollected) {
        this.amtCollected = amtCollected;
    }

    public Integer getAmtVoluntary() {
        return amtVoluntary;
    }

    public void setAmtVoluntary(Integer amtVoluntary) {
        this.amtVoluntary = amtVoluntary;
    }

    public Integer getTotalNumberofLoans() {
        return totalNumberofLoans;
    }

    public void setTotalNumberofLoans(Integer totalNumberofLoans) {
        this.totalNumberofLoans = totalNumberofLoans;
    }

    public Integer getTotalMembersAvailingLoans() {
        return totalMembersAvailingLoans;
    }

    public void setTotalMembersAvailingLoans(Integer totalMembersAvailingLoans) {
        this.totalMembersAvailingLoans = totalMembersAvailingLoans;
    }

    public Integer getTotalAmountOfLoans() {
        return totalAmountOfLoans;
    }

    public void setTotalAmountOfLoans(Integer totalAmountOfLoans) {
        this.totalAmountOfLoans = totalAmountOfLoans;
    }

    public Integer getNumberofMemberPenalised() {
        return numberofMemberPenalised;
    }

    public void setNumberofMemberPenalised(Integer numberofMemberPenalised) {
        this.numberofMemberPenalised = numberofMemberPenalised;
    }

    public Integer getTotalPenaltyAmount() {
        return totalPenaltyAmount;
    }

    public void setTotalPenaltyAmount(Integer totalPenaltyAmount) {
        this.totalPenaltyAmount = totalPenaltyAmount;
    }

    private Integer totalAmountOfLoans;
    private Integer numberofMemberPenalised;
    private Integer totalPenaltyAmount;
}
