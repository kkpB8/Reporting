package org.apache.fineract.cn.reporting.api.domain;

import javax.persistence.Column;
import java.math.BigInteger;

public class ClfVoFilterResponse {

    private BigInteger federationId;
    private String federationName;

    public BigInteger getFederationId() {
        return federationId;
    }

    public void setFederationId(BigInteger federationId) {
        this.federationId = federationId;
    }

    public String getFederationName() {
        return federationName;
    }

    public void setFederationName(String federationName) {
        this.federationName = federationName;
    }

}
