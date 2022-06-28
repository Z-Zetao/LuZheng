package com.oopHead.Forth;

/**
 * @author 51465
 */
public class CustomerTest {
}
class Customer{

    String name;
    int age;
    boolean isMale;

    public void eat(){
        System.out.println("客户正在吃饭！");
    }

    public void sleep(int hour){
        System.out.println("客户总共休息了：" + hour + "个小时！");
    }
}
