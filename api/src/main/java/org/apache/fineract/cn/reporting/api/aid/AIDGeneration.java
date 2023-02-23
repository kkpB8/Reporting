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
package org.apache.fineract.cn.reporting.api.aid;

import java.math.*;
import java.util.*;

public class AIDGeneration {



    public String generate(String maxNumber){
        String checksum = null;
        String finalAID = null;
        if((maxNumber == null) || (maxNumber.equals(String.valueOf(0)))){
            throw new NullPointerException("Max Number is Null");
        }else{
            maxNumber = String.valueOf(Integer.parseInt(maxNumber) + 1);
        }
        try {
            VerhoeffCheckDigit verhoeffCheckDigit = new VerhoeffCheckDigit();
            checksum = verhoeffCheckDigit.calculate(maxNumber);
        } catch (CheckDigitException e) {
            e.printStackTrace();
        }
        if(checksum!=null){
            finalAID = maxNumber.concat(checksum);
        }
        return finalAID;
    }

    public List<AIdDomain> generate(List<BigInteger> autoIncrementIdList, String maxNumber){
        List<AIdDomain> aIdDomainList = new ArrayList<>();
        for(int i =0; i<autoIncrementIdList.size();i++){
            String aid =null;
            AIdDomain aIdDomain = new AIdDomain();
            aid = generate(String.valueOf(Integer.parseInt(maxNumber) + i));
            aIdDomain.setAutoIncrementId(autoIncrementIdList.get(i));
            aIdDomain.setAId(aid);
            aIdDomainList.add(aIdDomain);
        }
        return aIdDomainList;
    }
}
