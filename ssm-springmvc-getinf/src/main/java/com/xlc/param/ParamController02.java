package com.xlc.param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ParamController02
 * @Description TODO
 * @Date 2024/12/1 15:50
 * @Created by cxx
 */
@RestController
@RequestMapping("path")
public class ParamController02 {
    //路径传值
    //path/账号/密码

    //动态路径设计
    @RequestMapping("{account}/{password}")
    public String login(@PathVariable String account, @PathVariable String password) {
        //pathVariable 表示接受动态路径下传来的参数
        return "account:" + account + "   ,password:  " + password;
    }
}
