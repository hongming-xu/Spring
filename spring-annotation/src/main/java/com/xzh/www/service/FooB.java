package com.xzh.www.service;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-08-07 15:49
 **/

import com.xzh.www.annotation.Fooish;
import org.springframework.stereotype.Component;

/** FooB **/
@Fooish(tags= {"this_is_class"})
@Component // 一定得写，有这个注解，Spring才会将这个类实例化
public class FooB implements Foo{
    @Override
    public void bar(){
        System.out.println("I am not a number, I am a free man!");
    }
}
