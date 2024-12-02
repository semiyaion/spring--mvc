package com.xlc.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname CokkieController
 * @Description TODO
 * @Date 2024/12/1 16:43
 * @Created by cxx
 */
@RequestMapping("cookie")
@RestController

public class CokkieController {
    //取出浏览器中的cookie
    @RequestMapping("data")
    public String data(@CookieValue(value = "cookieName") String value) {
        System.out.println("value" + value);
        return value;
    }

    //向浏览器存入cookie
    @GetMapping("save")
    public String save(HttpServletResponse response) {
        Cookie cookie = new Cookie("cookieName", "root");
        response.addCookie(cookie);
        return "传入cookie了";
    }

}
