package com.Interface.Java8Test;

/**
 * @author 51465
 */
public interface CompareA {
    public static void method1(){
        System.out.println("compareA:北京");
    }

    public default void method2(){
        System.out.println("compareA:上海");
    }
}
