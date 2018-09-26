package com.blog.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        // 对存放在list中的字符串进行排序
        List<String> list = new ArrayList<String>();

        list.add("i");
        list.add("am");
        list.add("java");
        list.add("or");
        list.add("js");

        System.out.println("排序前的数据:");
        System.out.println(list); // [i, am, java, or, js]

        System.out.println("排序后的数据:");
        Collections.sort(list);
        System.out.println(list); // [am, i, java, js, or] 根据字母的排序
    }
}
