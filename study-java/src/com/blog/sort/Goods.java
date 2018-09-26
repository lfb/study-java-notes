package com.blog.sort;

public class Goods implements Comparable<Goods> {


    private int gid; // 商品ID
    private String name; // 商品名称
    private double price; // 商品价格

    public Goods(int gid, String name, int price) {
        this.gid = gid;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGid() {
        return gid;
    }

    @Override
    public String toString() {
        return "商品ID: " + gid + ", 商品名称" + name + ", 商品价格" + price;
    }

    @Override
    public int compareTo(Goods o) {
        double price1 = this.price;
        double price2 = o.getPrice();
        int n = new Double(price2 - price1).intValue();
        System.out.println("n：" + n);
        return n;
    }
}
