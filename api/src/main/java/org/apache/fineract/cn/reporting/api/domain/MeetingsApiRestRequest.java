package org.apache.fineract.cn.reporting.api.domain;

public class MeetingApiRestRequest {
        private Integer stateId;
        private Integer districtId;
        private Integer blockId;
        private Integer panchayatId;
        private Integer villageId;
        private String fromDate;
        private String toDate;
        private Integer geographicalFlag;
        private Integer shgId;
        private Integer voId;
        private Integer clfId;
        private Integer flag;

        public Integer getFlag() {
            return flag;
        }

        public void setFlag(Integer flag) {
            this.flag = flag;
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

        public Integer getShgId() {
            return shgId;
        }

        public void setShgId(Integer shgId) {
            this.shgId = shgId;
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

        public String getFromDate() {
            return fromDate;
        }

        public void setFromDate(String fromDate) {
            this.fromDate = fromDate;
        }

        public String getToDate() {
            return toDate;
        }

        public void setToDate(String toDate) {
            this.toDate = toDate;
        }

        public Integer getGeographicalFlag() {
            return geographicalFlag;
        }

        public void setGeographicalFlag(Integer geographicalFlag) {
            this.geographicalFlag = geographicalFlag;
        }
    }