package com.oopHead;

/**
 * f(0) = 1
 * f(1) = 4
 * f(n) = 2 * f(n-1) + f(n-2)
 *
 * @author 51465
 */
public class RecursionPractice {

    public static void main(String[] args) {
        RecursionPractice recursionPractice = new RecursionPractice();
        System.out.println(recursionPractice.getFn(10));
    }


    public int getFn(int n) {
        int fn;
        if (n == 0) {
            fn = 1;
        }else if (n == 1) {
            fn = 4;
        }else {
            fn = 2 * getFn(n - 1) + getFn(n - 2);
        }
        return fn;
    }
}
