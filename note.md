# Spring

## 1. xml

## 2. annotation 注解说明
### 2.1@Autowired 
默认匹配 byType.

### 2.2@Qualifier
@Qualifier 配合Autowired使用，当Autowired不能唯一自动装配属性，则需要使用
@Qualifier(value=""")来指定具体的值

### 2.3 @Component
将某个类注册到Spring容器中，有几个等价的衍生注解：

    对应MVC三层架构
    @Service     (Service)
    @Controller  (Controller)
    @Repository  (DAO)

### 2.4 @Configuration and @Bean
代替xml，直接使用Java类来向Spring 容器中注册bean
```java

@Configuration
public class MyConfig{
    @Bean
    public User getUser(){
        return new User();
    }
}
```


