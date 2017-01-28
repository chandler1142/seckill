package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by chandlerzhao on 17/1/23.
 */
public interface SuccessKilledDao {

    /**
     *
     * @param seckillId
     * @param userphone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") Long seckillId, @Param("userphone") Long userphone);

    /**
     *
     * @param seckillId
     * @return
     */
    SuccessKilled queryBySeckKillId(@Param("seckillId") Long seckillId, @Param("userphone") Long userphone);

}
