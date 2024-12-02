package com.xlc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2024/12/1 11:55
 * @Created by cxx
 */
@Controller
@RequestMapping("/user")
//类上添加RequestMapping，提取的是方法中共有的地址，类上加之后，方法上只需要写自己独有的地址即可
public class UserController {
    @RequestMapping("login")//作用注册地址
    //精准地址{一个，或多个}——》{地址一，地址二}
    //支出模糊地址*（任意一层字符串）||**（任意多层字符串）

    //请求方式指定：
    //客户端可能发送类似get post  put  delete 等请求
    /*默认情况：@RequestMapping("xxx")  只要地址正确，任何请求都能访问
     * 指定情况：@RequestMapping("xxx",method=RequestMethod.xxxxx),即可完成指定方式的指定
     *                                               method可指定多种请求形式，用{}存放
     * 不符合请求方式：会出现405异常
     *
     * 或者直接使用GetMappding  PostMapping  DeleteMapping  PutMapping    只能使用在方法上*/

    public String login() {
        return null;
    }

    @RequestMapping("register")
    public String register() {

        return null;
    }
}
