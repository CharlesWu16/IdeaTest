package com.atguigu;

import com.atguigu.bean.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wuyanze
 * @create 2021-11-22 19:22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCar {
    @Autowired
    private Car car;

    @Test
    public void showCar(){
        System.out.println(car);
    }
}
