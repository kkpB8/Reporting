package org.apache.fineract.cn.reporting.api.domain;

public class ShgsSavingResponse {
    private Integer shgTillMarch2023;
    private Integer memTillMarch2023;
    private Integer shgApril2023toTilldate;
    private Integer memApril2023toTilldate;
    private Integer shgCurrentMonth;
    private Integer memCurrentMonth;
    private Integer shgPreviousMonth;
    private Integer memPreviousMonth;
    private Integer shgLastday;
    private Integer memLastday;
    private Integer memDailyAverage;

    public Integer getShgTillMarch2023() {
        return shgTillMarch2023;
    }

    public void setShgTillMarch2023(Integer shgTillMarch2023) {
        this.shgTillMarch2023 = shgTillMarch2023;
    }

    public Integer getMemTillMarch2023() {
        return memTillMarch2023;
    }

    public void setMemTillMarch2023(Integer memTillMarch2023) {
        this.memTillMarch2023 = memTillMarch2023;
    }

    public Integer getShgApril2023toTilldate() {
        return shgApril2023toTilldate;
    }

    public void setShgApril2023toTilldate(Integer shgApril2023toTilldate) {
        this.shgApril2023toTilldate = shgApril2023toTilldate;
    }

    public Integer getMemApril2023toTilldate() {
        return memApril2023toTilldate;
    }

    public void setMemApril2023toTilldate(Integer memApril2023toTilldate) {
        this.memApril2023toTilldate = memApril2023toTilldate;
    }

    public Integer getShgCurrentMonth() {
        return shgCurrentMonth;
    }

    public void setShgCurrentMonth(Integer shgCurrentMonth) {
        this.shgCurrentMonth = shgCurrentMonth;
    }

    public Integer getMemCurrentMonth() {
        return memCurrentMonth;
    }

    public void setMemCurrentMonth(Integer memCurrentMonth) {
        this.memCurrentMonth = memCurrentMonth;
    }

    public Integer getShgPreviousMonth() {
        return shgPreviousMonth;
    }

    public void setShgPreviousMonth(Integer shgPreviousMonth) {
        this.shgPreviousMonth = shgPreviousMonth;
    }

    public Integer getMemPreviousMonth() {
        return memPreviousMonth;
    }

    public void setMemPreviousMonth(Integer memPreviousMonth) {
        this.memPreviousMonth = memPreviousMonth;
    }

    public Integer getShgLastday() {
        return shgLastday;
    }

    public void setShgLastday(Integer shgLastday) {
        this.shgLastday = shgLastday;
    }

    public Integer getMemLastday() {
        return memLastday;
    }

    public void setMemLastday(Integer memLastday) {
        this.memLastday = memLastday;
    }

    public Integer getMemDailyAverage() {
        return memDailyAverage;
    }

    public void setMemDailyAverage(Integer memDailyAverage) {
        this.memDailyAverage = memDailyAverage;
    }
}
