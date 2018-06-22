package com.xzh.www.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-22 23:01
 **/
public class AppAnnotation {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("quartz-annotation.xml");
    }
}
