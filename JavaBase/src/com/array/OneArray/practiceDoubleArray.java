package com.array.OneArray;

/**
 * 创建一个array1，使其元素值为2，3，5，7，11，13，17，19
 * 创建一个array2，将array1赋值给array2
 * 遍历array2中将其偶数索引处改为其索引值
 */
public class practiceDoubleArray {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        //数组的反转
        for (int i = 0; i < array1.length / 2; i++) {
            int temp = array1[i];
            array1[i] = array1[array1.length - i - 1];
            array1[array1.length - i - 1] = temp;
        }
        for (int i : array1) {
            System.out.print(i + " ");
        }

//        int[] array2 = new int[array1.length];
//        //array2 = array1;
//        /**
//         * 数组的复制
//         */
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = array1[i];
//        }
//        for (int i = 0; i < array2.length; i++) {
//            if (i % 2 == 0) {
//                array2[i] = i;
//            }
//        }
//        for (int i: array1) {
//            System.out.print(i + " ");
//        }
    }
}
