package com.oopHead.Firth.DuoTai;

/**
 * @author 51465
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.test(new Dog());
        animalTest.test(new Cat());
    }


    public void test(Animal animal){
        animal.eat();
        animal.shoot();
    }
}

class Animal{
    public void eat(){
        System.out.println("动物：吃东西");
    }
    public void shoot(){
        System.out.println("动物：会叫");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗喜欢吃骨头");
    }
    @Override
    public void shoot(){
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫喜欢吃鱼");
    }
    @Override
    public void shoot(){
        System.out.println("喵喵喵");
    }
}