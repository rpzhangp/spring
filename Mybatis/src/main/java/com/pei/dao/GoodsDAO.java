package com.pei.dao;

import com.pei.pojo.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: spring-demo-di-01
 * @description 物品模块的接口
 * @author: 彭于晏
 * @create: 2021-07-18 21:00
 **/
public interface GoodsDAO {
    @Select("select * from t_goods")
    List<Goods> findAll();
}
