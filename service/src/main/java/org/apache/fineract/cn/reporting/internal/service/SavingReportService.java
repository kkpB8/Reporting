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
package org.apache.fineract.cn.reporting.internal.service;


import org.apache.fineract.cn.reporting.api.domain.ShgSavingResponse;
import org.apache.fineract.cn.reporting.internal.repository.ReportingSavingRepository;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

@Service
public class SavingReportService {


   private final ReportingSavingRepository reportingRepo;

    DecimalFormat df = new DecimalFormat("0.00");

    public SavingReportService(ReportingSavingRepository reportingRepo) {
        this.reportingRepo = reportingRepo;
    }

    public List<ShgSavingResponse> getShgSaving(String locationType, Integer locationId, String fromDate, String toDate) {
        List<ShgSavingResponse> meetingPojoList = new LinkedList<>();

        List<Object[]> meetings = new LinkedList<>();
        if(locationType.equalsIgnoreCase("state"))
        {
            meetings=reportingRepo.getSavingState(fromDate,toDate);
        }
       else if(locationType.equalsIgnoreCase("district"))
        {
            meetings=reportingRepo.getSavingDistrict(locationId,fromDate,toDate);
        }
        else if(locationType.equalsIgnoreCase("block"))
        {
            meetings=reportingRepo.getSavingBlock(locationId,fromDate,toDate);
        }
       else  if(locationType.equalsIgnoreCase("panchayat"))
        {
            meetings=reportingRepo.getSavingPanChayat(locationId,fromDate,toDate);
        }
      else  if(locationType.equalsIgnoreCase("village"))
        {
            meetings=reportingRepo.getSavingVillage(locationId,fromDate,toDate);
        }

        else   if(locationType.equalsIgnoreCase("shg"))
        {
            meetings=reportingRepo.getSavingShg(locationId,fromDate,toDate);
        }

        for (Object[] meetingData : meetings) {
            ShgSavingResponse meetingPojo = new ShgSavingResponse();
            meetingPojo.setLocationId((Integer)meetingData[0]);
            meetingPojo.setLocationOrShgName((String) meetingData[1]);
            meetingPojo.setNumberOfShgOrMembers((Integer) meetingData[2]);
            meetingPojo.setNumberOfMeetingConducted(BigInteger.valueOf((Long) meetingData[3]));
            meetingPojo.setExpectedAmount(BigInteger.valueOf((Long) meetingData[4]));
            meetingPojo.setAmountCollected( BigInteger.valueOf((Long) meetingData[5]));
            if (meetingPojo.getExpectedAmount().compareTo(BigInteger.ZERO)==0)
            {
               meetingPojo.setPercentOfCollection(new Double(0));
            }
            else {
//                BigInteger percent =meetingPojo.getAmountCollected().divide(meetingPojo.getExpectedAmount()).multiply(new BigInteger("100"));
                meetingPojo.setPercentOfCollection(Double.valueOf(df.format(meetingPojo.getAmountCollected().doubleValue()/meetingPojo.getExpectedAmount().doubleValue()*100)));
            }

            meetingPojo.setVoluntarySavingAmount(BigInteger.valueOf((Long) meetingData[6]));
            meetingPojoList.add(meetingPojo);

        }
        return meetingPojoList;

    }

}
