package com.ninja.cloud.config.controller;

import com.ninja.cloud.config.entity.Menu;
import com.ninja.cloud.config.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/28.
 * Description:
 */
@RestController
@RequestMapping("/v1/{appId}/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping("/save")
    public Menu save(@PathVariable String appId,
                     @RequestBody Menu menu) {
        return this.menuService.save(appId, menu);
    }

    @PostMapping("/saves")
    public List<Menu> saves(@PathVariable String appId,
                            @RequestBody List<Menu> menus) {
        return this.menuService.saves(appId, menus);
    }
    @GetMapping("/list")
    public List<Menu> list(@PathVariable String appId,
                           String name,
                           @RequestParam(defaultValue = "-1") int status,
                           String role) {
        return this.menuService.list(appId,name,status,role);
    }
}
