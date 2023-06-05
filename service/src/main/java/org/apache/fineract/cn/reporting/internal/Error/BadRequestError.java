package org.apache.fineract.cn.reporting.internal.Error;

public class BadRequestError extends RuntimeException {

    public BadRequestError(String id) {
        super(id);
    }

}