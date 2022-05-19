package com.InnerClass;

/**
 * @author 51465
 */
public class InnerClassTest {
    public static void main(String[] args) {
        Person.Man man = new Person.Man();
    }
}

class Person{
    //成员内部类
    static class Man{}

    public void method(){
        //局部内部类
        class AA{}
    }
}
