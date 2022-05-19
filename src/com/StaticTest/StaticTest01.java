package com.StaticTest;

/**
 * @author 51465
 */
public class StaticTest01 {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        System.out.println(c2.nation);//CHN
    }

}

class Chinese{
    String name;
    int age;
    static String nation;
}
