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

    private int age;
}
