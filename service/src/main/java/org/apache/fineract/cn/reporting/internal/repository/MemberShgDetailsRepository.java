package org.apache.fineract.cn.reporting.internal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
@Repository
public interface MemberShgDetailsRepository extends JpaRepository<MemberShgDetailsEntity, BigInteger> {
    @Query(nativeQuery = true, value = "select state_id,district_id,block_id,vo_id,shg_id,shg_name,count(mp.member_id) shg_mem ,\n" +
            "COALESCE(total_attendance,0) total_attendance ,COALESCE(total_meeting_held,0) total_meeting_held\n" +
            "from (\n" +
            "select sp.state_id,sp.district_id,sp.block_id--,fdd.clfId as CLFID\n" +
            ",fdd.vo_id,dd.cbo_child_id shg_id,shg_name,count(dd.cbo_child_id) shg_num\n" +
            "from cbo_mapping_details dd\n" +
            "inner join \n" +
            "(\n" +
            "select cc.cbo_id clfId, cbo_child_id vo_id,state_id,district_id,block_id from cbo_mapping_details  cc\n" +
            "inner join \n" +
            "( select distinct state_id,district_id,block_id,federation_id clfId ,cmd.cbo_id clf_id from public.federation_profile fp \n" +
            "inner join public.cbo_mapping_details cmd\n" +
            "on fp.federation_id=cmd.cbo_id\n" +
            "where fp.cbo_type=2\n" +
            "and fp.activation_status=2 and fp.is_active=true )fd on fd.clfId=cc.cbo_id\n" +
            ")fdd\n" +
            "on fdd.vo_id=dd.cbo_id\n" +
            "inner join shg_profile sp ON sp.shg_id=dd.cbo_child_id\n" +
            "where sp.state_id=10 and sp.district_id=170 and sp.block_id=3644 and vo_id=199\n" +
            "group by sp.state_id,sp.district_id,sp.block_id,vo_id,dd.cbo_child_id ,shg_name\n" +
            ") as aa \n" +
            "left join member_profile mp ON mp.cbo_id=aa.shg_id\n" +
            "left join shg_mtg mtg ON mtg.cbo_id=aa.shg_id\n" +
            "group by state_id,district_id,block_id,vo_id,shg_id,shg_name,total_attendance,total_meeting_held")
    List<MemberShgDetailsEntity> findByFilter(
            @Param("stateId") final Integer stateId,
            @Param("stateId") final Integer districtId,
            @Param("stateId") final Integer blockId
    );


    @Query(nativeQuery = true, value = "select state_id,district_id,block_id,vo_id,shg_id,shg_name,count(mp.member_id) shg_mem ,\n" +
            "COALESCE(total_attendance,0) total_attendance ,COALESCE(total_meeting_held,0) total_meeting_held\n" +
            "from (\n" +
            "select sp.state_id,sp.district_id,sp.block_id--,fdd.clfId as CLFID\n" +
            ",fdd.vo_id,dd.cbo_child_id shg_id,shg_name,count(dd.cbo_child_id) shg_num\n" +
            "from cbo_mapping_details dd\n" +
            "inner join \n" +
            "(\n" +
            "select cc.cbo_id clfId, cbo_child_id vo_id,state_id,district_id,block_id from cbo_mapping_details  cc\n" +
            "inner join \n" +
            "( select distinct state_id,district_id,block_id,federation_id clfId ,cmd.cbo_id clf_id from public.federation_profile fp \n" +
            "inner join public.cbo_mapping_details cmd\n" +
            "on fp.federation_id=cmd.cbo_id\n" +
            "where fp.cbo_type=2\n" +
            "and fp.activation_status=2 and fp.is_active=true )fd on fd.clfId=cc.cbo_id\n" +
            ")fdd\n" +
            "on fdd.vo_id=dd.cbo_id\n" +
            "inner join shg_profile sp ON sp.shg_id=dd.cbo_child_id\n" +
            "where sp.state_id=10 and sp.district_id=170 and sp.block_id=3644 and vo_id=199\n" +
            "group by sp.state_id,sp.district_id,sp.block_id,vo_id,dd.cbo_child_id ,shg_name\n" +
            ") as aa \n" +
            "left join member_profile mp ON mp.cbo_id=aa.shg_id\n" +
            "left join shg_mtg mtg ON mtg.cbo_id=aa.shg_id\n" +
            "group by state_id,district_id,block_id,vo_id,shg_id,shg_name,total_attendance,total_meeting_held")
    List<Object[]> getShgVoAttendance(Integer stateId, Integer districtId, Integer blockId);








    }



//findByAttendance
//    getShgVoAttendance