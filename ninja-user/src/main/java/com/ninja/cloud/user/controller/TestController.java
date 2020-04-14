package com.ninja.cloud.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/27.
 * Description:
 */
@RestController
@RequestMapping("/v1")
public class TestController {
    @GetMapping("lvs")
    public String lvs() {
        return "ok";
    }
}
