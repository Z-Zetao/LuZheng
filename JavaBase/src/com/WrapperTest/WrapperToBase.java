package com.WrapperTest;

/**
 * @author 51465
 */
public class WrapperToBase {
    public static void main(String[] args) {
        Integer integer1 = new Integer(10);//10
        Integer integer2 = new Integer("123");//123
        Integer integer3 = new Integer("123abc");//报错
        Float float1 = new Float(12.3f);//12.3
        Boolean boolean1 = new Boolean(true);//true
        Boolean boolean2 = new Boolean("true123");//false
        System.out.println(integer1.toString());
    }
}
