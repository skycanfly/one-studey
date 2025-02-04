package com.daxian.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableCaching
@MapperScan("com.daxian.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.daxian.product.feign"})
public class DaxianProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaxianProductApplication.class, args);
    }

}
