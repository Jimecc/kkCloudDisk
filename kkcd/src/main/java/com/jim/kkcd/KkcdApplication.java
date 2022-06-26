package com.jim.kkcd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jim.kkcd.mapper")
public class KkcdApplication {

    public static void main(String[] args) {
        SpringApplication.run(KkcdApplication.class, args);
    }

}
