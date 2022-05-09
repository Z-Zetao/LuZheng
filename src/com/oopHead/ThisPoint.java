package com.oopHead;

/**
 * @author 51465
 */
public class ThisPoint {
    public static void main(String[] args) {
        This p1 = new This("lulu", 18);
//        p1.setAge(18);
//        p1.setName("lulu");
        System.out.println(p1);
        int age = p1.getAge();
        System.out.println(age);
    }

}
class This{
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
    public String toString() {
        return "This{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public This(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
