package com.blog.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods(1, "冰箱", 2999);
        Goods goods2 = new Goods(2, "手机", 1999);
        Goods goods3 = new Goods(3, "电视机", 3999);

        List<Goods> goodsList = new ArrayList<Goods>();
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);

        System.out.println("排序前的数据：");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

        // 排序后
        Collections.sort(goodsList);
        System.out.println("排序后的数据：");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

        /**
         * 输出结果
         *
         * 排序前的数据：
         * 商品ID: 1, 商品名称冰箱, 商品价格2999.0
         * 商品ID: 2, 商品名称手机, 商品价格1999.0
         * 商品ID: 3, 商品名称电视机, 商品价格3999.0
         * n：1000
         * n：-2000
         * n：-2000
         * n：-1000
         * 排序后的数据：
         * 商品ID: 3, 商品名称电视机, 商品价格3999.0
         * 商品ID: 1, 商品名称冰箱, 商品价格2999.0
         * 商品ID: 2, 商品名称手机, 商品价格1999.0
         */
    }
}
