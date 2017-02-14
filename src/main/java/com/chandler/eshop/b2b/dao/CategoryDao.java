package com.chandler.eshop.b2b.dao;

import com.chandler.eshop.b2b.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by i325622 on 2/13/17.
 */
public interface CategoryDao {

    void createCategory(@Param("id") Long id,
                       @Param("parentId") Long parentId,
                       @Param("chain") String chain,
                       @Param("leaf") Boolean leaf,
                       @Param("level") Long level);

    List<Category> getCategoryByLevel(@Param("level") Long level);

    List<Category> getRandLeafCategory(@Param("level") Long level);

    List<Category> getRandLeafCategoryByRootId(
            @Param("id") Long id,
            @Param("level") Long level);

    List<Category> getAll();

}
