package com.array.TwoArray;

public class twoArrayTest01 {
    public static void main(String[] args) {
        //静态初始化
        int[][] arr1 = new int[][]{{1,2},{1,1},{6,7,8}};
        //动态初始化
        String[][] arr2 = new String[3][3];

        arr2[0][1] = "zetao";
        arr2[2][1] = "lulu";

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
