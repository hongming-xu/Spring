package com.xzh.www.usage1.dao;

import com.xzh.www.usage1.common.constants.DBConstants;
import com.xzh.www.usage1.common.spring.SpringContextUtil;
import com.xzh.www.usage1.entity.DataDictionaryEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-20 22:16
 **/
public class DataDictionaryDao {

    public List<DataDictionaryEntity> getAllDataDictionaryEntity(){
        JdbcTemplate jb = (JdbcTemplate) SpringContextUtil.getBean("jdbcTemplate");
        StringBuffer sb = new StringBuffer();
        sb.append(" SELECT ");
        sb.append("serverDisableDic.id as id, serverDisableDic.description as description");
        sb.append(" FROM ");
        sb.append(DBConstants.GUAVA_CACHE_DATABASE + "." + DBConstants.DATA_DICTIONARY_DATABASE + " serverDisableDic");
        List<DataDictionaryEntity> serverDisableDataDictionaryEntities = new ArrayList<DataDictionaryEntity>();
        try {
            serverDisableDataDictionaryEntities = jb.query(sb.toString(), new BeanPropertyRowMapper<DataDictionaryEntity>(DataDictionaryEntity.class));
        } catch (Exception e) {
            System.out.println("get server disable entity info error -dao ");
        }
        return serverDisableDataDictionaryEntities;
    }

}
