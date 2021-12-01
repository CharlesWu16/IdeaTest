package com.atguigu;

import com.atguigu.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author wuyanze
 * @create 2021-11-01 19:59
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        User user01 = run.getBean("getUser", User.class);
        User user02 = run.getBean("getUser", User.class);
        System.out.println("user01==user02吗？ "+(user01==user02));

    }
}
