package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2024/12/3 10:10
 * @Created by cxx
 */

@RestController
@RequestMapping("user")
public class UserController {
    //声明一个全局异常处理器
    @GetMapping("data")
    public String data() {
        String name = null;
        name.toString();
        return "ok";
        //未加全局异常出来之前网页显示：
        // java.lang.NullPointerException: Cannot invoke "String.toString()" because "name" is null
        //空指针异常
        //加了全局异常之后，网页显示   Cannot invoke "String.toString()" because "name" is null
    }

    @GetMapping("data1")
    public String data1() {
        int i = 1 / 0;
        return "ok";
        //加全局异常之后   网页显示/ by zero
    }

    @GetMapping("data2")
    public String data2() {
        return "拦截了吗，如如拦";
        /*request = org.apache.catalina.connector.RequestFacade@63d23c67, response = org.apache.catalina.connector.ResponseFacade@6d15ce6d, handler = Controller.UserController#data2()
          request = org.apache.catalina.connector.RequestFacade@63d23c67, response = org.apache.catalina.connector.ResponseFacade@6d15ce6d, handler = Controller.UserController#data2(), modelAndView = null
          整体  处理方法*/
    }


}
