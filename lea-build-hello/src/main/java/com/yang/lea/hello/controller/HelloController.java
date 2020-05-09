package com.yang.lea.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yang
 * @version 1.0
 * @date 2020/3/22 21:22
 * @description HelloController控制层
 * 组合注解：@RestController代替@Controller和@ResponseBody
 * 注解：@RestController 以JSON格式进行响应。
 */
@RestController
public class HelloController {
    /**
     * 注解 @GetMapping("/hello") 相当于：@RequestMapping(value = "hello",method = RequestMethod.GET)
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }
}
