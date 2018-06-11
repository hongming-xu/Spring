package com.xzh.www.xml.service.impl;

import com.xzh.www.xml.pojo.Role;
import com.xzh.www.xml.service.RoleServiceI;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 15:20
 **/
public class RoleServiceImpl implements RoleServiceI {
    public void printRole(Role role) {
        System.out.println("{id: " + role.getId() + ", "
                + "role_name : " + role.getRoleName() + ", "
                + "note : " + role.getNote() + "}");
    }

    public void printRole(Role role, int sort) {
        System.out.println("{id: " + role.getId() + ", "
                + "role_name : " + role.getRoleName() + ", "
                + "note : " + role.getNote() + "}");
        System.out.println(sort);
    }
}
