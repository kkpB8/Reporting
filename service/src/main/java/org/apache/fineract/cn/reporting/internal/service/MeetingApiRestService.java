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

        public List<MeetingApiRestResponse> fetchMeetingList(MeetingApiRestRequest meetingApiRestRequest) {
            if(meetingApiRestRequest.getStateId() == null){
                meetingApiRestRequest.setStateId(-1);
            }
            if(meetingApiRestRequest.getDistrictId() == null){
                meetingApiRestRequest.setDistrictId(-1);
            }
            if(meetingApiRestRequest.getBlockId() == null){
                meetingApiRestRequest.setBlockId(-1);
            }
            if(meetingApiRestRequest.getVillageId() == null){
                meetingApiRestRequest.setVillageId(-1);
            }
            if(meetingApiRestRequest.getPanchayatId() == null){
                meetingApiRestRequest.setPanchayatId(-1);
            }
            if(meetingApiRestRequest.getShgId() == null){
                meetingApiRestRequest.setShgId(-1);
            }
            if(meetingApiRestRequest.getVoId() == null){
                meetingApiRestRequest.setVoId(-1);
            }
            if(meetingApiRestRequest.getClfId() == null){
                meetingApiRestRequest.setClfId(-1);
            }
            if(meetingApiRestRequest.getFromDate() == null){
                meetingApiRestRequest.setFromDate("null");
            }
            if(meetingApiRestRequest.getToDate()== null){
                meetingApiRestRequest.setToDate("null");
            }
            if(meetingApiRestRequest.getGeographicalFlag()==null){
                meetingApiRestRequest.setGeographicalFlag(-1);
            }

            List<MeetingApiRestResponse> meetingApiRestResponseList = new ArrayList<>();
            List<MeetingApiRestEntity> meetingApiRestEntityList;
            meetingApiRestEntityList = meetingApiRestRepository.
                    findByFilter(
                            meetingApiRestRequest.getStateId(),
                            meetingApiRestRequest.getDistrictId(),
                            meetingApiRestRequest.getBlockId(),
                            meetingApiRestRequest.getVillageId(),
                            meetingApiRestRequest.getPanchayatId(),
                            meetingApiRestRequest.getShgId(),
                            meetingApiRestRequest.getVoId(),
                            meetingApiRestRequest.getClfId(),
                            meetingApiRestRequest.getFromDate(),
                            meetingApiRestRequest.getToDate(),
                            meetingApiRestRequest.getGeographicalFlag()
                    );

            meetingApiRestEntityList.forEach(meetingApiRestEntity ->
            {
                MeetingApiRestResponse meetingApiRestResponse = CommonApiMapper.map(meetingApiRestEntity);
//                double total = meetingApiRestResponse.getTotalShgFormed() * meetingApiRestResponse.getTotalShgFormed();
//                MeetingApiRestResponse meetingApiRestResponse1 = new MeetingApiRestResponse();
//                meetingApiRestResponse1 = meetingApiRestResponse;
//                meetingApiRestResponse1.setStateId(meetingApiRestResponse.getStateId());
//                meetingApiRestResponse1.setDistrictId(meetingApiRestResponse.getDistrictId());
//                meetingApiRestResponse1.setBlockId(meetingApiRestResponse.getBlockId());
//                meetingApiRestResponse1.setVillageId(meetingApiRestResponse.getVillageId());
//                meetingApiRestResponse1.setPanchayatId(meetingApiRestResponse.getPanchayatId());
//                meetingApiRestResponse1.setTotalShgFormed(meetingApiRestResponse.getTotalShgFormed());
//                meetingApiRestResponse1.setShgConductedMeeting(meetingApiRestResponse.getShgConductedMeeting());
//                meetingApiRestResponse1.setGeographicalFlag(meetingApiRestResponse.getGeographicalFlag());
//                meetingApiRestResponse1.setYearMonth(meetingApiRestResponse.getYearMonth());
//                meetingApiRestResponse1.setShgId(meetingApiRestResponse.getShgId());
//                meetingApiRestResponse1.setVoId(meetingApiRestResponse.getVoId());
//                meetingApiRestResponse1.setClfId(meetingApiRestResponse.getClfId());
//                meetingApiRestResponse1.setTotal(total);
                meetingApiRestResponseList.add(meetingApiRestResponse);
            });
            return meetingApiRestResponseList;

        }
}