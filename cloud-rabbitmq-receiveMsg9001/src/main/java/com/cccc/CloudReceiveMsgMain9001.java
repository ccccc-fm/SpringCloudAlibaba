package com.cccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudReceiveMsgMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudReceiveMsgMain9001.class, args);
    }
}
