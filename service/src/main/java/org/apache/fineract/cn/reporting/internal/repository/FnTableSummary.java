package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface FnTableSummary extends JpaRepository<FnTableSummaryEntity,Long> {



    @Transactional
    @Modifying
    @Query(value="select fn_table_summary(:geo_flag,:groupby,:wherestr,:insertstr,:yrmn)",nativeQuery = true)
    void fn_table_summary(@Param("geo_flag")Integer geo_flag, @Param("groupby")String groupby,
                          @Param("wherestr")String wherestr, @Param("insertstr")String insertstr, @Param("yrmn")String yrmn);


    @Transactional
    @Modifying
    @Query(value="select fn_tbl_summary_users(:geo_flag,:groupby,:wherestr,:insertstr,:yrmn)",nativeQuery = true)
    void fn_table_summary_user(@Param("geo_flag")Integer geo_flag, @Param("groupby")String groupby,
                          @Param("wherestr")String wherestr, @Param("insertstr")String insertstr, @Param("yrmn")String yrmn);



}
