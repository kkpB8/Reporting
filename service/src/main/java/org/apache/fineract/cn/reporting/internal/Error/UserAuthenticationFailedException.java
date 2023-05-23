package org.apache.fineract.cn.reporting.internal.Error;

public class UserAuthenticationFailedException extends RuntimeException {
    public UserAuthenticationFailedException(String id) {
        super(id);
    }

}
