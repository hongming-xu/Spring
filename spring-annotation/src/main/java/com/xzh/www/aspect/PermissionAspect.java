package com.xzh.www.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-08-07 15:54
 **/
@Aspect
@Component
public class PermissionAspect {

    @Pointcut("@annotation(com.xzh.www.annotation.Fooish)")
    public void permissionCodeAspect() {
    }

    @Before("permissionCodeAspect()")
    public void doBefore(JoinPoint joinPoint) {
        try {
            //*========控制台输出=========*//
            System.out.println("=====前置通知开始=====");
            System.out.println("###请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
            System.out.println("=====前置通知结束=====");
        }  catch (Exception e) {
            //记录本地异常日志
            e.printStackTrace();
        }
    }
    @After("permissionCodeAspect()")
    public void doAfterTask(JoinPoint joinPoint){
        System.out.println("=====后置通知=====");
        System.out.println("###请求方法:" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName() + "()"));
        System.out.println("=====后置通知end=====");
    }
}
