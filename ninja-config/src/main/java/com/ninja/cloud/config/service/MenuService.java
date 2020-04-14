package com.ninja.cloud.config.service;

import com.ninja.cloud.config.entity.Menu;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/28.
 * Description:
 */
public interface MenuService {
    Menu save(String appId, Menu menu);

    @Transactional
    List<Menu> saves(String appId, List<Menu> menu);

    List<Menu> list(String appId, String name, int status, String role);
}
