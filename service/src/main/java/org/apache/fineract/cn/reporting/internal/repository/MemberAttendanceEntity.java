package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
@Entity
@Cacheable(value = false)
//@Table(name = "cbo_summary")
public class MemberAttendanceEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "shg_id")
        private Integer shgId;
        @Column(name = "shg_name")
        private String shgName;
        @Column(name = "shg_mem")
        private Integer shgMem;
        @Column(name = "total_attendance")
        private Integer totalAttendance;
    @Column(name = "total_meeting_held")
    private Integer totalMeetingHeld;
    @Column(name = "expectedamt")
    private Integer expectedAmt;
    @Column(name = "amtcollected")
    private Integer amtCollected;
    @Column(name = "amtvoluntary")
    private Integer amtVoluntary;
    @Column(name = "total_number_of_loans")
    private Integer totalNumberOfLoans;
    @Column(name = "total_members_availing_Loans")
    private Integer totalMembersAvailingLoans;
    @Column(name = "total_amount_of_loans")
    private Integer totalAmountOfLoans;
    @Column(name = "numberofmemberpenalised")
    private Integer numberOfMemberPenalised;
    @Column(name = "totalpenaltyamount")
    private Integer totalPenaltyAmount;

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

    public Integer getTotalNumberOfLoans() {
        return totalNumberOfLoans;
    }

    public void setTotalNumberOfLoans(Integer totalNumberOfLoans) {
        this.totalNumberOfLoans = totalNumberOfLoans;
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

    public Integer getNumberOfMemberPenalised() {
        return numberOfMemberPenalised;
    }

    public void setNumberOfMemberPenalised(Integer numberOfMemberPenalised) {
        this.numberOfMemberPenalised = numberOfMemberPenalised;
    }

    public Integer getTotalPenaltyAmount() {
        return totalPenaltyAmount;
    }

    public void setTotalPenaltyAmount(Integer totalPenaltyAmount) {
        this.totalPenaltyAmount = totalPenaltyAmount;
    }
}
/*
    private Integer shgId;
    private String shgName;
    private Integer shgMem;
    private Integer totalAttendance;
    private Integer totalMeetingHeld;
    private Integer expectedAmt;
    private Integer amtCollected;
    private Integer amtVoluntary;
    private Integer totalNumberOfLoans;
    private Integer totalMembersAvailingLoans;
    private Integer totalAmountOfLoans;
    private Integer numberOfMemberPenalised;
    private Integer totalPenaltyAmount;
 */
