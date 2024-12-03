package xlctest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname JspController
 * @Description TODO
 * @Date 2024/12/2 8:53
 * @Created by cxx
 */
@Controller
@RequestMapping("/jsp")
public class JspController {
    @RequestMapping("index")
    public String data1(HttpServletRequest request) {
        request.setAttribute("data", "hello");
        //会将共享域中的内容key键data赋值给jsp中${data}中，jsp中的font会将文字转换成红色
        //设置共享域内容
        return "index";
        //此处填写设置的字符名称即可
        //不可以加@ResController,如果加了会直接返回字符串给浏览器，
        //不加会先走configureViewResolvers方法，添加项目的前后缀，寻找视图，用于访问当前项目
    }

    //转发
    @GetMapping("forward")
    public String data2() {

        return "forward:/jsp/index";
        //SpringMvc转发返回一般默认转发到视图中，要想转发到其他资源中则在其前缀前加forward
        /*1.方法的返回值写成字符串
         * 2.不能添加responseBody注解
         * 3.返回的字符串前添加forward:/转发地址*/
    }

    //重定向
    @GetMapping("redirect")
    public String data3() {
        return "redirect:http://www.baidu.com";
        //重定向方法，定向到的地址前要加redirect表示不走视图，定向走指定地址
    }
}
