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
package org.apache.fineract.cn.reporting.internal.exception;

import java.text.MessageFormat;

public final class CustomServiceException  extends RuntimeException {
    private final CustomServiceError customServiceError;

    public CustomServiceException(CustomServiceError customServiceError) {
        super(customServiceError.getMessage());
        this.customServiceError = customServiceError;
    }

    public static CustomServiceException badRequest(String message, Object... args) {
        return new CustomServiceException(CustomServiceError.create(400).message(MessageFormat.format(message, args)).build());
    }

    public static CustomServiceException notFound(String message, Object... args) {
        return new CustomServiceException(CustomServiceError.create(404).message(MessageFormat.format(message, args)).build());
    }

    public static CustomServiceException conflict(String message, Object... args) {
        return new CustomServiceException(CustomServiceError.create(409).message(MessageFormat.format(message, args)).build());
    }

    public static CustomServiceException internalError(String message, Object... args) {
        return new CustomServiceException(CustomServiceError.create(500).message(MessageFormat.format(message, args)).build());
    }

    public static CustomServiceException customErrorCodeAndMsg(Integer errorCode, String message, Object... args) {
        return new CustomServiceException(CustomServiceError.create(errorCode).message(MessageFormat.format(message, args)).build());
    }

    public static CustomServiceException recordNotFoundError(String message, Object... args) {
        return new CustomServiceException(CustomServiceError.create(1003).message(MessageFormat.format(message, args)).build());
    }

    public static CustomServiceException processingError(String message, Object... args) {
        return new CustomServiceException(CustomServiceError.create(900).message(MessageFormat.format(message, args)).build());
    }


    public CustomServiceError customServiceError() {
        return this.customServiceError;
    }

    public String toString() {
        return "" + this.customServiceError + "";
    }
}
