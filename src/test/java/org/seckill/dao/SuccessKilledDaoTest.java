package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by chandlerzhao on 17/1/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Autowired
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        int result = successKilledDao.insertSuccessKilled(1000L, 18317152003L);
        System.out.println(result);
    }

    @Test
    public void queryBySeckKillId() throws Exception {
        SuccessKilled successKilled = successKilledDao.queryBySeckKillId(1900L, 18317152003L);
        System.out.println(successKilled.toString());
    }

}