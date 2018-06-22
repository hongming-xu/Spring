package com.xzh.www.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXml {
    public static void main( String[] args ){
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("quartz-xml1.xml");
    }
}
