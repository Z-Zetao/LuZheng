package com.oopHead.Firth.JiCheng;

/**
 * @author 51465
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public void eat(){
        System.out.println("人需要吃饭！");
    }

    public void sleep(){
        System.out.println("人需要睡觉！");
    }
}
