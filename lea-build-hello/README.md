## lea-build-hello

### 简介
用SpringBoot创建一个最简的Web项目。

### 项目结构
* src/main/java 程序开发以及主程序入口
* src/main/resources 配置文件（项目中的配置文件基于yml文件）
* src/test/java 测试程序

### 项目中模块的引入
```java
<dependency>
    <!--添加spring-boot-starter-web依赖-->
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```
### 项目的pom文件中有默认的两个模块：
* spring-boot-starter-parent ：Springboot核心模。（依赖于springboot-learning父pom文件中）
* spring-boot-starter-web ：SpringMVC模块

### 项目使用的相关注解

**@SpringBootApplication注解**

Spring Boot和传统的Spring框架一样，是通过注解来降低类（以及模块）之间的耦合，在其中，@SpringBootApplication这个注解用得比较多，因为我们一般用它来启动应用项目。
 事实上它是一个复合注解，等价于@ComponentScan、@SpringBootConfiguration和@EnableAutoConfiguration。
 
* @ComponentScan继承于@Configuration，用来表示程序启动时将自动扫描当前包及子包下的所有类。
* @SpringBootConfiguration表示将会把本类里声明的一个或多个以@Bean注解标记的实例纳入Spring容器中。
* @EnableAutoConfiguration用来表示程序启动时将自动地装载springboot默认配置文件。

**@RestController注解**

@RestController注解：在Controller（控制层）里面的方法都以 json 格式响应给前端。
@RestController代替@Controller和@ResponseBody

**@GetMapping**

@GetMapping("/hello") 相当于：@RequestMapping(value = "hello",method = RequestMethod.GET)