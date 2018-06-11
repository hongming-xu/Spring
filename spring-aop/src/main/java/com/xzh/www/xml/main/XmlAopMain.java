package com.xzh.www.xml.main;

import com.xzh.www.xml.pojo.Role;
import com.xzh.www.xml.verifier.RoleVerifierI;
import com.xzh.www.xml.service.RoleServiceI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 21:00
 **/
public class XmlAopMain {

    public static void main(String[] args) {
        testXmlAop();
    }

    public static void testXmlAop(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg2.xml");
        RoleServiceI roleService = ctx.getBean(RoleServiceI.class);

        RoleVerifierI roleVerifier = (RoleVerifierI) roleService;

        Role role = new Role(1L, "role_name_1", "note_1");

        if(roleVerifier.verify(role)){
            roleService.printRole(role);
        }

    }

}
