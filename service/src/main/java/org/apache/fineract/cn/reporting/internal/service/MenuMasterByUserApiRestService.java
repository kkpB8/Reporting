package org.apache.fineract.cn.reporting.internal.service;

import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.MenuMasterResponse;
import org.apache.fineract.cn.reporting.internal.mapper.CommonApiMapper;
import org.apache.fineract.cn.reporting.internal.repository.*;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuMasterByUserApiRestService {

    private final Logger logger;
    private final MenuMasterRepository menuMasterRepository;

    @Autowired
    public MenuMasterByUserApiRestService(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,

                                     final MenuMasterRepository menuMasterRepository ) {
        super();
        this.logger = logger;
        this.menuMasterRepository = menuMasterRepository;

    }
    public List<MenuMasterResponse> MenuMasterByUserList(Integer roleId) {
        List<MenuMasterResponse> menuMasterResponseList = new ArrayList<>();
        List<MenuMasterEntity> menuMasterEntityList;
        menuMasterEntityList = menuMasterRepository.
                menuMasterDetails(roleId);

        menuMasterEntityList.forEach(menuMasterEntity ->
        {
            MenuMasterResponse menuMasterResponse = CommonApiMapper.map(menuMasterEntity);
            menuMasterResponseList.add(menuMasterResponse);
        });
        return menuMasterResponseList;
    }
}

