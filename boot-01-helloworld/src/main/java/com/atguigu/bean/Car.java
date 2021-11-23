package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author wuyanze
 * @create 2021-11-02 20:38
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private BigDecimal price;
    private boolean expensive;
    private String email;
    private String address;
}
