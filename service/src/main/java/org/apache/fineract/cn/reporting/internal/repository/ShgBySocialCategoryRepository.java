package org.apache.fineract.cn.reporting.internal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface ShgBySocialCategoryRepository extends JpaRepository<ShgBySocialCategoryEntity, BigInteger> {
        @Query("FROM  ShgBySocialCategoryEntity c WHERE " +
                "(c.geographicalFlag=:geographicalFlag) and "+
                "(c.yearMonth>=:fromDate and c.yearMonth<=:toDate) and " +
                "(-1 = :stateId or c.stateId=:stateId) and " +
                "(-1 = :districtId or c.districtId=:districtId) and " +
                "(-1 = :blockId or c.blockId=:blockId) and " +
                "(-1 = :panchayatId or c.panchayatId=:panchayatId) and " +
                "(-1 = :villageId or c.villageId=:villageId) and " +
                "(-1 = :shgId or c.shgId=:shgId) and " +
                "(-1 = :voId or c.voId=:voId) and " +
                "(-1 = :clfId or c.clfId=:clfId)")

        List<ShgBySocialCategoryEntity> findByFilter1(
                @Param("geographicalFlag") final Integer geographicalFlag,
                @Param("fromDate") final String fromDate,
                @Param("toDate") final String toDate,
                @Param("stateId") final Integer stateId,
                @Param("districtId") final Integer districtId,
                @Param("blockId") final Integer blockId,
                @Param("panchayatId") final Integer panchayatId,
                @Param("villageId") final Integer villageId,
                @Param("shgId") final Integer shgId,
                @Param("voId") final Integer voId,
                @Param("clfId") final Integer clfId

        );
    }

//    List<ResponseShgBySocialCategory> responseShgBySocialCategoryList = new ArrayList<>();
//    List<ShgBySocialCategoryEntity> shgBySocialCategoryEntityList;
//        shgBySocialCategoryEntityList = shgBySocialCategoryRepository.