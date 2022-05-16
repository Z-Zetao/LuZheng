package com.oopHead.Firth.DuoTai;

/**
 * @author 51465
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.equals(person2));

        //person1.eat();

        Woman woman = new Woman();
        woman.eat();

        //这个就是多态性
        Person p = new Man();
        p.eat();
        //多态不能去调用子类中特有的方法，因为这个p是Person类型的
        if (p instanceof Man) {
            Man pMan = (Man) p;
            pMan.setSmoking(true);
            pMan.earnMoney();
        }
    }
}
