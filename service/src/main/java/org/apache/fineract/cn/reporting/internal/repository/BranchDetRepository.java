package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface BranchDetRepository extends JpaRepository<BranchDetEntity, BigInteger> {
    @Query("FROM  BranchDetEntity c WHERE "+
            "(c.bankId=:bankId and c.geographicalFlag=:geographicalFlag)")
//            "(c.geographicalFlag=:geographicalFlag)")
//    List<BankDetailsEntity> fetchBankList(
    List<BranchDetEntity> fetchBranchList(
            @Param("bankId") final Integer bankId,
            @Param("geographicalFlag") final Integer geographicalFlag
    );
}
