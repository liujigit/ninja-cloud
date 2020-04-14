package com.ninja.cloud.config;

import com.ninja.cloud.swagger.annotation.NinjaSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NinjaSwagger(basePackage = "com.ninja.cloud.config.controller")
public class NinjaConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NinjaConfigApplication.class, args);
    }

}
