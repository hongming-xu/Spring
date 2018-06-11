package com.xzh.www.annotation.service;

import com.xzh.www.annotation.pojo.Role;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 15:17
 **/
public interface RoleServiceI {

    public void printRole(Role role);
    public void printRole(Role role, int sort);
}
