package org.apache.fineract.cn.reporting.api.domain;

public class VoFilterResponse {

    private String cboChildId;
    private String federationName;

    public String getCboChildId() {
        return cboChildId;
    }

    public void setCboChildId(String cboChildId) {
        this.cboChildId = cboChildId;
    }

    public String getFederationName() {
        return federationName;
    }

    public void setFederationName(String federationName) {
        this.federationName = federationName;
    }
}
