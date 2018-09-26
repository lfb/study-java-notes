package com.boblog.generic;

public class Book extends Goods {
    @Override
    public void sell() {
        System.out.println("Sell Books!");
    }
}
