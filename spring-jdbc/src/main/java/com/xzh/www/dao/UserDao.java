package com.xzh.www.dao;


import com.xzh.www.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public void addUserByNamedParams(final User user){
        final String sql = "INSERT INTO t_user(user_name, password) VALUES(:userName, :passowrd)";

        MapSqlParameterSource sps = new MapSqlParameterSource();
        sps.addValue("userName", user.getUserName());
        sps.addValue("passowrd", user.getPassword());
//        this.getNamedParameterJdbcTemplate().update(sql, sps);
        namedParameterJdbcTemplate.update(sql, sps);
    }

    public List<User> selectUserList(String sql, SqlParameterSource parameters){
       return namedParameterJdbcTemplate.query(sql, parameters,new BeanPropertyRowMapper<User>(User.class));
    }

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
}
