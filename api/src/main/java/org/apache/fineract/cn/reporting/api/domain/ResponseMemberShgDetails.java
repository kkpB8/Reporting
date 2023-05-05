package org.apache.fineract.cn.reporting.api.domain;

import javax.persistence.Column;
import java.math.BigInteger;

public class ResponseMemberShgDetails {

    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private BigInteger voId;
    private BigInteger shgId;
    private String shgName;
    private BigInteger shgMember;
    private Integer totalAttendance;
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
