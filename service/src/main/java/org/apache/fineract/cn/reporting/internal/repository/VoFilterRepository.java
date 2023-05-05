package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface VoFilterRepository extends JpaRepository<VoFilterEntity, BigInteger>{
    @Query(nativeQuery = true, value="select distinct Cast(cmd.cbo_child_id as varchar(50)),  fp.federation_name from public.federation_profile  fp\n" +
            "inner join cbo_mapping_details cmd on fp.federation_id=cmd.cbo_child_id where fp.cbo_type='1' and  cmd.cbo_id=?1")
    List<VoFilterEntity> voDetails(
            @Param("cboId") final Integer cboId
    );
}

//    select distinct Cast(cmd.cbo_child_id as varchar(50)),  fp.federation_name from public.federation_profile  fp
//        inner join cbo_mapping_details cmd on fp.federation_id=cmd.cbo_child_id where fp.cbo_type='1' and  cmd.cbo_id='287'