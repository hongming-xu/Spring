package com.xzh.www.usage2.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-20 22:45
 **/
public class BaseDao extends NamedParameterJdbcDaoSupport {

    @Resource(name = "jdbcTemplate")
    public void setJb(JdbcTemplate jb) {
        super.setJdbcTemplate(jb);
    }
}
