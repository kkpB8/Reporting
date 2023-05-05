package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Cacheable(value = false)
@Table(name = "federation_profile")
public class ClfVoFilterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="federation_id")
    private BigInteger federationId;
    @Column(name = "federation_name")
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
//federation_id , federation_name