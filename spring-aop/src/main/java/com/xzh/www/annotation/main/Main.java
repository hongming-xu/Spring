package com.xzh.www.annotation.main;

import com.xzh.www.annotation.config.AopConfig;
import com.xzh.www.annotation.pojo.Role;
import com.xzh.www.annotation.service.RoleServiceI;
import com.xzh.www.annotation.verifier.RoleVerifierI;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 15:06
 **/
public class Main {
    public static void main(String[] args) {
//        testAnnotation();
//        testAopParams();
        testIntroduction();
    }

    /**
     * 测试
     * 1、基本用法
     * 通过注解，使用Aspect实现的spring aop
     */
    public static void testAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        Role role = new Role(1l, "role_name_1", "note_1");
        RoleServiceI roleService = context.getBean(RoleServiceI.class);
        roleService.printRole(role);
    }


    /**
     * 2、传递参数给通知
     */
    public static void testAopParams(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-cfg1.xml");
        Role role = new Role(1l, "role_name_1", "note_1");
        RoleServiceI roleService = context.getBean(RoleServiceI.class);
        roleService.printRole(role, 1);
    }

    /**
     * 3、测试spring aop introduction
     * introduction: 允许在现有的类中添加自定义的类和方法。
     */
    public static void testIntroduction(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        RoleServiceI roleService = ctx.getBean(RoleServiceI.class);
        RoleVerifierI roleVerifier = (RoleVerifierI) roleService;

        Role role = new Role(1L, "role_name_1", "note_1");

        if(roleVerifier.verify(role)){
            roleService.printRole(role);
        }
}



}
