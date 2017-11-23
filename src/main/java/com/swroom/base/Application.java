package com.swroom.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tsunglei Ching [ray@boyamarine.com]
 * @date 2017/11/22 17:37
 */
@SpringBootApplication
@MapperScan(basePackages = "com.swroom.base.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
