package org.apache.fineract.cn.reporting.internal.Error;

public class MaximumLoginAttempsReached extends RuntimeException{
    public MaximumLoginAttempsReached(String id) {
        super(id);
    }
}
