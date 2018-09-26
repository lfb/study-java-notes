package com.blog.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntSort {
    public static void main(String[] args) {
        // 对存储在List中的整形数据进行排序
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);

        System.out.println("排序前的数据:");
        System.out.println(list); // [1, 5, 4, 2]

        // 排序
        Collections.sort(list);
        System.out.println("排序后的数据:");
        System.out.println(list); // [1, 2, 4, 5]

    }
}
