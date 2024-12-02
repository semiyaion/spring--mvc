package org.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @Classname SpringMvcchushihua
 * @Description TODO
 * @Date 2024/12/1 11:33
 * @Created by cxx
 */
//可以被web项目加载，会初始化ioc'容器，会设置dispatcherServlet的地址
public class SpringMvcchushihua extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //service 和mapper层的ioc容器配置
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //设置项目配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MvcConfig.class};
    }

    //  配置springMvc内部自带的servlet的访问地址
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
