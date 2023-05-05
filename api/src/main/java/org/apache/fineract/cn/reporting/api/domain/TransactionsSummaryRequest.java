package org.apache.fineract.cn.reporting.api.domain;

import java.math.BigInteger;

public class TransactionsSummaryRequest {

    private String fromDate;

    private String toDate;

//    private BigInteger shgId;
//    private BigInteger voId;
//    private BigInteger clfId;
    private Integer stateId;
    private Integer districtId;

    private Integer blockId;

//    private Integer panchayatId;
//    private Integer villageId;
//    private Integer geoGraphicalLevel;
//    private Integer flag;
//    private String qtrhalfYearFlag;
//    private String year;
     private Integer geographicalFlag;

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

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
}
