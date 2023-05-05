package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;
@Entity
@Cacheable(value = false)
@Table(name = "menu_role_mapping_master")
public class MenuMasterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "menu_master_id")
    private BigInteger menuMasterId;
    @Column(name = "menu_name")
    private String menuName;

    public BigInteger getMenuMasterId() {
        return menuMasterId;
    }

    public void setMenuMasterId(BigInteger menuMasterId) {
        this.menuMasterId = menuMasterId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}


//nullable = false