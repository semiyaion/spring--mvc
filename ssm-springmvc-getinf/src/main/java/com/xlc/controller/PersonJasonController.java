package com.xlc.controller;

import com.xlc.pojo.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Classname PersonJasonController
 * @Description TODO
 * @Date 2024/12/1 16:01
 * @Created by cxx
 */
@EnableWebMvc  //给handlerAdapter配置了json转换器
@RestController
@RequestMapping("per")
public class PersonJasonController {
    //data  ->请求体 post {name，age，gender}
    @RequestMapping("data1")
    public String data1(@RequestBody Person person) {
        //接受前端json@RequestBody
        //原因：java原生的api只支持路径参数和param参数 request.getParameter（“key”）；param 不支持json
        //解决：导入json处理的依赖，2.handlerAdapter配置json转换器
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        return "name=" + person.getName() + "age=" + person.getAge() + "gender=" + person.getGender();
    }
}
