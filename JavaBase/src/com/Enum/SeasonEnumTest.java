package com.Enum;

import java.util.Arrays;

/**
 * @author 51465
 */
public class SeasonEnumTest {
    public static void main(String[] args) {
        SeasonEnum spring = SeasonEnum.SPRING;
        //toString()
        System.out.println(spring);//SPRING
        //values()
        SeasonEnum[] values = SeasonEnum.values();//[SPRING, SUMMER, AUTUMN, WINTER]
        System.out.println(Arrays.toString(values));
        //valueOf(String str)
        SeasonEnum winter = SeasonEnum.valueOf("WINTER");//WINTER
        winter.show();
    }
}

interface Info{
    void show();
}

enum SeasonEnum implements Info{
    //提供当前枚举类的多个对象,多个对象之间用“,”隔开，末尾用“;”
    //在对象中重写show方法可以在每个对象中返回不同的值
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("冬天");
        }
    };
    //声明Season对象的属性——用private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //get方法
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }
    //私有化类的构造器
    private SeasonEnum(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
