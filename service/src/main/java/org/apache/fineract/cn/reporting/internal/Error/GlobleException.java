package org.apache.fineract.cn.reporting.internal.Error;

public class GlobleException extends Exception{

    public String responseCode;
    public String responseMsg;
    public String status;
    public String timestamp;

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    GlobleException(){
        super();
    }
    public GlobleException(String responseCode, String responseMsg, String status, String timestamp){
        super();
        this.responseCode=responseCode;
        this.responseMsg=responseMsg;
        this.status=status;
        this.timestamp=timestamp;
    }

    public String getResponseCode() {
        return responseCode;
    }


    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }


    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}

