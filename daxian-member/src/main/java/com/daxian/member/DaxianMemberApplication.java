package com.daxian.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.daxian.member.feign")
public class DaxianMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaxianMemberApplication.class, args);
    }

}
