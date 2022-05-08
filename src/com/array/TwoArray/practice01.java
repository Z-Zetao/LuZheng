package com.array.TwoArray;

import static java.lang.Math.*;

/**
 * @author 51465
 */
public class practice01 {
    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) floor(random() * 30 + 1);
            //判断跟前面是否相同
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
