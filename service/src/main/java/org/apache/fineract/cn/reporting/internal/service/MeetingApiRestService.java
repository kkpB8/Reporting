package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.MeetingApiRestRequest;
import org.apache.fineract.cn.reporting.api.domain.MeetingApiRestResponse;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.MeetingApiRestRepository;
import org.apache.fineract.cn.reporting.internal.repository.MeetingApiRestEntity;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@Service
public class MeetingApiRestService {
        private final Logger logger;
        private final MeetingApiRestRepository meetingApiRestRepository;

        @Autowired
        public MeetingApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                         final MeetingApiRestRepository meetingApiRestRepository) {
            super();
            this.logger = logger;
            this.meetingApiRestRepository = meetingApiRestRepository;

        }

        public List<MeetingApiRestResponse> fetchSHGSCList(Integer geographicalFlag, String fromDate, String toDate, Integer stateId, Integer districtId,
                                                           Integer blockId, Integer panchayatId, Integer villageId, Integer shgId, Integer voId, Integer clfId){
        if(geographicalFlag == null){
        geographicalFlag = -1;
    }
        if(fromDate == null){
        fromDate = "null";
    }
        if(toDate == null){
        toDate = "null";
    }
        if(stateId == null){
        stateId = -1;
    }
        if(districtId == null){
        districtId = -1;
    }
        if(blockId == null){
        blockId = -1;
    }
        if(panchayatId == null){
        panchayatId = -1;
    }
        if(villageId == null){
        villageId = -1;
    }
        if(shgId == null){
        shgId = -1;
    }
        if(voId == null){
        voId = -1;
    }
        if (clfId == null){
        clfId = -1;
    }
            List<MeetingApiRestResponse> meetingApiRestResponseList = new ArrayList<>();
            List<MeetingApiRestEntity> meetingApiRestEntityList;
            meetingApiRestEntityList = meetingApiRestRepository.
                    findByFilter(geographicalFlag, fromDate, toDate, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId);
            meetingApiRestEntityList.forEach(meetingApiRestEntity ->
            {
                MeetingApiRestResponse meetingApiRestResponse = CommonApiMapper.map(meetingApiRestEntity);
                meetingApiRestResponseList.add(meetingApiRestResponse);
            });
            return meetingApiRestResponseList;

        }
}