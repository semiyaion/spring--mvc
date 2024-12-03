package xlctest.json;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xlctest.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname JosonController
 * @Description TODO
 * @Date 2024/12/2 10:29
 * @Created by cxx
 */

@Controller
@RequestMapping("json")
public class JosonController {
    @RequestMapping("data")
    @ResponseBody
    //@ResponseBody注解可以用来标识方法或者方法返回值，表示方法的返回值是直接返回客户端数据，不走视图来渲染感应体
    //可以用于类，方法和形参值上，会将java转换成json字符串
    public User data() {
        User user = new User();
        user.setName("pussy");
        user.setAge(17);
        return user;
    }

    @ResponseBody
    @RequestMapping("data1")
    public List<User> data1() {
        User user = new User();
        user.setAge(17);
        user.setName("dick");
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }
}
