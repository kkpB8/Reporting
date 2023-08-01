package org.apache.fineract.cn.reporting.api.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ResponseSummaryReportsDetail {
    private String state;

    private String district;

    private String block;

    private BigInteger totalNoOfBookKeepers;

    private BigInteger noOfBookkeepersWithMappedCBO;

    private String typeOfCBO;

    private BigInteger totalCBOCount;

    private Integer cBOMappedCount ;

    private String cBOMappedPercentage;

    private Integer cBOsMappedMigrated;

    private  Integer newCBOsMapped;

    private  Integer  cBOsApprovedbyBM;

    private  Integer  cBOsRejectedbyBM;

    private  Integer  CBOsPendingwithBM;

    private  Integer incompleteCBOs;
    private  Integer CBOsPendingwithBookkeeper;



    private String percentageApprovedOverall;

    private String percentageApprovedMapped;

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

    public BigInteger getTotalNoOfBookKeepers() {
        return totalNoOfBookKeepers;
    }

    public void setTotalNoOfBookKeepers(BigInteger totalNoOfBookKeepers) {
        this.totalNoOfBookKeepers = totalNoOfBookKeepers;
    }

    public BigInteger getNoOfBookkeepersWithMappedCBO() {
        return noOfBookkeepersWithMappedCBO;
    }

    public void setNoOfBookkeepersWithMappedCBO(BigInteger noOfBookkeepersWithMappedCBO) {
        this.noOfBookkeepersWithMappedCBO = noOfBookkeepersWithMappedCBO;
    }

    public String getTypeOfCBO() {
        return typeOfCBO;
    }

    public void setTypeOfCBO(String typeOfCBO) {
        this.typeOfCBO = typeOfCBO;
    }

    public BigInteger getTotalCBOCount() {
        return totalCBOCount;
    }

    public void setTotalCBOCount(BigInteger totalCBOCount) {
        this.totalCBOCount = totalCBOCount;
    }

    public Integer getcBOMappedCount() {
        return cBOMappedCount;
    }

    public void setcBOMappedCount(Integer cBOMappedCount) {
        this.cBOMappedCount = cBOMappedCount;
    }

//    public Integer getcBOMappedPercentage() {
//        return cBOMappedPercentage;
//    }

//    public void setcBOMappedPercentage(Float cBOMappedPercentage) {
//        this.cBOMappedPercentage = cBOMappedPercentage;
//    }

    public Integer getcBOsMappedMigrated() {
        return cBOsMappedMigrated;
    }

    public void setcBOsMappedMigrated(Integer cBOsMappedMigrated) {
        this.cBOsMappedMigrated = cBOsMappedMigrated;
    }

    public Integer getNewCBOsMapped() {
        return newCBOsMapped;
    }

    public void setNewCBOsMapped(Integer newCBOsMapped) {
        this.newCBOsMapped = newCBOsMapped;
    }

    public Integer getcBOsApprovedbyBM() {
        return cBOsApprovedbyBM;
    }

    public void setcBOsApprovedbyBM(Integer cBOsApprovedbyBM) {
        this.cBOsApprovedbyBM = cBOsApprovedbyBM;
    }

    public Integer getcBOsRejectedbyBM() {
        return cBOsRejectedbyBM;
    }

    public void setcBOsRejectedbyBM(Integer cBOsRejectedbyBM) {
        this.cBOsRejectedbyBM = cBOsRejectedbyBM;
    }

    public Integer getCBOsPendingwithBM() {
        return CBOsPendingwithBM;
    }

    public void setCBOsPendingwithBM(Integer CBOsPendingwithBM) {
        this.CBOsPendingwithBM = CBOsPendingwithBM;
    }

    public Integer getCBOsPendingwithBookkeeper() {
        return CBOsPendingwithBookkeeper;
    }

    public void setCBOsPendingwithBookkeeper(Integer CBOsPendingwithBookkeeper) {
        this.CBOsPendingwithBookkeeper = CBOsPendingwithBookkeeper;
    }

    public String getPercentageApprovedOverall() {
        return percentageApprovedOverall;
    }

    public void setPercentageApprovedOverall(String percentageApprovedOverall) {
        this.percentageApprovedOverall = percentageApprovedOverall;
    }

    public String getPercentageApprovedMapped() {
        return percentageApprovedMapped;
    }

    public void setPercentageApprovedMapped(String percentageApprovedMapped) {
        this.percentageApprovedMapped = percentageApprovedMapped;
    }

    public Integer getIncompleteCBOs() {
        return incompleteCBOs;
    }

    public void setIncompleteCBOs(Integer incompleteCBOs) {
        this.incompleteCBOs = incompleteCBOs;
    }

    public void setcBOMappedPercentage(float floatValue) {
    }

    public String getcBOMappedPercentage() {
        return cBOMappedPercentage;
    }

    public void setcBOMappedPercentage(String cBOMappedPercentage) {
        this.cBOMappedPercentage = cBOMappedPercentage;
    }
}

