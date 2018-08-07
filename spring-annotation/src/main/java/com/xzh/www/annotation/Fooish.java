package com.xzh.www.annotation;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: xuzh1
 * @Date: 2018-08-07 15:46
 **/
@Target({ ElementType.TYPE, ElementType.METHOD }) //可以用在方法或者类上面
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Fooish {

    String[] tags() default { "all" };
}
