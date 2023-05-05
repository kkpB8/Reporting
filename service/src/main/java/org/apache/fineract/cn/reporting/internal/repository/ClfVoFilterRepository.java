package org.apache.fineract.cn.reporting.internal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface ClfVoFilterRepository extends JpaRepository<ClfVoFilterEntity, BigInteger> {
        @Query(nativeQuery = true, value="select federation_id , federation_name from federation_profile\n" +
                "        where cbo_type=2 and is_active=true and status=1 and approve_status=2")
        List<ClfVoFilterEntity> clfDetails();

}
