package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.ResponseMemberAttendanceDetails;
import org.apache.fineract.cn.reporting.api.domain.ResponseMemberShgDetails;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
@Service
public class MemberShgDetailsApiRestService {
    private final Logger logger;
    private final MemberShgDetailsRepository memberShgDetailsRepository;
    private final MemberAttendanceRepository memberAttendanceRepository;

//    MemberAttendanceEntity

    @Autowired
    public MemberShgDetailsApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                          final MemberShgDetailsRepository memberShgDetailsRepository,
                                          final MemberAttendanceRepository memberAttendanceRepository) {
        super();
        this.logger = logger;
        this.memberShgDetailsRepository = memberShgDetailsRepository;
        this.memberAttendanceRepository = memberAttendanceRepository;

    }

    public List<ResponseMemberShgDetails> getMemberDetails(Integer stateId, Integer districtId, Integer blockId) {
/*
            if (stateId == null) {
                stateId = -1;
            }
            if (districtId == null) {
                districtId = -1;
            }
            if (blockId == null) {
                blockId = -1;
            }
, BigInteger shgId, BigInteger voId
 */

        List<ResponseMemberShgDetails> responseMemberShgDetailsList = new ArrayList<ResponseMemberShgDetails>();
        List<MemberShgDetailsEntity> memberShgDetailsEntityList;
        memberShgDetailsEntityList = memberShgDetailsRepository.
                findByFilter(stateId, districtId, blockId);

        memberShgDetailsEntityList.forEach(memberShgDetailsEntity ->
        {
            ResponseMemberShgDetails responseMemberShgDetails = CommonApiMapper.map(memberShgDetailsEntity);
            responseMemberShgDetailsList.add(responseMemberShgDetails);
        });
        return responseMemberShgDetailsList;
    }


    public List<ResponseMemberShgDetails> getShgVoAttendance(Integer stateId, Integer districtId, Integer blockId) {
        List<ResponseMemberShgDetails> responseMemberShgDetailsList = new ArrayList<>();
        List<Object[]> memberShgDetailsList;
        if (stateId == null) {
            stateId = -1;
        }
        if (districtId == null) {
            districtId = -1;
        }
        if (blockId == null) {
            blockId = -1;
        }

        memberShgDetailsList = memberShgDetailsRepository.getShgVoAttendance(stateId, districtId, blockId);
        if (memberShgDetailsList != null && memberShgDetailsList.size() > 0) {
            for (Object[] loanShgReports : memberShgDetailsList) {
                ResponseMemberShgDetails responseMemberShgDetails = new ResponseMemberShgDetails();
                if (loanShgReports[0] != null) {
                    responseMemberShgDetails.setStateId(((Number) loanShgReports[0]).intValue());
                }
                if (loanShgReports[1] != null) {
                    responseMemberShgDetails.setDistrictId(((Number) loanShgReports[1]).intValue());
                }
                if (loanShgReports[2] != null) {
                    responseMemberShgDetails.setBlockId(((Number) loanShgReports[2]).intValue());
                }
                if (loanShgReports[3] != null) {
                    responseMemberShgDetails.setVoId(new BigInteger(loanShgReports[3].toString()));
                }
                if (loanShgReports[4] != null) {
                    responseMemberShgDetails.setShgId(new BigInteger(loanShgReports[4].toString()));
                }
                if (loanShgReports[5] != null) {
                    responseMemberShgDetails.setShgName(loanShgReports[5].toString());
                }
                if (loanShgReports[6] != null) {
                    responseMemberShgDetails.setShgMember(new BigInteger(loanShgReports[6].toString()));
                }
                if (loanShgReports[7] != null) {
                    responseMemberShgDetails.setTotalAttendance(((Number) loanShgReports[7]).intValue());
                }
                if (loanShgReports[8] != null) {
                    responseMemberShgDetails.setTotalMeetingHeld(((Number) loanShgReports[8]).intValue());
                }
                responseMemberShgDetailsList.add(responseMemberShgDetails);
            }
        } else {
            throw new RecordNotFoundException(CustomStatus.NOT_FOUND_MSG);
        }
        return responseMemberShgDetailsList;
    }


    public List<ResponseMemberAttendanceDetails> getMemberAttendenceDetails(Integer voId) {


        List<ResponseMemberAttendanceDetails> responseMemberAttendanceDetailsList = new ArrayList<ResponseMemberAttendanceDetails>();
        List<MemberAttendanceEntity> memberAttendanceEntityList;
        memberAttendanceEntityList = memberAttendanceRepository.
                findByAttendance(voId);

        memberAttendanceEntityList.forEach(memberAttendanceEntity ->
        {
            ResponseMemberAttendanceDetails responseMemberAttendanceDetails = CommonApiMapper.map(memberAttendanceEntity);
            responseMemberAttendanceDetailsList.add(responseMemberAttendanceDetails);
        });
        return responseMemberAttendanceDetailsList;
    }

}