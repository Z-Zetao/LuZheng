package com.lu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LuZheng {
    public static void main(String[] args) {
//        System.out.println("LuZheng");
//        System.out.println("zzt");
//        int c = add(3,4);
//        System.out.println(c);
//        System.out.println(Math.exp(1));

        System.out.println(new Date());

        Date dNow = new Date();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(dNow));


    }

    public static int add(int a, int b){
        return a + b;
    }
}
