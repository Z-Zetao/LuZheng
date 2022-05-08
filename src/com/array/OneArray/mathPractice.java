package com.array.OneArray;


import static java.lang.Math.random;

/**
 * 定义一个大小为10的一维数组，给它随机赋值，值都要是两位数
 * 求最大值，最小值，和，平均数
 *
 * @author 51465
 */
public class mathPractice {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * 100);
        }
        //求最大最小值
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        //求和、平均值
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / (double)array.length;
        System.out.println("数组的最大值为：" + max);
        System.out.println("数组的最小值为：" + min);
        System.out.println("数组的和为：" + sum);
        System.out.println("数组的平均值为：" + average);
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }
}
