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
import org.apache.fineract.cn.reporting.api.domain.*;
import org.apache.fineract.cn.reporting.internal.repository.ReportingMeetingRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;


@Service
public class MettingReportsService {

    private final ReportingMeetingRepository reportingRepo;

    DecimalFormat df = new DecimalFormat("0.00");

    public MettingReportsService(ReportingMeetingRepository reportingRepo) {
        this.reportingRepo = reportingRepo;
    }

    public List<ShgReportResponseDto> getShgMeeting(ReportRequestDto shgReportRequestDto) {
        System.out.println("Hello From Metting Service");
        List<ShgReportResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getShgMeeting(shgReportRequestDto.getStateName(), shgReportRequestDto.getDistrictName()
                , shgReportRequestDto.getBlockName(), shgReportRequestDto.getPanchayatName(),shgReportRequestDto.getVillageName(),
                shgReportRequestDto.getFromYear(), shgReportRequestDto.getFromMonth(), shgReportRequestDto.getToYear(), shgReportRequestDto.getToMonth())) {
            ShgReportResponseDto meetingPojo = new ShgReportResponseDto();
            meetingPojo.setGeolocation((String) meetingData[0]);
            meetingPojo.setLocationId((Integer) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalShg((Long) meetingData[3]);
            meetingPojo.setTotalMappedShg((Long) meetingData[5]);
            meetingPojo.setShgConductingMeeting((Long) meetingData[6]);
            meetingPojo.setShgConductingMeetingPercent((BigDecimal) meetingData[4]);
            if(!meetingPojo.getTotalMappedShg().equals(new Long("0")))
            {

                BigDecimal first= new BigDecimal(meetingPojo.getShgConductingMeeting());
                BigDecimal second= new BigDecimal(meetingPojo.getTotalMappedShg());
                BigDecimal percent= first.divide(second,2, RoundingMode.HALF_UP).multiply(new BigDecimal("100"));
                meetingPojo.setShgConductingMeetingPercent(percent);
            }
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }

    public List<ShgReportResponseVillageDto> getShgMeetingVillage(String villageNames,String fromYears,String fromMonths ,String toYears,String toMonths ) {
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;

        List<ShgReportResponseVillageDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getShgMeetingVillage(villageNames,fromDate,toDate)) {
            ShgReportResponseVillageDto meetingPojo = new ShgReportResponseVillageDto();
            meetingPojo.setBookKeeperName((String) meetingData[1]);
            meetingPojo.setNumberOfShgMapped((Long) meetingData[3]);
            meetingPojo.setNumberOfShgUpdated((Long) meetingData[2]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }

    public List<ShgAttendancePercentDto> getShgMeetingAttendance(ReportRequestDto reportRequestDto) {

        List<ShgAttendancePercentDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getShgMeetingAttendanceNew(reportRequestDto.getStateName(), reportRequestDto.getDistrictName(),
                reportRequestDto.getBlockName(), reportRequestDto.getPanchayatName(), reportRequestDto.getFromYear(), reportRequestDto.getFromMonth(), reportRequestDto.getToYear(), reportRequestDto.getToMonth())) {
            ShgAttendancePercentDto meetingPojo = new ShgAttendancePercentDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalShg((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);
            meetingPojoList.add(meetingPojo);

        }
        return meetingPojoList;

    }

    public List<ShgRegularityPercentResponseDto> getShgMeetingRegularity(ReportRequestDto reportRequestDto) {
        List<ShgRegularityPercentResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.geShgMeetingRegularityPercent(reportRequestDto.getStateName(), reportRequestDto.getDistrictName(),
                reportRequestDto.getBlockName(), reportRequestDto.getPanchayatName(), reportRequestDto.getFromYear(), reportRequestDto.getFromMonth(), reportRequestDto.getToYear(), reportRequestDto.getToMonth())) {
            ShgRegularityPercentResponseDto meetingPojo = new ShgRegularityPercentResponseDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalShg((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);

            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;

    }
    public List<ShgMeetingRegularityResponseDto> getShgMeetingRegularityVillage(String villageNames, String fromYears, String fromMonths, String toYears, String toMonths) {
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<ShgMeetingRegularityResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getShgMeetingRegularityVillage(villageNames,fromDate,toDate)) {
            ShgMeetingRegularityResponseDto meetingPojo = new ShgMeetingRegularityResponseDto();
            meetingPojo.setShgName((String) meetingData[0]);
            meetingPojo.setMeetingFrequency((Integer) meetingData[1]);
            meetingPojo.setTotalMeetingToBeConducted((Integer) meetingData[2]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[3]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;

    }

    public List<VoRegularityPercentResponseDto> getVoMeetingRegularity(ReportRequestDto reportRequestDto) {
        List<VoRegularityPercentResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingRegularityPercent(reportRequestDto.getStateName(), reportRequestDto.getDistrictName(),
                reportRequestDto.getBlockName(), reportRequestDto.getPanchayatName(), reportRequestDto.getFromYear(), reportRequestDto.getFromMonth(), reportRequestDto.getToYear(), reportRequestDto.getToMonth(),1)) {
            VoRegularityPercentResponseDto meetingPojo = new VoRegularityPercentResponseDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalVo((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }

    public List<VoAttendancePercentDto> getVoMeetingAttendance(ReportRequestDto reportRequestDto) {
        List<VoAttendancePercentDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingAttendancePercent(reportRequestDto.getStateName(), reportRequestDto.getDistrictName(),
                reportRequestDto.getBlockName(), reportRequestDto.getPanchayatName(), reportRequestDto.getFromYear(), reportRequestDto.getFromMonth(), reportRequestDto.getToYear(), reportRequestDto.getToMonth(), 1)) {
            VoAttendancePercentDto meetingPojo = new VoAttendancePercentDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalVo((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);
            meetingPojoList.add(meetingPojo);

        }
        return meetingPojoList;

    }



    public List<ShgRegularityPercentResponseDto> getShgMeetingRegularityClfVo(ShgVoClfRequestDto reportRequestDto) {
        List<ShgRegularityPercentResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.geShgMeetingRegularityClfVo(reportRequestDto.getCboType(),reportRequestDto.getBlockName(),reportRequestDto.getClfCode(),reportRequestDto.getFromYear(), reportRequestDto.getFromMonth(), reportRequestDto.getToYear(), reportRequestDto.getToMonth())) {
            ShgRegularityPercentResponseDto meetingPojo = new ShgRegularityPercentResponseDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalShg((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);

            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;

    }

    public List<ShgMeetingRegularityResponseDto> getShgMeetingRegularityVo(Integer voCode, String fromYears, String fromMonths, String toYears, String toMonths) {
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<ShgMeetingRegularityResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getShgMeetingRegularityVo(voCode,fromDate,toDate)) {
            ShgMeetingRegularityResponseDto meetingPojo = new ShgMeetingRegularityResponseDto();
            meetingPojo.setShgName((String) meetingData[0]);
            meetingPojo.setMeetingFrequency((Integer) meetingData[1]);
            meetingPojo.setTotalMeetingToBeConducted((Integer) meetingData[2]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[3]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;

    }
    public List<ShgAttendancePercentDto> getShgMeetingAttendanceClfVo(ShgVoClfRequestDto reportRequestDto) {

        List<ShgAttendancePercentDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.geShgMeetingAttendanceClfVo(reportRequestDto.getBlockName(),reportRequestDto.getClfCode(),reportRequestDto.getFromYear(), reportRequestDto.getFromMonth(), reportRequestDto.getToYear(),
                reportRequestDto.getToMonth(),reportRequestDto.getCboType())) {
            ShgAttendancePercentDto meetingPojo = new ShgAttendancePercentDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalShg((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);
            meetingPojoList.add(meetingPojo);

        }
        return meetingPojoList;

    }

    public List<ShgMeetingAttendenceResponseDto> getShgMeetingAttendanceVillage(String villageNames, String fromYears, String fromMonths, String toYears, String toMonths) {
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<ShgMeetingAttendenceResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getShgMeetingAttendanceVillage(villageNames,fromDate,toDate)) {
            ShgMeetingAttendenceResponseDto meetingPojo = new ShgMeetingAttendenceResponseDto();
            meetingPojo.setShgName((String) meetingData[0]);
            meetingPojo.setTotalMember((Long) meetingData[1]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[2]);
            meetingPojo.setTotalAttendentMember((Long) meetingData[3]);
            meetingPojo.setAttendancePercent((Double) meetingData[4]);
            if(meetingPojo.getAttendancePercent()!=null)
            {
                meetingPojo.setAttendancePercent(Double.valueOf(df.format(meetingPojo.getAttendancePercent())));
            }
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }
    public List<ShgMeetingAttendenceResponseDto> getShgMeetingAttendanceVo(Integer voCode, String fromYears, String fromMonths, String toYears, String toMonths) {
        if(fromYears.isEmpty()||fromMonths.isEmpty()||toYears.isEmpty()||toMonths.isEmpty())
        {
            fromYears="2010";
            fromMonths="08";
            toYears="2022";
            toMonths="08";
        }
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<ShgMeetingAttendenceResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getShgMeetingAttendanceVo(voCode,fromDate,toDate)) {
            ShgMeetingAttendenceResponseDto meetingPojo = new ShgMeetingAttendenceResponseDto();
            meetingPojo.setShgName((String) meetingData[0]);
            meetingPojo.setTotalMember((Long) meetingData[1]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[2]);
            meetingPojo.setTotalAttendentMember((Long) meetingData[3]);
            meetingPojo.setAttendancePercent((Double) meetingData[4]);
            if(meetingPojo.getAttendancePercent()!=null)
            {
                meetingPojo.setAttendancePercent(Double.valueOf(df.format(meetingPojo.getAttendancePercent())));
            }
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }
    public List<VoMeetingResponseDto> getVoMeeting(ReportRequestDto reportRequestDto) {
      String  stateName= reportRequestDto.getStateName();
        String  districtName= reportRequestDto.getDistrictName();
        String blockName= reportRequestDto.getBlockName();
        String panchayatName= reportRequestDto.getPanchayatName() ;
        String fromYear= reportRequestDto.getFromYear() ;
        String fromMonth= reportRequestDto.getFromMonth();
        String toYear= reportRequestDto.getToYear();
        String toMonth= reportRequestDto.getToMonth();
        String villageName=reportRequestDto.getVillageName();
        List<VoMeetingResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeeting(stateName,districtName
                ,blockName,panchayatName,villageName,fromYear,fromMonth,toYear,toMonth))
        {
            VoMeetingResponseDto meetingPojo = new VoMeetingResponseDto();
            meetingPojo.setGeolocation((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalvo((Long) meetingData[3]);
            meetingPojo.setTotalMappedvo((Long) meetingData[4]);
            meetingPojo.setVoconductingmeeting((Long) meetingData[5]);
            meetingPojo.setVoconductingmeetingpercent((BigDecimal) meetingData[6]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }

    public List<VoMeetingRegularityResponse> getVoMeetingRegularityVo(Integer clfcode, String fromYears, String fromMonths, String toYears, String toMonths) {
        if(fromYears.isEmpty()||fromMonths.isEmpty()||toYears.isEmpty()||toMonths.isEmpty())
        {
            fromYears="2010";
            fromMonths="08";
            toYears="2022";
            toMonths="08";
        }
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<VoMeetingRegularityResponse> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingRegularityVo(clfcode,fromDate,toDate)) {
            VoMeetingRegularityResponse meetingPojo = new VoMeetingRegularityResponse();
            meetingPojo.setVoName((String) meetingData[1]);
            meetingPojo.setMeetingFrequency((Integer) meetingData[2]);
            meetingPojo.setTotalMeetingToBeConducted((Integer) meetingData[3]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[4]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }

    public List<VoMeetingAttendenceResponse> getVoMeetingAttendanceVo(Integer clfcode, String fromYears, String fromMonths, String toYears, String toMonths) {
        if(fromYears.isEmpty()||fromMonths.isEmpty()||toYears.isEmpty()||toMonths.isEmpty())
        {
            fromYears="2010";
            fromMonths="08";
            toYears="2022";
            toMonths="08";
        }
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<VoMeetingAttendenceResponse> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingAttendanceVo(clfcode,fromDate,toDate)) {
            VoMeetingAttendenceResponse meetingPojo = new VoMeetingAttendenceResponse();
            meetingPojo.setVoName((String) meetingData[0]);
            meetingPojo.setTotalMember((Long) meetingData[1]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[2]);
            meetingPojo.setAttendancePercent((Double) meetingData[3]);
            // meetingPojo.setAttendancePercent(Double.valueOf(df.fmeetingPojo.getAttendancePercent())));
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }

    public List<VoRegularityPercentResponseDto> getVoMeetingRegularityClf(String blockName, String toYears, String toMonths, String fromYears, String fromMonths) {
        if(fromYears.isEmpty()||fromMonths.isEmpty()||toYears.isEmpty()||toMonths.isEmpty())
        {
            fromYears="2010";
            fromMonths="08";
            toYears="2022";
            toMonths="08";
        }
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<VoRegularityPercentResponseDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingRegularityClf(blockName, toYears, fromYears)) {
            VoRegularityPercentResponseDto meetingPojo = new VoRegularityPercentResponseDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalVo((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);

            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }
    public List<VoAttendancePercentDto> getVoMeetingAttendanceClf(String blockName, String toYears, String toMonths, String fromYears, String fromMonths) {
        if(fromYears.isEmpty()||fromMonths.isEmpty()||toYears.isEmpty()||toMonths.isEmpty())
        {
            fromYears="2010";
            fromMonths="08";
            toYears="2022";
            toMonths="08";
        }
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<VoAttendancePercentDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingAttendanceClf(blockName, fromYears, toYears)) {
            VoAttendancePercentDto meetingPojo = new VoAttendancePercentDto();
            meetingPojo.setLocationType((String) meetingData[0]);
            meetingPojo.setLocationId((String) meetingData[1]);
            meetingPojo.setLocationName((String) meetingData[2]);
            meetingPojo.setTotalVo((Long) meetingData[3]);
            meetingPojo.setFiftyPercent((Long) meetingData[4]);
            meetingPojo.setFiftySeventy((Long) meetingData[5]);
            meetingPojo.setSeventyNinety((Long) meetingData[6]);
            meetingPojo.setNinety((Long) meetingData[7]);
            meetingPojoList.add(meetingPojo);

        }
        return meetingPojoList;

    }
    public List<VoMeetingAttendenceResponse> getVoMeetingAttendanceVillage(String villageNames, String fromYears, String fromMonths, String toYears, String toMonths) {
        if(fromYears.isEmpty()||fromMonths.isEmpty()||toYears.isEmpty()||toMonths.isEmpty())
        {
            fromYears="2010";
            fromMonths="08";
            toYears="2022";
            toMonths="08";
        }
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<VoMeetingAttendenceResponse> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingAttendanceVillage(villageNames,fromDate,toDate)) {
            VoMeetingAttendenceResponse meetingPojo = new VoMeetingAttendenceResponse();
            meetingPojo.setVoName((String) meetingData[0]);
            meetingPojo.setTotalMember((Long) meetingData[1]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[2]);
            meetingPojo.setAttendancePercent((Double) meetingData[3]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }
    public List<VoReportResponseVillageDto> getVoMeetingVillage(String villageNames, String fromYears, String fromMonths, String toYears, String toMonths) {
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<VoReportResponseVillageDto> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingVillage(villageNames,fromDate,toDate)) {
            VoReportResponseVillageDto meetingPojo = new VoReportResponseVillageDto();
            meetingPojo.setBookKeeperName((String) meetingData[1]);
            meetingPojo.setNumberOfVoMapped((Long) meetingData[3]);
            meetingPojo.setNumberOfVoUpdated((Long) meetingData[2]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }
    public List<VoMeetingRegularityResponse> getVoMeetingRegularityVillage(String villageNames, String fromYears, String fromMonths, String toYears, String toMonths) {
        if(fromYears.isEmpty()||fromMonths.isEmpty()||toYears.isEmpty()||toMonths.isEmpty())
        {
            fromYears="2010";
            fromMonths="08";
            toYears="2022";
            toMonths="08";
        }
        String fromDate=fromYears+"-"+fromMonths;
        String toDate=toYears+"-"+toMonths;
        List<VoMeetingRegularityResponse> meetingPojoList = new LinkedList<>();
        for (Object[] meetingData : reportingRepo.getVoMeetingRegularityVillage(villageNames,fromDate,toDate)) {
            VoMeetingRegularityResponse meetingPojo = new VoMeetingRegularityResponse();
            meetingPojo.setVoName((String) meetingData[0]);
            meetingPojo.setMeetingFrequency((Integer) meetingData[1]);
            meetingPojo.setTotalMeetingToBeConducted((Integer) meetingData[2]);
            meetingPojo.setTotalConductedMeeting((Long) meetingData[3]);
            meetingPojoList.add(meetingPojo);
        }
        return meetingPojoList;
    }
}
