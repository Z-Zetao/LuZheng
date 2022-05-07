package com.array.OneArray;

public class oneArrayTest01 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "lulu";
        names[1] = "zetao";
        names[2] = "huixia";
        names[3] = "lu";
        names[4] = "zheng";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println(names.length);
    }
}
