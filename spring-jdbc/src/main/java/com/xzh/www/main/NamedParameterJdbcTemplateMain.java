package com.xzh.www.main;

import com.xzh.www.dao.UserDao;
import com.xzh.www.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NamedParameterJdbcTemplateMain {

    public static void main(String[] args) {
        //testAddUser();
        testSelectUserList();
    }

    public static void testAddUser(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        UserDao userDao = (UserDao)ctx.getBean("userDao");
        User user1 = new User();
        user1.setUserName("xzh");
        user1.setPassword("xzh");
        userDao.addUserByNamedParams(user1);
        System.out.println("观察数据库");
    }

    public static void testSelectUserList(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        UserDao userDao = (UserDao)ctx.getBean("userDao");

        String sql = "SELECT tuser.user_name as username,tuser.password as password from t_user tuser where id in (:ids)";
        MapSqlParameterSource parameters = new MapSqlParameterSource();
        List<String> filterIds = new ArrayList<String>();
        filterIds.add("1");
        filterIds.add("3");
        parameters.addValue("ids", filterIds);

        List<User> userList = new ArrayList<User>();
        userList = userDao.selectUserList(sql, parameters);

        for(Iterator<User> it = userList.iterator(); it.hasNext();){
            User user = it.next();
            System.out.println("name: " + user.getUserName() + " ; password: " + user.getPassword());
        }

    }
}
