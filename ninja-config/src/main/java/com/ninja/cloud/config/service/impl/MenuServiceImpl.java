package com.ninja.cloud.config.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ninja.cloud.config.entity.Menu;
import com.ninja.cloud.config.mapper.MenuMapper;
import com.ninja.cloud.config.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/11/28.
 * Description:
 */
@Slf4j
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public Menu save(String appId, Menu menu) {
        return this.menuMapper.saveReturn(appId, menu);
    }

    @Override
    @Transactional
    public List<Menu> saves(final String appId, List<Menu> menu) {
        return menu.parallelStream()
                .map(item -> this.menuMapper.saveReturn(appId, item))
                .collect(Collectors.toList());
    }

    @Override
    public List<Menu> list(String appId, String name, int status, String role) {
        QueryWrapper<Menu> queryWrapper = Wrappers.query();

        if (!StringUtils.isEmpty(name)) {
            queryWrapper.like("name", name);
        }

        if (status != -1) {
            queryWrapper.eq("status", status);
        }

        if (role != null && !role.isEmpty()) {
            queryWrapper.apply("role", role);
        }
        return this.menuMapper.selectList(appId, queryWrapper);
    }
}
