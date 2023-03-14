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
package org.apache.fineract.cn.reporting.api.domain;

public class ClfsddResponse {
    public String getFederation_id() {
        return federation_id;
    }

    public void setFederation_id(String federation_id) {
        this.federation_id = federation_id;
    }

    public String getFederation_name() {
        return federation_name;
    }

    public void setFederation_name(String federation_name) {
        this.federation_name = federation_name;
    }

    private String federation_id;
    private String federation_name;
}
