package com.Compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 51465
 */
public class ComparatorTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA", "BB", "MM", "CC", "GG", "DD"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("输入数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
