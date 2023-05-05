package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.ResponseShgBySocialCategory;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.ShgBySocialCategoryEntity;
import org.apache.fineract.cn.reporting.internal.repository.ShgBySocialCategoryRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShgBySocialCategoryService {
        private final Logger logger;
        private final ShgBySocialCategoryRepository shgBySocialCategoryRepository;

        @Autowired
        public ShgBySocialCategoryService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                         final ShgBySocialCategoryRepository shgBySocialCategoryRepository) {
            super();
            this.logger = logger;
            this.shgBySocialCategoryRepository = shgBySocialCategoryRepository;
        }
    public List<ResponseShgBySocialCategory> fetchShgInitiationList(Integer geographicalFlag, String fromDate, String toDate, Integer stateId, Integer districtId,
                                                                    Integer blockId, Integer panchayatId, Integer villageId, Integer shgId, Integer voId, Integer clfId) {

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
        if(villageId == null) {
            villageId = -1;
        }
        if(shgId == null){
            shgId = -1;
        }
        if(voId == null){
            voId = -1;
        }
        if(clfId == null){
            clfId = -1;
        }

        List<ResponseShgBySocialCategory> responseShgBySocialCategoryList = new ArrayList<>();
        List<ShgBySocialCategoryEntity> shgBySocialCategoryEntityList;
        shgBySocialCategoryEntityList = shgBySocialCategoryRepository.
                findByFilter1(geographicalFlag, fromDate, toDate, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId );

        shgBySocialCategoryEntityList.forEach(shgBySocialCategoryEntity ->
        {
            ResponseShgBySocialCategory responseShgBySocialCategory = CommonApiMapper.map(shgBySocialCategoryEntity);
            responseShgBySocialCategoryList.add(responseShgBySocialCategory);
        });
        return responseShgBySocialCategoryList;
    }
}
