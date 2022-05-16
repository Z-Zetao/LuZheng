package com.oopHead.Firth.JiCheng;

/**
 * @author 51465
 */
public class Student extends Person{

    String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Student(){}

    public void study(){
        System.out.println("学生需要学习！");
    }

    @Override
    public void eat() {
        System.out.println("学生要多吃有营养的食物！");
    }

    public void show() {
        this.eat();
        super.eat();
    }
}
