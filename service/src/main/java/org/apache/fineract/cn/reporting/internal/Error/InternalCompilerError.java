package org.apache.fineract.cn.reporting.internal.Error;

public class InternalCompilerError extends RuntimeException {
    public InternalCompilerError(String id) {
        super(id);
    }
}