package com.daxian.daxiansearch;

import cn.easyes.starter.register.EsMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EsMapperScan("com.daxian.daxiansearch.mapper")
public class DaxianSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaxianSearchApplication.class, args);
    }

}
