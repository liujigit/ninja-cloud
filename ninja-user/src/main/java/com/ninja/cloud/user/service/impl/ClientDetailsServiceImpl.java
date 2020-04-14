package com.ninja.cloud.user.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright：botBrain.ai
 * Author: liuji
 * Date: 2019/5/7.
 * Description:
 */
@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {
    private Map<String, ClientDetails> detailsMap = new HashMap<String, ClientDetails>() {{
        BaseClientDetails lk = new BaseClientDetails();
        lk.setClientId("lk");
        lk.setClientSecret("lk");
        lk.setAccessTokenValiditySeconds(5000);
        lk.setRefreshTokenValiditySeconds(15000);
        //支持的授权方式
        lk.setAuthorizedGrantTypes(Lists.newArrayList("password", "client_credentials", "refresh_token"));
        lk.setRegisteredRedirectUri(Sets.newHashSet("www.baidu.com", "www.baidu1.com"));
        lk.setScope(Lists.newArrayList("web", "app"));
        lk.setAuthorities(AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN", "ROLE_DBA"));

        BaseClientDetails hk = new BaseClientDetails();
        hk.setClientId("hk");
        hk.setClientSecret("hk");
        hk.setAccessTokenValiditySeconds(1500);
        hk.setRefreshTokenValiditySeconds(15000);
        hk.setAuthorizedGrantTypes(Lists.newArrayList("password", "client_credentials", "refresh_token"));
        hk.setRegisteredRedirectUri(Sets.newHashSet("www.baidu.com", "www.baidu1.com"));
        hk.setScope(Lists.newArrayList("web", "app"));
        hk.setAuthorities(AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN", "ROLE_DBA"));
        this.put("lk", lk);
        this.put("hk", hk);
    }};

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        return detailsMap.get(clientId);
    }
}
