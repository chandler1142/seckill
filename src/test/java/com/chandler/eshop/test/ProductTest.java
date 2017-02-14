package com.chandler.eshop.test;

import com.chandler.eshop.b2b.dao.CategoryDao;
import com.chandler.eshop.b2b.dao.CustomerGroupDao;
import com.chandler.eshop.b2b.dao.ProductDao;
import com.chandler.eshop.b2b.dao.VisibilityDao;
import com.chandler.eshop.b2b.entity.Category;
import com.chandler.eshop.b2b.entity.CustomerGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by codingBoy on 16/11/27.
 * 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ProductTest {

    static char[] array = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    @Autowired
    private ProductDao productDao;

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CustomerGroupDao customerGroupDao;

    @Autowired
    private VisibilityDao visibilityDao;

    //    @Test
    public void insertCategory() {

        for (int i = 0; i < 5; i++) {
            Long id = getRandomNum();
            categoryDao.createCategory(id, -1L, id + "", false, 1L);
        }

        List<Category> firstLevelCategoryList = categoryDao.getCategoryByLevel(1L);
        for (Category category : firstLevelCategoryList) {
            String chain = category.getChain();
            for (int i = 0; i < 5; i++) {
                Long id = getRandomNum();
                categoryDao.createCategory(id, category.getId(), category.getChain() + id + "", false, 2L);
            }
        }

        List<Category> secondLevelCategoryList = categoryDao.getCategoryByLevel(2L);
        for (Category category : secondLevelCategoryList) {
            String chain = category.getChain();
            for (int i = 0; i < 5; i++) {
                Long id = getRandomNum();
                categoryDao.createCategory(id, category.getId(), category.getChain() + id + "", false, 3L);
            }
        }

        List<Category> thirdLevelCategoryList = categoryDao.getCategoryByLevel(3L);
        for (Category category : thirdLevelCategoryList) {
            String chain = category.getChain();
            for (int i = 0; i < 5; i++) {
                Long id = getRandomNum();
                categoryDao.createCategory(id, category.getId(), category.getChain() + id + "", true, 4L);
            }
        }

    }

    //    @Test
    public void queryById() throws Exception {
        //create product
//        for (int i = 0; i < 250000; i++) {
//            Category category = categoryDao.getRandLeafCategory(4L).get(0);
//            productDao.createProduct("product" + i, category.getChain(), category.getId());
//            System.out.println("create product: " + i);
//        }

        String sql = "SELECT * FROM eshopB2BTest.Product where chain like \"%424843640516007%\"";
        for (int i = 0; i < 500; i++) {
            Category category = categoryDao.getCategoryByLevel(new Long(4L)).get(0);
            String chain = category.getChain();
            String statement = " and chain not like \"%" + chain + "%\"";
            sql += statement;
        }
        System.out.println(sql);

    }

    //    @Test
    public void addGroups() {
        for (int i = 50; i < 100; i++) {
            customerGroupDao.createCustomerGroup(getRandomNum(), "group" + i);
        }
    }

    @Test
    public void addVisibility() {
//        visibilityDao.createVisibility(1L,2L, false);
        List<Category> categories = categoryDao.getAll();
        List<CustomerGroup> customerGroups = customerGroupDao.getAll();

        for (int i = 0; i < categories.size(); i++) {
            Category category = categories.get(i);
            for (int j = 0; j < customerGroups.size(); j++) {
                CustomerGroup customerGroup = customerGroups.get(j);
                visibilityDao.createVisibility(category.getId(), customerGroup.getId(), true);
                System.out.println("insert into visibility");
            }
        }
    }

    private Long getRandomNum() {
        String value = "";
        for (int i = 0; i < 16; i++) {
            int j = (int) (Math.random() * 10);
            value += array[j];
        }
        return Long.valueOf(value);
    }

}