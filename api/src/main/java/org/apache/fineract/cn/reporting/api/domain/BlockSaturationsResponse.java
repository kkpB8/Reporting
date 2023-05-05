package org.apache.fineract.cn.reporting.api.domain;

import java.math.BigInteger;

public class BlockSaturationsResponse {
    private BigInteger zero3;
    private BigInteger three6;
    private BigInteger six10;
    private BigInteger moreThen10;
    private Integer geographicalFlag;

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public BigInteger getZero3() {
        return zero3;
    }

    public void setZero3(BigInteger zero3) {
        this.zero3 = zero3;
    }

    public BigInteger getThree6() {
        return three6;
    }

    public void setThree6(BigInteger three6) {
        this.three6 = three6;
    }

    public BigInteger getSix10() {
        return six10;
    }

    public void setSix10(BigInteger six10) {
        this.six10 = six10;
    }

    public BigInteger getMoreThen10() {
        return moreThen10;
    }

    public void setMoreThen10(BigInteger moreThen10) {
        this.moreThen10 = moreThen10;
    }
}
/*
    private String state_id;
    private String state_name;
    private String district_id;
    private String district_name;

    private String zero_3;
    private String three_6;
    private String six_10;
    private String morethen10;

    private String total1;
    private String zeroto3_2;
    private String threeto6_2;
    private String sixto10_2;
    private String tenplus_2;
    private String total2;


 */