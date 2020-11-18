package com.example.producer7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Producer7002Application {

    public static void main(String[] args) {
        SpringApplication.run(Producer7002Application.class, args);
    }

}
