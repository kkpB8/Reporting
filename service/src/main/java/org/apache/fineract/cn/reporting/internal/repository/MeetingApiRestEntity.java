package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;
import java.math.BigInteger;
@Entity
@Cacheable(value = false)
@Table(name = "transaction_summary")
public class MeetingApiRestEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private BigInteger id ;
        @Column(name = "geographical_level")
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
        @Column(name = "year_month")
        private String yearMonth;
        @Column(name = "total_shg_formed")
        private Integer totalShgFormed;
        @Column(name = "shg_conducted_meeting")
        private Integer shgConductedMeeting;
        @Column(name = "shg_id")
        private Integer shgId;
        @Column(name = "vo_id")
        private Integer voId;
        @Column(name = "clf_id")
        private Integer clfId;


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

        public BigInteger getId() {
                return id;
        }

        public void setId(BigInteger id) {
                this.id = id;
        }

//        public Integer getGeographicalLevel() {
//                return geographicalLevel;
//        }
//        public void setGeographicalLevel(Integer geographicalLevel) {
//                this.geographicalLevel = geographicalLevel;
//        }

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

        public Integer getVillageId() {
                return villageId;
        }

        public void setVillageId(Integer villageId) {
                this.villageId = villageId;
        }

        public Integer getPanchayatId() {
                return panchayatId;
        }

        public void setPanchayatId(Integer panchayatId) {
                this.panchayatId = panchayatId;
        }

        public String getYearMonth() {
                return yearMonth;
        }

        public void setYearMonth(String yearMonth) {
                this.yearMonth = yearMonth;
        }

        public Integer getTotalShgFormed() {
                return totalShgFormed;
        }

        public void setTotalShgFormed(Integer totalShgFormed) {
                this.totalShgFormed = totalShgFormed;
        }

        public Integer getShgConductedMeeting() {
                return shgConductedMeeting;
        }

        public void setShgConductedMeeting(Integer shgConductedMeeting) {
                this.shgConductedMeeting = shgConductedMeeting;
        }
}
