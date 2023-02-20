package com.hjt.course01.controller;

import com.hjt.course01.entity.Product;
import com.hjt.course01.service.ProductService;
import com.hjt.course01.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mc")
public class MyBatisController {

    @Resource
    private ProductService productService;

    @GetMapping("/m1/{name}")
    public JsonResult<List> m1(@PathVariable String name){
        List<Product> products = productService.getListByName(name);
        return new JsonResult<>(products);
    }

    @GetMapping("/m2")
    public JsonResult<List> m2(){
        List<Product> products = productService.getList();
        return new JsonResult<>(products);
    }

    @GetMapping("/m3")
    public JsonResult m3(){
        Product product_e = new Product( "product e", 52.5f, 6);
        productService.insert(product_e);
        return new JsonResult();
    }

}
