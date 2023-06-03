package org.apache.fineract.cn.reporting.rest;
import config.ResponseStatus;
import org.apache.fineract.cn.reporting.internal.Error.GlobalApiResponse;

import java.time.LocalDateTime;
public class BaseController {

    protected final ResponseStatus API_SUCCESS_STATUS = ResponseStatus.SUCCESS;

    protected final ResponseStatus API_ERROR_STATUS = ResponseStatus.FAILURE;


    protected GlobalApiResponse successResponse(String message, Object data) {
        GlobalApiResponse globalApiResponse = new GlobalApiResponse();
        globalApiResponse.setStatus(API_SUCCESS_STATUS);
        globalApiResponse.setResponseMsg(message);
        globalApiResponse.setResponseData(data);
        globalApiResponse.setTimestamp(LocalDateTime.now().toString());
        return globalApiResponse;
    }

    protected GlobalApiResponse getSuccessResponse(String message, Object data) {
        GlobalApiResponse globalApiResponse = new GlobalApiResponse();
        globalApiResponse.setStatus(API_SUCCESS_STATUS);
        globalApiResponse.setResponseMsg(message);
        globalApiResponse.setTimestamp(LocalDateTime.now().toString());
        globalApiResponse.setResponseData(data);
        return globalApiResponse;
    }

    protected GlobalApiResponse getSuccessResponse(String message, String code, Object data) {
        GlobalApiResponse globalApiResponse = new GlobalApiResponse();
        globalApiResponse.setStatus (API_SUCCESS_STATUS);
        globalApiResponse.setResponseMsg(message);
        globalApiResponse.setResponseCode(code);
        globalApiResponse.setTimestamp(LocalDateTime.now().toString());
        globalApiResponse.setResponseData(data);
        return globalApiResponse;
    }

    protected GlobalApiResponse errorResponse(String message, Object errors) {
        GlobalApiResponse globalApiResponse = new GlobalApiResponse();
        globalApiResponse.setStatus(API_ERROR_STATUS);
        globalApiResponse.setResponseMsg(message);
        globalApiResponse.setTimestamp(LocalDateTime.now().toString());
        globalApiResponse.setResponseData(errors);
        return globalApiResponse;

    }
}