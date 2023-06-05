package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.service.SavingReportService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("/saving-report")
public class SavingReportController extends BaseController{
    private final Logger logger;
    private final SavingReportService savingReportService;

    public SavingReportController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger, SavingReportService savingReportService) {
        this.logger = logger;
        this.savingReportService = savingReportService;
    }

    @Permittable(value= AcceptedTokenType.GUEST)
    @GetMapping("/shg-saving")
    public ResponseEntity<GlobalApiResponse<?>> getShgSaving(@RequestParam("locationType") String locationType, @RequestParam(value = "locationId",defaultValue = "1") int locationId,
                                                             @RequestParam(value="fromDate",defaultValue = "2016-10") String fromDate, @RequestParam(value="toDate",defaultValue = "2021-07") String toDate) {
        return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",savingReportService.getShgSaving(locationType,locationId,fromDate,toDate)));
    }
}
