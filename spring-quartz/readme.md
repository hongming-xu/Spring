#   Spring集成Quartz的2种方式
* * *
# 一、Spring通过xml的方式集成Quartz
**Maven依赖**  
**步骤**
- 创建JobDteail
- 创建Trigger
- 创建Scheduler  


### 1、Maven依赖

```xml
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context-support</artifactId>
        <version>${spring.version}</version>
    </dependency>

    <dependency>
        <groupId>org.quartz-scheduler</groupId>
        <artifactId>quartz</artifactId>
        <version>2.2.3</version> 
    </dependency>

```

### 2、JobDetail的2种实现方式
- JobDteail通过JobDetailBean实现(需要实现QuartzJobBean接口）
- JobDteail通过MethodInvokeJobDetailFactoryBean实现

注：</br>
如果想简单方便的方法，可使用MethodInvokeJobDetailFactoryBean；</br>
如果你需要更高级的设置，需要给作业传递数据，想更加灵活的话就使用MethodInvokeJobDetailFactoryBean. </br>

_ _ _


### 3、Trigger的选择（2种）
- SimpleTriggerFactoryBean（仅定义简单的Trigger)
- CronTriggerFactoryBean


_ _ _

# 二、Spring通过注解的方式集成Quartz
- - -
### 1、配置文件修改
- 配置文件中增加task命名空间
```xml
    xmlns:task="http://www.springframework.org/schema/task" 

    http://www.springframework.org/schema/task   
    http://www.springframework.org/schema/task/spring-task.xsd
```
- 配置Spring扫描和task扫描
```xml
    <!-- 定时任务扫描 -->
    <task:annotation-driven/>
```

### 2、编写带有注解的job类
```java
    @Component
    public class MyAnnoJob {

        // 每隔5秒执行一次
        @Scheduled(cron = "*/5 * * * * ?")
        public void test() throws Exception {
            System.out.println("Spring集成Quartz 使用 Annotation的方式......");
        }
    }
```
### 参考文献
(1)Spring 4.2.2 集成 Quartz Scheduler 2.2.2 任务调度示例   </br>
https://blog.csdn.net/defonds/article/details/49496895  <br/>
(2)Quartz-Spring集成Quartz通过XML配置的方式    <br/>
https://blog.csdn.net/yangshangwei/article/details/78505730  <br/>
(3)Quartz-Spring集成Quartz通过注解配置的方式  <br/>
https://blog.csdn.net/yangshangwei/article/details/78514774



























