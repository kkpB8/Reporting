/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.reporting.internal.Error;

import java.text.MessageFormat;

public final class ServiceException extends RuntimeException {
    private final ServiceError serviceError;

    public ServiceException(ServiceError serviceError) {
        super(serviceError.getMessage());
        this.serviceError = serviceError;
    }

    public static ServiceException badRequest(String message, Object... args) {
        return new ServiceException(ServiceError.create(600).message(MessageFormat.format(message, args)).build());
    }

    public static ServiceException notFound(String message, Object... args) {
        return new ServiceException(ServiceError.create(604).message(MessageFormat.format(message, args)).build());
    }

    public static ServiceException conflict(String message, Object... args) {
        return new ServiceException(ServiceError.create(609).message(MessageFormat.format(message, args)).build());
    }

    public static ServiceException internalError(String message, Object... args) {
        return new ServiceException(ServiceError.create(700).message(MessageFormat.format(message, args)).build());
    }

    public static ServiceException customErrorCodeAndMsg(Integer errorCode, String message, Object... args) {
        return new ServiceException(ServiceError.create(errorCode).message(MessageFormat.format(message, args)).build());
    }

    public ServiceError serviceError() {
        return this.serviceError;
    }

    public String toString() {
        return "ServiceException{serviceError=" + this.serviceError + '}';
    }
}
