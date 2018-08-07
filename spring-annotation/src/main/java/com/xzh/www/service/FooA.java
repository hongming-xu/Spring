package com.xzh.www.service;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-08-07 15:49
 **/

import com.xzh.www.annotation.Fooish;

/** FooA **/
public class FooA implements Foo{
    @Override
    @Fooish(tags={"this_is_method"})
    public void bar(){
        System.out.println("I am number 6!");
    }
}

