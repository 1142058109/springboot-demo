package com.hjt.course01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class IndexController {
    @RequestMapping("/login")
    public String send(HttpServletRequest request){
        System.out.println("跳转到登录页面");
        return "login";
    }
}
