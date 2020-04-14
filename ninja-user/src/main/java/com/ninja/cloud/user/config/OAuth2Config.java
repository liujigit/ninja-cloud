//package com.ninja.cloud.user.config;
//
//import com.ninja.cloud.user.service.impl.ClientDetailsServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.ClientDetailsService;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
//
///**
// * Copyright：botBrain.ai
// * Author: liuji
// * Date: 2019/4/18.
// * Description:
// */
//@Configuration
//@EnableAuthorizationServer
//public class OAuth2Config extends AuthorizationServerConfigurerAdapter {
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Autowired
//    private TokenStore tokenStore;
//    //    @Resource(name = "mydataSource")
////    private DataSource dataSource;
////
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private JwtAccessTokenConverter jwtAccessTokenConverter;
//
//
//    //    public OAuth2Config(AuthenticationConfiguration authenticationConfiguration) throws Exception {
////        this.authenticationManager = authenticationConfiguration.getAuthenticationManager();
////    }
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        //下面配置了一个简单的客服端
////        clients.inMemory()// 使用内存保存客服端信息，建议编写自己的clientService来配置客服端
////                .withClient("lk")//客服端的clientid
////                .secret("lk")//该客服端访问时的密码
////                .authorizedGrantTypes("password", "client_credentials", "refresh_token")//支持的授权方式
////                .scopes("web", "app")   //scope范围
////                .accessTokenValiditySeconds(12000)
////                .refreshTokenValiditySeconds(360000);
//
//        ClientDetailsService clientDetailsService = new ClientDetailsServiceImpl();
//        clients.withClientDetails(clientDetailsService).jdbc().passwordEncoder(this.passwordEncoder);
//    }
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
//
//        endpoints
////                .tokenStore(tokenStore)
//                .accessTokenConverter(jwtAccessTokenConverter())
//                .authenticationManager(authenticationManager)
//                .userDetailsService(userDetailsService)
//        ;
////                .reuseRefreshTokens(false)
//    }
//
////    @Override
////    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {
////        oauthServer
////                .allowFormAuthenticationForClients()
////                .checkTokenAccess("permitAll()");
////    }
//
//
//    @Bean(name = "tokenStore")
//    public TokenStore tokenStore() {
////        RedisTokenStore tokenStore = new RedisTokenStore(redisFactory);
////        tokenStore.setPrefix("text_oauth:");
////        return tokenStore;
//        return new JwtTokenStore(jwtAccessTokenConverter());
//    }
//
////    @Bean("tokenServices")
////    public DefaultTokenServices tokenServices() {
////        return new DefaultTokenServices();
////    }
//
//
//    @Bean(name = "jwtAccessTokenConverter")
//    public JwtAccessTokenConverter jwtAccessTokenConverter() {
//        JWTTokenEnhancer jwtTokenEnhancer = new JWTTokenEnhancer();
//        jwtTokenEnhancer.setSigningKey("123456");
////        jwtAccessTokenConverter.setAccessTokenConverter(new IAccessTokenConverter());
//        return jwtTokenEnhancer;
////        return (accessToken, authentication) -> {
////            final Map<String, Object> additionalInfo = new HashMap<>(1);
////            additionalInfo.put("license", "made by pig");
////            ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
////            ((DefaultOAuth2AccessToken) accessToken)
////            return accessToken;
////        };
//    }
//
//
//}