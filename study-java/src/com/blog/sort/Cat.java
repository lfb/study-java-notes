package com.blog.sort;

public class Cat {
    private String name; // 名字
    private int month; // 年龄
    private String species; // 品种

    // 构造方法
    public Cat(String name, int month, String species) {
        this.name = name; // 名字
        this.month = month; // 月份
        this.species = species; // 品种
    }

    // 获取名字
    public String getName() {
        return name;
    }

    // 设置名字
    public void setName(String name) {
        this.name = name;
    }


    // 设置月份
    public void setMonth(int month) {
        this.month = month;
    }

    // 获取月份
    public int getMonth() {
        return month;
    }

    // 设置品种
    public void setSpecies(String species) {
        this.species = species;
    }

    // 获取品种
    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "[名字:" + name + ", 月份：" + month + ", 品种: " + species + "]";
    }
}
