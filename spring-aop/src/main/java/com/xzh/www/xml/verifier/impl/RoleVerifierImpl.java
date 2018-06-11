package com.xzh.www.xml.verifier.impl;

import com.xzh.www.xml.pojo.Role;
import com.xzh.www.xml.verifier.RoleVerifierI;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-11 17:00
 **/
public class RoleVerifierImpl implements RoleVerifierI {
    public boolean verify(Role role) {
        System.out.println("引入，检测一下角色是否为空");
        return role != null;
    }
}
