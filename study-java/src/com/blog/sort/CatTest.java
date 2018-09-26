package com.blog.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {
    public static void main(String[] args) {
        // 按名字来排序
        Cat lynn = new Cat("lynn", 2, "女神");
        Cat bob = new Cat("bob", 3, "男神");
        Cat peter = new Cat("peter", 4, "男神");

        List<Cat> catList = new ArrayList<Cat>();
        catList.add(lynn);
        catList.add(bob);
        catList.add(peter);

        System.out.println("按名字排序前的宠物猫信息：");
        for (Cat cat : catList) {
            System.out.println(cat);
        }

        // 按名字来进行排序
        Collections.sort(catList, new NameComparator());
        System.out.println("按名字排序后的宠物猫信息：");
        for (Cat cat : catList) {
            System.out.println(cat);
        }

        /**
         * 输出：
         * 按名字排序前的宠物猫信息：
         * [名字:lynn, 月份：2, 品种: 女神]
         * [名字:bob, 月份：3, 品种: 男神]
         * [名字:peter, 月份：4, 品种: 男神]
         *
         * 按名字排序后的宠物猫信息：
         * [名字:bob, 月份：3, 品种: 男神]
         * [名字:lynn, 月份：2, 品种: 女神]
         * [名字:peter, 月份：4, 品种: 男神]
         */

        // 按年龄进行降序排序
        Collections.sort(catList, new AgeComparator());
        System.out.println("按年龄降序的宠物猫信息：");
        for (Cat cat : catList) {
            System.out.println(cat);
        }
        /**
         * 按年龄排序的宠物猫信息：
         * [名字:peter, 月份：4, 品种: 男神]
         * [名字:bob, 月份：3, 品种: 男神]
         * [名字:lynn, 月份：2, 品种: 女神]
         */
    }
}
