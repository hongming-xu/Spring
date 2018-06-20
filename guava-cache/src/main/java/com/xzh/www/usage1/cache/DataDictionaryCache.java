package com.xzh.www.usage1.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.xzh.www.usage1.common.constants.DBConstants;
import com.xzh.www.usage1.common.constants.SystemConstants;
import com.xzh.www.usage1.service.DataDictionaryService;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-20 22:15
 **/
public class DataDictionaryCache {


    private DataDictionaryService dataDictionaryService;
    public static LoadingCache<String, Map<String, String>> dataDictionaryCache;

    @PostConstruct
    public void init() {
        dataDictionaryService = new DataDictionaryService();
        dataDictionaryCache = CacheBuilder.newBuilder()
                .maximumSize(SystemConstants.MAX_NUM_SIZE)
                .refreshAfterWrite(30, TimeUnit.MINUTES)
                .build(new CacheLoader<String, Map<String, String>>() {
                    @Override
                    public Map<String, String> load(String cacheType) throws Exception {
                        if (DBConstants.DATA_DICTIONARY_CACHE_KEY.equals(cacheType)) {
                            return dataDictionaryService.getAllDataDictionaryCache();
                        }else{
                            return new HashMap<String,String>();
                        }
                    }
                });
        try{
            dataDictionaryCache.get(DBConstants.DATA_DICTIONARY_CACHE_KEY);
        }catch (Exception e){
            System.out.println("get server disable dictionary cache info error");
            e.printStackTrace();
        }
    }

}
