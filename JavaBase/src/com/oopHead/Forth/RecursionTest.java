package com.oopHead.Forth;

/**
 * @author 51465
 */
public class RecursionTest {

    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
        System.out.println(recursionTest.getSum(100));
    }

    public int getSum(int num){
        if (num == 1){
            return 1;
        }else {
            return getSum(num - 1) + num;
        }
    }
}
