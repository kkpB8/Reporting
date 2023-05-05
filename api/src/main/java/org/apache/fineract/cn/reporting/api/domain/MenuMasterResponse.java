package org.apache.fineract.cn.reporting.api.domain;

import java.math.BigInteger;

public class MenuMasterResponse {
    private BigInteger menuMasterId;
    private  String menuName;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public BigInteger getMenuMasterId() {
        return menuMasterId;
    }

    public void setMenuMasterId(BigInteger menuMasterId) {
        this.menuMasterId = menuMasterId;
    }
}
