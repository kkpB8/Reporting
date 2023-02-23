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
package org.apache.fineract.cn.reporting.api.lookup.annotation;

import com.fasterxml.jackson.core.type.*;
import com.fasterxml.jackson.databind.*;
import org.apache.fineract.cn.reporting.api.domain.LookUpMasterModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class LookupValidator implements
        ConstraintValidator<LookupConstraint, Number> {

    private int key1;

    @Override
    public void initialize(LookupConstraint key1) {
        this.key1 = key1.key1();
    }

    public  boolean validate(Number value) {
        if ( value == null ) {
            return true;
        }
        List<Integer> obj = new ArrayList<>();
        final ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<LookUpMasterModel> LookUpMasterModelList = objectMapper.readValue(
                    new File("/root/Desktop/LokOS/lookup.json"),
                   // new File("lookup.json"),
                    new TypeReference<List<LookUpMasterModel>>(){});

            LookUpMasterModelList.forEach(lookUpMasterModel ->{
                if(key1==lookUpMasterModel.getKey1()){
                    obj.add(lookUpMasterModel.getLookup_code());
                }
            });
            System.out.println("LookUpMasterModelList success!");
        } catch (IOException e){
            System.out.println("LookUpMasterModelList failed!" + e.getMessage());
        }
        if (value instanceof Short ) {
            //return (obj!=null && !obj.isEmpty())?obj.contains(value.intValue()):true;
            return obj.contains(value.intValue());
        }
        return obj.contains(value);

    }

    @Override
    public boolean isValid(Number value,
                           ConstraintValidatorContext cxt) {
        return validate(value);
    }

}