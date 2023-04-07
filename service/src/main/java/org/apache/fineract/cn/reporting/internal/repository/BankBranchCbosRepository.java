package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface BankBranchCbosRepository extends JpaRepository<BankBranchCbosEntity, BigInteger> {
    @Query("FROM  BankBranchCbosEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(-1 = :districtId or c.districtId=:districtId) and " +
            "(-1 = :blockId or c.blockId=:blockId) and " +
            "(-1 = :bankId or c.bankId=:bankId) and " +
            "(-1 = :branchId or c.branchId=:branchId) and " +
            "(c.yearMonth>=:fromDate and c.yearMonth<=:toDate) and " +
            "(c.geographicalFlag=:geographicalFlag)")
    List<BankBranchCbosEntity> findByFilter(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("bankId") final Integer bankId,
            @Param("branchId") final Integer branchId,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate,
            @Param("geographicalFlag") final Integer geographicalFlag
    );

}

