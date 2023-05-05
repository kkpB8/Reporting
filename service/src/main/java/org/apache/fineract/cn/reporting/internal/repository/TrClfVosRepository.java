package org.apache.fineract.cn.reporting.internal.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface TrClfVosRepository extends JpaRepository<TrClfVoEntity, BigInteger> {
/*
@Query(nativeQuery = true, value = "select * from fn_transaction_clf_vo_data('178008')")
    List<TrClfVoEntity> fetclfvoList(
@Param("village_id") final Integer village_id
        );
*/

    @Query(nativeQuery = true, value = "select  um.user_name B_K_Name,CAST(vm.village_id as int) village_id ,\n" +
            "CAST(count(shg_id) as int) SHGsMapped,CAST(count(CASE WHEN to_char(sp.updated_date,'YYYY-MM')='2023-04'\n" +
            "then shg_id end) as int) as shgUpdated from village_master vm inner join shg_profile sp on vm.village_id=sp.village_id \n" +
            "inner join public.users_master um on \n" +
            "um.user_id = sp.user_id \n" +
            "where sp.status=1 and sp.is_active='true' and activation_status=2 and sp.user_id is not null and (vm.village_id=178008)\n" +
            "group by vm.village_id,um.user_name")
    List<TrClfVoEntity> fetclfvoList(
            @Param("village_id") final Integer village_id
    );

}
