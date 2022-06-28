package com.Abstract;

/**
 * @author 51465
 */
public class AbstractTest {
    public static void main(String[] args) {
        //
        //Person person = new Person();

    }
}
abstract class Person{
    String name;
    int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }
    public void walk(){
        System.out.println("人走路");
    }

}
class Student extends Person{

}