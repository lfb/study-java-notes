package com.boblog.generic;

public class GenericMethods {
    public <T> void printValue(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.printValue("Hello");
        gm.printValue(123);
        gm.printValue(123.21f);
    }
}
