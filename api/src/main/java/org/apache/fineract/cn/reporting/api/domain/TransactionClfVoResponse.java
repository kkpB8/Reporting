package org.apache.fineract.cn.reporting.api.domain;

public class TransactionClfVoResponse {
    private String b_k_name;
    private Integer village_id;
    private Integer shgsmapped;
    private Integer shgupdated;


    public String getB_k_name() {
        return b_k_name;
    }

    public void setB_k_name(String b_k_name) {
        this.b_k_name = b_k_name;
    }

    public Integer getVillage_id() {
        return village_id;
    }

    public void setVillage_id(Integer village_id) {
        this.village_id = village_id;
    }

    public Integer getShgsmapped() {
        return shgsmapped;
    }

    public void setShgsmapped(Integer shgsmapped) {
        this.shgsmapped = shgsmapped;
    }

    public Integer getShgupdated() {
        return shgupdated;
    }

    public void setShgupdated(Integer shgupdated) {
        this.shgupdated = shgupdated;
    }
}
