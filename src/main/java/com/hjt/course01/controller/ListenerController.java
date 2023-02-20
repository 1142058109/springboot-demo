package com.hjt.course01.controller;

import com.hjt.course01.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RequestMapping("/lc")
@RestController
public class ListenerController {

    @GetMapping("/l1")
    public JsonResult l1(HttpServletRequest request) {
        ServletContext servletContext = request.getServletContext();
        Object products = servletContext.getAttribute("products");
        return new JsonResult(products);
    }

    @GetMapping("/l2")
    public JsonResult l2(HttpServletRequest request , HttpServletResponse response){
        Cookie cookie;
        try {
             cookie = new Cookie("JSESSIONID", URLEncoder.encode(request.getSession().getId(), "utf-8"));
             cookie.setPath("/");
             cookie.setMaxAge(48*60*60);
             response.addCookie(cookie);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getServletContext().getAttribute("count");
        return new JsonResult(count);
    }

}
