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
package org.apache.fineract.cn.reporting.rest;


import org.apache.fineract.cn.reporting.internal.repository.FnTableSummary;
import org.apache.fineract.cn.reporting.internal.service.PGFunctionProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;


@Component
public class SummaryScheduler {

    private final PGFunctionProcedureService fnTableSummary;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");


    @Autowired
    public SummaryScheduler(PGFunctionProcedureService fnTableSummary) {
        this.fnTableSummary = fnTableSummary;
    }

    @Scheduled(fixedDelay = 50000000)
 //   @Scheduled(cron = "0 1 * * * ?")
    public void summary_scheduler(){
        logger.info("Summary Scheduler Start");
        //scheduler runs at 1AM so scheduler will run for a day before
        Calendar cal  = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String dateBefore = dateFormat.format(new Date(cal.getTimeInMillis()));
        String table_name="dynamic_lokos_ha";

try{
        //1st call
       fnTableSummary.fn_table_summary(5,"state_id,district_id,block_id,panchayat_id,village_id","and p.village_id=s.village_id",
                "state_id,district_id,block_id,panchayat_id,village_id,state_name ,district_name,block_name,panchayat_name,village_name",
                dateBefore,table_name);
        //2nd call
        fnTableSummary.fn_table_summary(4,"state_id,district_id,block_id,panchayat_id","and p.panchayat_id=s.panchayat_id",
                "state_id,district_id,block_id,panchayat_id,state_name",dateBefore,table_name);
        //3st call
        fnTableSummary.fn_table_summary(3," state_id,district_id,block_id "," and p.block_id=s.block_id ",
                " state_id,district_id,block_id,state_name,district_name,block_name ",
                dateBefore,table_name);
        //1st call
        fnTableSummary.fn_table_summary(2," state_id,district_id "," and p.district_id=s.district_id ",
                " state_id,district_id,state_name,district_name ",
                dateBefore,table_name);
        //1st call
        fnTableSummary.fn_table_summary(1," state_id "," and p.state_id=s.state_id ",
                " state_id,state_name ",
                dateBefore,table_name);


        logger.info("Summary User Scheduler Start");
        //summary tbl users
        //1st call
            fnTableSummary.fn_table_summary_user(5,"state_id,district_id,block_id,unnest(string_to_array(village_id,'',''))village_id","state_id,district_id,block_id,unnest(string_to_array(village_id,'',''))",
                " and p.village_id::int=s.village_id",dateBefore,table_name);
        //2st call
        fnTableSummary.fn_table_summary_user(4,"state_id,district_id,block_id,unnest(string_to_array(panchayat_id,'',''))panchayat_id","state_id,district_id,block_id,unnest(string_to_array(panchayat_id,'',''))",
                " and p.panchayat_id::int=s.panchayat_id",dateBefore,table_name);
        //3st call
        fnTableSummary.fn_table_summary_user(3,"state_id,district_id,block_id","state_id,district_id,block_id",
                " and  p.block_id::int=s.block_id",dateBefore,table_name);
        //1st call
        fnTableSummary.fn_table_summary_user(2,"state_id,district_id","state_id,district_id",
                " and p.district_id::int=s.district_id",dateBefore,table_name);
        //1st call
        fnTableSummary.fn_table_summary_user(1,"state_id","state_id",
                " and p.state_id=s.state_id",dateBefore,table_name);
}catch (Exception ex){
    logger.info("Summary Scheduler error  : "+ex.getMessage());
}

    }


}
