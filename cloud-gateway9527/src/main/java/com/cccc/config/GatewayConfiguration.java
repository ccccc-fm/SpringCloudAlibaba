package com.cccc.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator customRoute(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder route = builder.routes();
        route.route("path_baidu_guonei", r -> r.path("/consumer/getInfo").uri("http://localhost")).build();
        route.route("path_baidu_guonji", r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return route.build();
    }
}
