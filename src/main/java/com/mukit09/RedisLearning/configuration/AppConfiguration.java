package com.mukit09.RedisLearning.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class AppConfiguration {

    @Autowired
    private CacheInterceptor cacheInterceptor;

    @PostConstruct
    public void init() {
        cacheInterceptor.afterSingletonsInstantiated();
    }
}