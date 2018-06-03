package com.xzh.www.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class BaseDao extends NamedParameterJdbcDaoSupport {

    @Resource(name = "jdbcTemplate")
    public void setJb(JdbcTemplate jb) {
        super.setJdbcTemplate(jb);
    }
}
