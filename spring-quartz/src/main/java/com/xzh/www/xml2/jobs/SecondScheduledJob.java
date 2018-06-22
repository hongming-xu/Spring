package com.xzh.www.xml2.jobs;

import com.xzh.www.xml2.util.SpecificBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-22 14:40
 **/
public class SecondScheduledJob extends QuartzJobBean {

    private SpecificBean specificBean;

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("I am SecondScheduledJob");
        this.specificBean.printAnotherMessage();
    }

    public void setSpecificBean(SpecificBean specificBean) {
        this.specificBean = specificBean;
    }
}
