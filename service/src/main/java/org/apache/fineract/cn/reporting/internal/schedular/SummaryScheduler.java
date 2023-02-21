package org.apache.fineract.cn.reporting.internal.schedular;


import org.apache.fineract.cn.reporting.internal.repository.FnTableSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

@EnableScheduling
@Component

public class SummaryScheduler {

    private final FnTableSummary fnTableSummary;
    private Logger logger=Logger.getLogger(SummaryScheduler.class.getName());
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM");


    @Autowired
    public SummaryScheduler(FnTableSummary fnTableSummary) {
        this.fnTableSummary = fnTableSummary;
    }


    @Scheduled(cron = "0 1 * * * ?")
    public void summary_scheduler(){
        logger.info("Summary Scheduler Start");
        //scheduler runs at 1AM so scheduler will run for a day before
        Calendar cal  = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String dateBefore = dateFormat.format(new Date(cal.getTimeInMillis()));

        //summary tbl

        //1st call
        fnTableSummary.fn_table_summary(5," state_id,district_id,block_id,panchayat_id,village_id "," and p.village_id=s.village_id ",
                " state_id,district_id,block_id,panchayat_id,village_id,state_name ,district_name,block_name,panchayat_name,village_name ",
                dateBefore);
        //2nd call
        fnTableSummary.fn_table_summary_user(4," state_id,district_id,block_id,panchayat_id "," and p.panchayat_id=s.panchayat_id ",
                " state_id,district_id,block_id,panchayat_id,state_name ",dateBefore);
        //3st call
        fnTableSummary.fn_table_summary(3," state_id,district_id,block_id "," and p.block_id=s.block_id ",
                " state_id,district_id,block_id,state_name,district_name,block_name ",
                dateBefore);
        //1st call
        fnTableSummary.fn_table_summary(2," state_id,district_id "," and p.district_id=s.district_id ",
                " state_id,district_id,state_name,district_name ",
                dateBefore);
        //1st call
        fnTableSummary.fn_table_summary(1," state_id "," and p.state_id=s.state_id ",
                " state_id,state_name ",
                dateBefore);


        logger.info("Summary User Scheduler Start");
        //summary tbl users
        //1st call
        fnTableSummary.fn_table_summary_user(5,"state_id,district_id,block_id,unnest(string_to_array(village_id,'',''))village_id","state_id,district_id,block_id,unnest(string_to_array(village_id,'',''))",
                "and p.village_id::int=s.village_id",dateBefore);
        //2st call
        fnTableSummary.fn_table_summary_user(4,"state_id,district_id,block_id,unnest(string_to_array(panchayat_id,'',''))panchayat_id","state_id,district_id,block_id,unnest(string_to_array(panchayat_id,'',''))",
                "and p.panchayat_id::int=s.panchayat_id",dateBefore);
        //3st call
        fnTableSummary.fn_table_summary_user(3,"state_id,district_id,block_id","state_id,district_id,block_id",
                "and  p.block_id::int=s.block_id",dateBefore);
        //1st call
        fnTableSummary.fn_table_summary_user(2,"state_id,district_id","state_id,district_id",
                "and p.district_id::int=s.district_id",dateBefore);
        //1st call
        fnTableSummary.fn_table_summary_user(1,"state_id","state_id",
                "and p.state_id=s.state_id",dateBefore);


    }


}
