package org.apache.fineract.cn.reporting.internal.Error;

public class UserWithStateNotFoundException extends RuntimeException {


    public UserWithStateNotFoundException(String id) {
        super(id);
    }


}
