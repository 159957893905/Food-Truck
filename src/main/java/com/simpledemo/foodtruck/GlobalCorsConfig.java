package com.simpledemo.foodtruck;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class GlobalCorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // 允许所有来源
        config.addAllowedHeader("*"); // 允许所有头部
        config.addAllowedMethod("*"); // 允许所有方法
        source.registerCorsConfiguration("/**", config); // 对所有路径应用配置
        return new CorsFilter(source);
    }
}