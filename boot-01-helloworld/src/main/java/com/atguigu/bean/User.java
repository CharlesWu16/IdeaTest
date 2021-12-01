package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wuyanze
 * @create 2021-11-02 19:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
//    int a;
//
//    protected final int b =1;
//
//    public void method(){
//        System.out.println("hello");
//    }
}
