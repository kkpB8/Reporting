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
        @Column(name = "village_id")
        private Integer villageId;
        @Column(name = "panchayat_id")
        private Integer panchayatId;
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
        @Column(name = "shg_mapped_month")
        private Integer shgMappedMonth;
        @Column(name = "total_vo_month")
        private Integer totalVoMonth;
        @Column(name = "total_mapped_vo")
        private Integer totalMappedVo;
        @Column(name = "vo_conduting_meeting")
        private Integer voCondutingMeeting;
        @Column(name = "total_clf_month")
        private Integer totalClfMonth;
        @Column(name = "total_mapped_clf")
        private Integer totalMappedClf;
        @Column(name = "clf_conduting_meeting")
        private Integer clfCondutingMeeting;
        @Column(name = "state_name")
        private String stateName;
        @Column(name = "district_name")
        private String districtName;
        @Column(name = "block_name")
        private String blockName;
        @Column(name = "panchayat_name")
        private String panchayatName;
        @Column(name = "village_name")
        private String villageName;
        public Integer getShgMappedMonth() {
                return shgMappedMonth;
        }

        public void setShgMappedMonth(Integer shgMappedMonth) {
                this.shgMappedMonth = shgMappedMonth;
        }

        public Integer getTotalVoMonth() {
                return totalVoMonth;
        }

        public void setTotalVoMonth(Integer totalVoMonth) {
                this.totalVoMonth = totalVoMonth;
        }

        public Integer getTotalMappedVo() {
                return totalMappedVo;
        }

        public void setTotalMappedVo(Integer totalMappedVo) {
                this.totalMappedVo = totalMappedVo;
        }

        public Integer getVoCondutingMeeting() {
                return voCondutingMeeting;
        }

        public void setVoCondutingMeeting(Integer voCondutingMeeting) {
                this.voCondutingMeeting = voCondutingMeeting;
        }

        public Integer getTotalClfMonth() {
                return totalClfMonth;
        }

        public void setTotalClfMonth(Integer totalClfMonth) {
                this.totalClfMonth = totalClfMonth;
        }

        public Integer getTotalMappedClf() {
                return totalMappedClf;
        }

        public void setTotalMappedClf(Integer totalMappedClf) {
                this.totalMappedClf = totalMappedClf;
        }

        public Integer getClfCondutingMeeting() {
                return clfCondutingMeeting;
        }

        public void setClfCondutingMeeting(Integer clfCondutingMeeting) {
                this.clfCondutingMeeting = clfCondutingMeeting;
        }

        public String getStateName() {
                return stateName;
        }

        public void setStateName(String stateName) {
                this.stateName = stateName;
        }

        public String getDistrictName() {
                return districtName;
        }

        public void setDistrictName(String districtName) {
                this.districtName = districtName;
        }

        public String getBlockName() {
                return blockName;
        }

        public void setBlockName(String blockName) {
                this.blockName = blockName;
        }

        public String getPanchayatName() {
                return panchayatName;
        }

        public void setPanchayatName(String panchayatName) {
                this.panchayatName = panchayatName;
        }

        public String getVillageName() {
                return villageName;
        }

        public void setVillageName(String villageName) {
                this.villageName = villageName;
        }


        public Integer getGeographicalFlag() {
                return geographicalFlag;
        }

        public void setGeographicalFlag(Integer geographicalFlag) {
                this.geographicalFlag = geographicalFlag;
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

        public BigInteger getId() {
                return id;
        }

        public void setId(BigInteger id) {
                this.id = id;
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
