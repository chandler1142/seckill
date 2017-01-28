package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by codingBoy on 16/11/27.
 * 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void queryById() throws Exception {
        long id = 1000;
        Seckill actual = seckillDao.queryById(id);
        System.out.println(actual.toString());
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckillList = seckillDao.queryAll(0, 10);
        System.out.println(seckillList.size());
    }

    @Test
    public void reduceNumber() throws Exception {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2016-01-01 00:00:01");
        int result = seckillDao.reduceNumber(1001L, date);
        System.out.println(result);
    }


}