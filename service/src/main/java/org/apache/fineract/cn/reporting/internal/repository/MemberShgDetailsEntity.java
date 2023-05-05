package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Cacheable(value = false)
//@Table(name = "cbo_summary")
public class MemberShgDetailsEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "state_id")
        private Integer stateId;
        @Column(name = "district_id")
        private Integer districtId;
        @Column(name = "block_id")
        private Integer blockId;
    @Column(name = "vo_id")
    private BigInteger voId;
    @Column(name = "shg_id")
    private BigInteger shgId;
    @Column(name = "shg_name")
    private String shgName;
    @Column(name = "shg_member")
    private BigInteger shgMember;
    @Column(name = "total_attendance")
    private Integer totalAttendance;
    @Column(name = "total_meeting_held")
    private Integer totalMeetingHeld;


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

    public BigInteger getVoId() {
        return voId;
    }

    public void setVoId(BigInteger voId) {
        this.voId = voId;
    }

    public BigInteger getShgId() {
        return shgId;
    }

    public void setShgId(BigInteger shgId) {
        this.shgId = shgId;
    }

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public BigInteger getShgMember() {
        return shgMember;
    }

    public void setShgMember(BigInteger shgMember) {
        this.shgMember = shgMember;
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
}
