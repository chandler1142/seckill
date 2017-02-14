package com.chandler.eshop.b2b.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by i325622 on 2/14/17.
 */
public interface VisibilityDao {

    void createVisibility(@Param("categoryId") Long categoryId,
                          @Param("groupId") Long groupId,
                          @Param("visible") Boolean visible);

}
