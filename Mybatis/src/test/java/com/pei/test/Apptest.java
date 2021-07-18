package com.pei.test;

import com.pei.dao.GoodsDAO;
import com.pei.pojo.Goods;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * @program: spring-demo-di-01
 * @description
 * @author: 彭于晏
 * @create: 2021-07-18 21:23
 **/
public class Apptest {
    @Test
    public void testALL(){
        try {
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            SqlSession sqlSession = build.openSession();
            GoodsDAO goodsDAO = sqlSession.getMapper(GoodsDAO.class);
            List<Goods> all = goodsDAO.findAll();
            for (Goods goods : all) {
                System.out.println(goods);
            }
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
