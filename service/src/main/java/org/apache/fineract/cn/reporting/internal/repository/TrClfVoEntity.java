package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.*;

@Entity
@Cacheable(value = false)
@Table(name = "cbo_summary")
public class TrClfVoEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "b_k_name")
        private String b_k_name;
        @Column(name = "village_id")
        private Integer village_id;
        @Column(name = "shgsmapped")
        private Integer shgsmapped;
        @Column(name = "shgupdated")
        private Integer shgupdated;

        public String getB_k_name() {
                return b_k_name;
        }

        public void setB_k_name(String b_k_name) {
                this.b_k_name = b_k_name;
        }

        public Integer getVillage_id() {
                return village_id;
        }

        public void setVillage_id(Integer village_id) {
                this.village_id = village_id;
        }

        public Integer getShgsmapped() {
                return shgsmapped;
        }

        public void setShgsmapped(Integer shgsmapped) {
                this.shgsmapped = shgsmapped;
        }

        public Integer getShgupdated() {
                return shgupdated;
        }

        public void setShgupdated(Integer shgupdated) {
                this.shgupdated = shgupdated;
        }
}
