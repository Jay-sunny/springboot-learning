package com.yang.lea.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yang
 * @version 1.0
 * @date 2020-3-22 20:50
 * @description 启动类
 * 组合注解：@SpringBootApplication 相当于@EnableAutoConfiguration和@ComponentScan。
 * 注解：@EnableAutoConfiguration 表示开启自动化配置。开启自动化配置过后会自动进行Spring和SpringMVC的配置。
 * 注解：@ComponentScan 表示进行包扫描。
 */
@SpringBootApplication
public class LeaBuildHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeaBuildHelloApplication.class, args);
    }
}