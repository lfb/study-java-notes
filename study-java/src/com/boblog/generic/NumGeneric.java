package com.boblog.generic;

import org.omg.PortableInterceptor.INACTIVE;

public class NumGeneric<T> {
    private T num;

    private T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    // 测试
    public static void main(String[] args) {
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println("integer: " + intNum.getNum());

        NumGeneric<Float> floatNumGeneric = new NumGeneric<>();
        floatNumGeneric.setNum(4.0f);
        System.out.println("Float: " + floatNumGeneric.getNum());
    }
}
