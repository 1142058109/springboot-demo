package com.hjt.course01;

import com.alibaba.fastjson.JSON;
import com.hjt.course01.entity.User;
import com.hjt.course01.service.impl.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashSet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Course14ApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(Course14ApplicationTests.class);

    @Resource
    private RedisService redisService;

    @Test
    public void contextLoads() {


    }

    @Test
    public void contextLoads2() {
        HashSet<Object> objects = new HashSet<>();
        objects.add("5");
        objects.add("6");

    }

}
