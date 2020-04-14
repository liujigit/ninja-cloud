package com.ninja.cloud.user.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/12/20.
 * Description:
 */
public class NoEncryptPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return (String) charSequence;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence);
    }
}
