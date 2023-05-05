package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClfVoFilterApiRestService {

        private final Logger logger;
        private final ClfVoFilterRepository clfVoFilterRepository;
        private final VoFilterRepository voFilterRepository;

        @Autowired
        public ClfVoFilterApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                              final ClfVoFilterRepository clfVoFilterRepository,
                                              final VoFilterRepository voFilterRepository ) {
            super();
            this.logger = logger;
            this.clfVoFilterRepository = clfVoFilterRepository;
            this.voFilterRepository = voFilterRepository;

        }
        public List<ClfVoFilterResponse> ClfFilterList() {
            List<ClfVoFilterResponse> clfVoFilterResponseList = new ArrayList<>();
            List<ClfVoFilterEntity> clfVoFilterEntityList;
            clfVoFilterEntityList = clfVoFilterRepository.
                    clfDetails();

            clfVoFilterEntityList.forEach(clfVoFilterEntity ->
            {
                ClfVoFilterResponse clfVoFilterResponse = CommonApiMapper.map(clfVoFilterEntity);
                clfVoFilterResponseList.add(clfVoFilterResponse);
            });
            return clfVoFilterResponseList;
        }
        public List<VoFilterResponse> VoFilterList(Integer cboId) {
        List<VoFilterResponse> voFilterResponseList = new ArrayList<>();
        List<VoFilterEntity> voFilterEntityList;
        voFilterEntityList = voFilterRepository.
                voDetails(cboId);

        voFilterEntityList.forEach(voFilterEntity ->
        {
            VoFilterResponse voFilterResponse = CommonApiMapper.map(voFilterEntity);
            voFilterResponseList.add(voFilterResponse);
        });
        return voFilterResponseList;
    }
}
