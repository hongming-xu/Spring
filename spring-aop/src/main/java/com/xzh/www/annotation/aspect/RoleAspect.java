package com.xzh.www.annotation.aspect;

import com.xzh.www.annotation.pojo.Role;
import com.xzh.www.annotation.verifier.RoleVerifierI;
import com.xzh.www.annotation.verifier.impl.RoleVerifierImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 15:29
 **/
@Aspect
@Order(1)     //当有多个aspect时，可设定aspect的顺序
public class RoleAspect {

//--------1、基本用法-----------------------------------------------------------------------------
    /**
     * 声明一个切点（被拦截的方法）
     */
    @Pointcut("execution(* com.xzh.www.annotation.service.impl.RoleServiceImpl.printRole(..))")
    public void print(){

    }

    @Before("print()")
    public void before(){
        System.out.println("before ....");
    }

    @After("print()")
    public void after() {
        System.out.println("after ....");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterReturning ....");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing ....");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("around before ....");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around after ....");
    }


 //---------2、spring aop introduction使用---------------------------------------------------------------


/*
    //接受连接点(被拦截方法)传递的参数
    @Before("execution(* com.xzh.www.annotation.service.impl.RoleServiceImpl.printRole(..)) " + "&& args(role, sort)")
    public void before(Role role, int sort) {
        System.out.println("before ...." );
    }
*/

//------3、spring aop introduction使用-------------------------------------------------------------

    //环绕通知使用
    @DeclareParents(value= "com.xzh.www.annotation.service.impl.RoleServiceImpl+", defaultImpl=RoleVerifierImpl.class)
    public RoleVerifierI roleVerifier;


}
