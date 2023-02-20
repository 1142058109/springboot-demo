package com.hjt.course01.dao;

import com.hjt.course01.entity.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;
public interface ProductMapper {

    public List<Product> getProductByName(String name);
    @Select("select * from product_")
    public List<Product> getList();
    @Insert("insert into Product_ values (null,#{name},#{price},#{cid})")
    public void insert(Product product);
}
