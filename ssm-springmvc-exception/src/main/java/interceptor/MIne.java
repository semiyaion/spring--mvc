package interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Classname MIne
 * @Description TODO
 * @Date 2024/12/3 10:37
 * @Created by cxx
 */
public class MIne implements HandlerInterceptor {
    //在handler之前，调用拦截方法
    //编码格式，登录保护，极限处理
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*request,请求对象
         response,相应对象，
         handler  要调用的方法，
         return     true放行，false 拦截*/
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler);
        return true;
    }

    //后置处理方法
    //handler处理之后调用的方法
    //没有  retrun
    //  modeAndView   返回的视图和共享域对象
    //一般是对敏感数据的处理
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", modelAndView = " + modelAndView);
    }

    //  整体处理完毕
    //  ex  handle 报错异常对象
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("整体处理方法");
    }
}
