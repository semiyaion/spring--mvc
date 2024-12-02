package com.xlc.header;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HeaderController
 * @Description TODO
 * @Date 2024/12/1 16:50
 * @Created by cxx
 */
@RequestMapping("cont")
@RestController
public class HeaderController {
    @RequestMapping("head")
    public String head(@RequestHeader("Host") String host) {
        System.out.println(host);
        return host;
        //接受请求头
        //requestheader   里面指定获取请求头的名称
        //localhost:8080

    }
}
