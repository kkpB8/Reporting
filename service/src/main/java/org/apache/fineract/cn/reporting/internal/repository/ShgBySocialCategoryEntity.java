package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;
@Entity
@Cacheable(value = false)
@Table(name = "cbo_summary")
public class ShgBySocialCategoryEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private BigInteger id ;
        @Column(name = "geographical_flag")
        private Integer geographicalFlag;
        @Column(name = "state_id")
        private Integer stateId;
        @Column(name = "district_id")
        private Integer districtId;
        @Column(name = "block_id")
        private Integer blockId;
        @Column(name = "panchayat_id")
        private Integer panchayatId;
        @Column(name = "village_id")
        private Integer villageId;
        @Column(name="shg_id")
        private Integer shgId;
        @Column(name = "vo_id")
        private Integer voId;
        @Column(name = "clf_id")
        private Integer clfId;
        @Column(name = "shg_name")
        private String shgName;
        @Column(name = "vo_name")
        private String voName;
       @Column(name = "clf_name")
       private String clfName;
    @Column(name = "shg_sc_month")
    private Integer shgScMonth;
    @Column(name = "shg_st_month")
    private Integer shgStMonth;
    @Column(name = "shg_gen_month")
    private Integer shgGenMonth;
    @Column(name = "shg_other_month")
    private Integer shgOtherMonth;
    @Column(name="shg_mem_sc_month")
    private Integer shgMemScMonth;
    @Column(name = "shg_mem_st_month")
    private Integer shgMemStMonth;
    @Column(name = "shg_mem_gen_month")
    private Integer shgMemGenMonth;
    @Column(name = "shg_mem_other_month")
    private Integer shgMemOtherMonth;
    @Column(name = "year_month")
    private String yearMonth;

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getGeographicalFlag() {
        return geographicalFlag;
    }

    public void setGeographicalFlag(Integer geographicalFlag) {
        this.geographicalFlag = geographicalFlag;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Integer getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Integer panchayatId) {
        this.panchayatId = panchayatId;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public Integer getShgId() {
        return shgId;
    }

    public void setShgId(Integer shgId) {
        this.shgId = shgId;
    }

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    public Integer getClfId() {
        return clfId;
    }

    public void setClfId(Integer clfId) {
        this.clfId = clfId;
    }

    public String getShgName() {
        return shgName;
    }

    public void setShgName(String shgName) {
        this.shgName = shgName;
    }

    public String getVoName() {
        return voName;
    }

    public void setVoName(String voName) {
        this.voName = voName;
    }

    public String getClfName() {
        return clfName;
    }

    public void setClfName(String clfName) {
        this.clfName = clfName;
    }

    public Integer getShgScMonth() {
        return shgScMonth;
    }

    public void setShgScMonth(Integer shgScMonth) {
        this.shgScMonth = shgScMonth;
    }

    public Integer getShgStMonth() {
        return shgStMonth;
    }

    public void setShgStMonth(Integer shgStMonth) {
        this.shgStMonth = shgStMonth;
    }

    public Integer getShgGenMonth() {
        return shgGenMonth;
    }

    public void setShgGenMonth(Integer shgGenMonth) {
        this.shgGenMonth = shgGenMonth;
    }

    public Integer getShgOtherMonth() {
        return shgOtherMonth;
    }

    public void setShgOtherMonth(Integer shgOtherMonth) {
        this.shgOtherMonth = shgOtherMonth;
    }

    public Integer getShgMemScMonth() {
        return shgMemScMonth;
    }

    public void setShgMemScMonth(Integer shgMemScMonth) {
        this.shgMemScMonth = shgMemScMonth;
    }

    public Integer getShgMemStMonth() {
        return shgMemStMonth;
    }

    public void setShgMemStMonth(Integer shgMemStMonth) {
        this.shgMemStMonth = shgMemStMonth;
    }

    public Integer getShgMemGenMonth() {
        return shgMemGenMonth;
    }

    public void setShgMemGenMonth(Integer shgMemGenMonth) {
        this.shgMemGenMonth = shgMemGenMonth;
    }

    public Integer getShgMemOtherMonth() {
        return shgMemOtherMonth;
    }

    public void setShgMemOtherMonth(Integer shgMemOtherMonth) {
        this.shgMemOtherMonth = shgMemOtherMonth;
    }

    /*
    shg_sc_month
            shg_st_month
    shg_gen_month
            shg_other_month
    shg_mem_sc_month
            shg_mem_st_month
    shg_mem_gen_month
            shg_mem_other_month

    private Integer geographicalFlag;
    private Integer stateId;
    private Integer districtId;
    private Integer blockId;
    private Integer panchayatId;
    private Integer villageId;
    private Integer shgId;
    private Integer voId;
    private Integer clfId;
    private String shgName;
    private String voName;
    private String clfName;
    private Integer shgScMonth;
    private Integer shgStMonth;
    private Integer shgGenMonth;
    private Integer shgOtherMonth;
    private Integer shgMemScMonth;
    private Integer shgMemStMonth;
    private Integer shgMemGenMonth;
    private Integer shgMemOtherMonth;

 */


/*
    geographical_flag integer,
    state_id integer,
    district_id integer,
    block_id integer,
    panchayat_id integer,
    village_id integer,
    shg_id integer,
    vo_id integer,
    clf_id integer,
    shg_name character varying COLLATE pg_catalog."default",
    vo_name character varying COLLATE pg_catalog."default",
    clf_name character varying COLLATE pg_catalog."default",
    year_month character varying(7) COLLATE pg_catalog."default",
    id bigint,
    shg_sc_month integer,
    shg_st_month integer,
    shg_gen_month integer,
    shg_other_month integer,
    shg_mem_sc_month integer,
    shg_mem_st_month integer,
    shg_mem_gen_month integer,
    shg_mem_other_month integer

 */

}
