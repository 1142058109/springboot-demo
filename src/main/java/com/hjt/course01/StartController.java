package com.hjt.course01;


import com.hjt.course01.util.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/start")
public class StartController {
    private final static Logger logger = LoggerFactory.getLogger(StartController.class);
    @RequestMapping("/springboot")
    public JsonResult<Map> startSpringBoot() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"jietao");
        map.put(2,"jieabi");
        map.put(3,"locao");
        map.put(4,null);
        return new JsonResult<>(map);
    }

    @RequestMapping("/log")
    public String log(){
        logger.debug("=====测试日志debug级别打印====");
        logger.info("======测试日志info级别打印=====");
        logger.error("=====测试日志error级别打印====");
        logger.warn("======测试日志warn级别打印=====");

        // 可以使用占位符打印出一些参数信息
        String str1 = "blog.itcodai.com";
        String str2 = "blog.csdn.net/eson_15";
        logger.info("======倪升武的个人博客：{}；倪升武的CSDN博客：{}", str1, str2);
        return "success";

    }




}

