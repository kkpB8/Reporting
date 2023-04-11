package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface MeetingApiRestRepository extends JpaRepository<MeetingApiRestEntity, BigInteger> {
        @Query("FROM  MeetingApiRestEntity c WHERE " +
                "(-1 = :stateId or c.stateId=:stateId) and " +
                "(-1 = :districtId or c.districtId=:districtId) and " +
                "(-1 = :blockId or c.blockId=:blockId) and " +
                "(-1 = :panchayatId or c.panchayatId=:panchayatId) and " +
                "(-1 = :villageId or c.villageId=:villageId) and " +
                "(-1 = :shgId or c.shgId=:shgId) and " +
                "(-1 = :voId or c.voId=:voId) and " +
                "(-1 = :clfId or c.clfId=:clfId) and " +
                "(c.yearMonth>=:fromDate or c.yearMonth<=:toDate) and " +
                "(c.geographicalFlag=:geographicalFlag)")
        List<MeetingApiRestEntity> findByFilter(
                @Param("stateId") final Integer stateId,
                @Param("districtId") final Integer districtId,
                @Param("blockId") final Integer blockId,
                @Param("villageId") final Integer villageId,
                @Param("panchayatId") final Integer panchayatId,
                @Param("shgId") final Integer shgId,
                @Param("voId") final Integer voId,
                @Param("clfId") final Integer clfId,
                @Param("fromDate") final String fromDate,
                @Param("toDate") final String toDate,
                @Param("geographicalFlag") final Integer geographicalFlag

        );
    }
