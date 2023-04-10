package org.apache.fineract.cn.reporting.internal.repository;

import org.apache.fineract.cn.reporting.api.domain.ResponseBankDeatils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetailsEntity, BigInteger> {
    @Query("FROM  BankDetailsEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(c.geographicalFlag=:geographicalFlag)")
//    List<BankDetailsEntity> fetchBankList(
    List<BankDetailsEntity> fetchBanksList(
            @Param("stateId") final Integer stateId,
            @Param("geographicalFlag") final Integer geographicalFlag
    );
}
