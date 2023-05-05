package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface BranchDetailApiRepository extends JpaRepository<BranchDetailApiEntity, BigInteger>{

    @Query("FROM  BranchDetailApiEntity c WHERE "+
          //  "(-1 = :bankId=:bankId and c.geographicalFlag=:geographicalFlag)")
            "(-1 = :bankId or c.bankId=:bankId) and " +
            "(c.geographicalFlag=:geographicalFlag)")
    List<BranchDetailApiEntity> fetchBranchsList(
            @Param("bankId") final Integer bankId,
            @Param("geographicalFlag") final Integer geographicalFlag

    );
}
