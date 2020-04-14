package com.ninja.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class NinjaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(NinjaZuulApplication.class, args);
    }

}
