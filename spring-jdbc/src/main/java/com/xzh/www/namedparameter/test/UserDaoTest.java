package com.xzh.www.namedparameter.test;

import com.xzh.www.namedparameter.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-12 17:38
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-cfg2.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testNamedParameter(){

    }

    @Test
    public void testKeyHolder(){

    }
}
