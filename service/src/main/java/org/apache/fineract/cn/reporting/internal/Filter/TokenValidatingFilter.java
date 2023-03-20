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
package org.apache.fineract.cn.reporting.internal.Filter;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.fineract.cn.reporting.internal.Error.CustomErrorResponse;
import org.apache.fineract.cn.reporting.internal.exception.CustomStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;


/**
 * A servlet filter to log request and response
 * The logging implementation is pretty native and for demonstration only
 *
 */
@Component
@Order(2)
public class  TokenValidatingFilter implements Filter {

    private final static Logger LOG = LoggerFactory.getLogger(TokenValidatingFilter.class);
    static final int MINUTES_PER_HOUR = 60;

    public TokenValidatingFilter() {
    }

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
        LOG.info("Initializing filter :{}", this);
    }

    @Override
    public void doFilter(ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String user = req.getHeader("User");
        String token = req.getHeader("Authorization");
        String logout = req.getParameter("logout");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String grant_type = req.getParameter("grant_type");
        String stateid = req.getParameter("stateid");
        if (user == null) {
            user = username;
        }
        if ((logout != null && logout.equals("1")) || (username != null && password != null && grant_type != null && stateid != null)) {
            token = "Bearer eyJhbGciOiJSUzUxMiJ9.eyJzdWIiOiJtaWNyb3dhcmUiLCIvZmluY24uYXBhY2hlLm9yZy9zIjoiMjAyMS0wMS0xN1QwNF8zNl80OSIsIi9maW5jbi5hcGFjaGUub3JnL2MiOiJ7XCJ0b2tlblBlcm1pc3Npb25zXCI6W3tcInBhdGhcIjpcImlkZW50aXR5LXYxL2NhdG" + LocalDateTime.now().toString();
        }
        if (user != null && token != null) {
            LOG.info("Token Validation Starting Time: ", LocalDateTime.now().toString());
            String tokenWithTime = LocalDateTime.now().toString() + token;
            if (req.getServletContext().getAttribute("token") == null) {
                HashMap<String, LinkedList<String>> hashMap = new HashMap<>();
                LinkedList<String> tokensList = new LinkedList<>();
                LinkedList<String> hashmapTimeList = new LinkedList<>();
                tokensList.add(tokenWithTime);
                hashmapTimeList.add(LocalDateTime.now().toString());
                hashMap.put("hashMapCreationTime", hashmapTimeList);
                hashMap.put(user, tokensList);
                req.getServletContext().setAttribute("token", hashMap);
            } else {
                HashMap<String, LinkedList<String>> hashMap = (HashMap<String, LinkedList<String>>) req.getServletContext().getAttribute("token");
                if (!hashMap.containsKey("hashMapCreationTime")) {
                    LinkedList<String> hashmapTimeList = new LinkedList<>();
                    hashmapTimeList.add(LocalDateTime.now().toString());
                    hashMap.put("hashMapCreationTime", hashmapTimeList);
                }
                if (hashMap.containsKey(user)) {
                    LinkedList<String> tokensList = hashMap.get(user);
                    if (tokensList.size() > 0) {
                        String lastTokenWithTime = tokensList.getLast();
                        String lastToken = lastTokenWithTime.substring(23);
                        if (!lastToken.equals(token)) {
                            for (int i = 0; i < tokensList.size(); i++) {
                                String tokenWithTimeFromList = tokensList.get(i);
                                String tokenFromList = tokenWithTimeFromList.substring(23);
                                if (tokenFromList.equals(token)) {
                                    //res.sendError(HttpStatus.FORBIDDEN.value(), "Invalid token. Use new token.");
                                    //throw new TokenInvalidatedException("Invalid token. Use new token.");
                                    CustomErrorResponse error = new CustomErrorResponse(CustomStatus.TOKEN_INVALID_CODE,CustomStatus.TOKEN_INVALID_MSG);
                                    error.setResponseCode("403");
                                    error.setResponseMsg("Invalid token. Please use new token");
                                    error.setStatus(HttpStatus.FORBIDDEN.value());
                                    error.setTimestamp(LocalDateTime.now().toString());

                                    byte[] resposeToSend = restResponseBytes(error);
                                    res.setHeader("Content-Type", "application/json");
                                    res.setStatus(HttpStatus.FORBIDDEN.value());
                                    response.getOutputStream().write(resposeToSend);
                                    return;
                                }
                            }
                            tokensList.add(tokenWithTime);
                            hashMap.put(user, tokensList);
                        }
                    } else {
                        tokensList.add(tokenWithTime);
                        hashMap.put(user, tokensList);
                    }
                } else {
                    LinkedList<String> tokensList = new LinkedList<>();
                    tokensList.add(tokenWithTime);
                    hashMap.put(user, tokensList);
                }
                //Removing invalid tokens after a fixed interval
                try {
                    String mapCreationTime = hashMap.get("hashMapCreationTime").get(0);
                    LocalDateTime hashMapCreationTime = LocalDateTime.parse(mapCreationTime);
                    LocalDateTime currentTime = LocalDateTime.now();
                    Duration duration = Duration.between(hashMapCreationTime, currentTime);
                    long hours = (duration.toMinutes()) / 60;
                    long minutes = (duration.toMinutes()) % 60;
                    if (hours > 20) {
                        /*for (Map.Entry<String, LinkedList<String>> entry : hashMap.entrySet()) {
                            String usr = entry.getKey();
                        LinkedList<String> tokensList = hashMap.get(usr);

                        for (int i = 0; i < tokensList.size(); i++) {
                            String tokenWithTimeFromList = tokensList.get(i);
                            String tokenTime = tokenWithTimeFromList.substring(0, 23);
                            LocalDateTime tokenCreationTime = LocalDateTime.parse(tokenTime);
                            duration = Duration.between(tokenCreationTime, LocalDateTime.now());
                            hours = (duration.toMinutes()) / 60;
                            minutes = (duration.toMinutes()) % 60;
                            if (hours > 4) {
                                tokensList.remove(i);
                                i--;
                            }
                        }
                        hashMap.put(user, tokensList);
                    }
                    if(hashMap.entrySet().stream().filter(e -> e.getKey().equals("hashMapCreationTime")).count() > 0){
                        hashMap.remove("hashMapCreationTime");
                    }*/
                    hashMap.clear();
                }
            }catch(Exception e){
                System.out.println("Exception: " +e);
            }
        }
            LOG.info("Logging Request  {} : {}", req.getMethod(), req.getRequestURI());

            chain.doFilter(request, response);
            LOG.info("Logging Response :{}", res.getContentType());
        }
        LOG.info("Token Validation Completion Time: ", LocalDateTime.now().toString());
    }

    @Override
    public void destroy() {
        LOG.warn("Destructing filter :{}", this);
    }

    private byte[] restResponseBytes(CustomErrorResponse errorResponse) throws  IOException{
        String serialized = new ObjectMapper().writeValueAsString(errorResponse);
        return serialized.getBytes();
    }
}