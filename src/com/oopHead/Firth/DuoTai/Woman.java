package com.oopHead.Firth.DuoTai;

/**
 * @author 51465
 */
public class Woman extends Person{

    private boolean isBeauty;

    public boolean isBeauty() {
        return isBeauty;
    }

    public void setBeauty(boolean beauty) {
        isBeauty = beauty;
    }

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat(){
        System.out.println("女人少吃，为了减肥");
    }

    @Override
    public void walk(){
        System.out.println("女人窈窕地走路");
    }
}
