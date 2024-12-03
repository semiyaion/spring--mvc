package config;

import interceptor.MIne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Classname MvcConfig
 * @Description TODO
 * @Date 2024/12/2 8:37
 * @Created by cxx
 */

@Configuration
@ComponentScan({"Controller", "error"})
@EnableWebMvc //json解析器
public class MvcConfig implements WebMvcConfigurer {
    @Bean
    public RequestMappingHandlerMapping handlerMapping() {
        return new RequestMappingHandlerMapping();
    }

    @Bean
    public RequestMappingHandlerAdapter handlerAdapter() {
        return new RequestMappingHandlerAdapter();
    }

    //设置前后缀，可以指定文件到指定文件夹中寻找指定的文件类型
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/view/", ".jsp");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
        //开启静态资源查找
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        //配置：拦截全部请求
//        registry.addInterceptor(new MIne());


        //指定地址拦截
        registry.addInterceptor(new MIne())
                .addPathPatterns("/user/data");//此处只拦截data1
        //排除拦截
        registry.addInterceptor(new MIne()).addPathPatterns("user/**").excludePathPatterns("/user/data1");
        //拦截user中的所有路径除了data1    }
    }
}
