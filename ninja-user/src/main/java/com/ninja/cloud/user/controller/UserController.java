package com.ninja.cloud.user.controller;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/4/19.
 * Description:
 */
@RestController
public class UserController {
    @GetMapping("/user")
    public Object findUserInfo(OAuth2Authentication user) {
        Map<String, Object> map = new HashMap<>();
        map.put("user", user.getUserAuthentication().getPrincipal());
        map.put("authorities", AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));
        map.put("details", user.getDetails());
        map.put("client_id", user.getOAuth2Request().getClientId());
        map.put("scope", user.getOAuth2Request().getScope());
        return map;
    }
}
