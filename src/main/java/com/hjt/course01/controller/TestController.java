package com.hjt.course01.controller;

import com.hjt.course01.entity.User;
import com.hjt.course01.util.JsonResult;
import com.hjt.course01.util.MicroServiceUrl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
@Api
@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Resource
    private MicroServiceUrl microServiceUrl;

    @GetMapping("/config")
    public String testConfig() {
        LOGGER.info("=====获取的订单服务地址为：{}", microServiceUrl.getOrderUrl());
        LOGGER.info("=====获取的用户服务地址为：{}", microServiceUrl.getUserUrl());
        LOGGER.info("=====获取的购物车服务地址为：{}", microServiceUrl.getShoppingUrl());

        return "success";
    }
    @GetMapping("/user/{id}/{name}")
    public JsonResult<List> get(@PathVariable() Integer id, @PathVariable() String name){
        List<Object> objectList = new ArrayList<Object>();
        objectList.add(id);
        objectList.add(name);
        return new JsonResult<>(objectList);
    }

    @PostMapping("/form1")
    public String testForm(@RequestParam String username, @RequestParam String password) {
        System.out.println("获取到的username为：" + username);
        System.out.println("获取到的password为：" + password);
        return "success";
    }

    @PostMapping("/form2")
    public JsonResult<User> testForm(User user){
        return new JsonResult<>(user);
    }

    @GetMapping("/swagger01/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public JsonResult<User> getById(@PathVariable(value = "id")@ApiParam(value = "用户唯一标识") Long id){
        User jietao = new User();

        System.out.println("ok");
        return new JsonResult<>(jietao);
    }

    @PostMapping("/insert")
    @ApiOperation(value = "添加用户信息")
    public JsonResult<Void> insertUser(@RequestBody @ApiParam(value = "用户信息") User user) {
        // 处理添加逻辑
        return new JsonResult<>();
    }

    @GetMapping("/t1")
    public String t1(){
        int i =1/0;
        return "ok";
    }



}