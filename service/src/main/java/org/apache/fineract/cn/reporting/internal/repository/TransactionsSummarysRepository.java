package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface TransactionsSummarysRepository extends JpaRepository<TransactionsSummarysEntity, BigInteger> {
    @Query("FROM TransactionsSummarysEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(-1 = :panchayatId or c.panchayatId=:panchayatId) and " +
            "(-1 = :voId or c.voId=:voId) and " +
            "(-1 = :clfId or c.clfId=:clfId) and " +
            "(c.yearMonth>=:fromDate and c.yearMonth<=:toDate) and " +
            "(c.geographicalFlag=:geographicalFlag)")
    List<TransactionsSummarysEntity> findByFilter4(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("panchayatId") final Integer panchayatId,
            @Param("voId") final BigInteger voId,
            @Param("clfId") final BigInteger clfId,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate,
            @Param("geographicalFlag") final Integer geographicalFlag
//            @Param("orderBy") final String orderBy
    );
}