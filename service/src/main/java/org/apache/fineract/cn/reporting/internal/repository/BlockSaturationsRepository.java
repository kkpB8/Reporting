package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
//@Repository
public interface BlockSaturationsRepository  {
//extends JpaRepository<BlockSaturationsEntity, BigInteger>
    /*
        @Query(nativeQuery = true, value="select ab.state_id,ab.district_id, ab.block_id ,count(CASE WHEN nm > 0 and nm <4 then nm end) zero_3,\n" +
                "count(CASE WHEN nm >3  and nm <7 then nm end) three_6,\n" +
                "count(CASE WHEN nm >5  and nm <11 then nm end) six_10,\n" +
                "count(CASE WHEN  nm >10 then nm end) MORETHEN10\n" +
                "\n" +
                "from (\n" +
                "select ab.state_id,ab.district_id, ab.block_id ,cast(DATE_PART('day', current_date::timestamp - ab.date_intervention::timestamp) as int) / 365 as nm\n" +
                "from block_master ab ) ab\n" +
                "group by ab.state_id,ab.district_id, ab.block_id")
    List<BlockSaturationsEntity> findByFilter(
            @Param("stateId") final Integer stateId,
            @Param("districtId") final Integer districtId,
            @Param("blockId") final Integer blockId,
            @Param("geographicalFlag") final Integer geographicalFlag,
            @Param("fromDate") final String fromDate,
            @Param("toDate") final String toDate

            );
     */
}
