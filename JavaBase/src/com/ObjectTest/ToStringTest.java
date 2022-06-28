package com.ObjectTest;

import java.util.Objects;

/**
 * @author 51465
 */
public class ToStringTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("zzt");
        person1.setAge(18);
        Person person2 = new Person();
        person2.setName("lhx");
        person2.setAge(18);
        //equals方法的测试
        System.out.println(person1.equals(person2));
        //toString方法的测试
        System.out.println(person1);
        System.out.println(person2);
    }
}

class Person{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}