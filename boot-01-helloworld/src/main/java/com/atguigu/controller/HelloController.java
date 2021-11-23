package com.atguigu.controller;

import com.atguigu.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyanze
 * @create 2021-11-01 20:02
 */
@RestController
public class HelloController {
    @Autowired
    Car car;

    @RequestMapping("/Applecar")
    public Car getCar(){
        return car;
    }

    @RequestMapping("/hello")
    public String hello(){
        String result = "Hello Springboot2";
        return result;
    }
}
