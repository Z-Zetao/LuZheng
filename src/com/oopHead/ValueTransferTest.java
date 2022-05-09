package com.oopHead;

/**
 * @author 51465
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a + ", b = " + b);
        b = 20;
        System.out.println("a = " + a + ", b = " + b);

        Demo demo01 = new Demo();
        Demo demo02 = demo01;
        System.out.println("demo01.a = " + demo01.a + ", demo02.a = " + demo02.a);
        demo02.a = 20;
        System.out.println("demo01.a = " + demo01.a + ", demo02.a = " + demo02.a);
    }
}


class Demo{
    int a = 10;
}