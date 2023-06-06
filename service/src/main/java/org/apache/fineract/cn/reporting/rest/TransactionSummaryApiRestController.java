package org.apache.fineract.cn.reporting.rest;

import org.apache.fineract.cn.anubis.annotation.AcceptedTokenType;
import org.apache.fineract.cn.anubis.annotation.Permittable;
import org.apache.fineract.cn.reporting.ServiceConstants;
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;
import org.apache.fineract.cn.reporting.internal.Error.RequestInputMissing;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.apache.fineract.cn.reporting.internal.service.TransactionSummaryApiService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/report1")
public class TransactionSummaryApiRestController extends  BaseController{

  private final Logger logger;
  private final TransactionSummaryApiService transactionSummaryApiService;


  @Autowired
  public TransactionSummaryApiRestController(@Qualifier(ServiceConstants.LOGGER_NAME) final Logger logger,
                                             final TransactionSummaryApiService transactionSummaryApiService) {
    super();
    this.logger = logger;
    this.transactionSummaryApiService = transactionSummaryApiService;
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-shg-meeting",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<List<TransactionSummary>>> fetchShgMeetingSummaryList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                                         @RequestParam("flag") Integer flag,
                                                                                         @RequestParam("fromDate") String fromDate,
                                                                                         @RequestParam("toDate") String toDate,
                                                                                         @RequestParam("yearMonth") String yearMonth,
                                                                                         @RequestParam("stateId") Integer stateId,
                                                                                         @RequestParam("districtId") Integer districtId,
                                                                                         @RequestParam("blockId") Integer blockId,
                                                                                         @RequestParam("panchayatId") Integer panchayatId,
                                                                                         @RequestParam("villageId") Integer villageId,
                                                                                         @RequestParam("shgId") BigInteger shgId,
                                                                                         @RequestParam("voId") BigInteger voId,
                                                                                         @RequestParam("clfId") BigInteger clfId) {

    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchShgTransactionsSummaryList(geographicalFlag, flag, fromDate, toDate, yearMonth,stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId)));


  }


  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-shg-saving",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )

  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<List<TransactionSummary>>> fetchShgSavingSummaryList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                                        @RequestParam("flag") Integer flag,
                                                                                        @RequestParam("fromDate") String fromDate,
                                                                                        @RequestParam("toDate") String toDate,
                                                                                        @RequestParam("yearMonth") String yearMonth,
                                                                                        @RequestParam("stateId") Integer stateId,
                                                                                        @RequestParam("districtId") Integer districtId,
                                                                                        @RequestParam("blockId") Integer blockId,
                                                                                        @RequestParam("panchayatId") Integer panchayatId,
                                                                                        @RequestParam("villageId") Integer villageId,
                                                                                        @RequestParam("shgId") BigInteger shgId,
                                                                                        @RequestParam("voId") BigInteger voId,
                                                                                        @RequestParam("clfId") BigInteger clfId) {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchShgTransactionsSummaryList(geographicalFlag, flag, fromDate, toDate, yearMonth, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId)));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-shg-loan",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<List<TransactionSummary>>> fetchShgLoanSummaryList(@RequestParam("geographicalFlag") Integer geographicalFlag,
                                                                                      @RequestParam("flag") Integer flag,
                                                                                      @RequestParam("fromDate") String fromDate,
                                                                                      @RequestParam("toDate") String toDate,
                                                                                      @RequestParam("yearMonth") String yearMonth,
                                                                                      @RequestParam("stateId") Integer stateId,
                                                                                      @RequestParam("districtId") Integer districtId,
                                                                                      @RequestParam("blockId") Integer blockId,
                                                                                      @RequestParam("panchayatId") Integer panchayatId,
                                                                                      @RequestParam("villageId") Integer villageId,
                                                                                      @RequestParam("shgId") BigInteger shgId,
                                                                                      @RequestParam("voId") BigInteger voId,
                                                                                      @RequestParam("clfId") BigInteger clfId) {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchShgTransactionsSummaryList(geographicalFlag, flag, fromDate, toDate,yearMonth, stateId, districtId, blockId, panchayatId, villageId, shgId, voId, clfId)));
  }
//    return ResponseEntity.ok(
//            this.transactionSummaryApiService.fetchShgTransactionSummaryList(transactionSummaryRequest));
//  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-vo-meeting",
          method = RequestMethod.POST,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<List<VoTransactionSummary>>> fetchVoMeetingSummaryList(@RequestBody TransactionSummaryRequest transactionSummaryRequest) {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchVoTransactionSummaryList(transactionSummaryRequest)));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-vo-saving",
          method = RequestMethod.POST,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<List<VoTransactionSummary>>> fetchVoSavingSummaryList(@RequestBody TransactionSummaryRequest transactionSummaryRequest) {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchVoTransactionSummaryList(transactionSummaryRequest)));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/get-vo-loan",
          method = RequestMethod.POST,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public
  @ResponseBody
  ResponseEntity<GlobalApiResponse<List<VoTransactionSummary>>> fetchVoLoanSummaryList(@RequestBody TransactionSummaryRequest transactionSummaryRequest) {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchVoTransactionSummaryList(transactionSummaryRequest)));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/shg-meeting-dd",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  ResponseEntity<GlobalApiResponse<List<ShgMeetingResponse>>> fetchBranchList(@RequestParam("villageId") Integer villageId) {
//  public List<ShgMeetingResponse> fetchBranchList(@RequestParam("villageId") Integer villageId) {
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchBranchList(villageId)));
  }

  @Permittable(value = AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/shg-subreports",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  ResponseEntity<GlobalApiResponse<List<SummaryTransactionSubReportsResponse>>> fetchSubReportsList(@RequestParam("villageId") Integer villageId,
                                                                                                    @RequestParam("voId") Integer voId,
                                                                                                    HttpServletRequest httpServletRequest) {
    if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
      this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
      throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
    }
    String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");
    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200",
            this.transactionSummaryApiService.fetchSubReportsList(villageId, voId, tenantIdentifier)));
  }
  @Permittable(value= AcceptedTokenType.GUEST)
  @RequestMapping(
          value = "/shg-saving",
          method = RequestMethod.GET,
          consumes = MediaType.ALL_VALUE,
          produces = MediaType.APPLICATION_JSON_VALUE
  )
  public ResponseEntity<GlobalApiResponse<List<ShgsSavingResponse>>> getShgSaving(HttpServletRequest httpServletRequest) {
    if (httpServletRequest.getHeader("X-Tenant-Identifier") == null) {
      this.logger.error(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
      throw new RequestInputMissing(CustomStatus.REQUEST_INPUT_NOT_PRESENT_MSG + "{X-Tenant-Identifier}");
    }
    String tenantIdentifier = httpServletRequest.getHeader("X-Tenant-Identifier");

    return ResponseEntity.ok(getSuccessResponse("Data retrieve successfully","200", this.transactionSummaryApiService.getShgSaving(tenantIdentifier)));
  }
}