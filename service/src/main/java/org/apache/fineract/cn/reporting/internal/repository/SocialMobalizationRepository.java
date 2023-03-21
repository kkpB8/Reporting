package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface SocialMobalizationRepository extends JpaRepository<SocialMobalizationEntity, BigInteger> {
    @Query("FROM  SocialMobalizationEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(c.yearMonth>=:fromDate and c.yearMonth<=:toDate) and " +
            "(:yearMonth is not null or c.yearMonth=:yearMonth) and " +
            "(c.geographicalFlag=:geographicalFlag)")

    List<SocialMobalizationEntity> findByFilter(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate,
            @Param("yearMonth") final String yearMonth,
            @Param("geographicalFlag") final Integer geographicalFlag
    );
}