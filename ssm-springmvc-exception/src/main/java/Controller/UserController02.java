package Controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

import java.util.HashMap;

/**
 * @Classname UserController02
 * @Description TODO
 * @Date 2024/12/3 11:29
 * @Created by cxx
 */
@RestController
@RequestMapping("user2")
public class UserController02 {
    //接受用户数据，用户有校验注解

    //1.先给实体类添加校验注解
    //2.在controller层新增对象，并给形参对象添加@validated表示校验开始生效注解
    //3.无论是parm还是json注解都有效果  但如果是json参数还需要加一个@RequestBody

    //如果不符合参数信息，向前端直接抛出异常是错误的
    //应该自定义一个约定然后返回结果
    //1.捕捉错误信息BindingResult,要求bindingresult必须紧挨着实体类校验对象
    @PostMapping("data")
    public Object regisrer(@Validated @RequestBody User user, BindingResult result) {
        if (result.hasErrors()) {
            //表示如果有错误，就不直接返回，自己决定返回的信息
            HashMap<Object, Object> map = new HashMap<>();
            map.put("code", 400);
            map.put("msg", "参数校验异常");
            return map;
        }
        System.out.println("user = " + user);
        return user;
    }
}
