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
package org.apache.fineract.cn.reporting;



import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateUtils {

//DATE
public static Date secondsToDateConverter(Integer seconds){
    if(seconds!=0 && seconds!=null){
        long millis = seconds;
        LocalDateTime date = LocalDateTime.ofEpochSecond(millis, 0, ZoneOffset.UTC);
        return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
    }
    else
    return null;
}

    public static Date secondsToDateConverter(Long seconds){
        if(seconds!=0 && seconds!=null){
            long millis = seconds;
            LocalDateTime date = LocalDateTime.ofEpochSecond(millis, 0, ZoneOffset.UTC);
            return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
        }
        else
            return null;
    }

    public static Date secondsToLocalDateConverter(Long seconds){
        if(seconds!=0 && seconds!=null){
            long millis = seconds;
            LocalDateTime date = LocalDateTime.ofEpochSecond(millis, 0, offset(ZoneId.systemDefault()));
            return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
        }
        else
            return null;
    }

    public static Integer dateToSecondsConverter(Date date) {

        LocalDateTime dateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

        if(dateTime!=null) {
            long ldt = dateTime.toEpochSecond(ZoneOffset.UTC);
            return (Integer) (int) ldt;
        }
        else
            return 0;

    }


    public static Long dateToSecondsConverterLong(Date date) {
        LocalDateTime dateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        if(dateTime!=null) {
            return dateTime.toEpochSecond(ZoneOffset.UTC);
        }
        else
            return Long.valueOf(0);
    }

    public static Long dateToLocalSecondsConverterLong(Date date) {
        LocalDateTime dateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        if(dateTime!=null) {
            return dateTime.toEpochSecond(offset(ZoneId.systemDefault()));
        }
        else
            return Long.valueOf(0);
    }

    //TIMESTAMP
    public static LocalDateTime secondsToTimestampConverter(Integer seconds) {
        if(seconds!=0) {
            long millis = seconds;
            return LocalDateTime.ofEpochSecond(millis, 0, ZoneOffset.UTC);
        }
        else
        return null;
    }

    public static LocalDateTime secondsToTimestampConverterLong(Long seconds) {
        if(seconds!=0) {
            long millis = seconds;
            return LocalDateTime.ofEpochSecond(millis, 0, ZoneOffset.UTC);
        }
        else
            return null;
    }

    public static ZoneOffset offset(ZoneId id) {
        return ZoneOffset.ofTotalSeconds((int)
                TimeUnit.MILLISECONDS.toSeconds(
                        TimeZone.getTimeZone(id).getRawOffset()        // Returns offset in milliseconds
                )
        );
    }
    public static LocalDateTime secondsToLocalTimestampConverterLong(Long seconds) {
        if(seconds!=0) {
            long millis = seconds;
            return LocalDateTime.ofEpochSecond(millis, 0, offset(ZoneId.systemDefault()));
        }
        else
            return null;
    }

    public static Integer timeStampToSecondsConverter(LocalDateTime dateTime) {
        if(dateTime!=null) {
        long ldt = dateTime.toEpochSecond(ZoneOffset.UTC);
            return (Integer) (int) ldt;
            }
        else
            return 0;
        }

    public static Long TimestampToSecondsConverterLong(Timestamp dateTime) {
        if(dateTime!=null) {
            long ldt = dateTime.getTime()/1000;
            Integer intDate = (int) ldt;
            return ldt;
        }
        else
            return new Long("0");
    }

    /*public static Long timeStampToSecondsConverterLong(LocalDateTime dateTime) throws ParseException {
        if(dateTime!=null) {
            long ldt = dateTime.toEpochSecond(ZoneOffset.UTC);
            //Integer intDate = (int) ldt;
            return ldt;
        }
        else
            return new Long("0");
    }*/

    public static String longToDateConverter(String format,long longDate)  {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        String strDate = null;
        try {
            date=new Date(longDate);
            strDate = formatter.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strDate;
    }

    public static String longConvertToYearMonth(long millis)  {
        String strDate = null;
        try {
            LocalDateTime date = LocalDateTime.ofEpochSecond(millis, 0, ZoneOffset.UTC);
            strDate= date.format(DateTimeFormatter.ofPattern("yyyy-MM"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strDate;
    }
}
