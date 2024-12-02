package org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname Hellocontrol
 * @Description TODO
 * @Date 2024/12/1 11:23
 * @Created by cxx
 */
@Controller

public class Hellocontrol {
    //handler -->springmvc/hello
    @RequestMapping("springmvc/hello")//对外访问的地址，到handlerMapping注册的注解
    @ResponseBody//直接返回字符串给前端，不要找视图解析器
    public String hello() {
        System.out.println("HelloController.hello");
        //返回给前端
        return "hello springmvc";
    }
}
