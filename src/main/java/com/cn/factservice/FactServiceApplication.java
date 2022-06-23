package com.cn.factservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FactServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactServiceApplication.class, args);
    }

}
