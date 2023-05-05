package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.MenuMasterResponse;
import org.apache.fineract.cn.reporting.internal.Error.RecordNotFoundException;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.MenuMasterByUserApiRestService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/menu")
public class MenuMasterByUserApiRestController {

        private final Logger logger;
        private final MenuMasterByUserApiRestService menuMasterByUserApiRestService;
        @Autowired
        public MenuMasterByUserApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, final  MenuMasterByUserApiRestService menuMasterByUserApiRestService) {
            super();
            this.logger = logger;
            this.menuMasterByUserApiRestService = menuMasterByUserApiRestService;
        }
        @Permittable(value = AcceptedTokenType.GUEST)
        @RequestMapping(
                value = "/menu-master",
                method = RequestMethod.GET,
                consumes = MediaType.ALL_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
        )
        public
        @ResponseBody
        ResponseEntity<List<MenuMasterResponse>> MenuMasterByUserList (@RequestParam("roleId") Integer roleId) {
            if (roleId != null) {
                return ResponseEntity.ok(
                        this.menuMasterByUserApiRestService.MenuMasterByUserList(roleId));
            } else {
                throw new RecordNotFoundException(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG);
            }
        }
}

