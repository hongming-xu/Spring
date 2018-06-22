package com.xzh.www.xml2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-22 23:18
 **/
public class AppXml2 {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("quartz-xml2.xml");
    }
}
