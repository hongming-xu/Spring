package com.xzh.www.annotation.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-22 22:59
 **/
@Component
public class MyAnnoJob {

    @Scheduled(cron = "*/5 * * * * ?")
    // 每隔5秒执行一次
    public void test() throws Exception {
        System.out.println("Spring集成Quartz 使用 Annotation的方式......");
    }
}