package com.chandler.eshop.b2b.dao;

import com.chandler.eshop.b2b.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by i325622 on 2/13/17.
 */
public interface ProductDao {

    void createProduct(@Param("name") String name, @Param("chain") String chain, @Param("categoryId") Long categoryId);

    /**
     * @param id
     * @return
     */
    Product queryById(@Param("id") long id);

    /**
     * @return
     */
    List<Product> queryAll();
}
