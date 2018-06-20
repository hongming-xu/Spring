package com.xzh.www.usage1.service;

import com.xzh.www.usage1.dao.DataDictionaryDao;
import com.xzh.www.usage1.entity.DataDictionaryEntity;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-20 22:16
 **/
public class DataDictionaryService {

    public Map<String, String> getAllDataDictionaryCache(){
        Map<String, String> serverDisableDicMap = new HashMap<>();
        List<DataDictionaryEntity> dataDictionaryEntities = new ArrayList<DataDictionaryEntity>();
        dataDictionaryEntities = new DataDictionaryDao().getAllDataDictionaryEntity();
        if (!CollectionUtils.isEmpty(dataDictionaryEntities)) {
            for(DataDictionaryEntity dataDictionaryEntity : dataDictionaryEntities){
                String serverDisableDicId = String.valueOf(dataDictionaryEntity.getId());
                String serverDisableDesc = dataDictionaryEntity.getDescription();
                serverDisableDicMap.putIfAbsent(serverDisableDicId, serverDisableDesc);
            }
        }
        return serverDisableDicMap;
    }
}
