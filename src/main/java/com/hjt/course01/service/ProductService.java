package com.hjt.course01.service;

import com.hjt.course01.entity.Product;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.util.List;
public interface ProductService {
    public List<Product> getListByName(String name);

    public List<Product> getList();

    public void insert(Product product);
}
