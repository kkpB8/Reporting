package org.apache.fineract.cn.reporting.internal.Error;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String id) {
        super(id);
    }


}
