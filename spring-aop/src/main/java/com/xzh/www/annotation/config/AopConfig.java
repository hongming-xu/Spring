package com.xzh.www.annotation.config;

import com.xzh.www.annotation.aspect.RoleAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description: 使用注解初始化容器
 * @Configuration: 初始化spring容器（未使用applicationContext.xml配置文件初始化容器）
 * @EnableAspectJAutoProxy： 使能aop
 * @ComponentScan： 设定注解扫描范围
 * @Author: xuzh1
 * @Date: 2018-06-11 15:43
 **/
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.xzh.www.annotation")
public class AopConfig {

    /**
     * @Bean: 仅作用在方法上，存在4个配置属性
     * name、initMethod、destroyMethod、autowired
     */
    @Bean
    public RoleAspect getRoleAspect() {
        return new RoleAspect();
    }
}
