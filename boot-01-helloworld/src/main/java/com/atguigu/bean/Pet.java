package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wuyanze
 * @create 2021-11-02 19:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private String name;
    private String age;
    private String like;
    private String color;
    private String sex;
    private boolean flag;
}
