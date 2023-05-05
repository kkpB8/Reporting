package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface MemberAttendanceRepository extends JpaRepository<MemberAttendanceEntity, BigInteger> {

     @Query(nativeQuery = true, value = " \n" +
            "select * from   fn_summarytrasanction_sub_reports(0,199)")
     List<MemberAttendanceEntity> findByAttendance(
     @Param("voId") final Integer voId
     );

    }




