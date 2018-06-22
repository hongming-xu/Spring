package com.xzh.www.xml.jobs;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-22 14:40
 **/
@Component("myJob")
public class MyJob {

    public void printMessage() {
        System.out.println("I am MyJob. I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }
}
