package com.xzh.www.xml.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 20:47
 **/
public class XmlRoleAspect {

    public void before() {
        System.out.println("before ......");
    }

    public void after() {
        System.out.println("after ......");
    }

    public void afterThrowing() {
        System.out.println("after-throwing ......");
    }

    public void afterReturning() {
        System.out.println("after-returning ......");
    }

    public void around(ProceedingJoinPoint jp) {
        System.out.println("around before ......");
        try {
            jp.proceed();
        } catch (Throwable e) {
            new RuntimeException("回调原有流程，产生异常......");
        }
        System.out.println("around after ......");
    }


}
