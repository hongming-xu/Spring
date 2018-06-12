package com.xzh.www.jdbctemplate.test;

import com.xzh.www.jdbctemplate.dao.UserDao;
import com.xzh.www.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-12 15:51
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-cfg1.xml"})
public class UserDaoTest{

    //若使用xml配置UserDao bean, 注入jdbcTemplat时，必须写在setter方法上。
    @Autowired
    public UserDao userDao;


    @Test
    public void testQueryUserById(){
        System.out.println(userDao.queryUserById(1));
    }

    @Test
    public void testMultiQuery(){
        List<User> users = userDao.multiQuery();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testCountQuery(){
        System.err.println(userDao.countQuery());
    }

    @Test
    public void testInsert(){

    }



}
