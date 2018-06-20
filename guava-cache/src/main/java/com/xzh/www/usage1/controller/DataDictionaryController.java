package com.xzh.www.usage1.controller;

import com.xzh.www.usage1.cache.DataDictionaryCache;
import com.xzh.www.usage1.common.constants.DBConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-06-20 22:29
 **/
@RestController
@RequestMapping("/")
public class DataDictionaryController {

    @RequestMapping("")
    public void testServerDisableCacheInit(){
        Map<String, String> serverDisableDicCache = null;
        try {
            serverDisableDicCache = DataDictionaryCache.dataDictionaryCache.get(DBConstants.DATA_DICTIONARY_CACHE_KEY);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        for(Map.Entry<String, String> entry : serverDisableDicCache.entrySet()){
            System.out.println("serverDisableDicId: " + entry.getKey() + "; serverDisableDesc: " + entry.getValue());
        }
    }
}
