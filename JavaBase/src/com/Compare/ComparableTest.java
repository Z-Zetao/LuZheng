package com.Compare;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author 51465
 */
public class ComparableTest {

    @Test
    public void test2(){
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("lenovo", 34);
        goods[1] = new Goods("dell", 43);
        goods[2] = new Goods("xiaomi", 12);
        goods[3] = new Goods("huawei", 65);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }

    @Test
    public void test1(){
        String[] arr = new String[]{"AA", "BB", "MM", "CC", "GG", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
