# guava-cache使用demo
## usage1:
  在缓存类中是通过new 服务，实现jdbcTemplate的获取
## usage2
  缓存类通过实现ApplicationListener接口中的方法，使得在bean实例化结束后执行某一方法
  可以直接通过注入已经实例化的bean，给缓存类使用。
  
## 测试工程
修改web.xml中的spring配置容器文件；修改springmvc.xml文件中controller的扫描
可分别测试usage1与usage2的用法。

## 总结
建议使用usage2方式加载缓存

                   write by xuzhanhui