package com.boblog.generic;

import java.util.List;

public class GoodsSeller {
    public void sellGoods(List<? extends Goods> goods) {
        // 调用集合中的sell方法
        for (Goods g : goods) {
            g.sell();
        }

    }
}
