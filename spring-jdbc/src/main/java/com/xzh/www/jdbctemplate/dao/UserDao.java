package com.xzh.www.jdbctemplate.dao;

import com.xzh.www.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-12 16:39
 **/
@Repository
public class UserDao extends BaseDao{

    /**
     * 查询单个对象queryForObject
     */
    public User queryUserById(int userId){
        String sql = "select id,user_name,password from t_user where id = ?";
        Object[] params = new Object[]{userId};

        BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return jdbcTemplate.queryForObject(sql, params, new int[]{Types.INTEGER}, rowMapper);
    }

    /**
     * 查询多个对象query
     */
    public List<User> multiQuery(){
        String sql = "select user.id as userId,user.user_name as userName,user.password from t_user user";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    /**
     * 查询count、avg、sum等函数返回唯一值
     */
    public Integer countQuery(){
        String sql = "select count(*) from t_user";

        BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * 新增
     */
    public int insert(User user){
        String sql = "insert into t_user (user_name,password) values (?,?)";
        return jdbcTemplate.update(sql, new Object[]{user.getUserName(), user.getPassword()}, new int[]{Types.VARCHAR, Types.VARCHAR});
    }

    /**
     * 更新
     */
    public int update(){
        String sql = "update t_user set user_name=? , password=? where id=?";
        return jdbcTemplate.update(sql, new Object[]{256, 256,3}, new int[]{Types.VARCHAR, Types.VARCHAR, Types.INTEGER});
    }

    /**
     * 删除
     */
    public int delete(){
        String sql = "delete from t_user where id=?";
        return jdbcTemplate.update(sql, new Object[]{3});
    }

    /**
     * 批量操作
     */
    public void batchOperation(){
        List<Object[]> batchArgs=new ArrayList<Object[]>();
        batchArgs.add(new Object[]{777,888});
        batchArgs.add(new Object[]{666,888});
        batchArgs.add(new Object[]{555,888});
        String sql = "insert into t_user (user_name,password) values (?,?)";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    public void batchDeleteOperation(){
        List<Object[]> batchArgs=new ArrayList<Object[]>();
        batchArgs.add(new Object[]{1});
        batchArgs.add(new Object[]{2});
        String sql = "delete from t_user where id = ?";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

    public void batchDeleteOperation2(){
        List<Object[]> batchArgs=new ArrayList<Object[]>();
        batchArgs.add(new Object[]{1});
        batchArgs.add(new Object[]{2});
        String sql = "delete user, relation from t_user user join user_department_relation relation on user.id = relation.user_id where user.id = ?";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }

}
