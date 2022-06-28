package com.Interface.Java8Test;

/**
 * @author 51465
 */
public class SubClassTest {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.method2();//compareA:上海
        //静态方法这样调是有问题的，只能通过接口进行调用
        //subClass.method1();
        CompareA.method1();//compareA:北京
    }
}

class SubClass extends SuperClass implements CompareA{

}
