package com.atguigu.config;

import com.atguigu.bean.Car;
import com.atguigu.bean.Pet;
import com.atguigu.bean.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuyanze
 * @create 2021-11-02 19:54
 * 1.配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2.配置类本身也是组件
 * 3.proxyBeanMethods：代理bean的方法，如果是true的话，每次拿到的都是同一个对象，
 * 如果是false的话，每次拿到的都是不同的对象
 */
@Configuration(proxyBeanMethods = true)
//@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    public User getUser(){
        return new User("Charles",30);
    }

    @Bean
    public Pet getPet(){
        return new Pet("Tomcat");
    }
}
