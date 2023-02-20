package com.hjt.course01.service.impl;

import com.hjt.course01.dao.ProductMapper;
import com.hjt.course01.entity.Product;
import com.hjt.course01.service.ProductService;
import org.apache.ibatis.session.SqlSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    private static final Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public List<Product> getListByName(String name) {
        logger.info("========根据{}遍历Product=========",name);
        List<Product> products = productMapper.getProductByName(name);
        logger.info("========遍历完成=========");
        return products;
    }

    @Override
    public List<Product> getList() {
        logger.info("========遍历Product=========");
        List<Product> products = productMapper.getList();
        logger.info("========遍历完成=========");
        return products;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void insert(Product product) {
        productMapper.insert(product);
    }
}
