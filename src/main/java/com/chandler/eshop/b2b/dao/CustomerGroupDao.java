package com.chandler.eshop.b2b.dao;

import com.chandler.eshop.b2b.entity.CustomerGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by i325622 on 2/14/17.
 */
public interface CustomerGroupDao {

    void createCustomerGroup(@Param("id") Long id,
                             @Param("name") String name);

    List<CustomerGroup> getAll();

}
