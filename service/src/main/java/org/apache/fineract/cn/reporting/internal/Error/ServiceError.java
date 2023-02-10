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

public final class ServiceError {
    private final int code;
    private final String message;

    private ServiceError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static Builder create(int code) {
        return new Builder(code);
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return "{code=" + this.code + ", message='" + this.message + '\'' + '}';
    }

    public static final class Builder {
        private final int code;
        private String message;

        public Builder(int code) {
            this.code = code;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ServiceError build() {
            return new ServiceError(this.code, this.message);
        }
    }
}
