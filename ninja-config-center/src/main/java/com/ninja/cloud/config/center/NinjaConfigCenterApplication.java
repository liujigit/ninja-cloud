package com.ninja.cloud.config.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NinjaConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(NinjaConfigCenterApplication.class, args);
    }

}
