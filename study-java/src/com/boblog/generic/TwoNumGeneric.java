package com.boblog.generic;

public class TwoNumGeneric<T, X> {
    private T num1;
    private X num2;

    public void setNum(T num1, X num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public void setNum2(X num2) {
        this.num2 = num2;
    }

    public T getNum1() {
        return num1;
    }

    public X getNum2() {
        return num2;
    }

    public static void main(String[] args) {
        TwoNumGeneric<Integer, Float> twoNumGeneric = new TwoNumGeneric<>();
        twoNumGeneric.setNum(10, 22.3f);
        System.out.println("num1 = " + twoNumGeneric.getNum1()); // num1 = 10
        System.out.println("num2 = " + twoNumGeneric.getNum2()); // num2 = 22.3
    }
}

