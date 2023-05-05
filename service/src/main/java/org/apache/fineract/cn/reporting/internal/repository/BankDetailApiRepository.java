
package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface BankDetailApiRepository extends JpaRepository<BankDetailApiEntity, BigInteger> {
  /*  @Query("FROM BankDetailApiEntity c WHERE " +
        //    "( c.stateId=:stateId) and " +
            "( c.bankId=:bankId) and " +
            "(c.geographicalFlag=:geographicalFlag)")
    public List<BankDetailApiEntity> fetchBanksList(
          //  @Param("stateId") final Integer stateId,
            @Param("bankId") final Integer bankId,
            @Param("geographicalFlag") final Integer geographicalFlag
    );
   */

    @Query("FROM  BankDetailApiEntity c WHERE " +
            "(-1 = :stateId or c.stateId=:stateId) and " +
            "(c.geographicalFlag=:geographicalFlag)")
    List<BankDetailApiEntity> fetchBanksList(
            @Param("stateId") final Integer stateId,
            @Param("geographicalFlag") final Integer geographicalFlag
    );
    @Query("FROM  BankDetailApiEntity c WHERE "+
            //  "(-1 = :bankId=:bankId and c.geographicalFlag=:geographicalFlag)")
            "(-1 = :bankId or c.bankId=:bankId) and " +
            "(c.geographicalFlag=:geographicalFlag)")
    List<BankDetailApiEntity> fetchBranchList1(
            @Param("bankId") final Integer bankId,
            @Param("geographicalFlag") final Integer geographicalFlag
    );
}