package com.xzh.www.jdbctemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-12 14:34
 **/
public class BaseDao {

    //若使用xml配置UserDao bean, 注入jdbcTemplat时，必须写在setter方法上。
    @Autowired
    public JdbcTemplate jdbcTemplate;

}
