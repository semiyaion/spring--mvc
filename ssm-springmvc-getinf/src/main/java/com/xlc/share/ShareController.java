package com.xlc.share;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ShareController
 * @Description TODO
 * @Date 2024/12/1 17:04
 * @Created by cxx
 */
@RestController
@RequestMapping("share")
public class ShareController {
    //获取全局最大的共享域
    @Autowired
    private ServletContext servletContext;

    @RequestMapping("data")
    public void data(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

        //springMvc提供的方法共享域 Request级别共享域
        //                          Model型的形参        model.addAttribute("xxxxx","xxxxxxx")即可存放在Request的共享域
        //                          ModelMap型的形参        modelMap.addAttribute("xxxxx","xxxxxxx")
        //                              Map类型的形参       Map.addAttribute("xxxxx","xxxxxxx")
    }

    @RequestMapping("data02")
    public void data02(Model model) {
        model.addAttribute("name", "xlc");

    }
}
