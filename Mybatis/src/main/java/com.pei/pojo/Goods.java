package com.pei.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: spring-demo-di-01
 * @description
 * @author: 彭于晏
 * @create: 2021-07-18 21:00
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods implements Serializable {
    /**商品编号*/
    private Integer goodsId;
    /**标题*/
    private String title;
    /**子标题*/
    private String subTitle;
    /**原始价格*/
    private double originalCost;
    /**当前价格*/
    private double currentPrice;
    /**折扣率*/
    private double discount;
    /**是否包邮 1--包邮 0--不包邮*/
    private Integer isFreeDelivery;
    /**分类编号*/
    private Integer categoryId;
}
