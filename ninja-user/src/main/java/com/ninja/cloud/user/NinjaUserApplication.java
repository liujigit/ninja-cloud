package com.ninja.cloud.user;

import com.ninja.cloud.swagger.annotation.NinjaSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;

@SpringBootApplication
@NinjaSwagger(basePackage = "com.ninja.cloud.user.controller")
public class NinjaUserApplication {

    public static void main(String[] args) {
//        TokenEndpoint
        SpringApplication.run(NinjaUserApplication.class, args);
    }

}
