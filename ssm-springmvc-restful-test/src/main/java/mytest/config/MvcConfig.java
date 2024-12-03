package mytest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Classname MvcConfig
 * @Description TODO
 * @Date 2024/12/2 18:23
 * @Created by cxx
 */
@Configuration
@ComponentScan("mytest")
public class MvcConfig {
    public RequestMappingHandlerAdapter handlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }

    public RequestMappingHandlerMapping handlerMapping() {
        return new RequestMappingHandlerMapping();
    }
}
