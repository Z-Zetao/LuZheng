package com.oopHead;

/**
 * @author 51465
 */
public class InternetRed {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void method(int a, int b) {
        a *= 10;
        b *= 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.exit(0);
    }
}
