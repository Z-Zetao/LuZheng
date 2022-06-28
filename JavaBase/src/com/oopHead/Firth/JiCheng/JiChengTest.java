package com.oopHead.Firth.JiCheng;

/**
 * @author 51465
 */
public class JiChengTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();

        Student student = new Student();
        student.eat();
        System.out.println("**************");
        student.show();
    }
}
