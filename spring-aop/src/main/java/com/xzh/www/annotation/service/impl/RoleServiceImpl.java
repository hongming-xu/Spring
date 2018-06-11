package com.xzh.www.annotation.service.impl;

import com.xzh.www.annotation.pojo.Role;
import com.xzh.www.annotation.service.RoleServiceI;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 15:20
 **/
@Component(value = "roleService")
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
