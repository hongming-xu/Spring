package com.xzh.www.namedparameter.dao;

import com.xzh.www.pojo.User;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-12 16:39
 **/
@Repository
public class UserDao extends BaseDao {

    /**
     * 具名新增
     */
    public void insert(){
        String sql = "insert into t_user (user_name,password) values (:user_name,:password)";
        User u = new User();
        u.setUserName("555");
        SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(u);
        namedParameterJdbcTemplate.update(sql,sqlParameterSource);
    }


    /**
     *
     * NamedParameterJdbcTemplate还新增了KeyHolder类,使用它我们可以获得主键
     */
    public void testKeyHolder(){
        String sql = "insert into t_user (user_name,password) values (:user_name,:password)";
        User u = new User();
        u.setUserName("555");
        SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(u);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, sqlParameterSource, keyHolder);
        int k = keyHolder.getKey().intValue();
        System.out.println(k);
    }

}
