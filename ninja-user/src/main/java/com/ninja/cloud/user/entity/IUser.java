package com.ninja.cloud.user.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/5/9.
 * Description:
 */
public class IUser extends User {
    private Long id;
    private String icon;

    public IUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public IUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public static IUser copyFrom(IUser user) {
        if (user == null) {
            return null;
        }
        IUser u = new IUser(user.getUsername(), user.getPassword(), new ArrayList<>(user.getAuthorities()));
        u.setId(user.getId());
        u.setIcon(user.getIcon());
        return u;
    }
}
