package com.ninja.cloud.user.service.impl;

import com.ninja.cloud.user.entity.IUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/5/7.
 * Description:
 */
@Slf4j
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

//    public UserDetailsServiceImpl() {
//        super.setJdbcTemplate(this.jdbcTemplate);
//    }


    private Map<String, IUser> userDetailsMap = new HashMap<String, IUser>() {{
        IUser admin = new IUser("admin", "admin", AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_DBA"));
        admin.setId(123L);
        admin.setIcon("admin.img");
        IUser user = new IUser("user", "user", AuthorityUtils.createAuthorityList("ROLE_USER"));
        user.setId(124L);
        user.setIcon("user.img");
        this.put("admin", admin);
        this.put("user", user);
    }};

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        IUser u = userDetailsMap.get(username);
        IUser user = IUser.copyFrom(u);
        return user;
    }
}
