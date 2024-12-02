package com.xlc.param;

import com.xlc.pojo.Userpojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname ParamVontroller
 * @Description TODO
 * @Date 2024/12/1 14:19
 * @Created by cxx
 */
@RequestMapping("param")
@Controller
@ResponseBody
@RestController
public class ParamVontroller {

    //直接接受
    @RequestMapping("data")
    //在形参列表填写对应的名称参数即可。  请求参数名=形参参数名即可
    //名称必须相同，并且参数不传递也可以
    public String data(String name, Integer age) {
        System.out.println("name" + name + ",age" + age);
        return "name" + name + ",age" + age;
    }

    //注解指定
    @RequestMapping("data1")
    //要求account必须传递否则报错  page可以不必须传递，如果不传递默认值就是1
    public String data1(@RequestParam(value = "account") String account,
                        @RequestParam(required = false, defaultValue = "1") int page) {
        //@RequestParam  形参列表，请求参数名，或者是否必须传递或者非必须传递设置默认值false
        //value   指定参数名如果形参和请求参数名一致可以省略,前段网页名必须与请求值相同
        //ruquired=true 前端必须传递参数，false可以不穿并设置默认名
        System.out.println("account" + account + ",page" + page);
        return account + "+account:+" + ",page:" + page;

    }

    //特殊值
    //一名多值      key=18&key=2     直接使用集合接值
    @RequestMapping("data2")
    public String dara2(@RequestParam List<String> hbs) {
        //不加@RequestParam将hbs对应的一个字符串直接赋值给集合，类型异常
        //加了注解后就会将集合add加入对应字符串
        System.out.println(hbs);
        return "ok";
    }

    //使用实体对象接值
    @RequestMapping("data3")
    public String data3(Userpojo userpojo) {
        System.out.println(userpojo);
        return userpojo.toString();
        //http://localhost:8080/MVC/param/data3?name=二狗&age=18
    }
}
