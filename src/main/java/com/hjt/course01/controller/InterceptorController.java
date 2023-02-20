package com.hjt.course01.controller;

import com.hjt.course01.util.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ic")
@RestController
public class InterceptorController {

    @RequestMapping("/i1")
    public JsonResult i1(){
        System.out.println("hello,/ic/i1");
        return  new JsonResult("i1执行");
    }

}
