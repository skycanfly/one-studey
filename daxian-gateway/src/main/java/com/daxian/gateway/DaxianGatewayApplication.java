package com.daxian.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude ={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class DaxianGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaxianGatewayApplication.class, args);
    }

}
