package com.oopHead.Forth.OverLoad;

/**
 * @author 51465
 */
public class OverLoadTest {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        double d1 = 1.1;
        double d2 = 2.2;
        String s = "lulu";
        new OverLoadTest().getSum(i,j);
        new OverLoadTest().getSum(i,s);
        new OverLoadTest().getSum(d1,d2);
    }

    public void getSum(int i,int j){
        System.out.println(i + j);
    }
    public void getSum(double d1,double d2){
        System.out.println(d1 + d2);
    }
    public void getSum(int i,String s){
        System.out.println(i + s);
    }
}
