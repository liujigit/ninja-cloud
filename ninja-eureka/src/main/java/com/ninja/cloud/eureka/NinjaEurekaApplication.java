package com.ninja.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.ArrayList;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableEurekaServer
public class NinjaEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(NinjaEurekaApplication.class, args);
    }

}
