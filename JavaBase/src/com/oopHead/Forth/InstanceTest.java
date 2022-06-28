package com.oopHead.Forth;

/**
 * @author 51465
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone);

        //匿名对象————就是对象没有名
        //这个就是匿名对象
        //想调用它就直接后面（.方法名）
        new Phone().price = 1999;
        new Phone().phonePrice();
    }
}

class Phone{
    double price;
    public void sendEmail(){
        System.out.println("发送邮件！");
    }
    public void playGame(){
        System.out.println("玩游戏！");
    }
    public void phonePrice(){
        System.out.println("手机的价格为：" + price);
    }
}
