package org.apache.fineract.cn.reporting.api.domain;

public class ClfsddResponse {
    public String getFederation_id() {
        return federation_id;
    }

    public void setFederation_id(String federation_id) {
        this.federation_id = federation_id;
    }

    public String getFederation_name() {
        return federation_name;
    }

    public void setFederation_name(String federation_name) {
        this.federation_name = federation_name;
    }

    private String federation_id;
    private String federation_name;
}
