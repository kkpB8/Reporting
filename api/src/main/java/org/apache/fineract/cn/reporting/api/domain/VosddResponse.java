package org.apache.fineract.cn.reporting.api.domain;

public class VosddResponse {
    private String cbo_child_id;

    public String getCbo_child_id() {
        return cbo_child_id;
    }

    public void setCbo_child_id(String cbo_child_id) {
        this.cbo_child_id = cbo_child_id;
    }

    public String getFederation_name() {
        return federation_name;
    }

    public void setFederation_name(String federation_name) {
        this.federation_name = federation_name;
    }

    private String federation_name;
}
