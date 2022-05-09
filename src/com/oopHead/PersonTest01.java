package com.oopHead;

public class PersonTest01 {
    public static void main(String[] args) {
        Person lulu = new Person();
        lulu.setName("tao");
        lulu.setAge(18);
        System.out.println(lulu.getAge());
        System.out.println(lulu.getName());
        lulu.isMarry(0);
    }
}

class Person {
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

    public void isMarry(int isMarry) {
        if (isMarry == 0) {
            System.out.println("未婚");
        }
        if (isMarry == 1) {
            System.out.println("已婚");
        }
    }
}
