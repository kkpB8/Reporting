package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;

public interface TransactionsSummaryRepository extends JpaRepository<TransactionsSummaryEntity, BigInteger> {
    @Query("FROM TransactionsSummaryEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(c.yearMonth>=:fromDate and c.yearMonth<=:toDate) and " +
            "(c.geographicalFlag=:geographicalFlag)")
    public List<TransactionsSummaryEntity> findByFilter2(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate,
            @Param("geographicalFlag") final Integer geographicalFlag
    );
}
