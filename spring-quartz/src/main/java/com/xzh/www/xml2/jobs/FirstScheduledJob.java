package com.xzh.www.xml2.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-22 14:40
 **/
public class FirstScheduledJob extends QuartzJobBean {
    protected void executeInternal(JobExecutionContext jobExecutionContext)
            throws JobExecutionException {

        System.out.println("I am FirstScheduledJob");
    }
}
