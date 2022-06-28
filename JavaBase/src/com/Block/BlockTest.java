package com.Block;

/**
 * @author 51465
 */
public class BlockTest {
    public static void main(String[] args) {

        String desc = Person.desc;
        System.out.println(desc);
        System.out.println("****************");
        Person person = new Person();
        System.out.println(person);
    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    static {
        System.out.println("hello");
        desc = "我是一个爱玩的人";
    }

    {
        System.out.println("Hello");
        age = 24;
        name = "zzt";
    }

    public void eat(){
        System.out.println("人需要吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
