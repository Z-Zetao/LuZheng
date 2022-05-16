package com.oopHead.Firth.DuoTai;

/**
 * @author 51465
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("人：吃饭");
    }

    public void walk(){
        System.out.println("人：走路");
    }
}
