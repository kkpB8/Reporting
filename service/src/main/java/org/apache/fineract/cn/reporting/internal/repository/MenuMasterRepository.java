package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface MenuMasterRepository extends JpaRepository<MenuMasterEntity, BigInteger> {

    @Query(nativeQuery = true, value="select m.menu_master_id,m.menu_name  from menu_role_mapping_master mr\n" +
            "inner join menu_master m on mr.menu_id=m.menu_master_id\n" +
            "where mr.role_id=?1")
    List<MenuMasterEntity> menuMasterDetails(
            @Param("roleId") final Integer roleId
    );

}
