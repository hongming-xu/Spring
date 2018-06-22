package com.xzh.www.xml2.util;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-22 14:41
 **/
@Component("specificBean")
public class SpecificBean {

    public void printAnotherMessage(){
        System.out.println("I am specificBean. I am called by Quartz jobBean using CronTriggerFactoryBean");
    }

}
