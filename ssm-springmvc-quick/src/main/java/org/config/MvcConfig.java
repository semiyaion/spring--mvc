package org.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Classname MvcConfig
 * @Description TODO
 * @Date 2024/12/1 11:27
 * @Created by cxx
 */
@Configuration
@ComponentScan("org.controller")
public class MvcConfig {
    //将controller配置到ioc容器
    //将handlerMapping 加入到ioc容器
    @Bean
    public RequestMappingHandlerMapping handlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }


}
