package com.company;

public class MathClass {
    private static int counter = 0;
    private int data;

    public MathClass(int data) {
        counter++;
        this.data = data;
    }

    public static int getCounter() {
        return counter;
    }

    public int getData() {
        return data;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
