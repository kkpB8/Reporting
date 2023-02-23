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
/*
package org.lokos.reporting.internal.logger;

import org.slf4j.*;
import org.springframework.web.servlet.handler.*;

import javax.servlet.http.*;

public class ServiceInterceptor extends HandlerInterceptorAdapter {

    */
/**

     * The Logger for the Class.

     *//*


   // private final static Logger LOGGER = Logger.getLogger(ServiceInterceptor.class);
    private final Logger logger;

    public ServiceInterceptor(Logger logger) {
        this.logger = logger;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        this.logger.info("Inside ServiceInterceptor->preHandle()");
        if(this.logger.isDebugEnabled()){
            this.logger.debug("value of request header. userid  : {0}",request.getHeader("User"));
        }
        MDC.put("userId", request.getHeader("User"));
        //MDC.put("sessionId ", request.getHeader("SessionId"));
        //MDC.put("requestId", request.getHeader("RequestId"));
        return true;
    }
}*/
