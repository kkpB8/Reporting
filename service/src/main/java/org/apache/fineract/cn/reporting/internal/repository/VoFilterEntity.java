package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;
@Entity
@Cacheable(value = false)
@Table(name = "federation_profile")
public class VoFilterEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="cbo_child_id")
        private String cboChildId;
        @Column(name = "federation_name")
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
//    private String cboChildId;
//    private String federationName;
//    cbo_child_id , federation_name




