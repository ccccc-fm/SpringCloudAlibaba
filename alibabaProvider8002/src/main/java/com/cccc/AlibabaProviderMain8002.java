package com.cccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaProviderMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaProviderMain8002.class, args);
    }
}
