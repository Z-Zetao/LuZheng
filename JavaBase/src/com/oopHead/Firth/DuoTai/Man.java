package com.oopHead.Firth.DuoTai;

/**
 * @author 51465
 */
public class Man extends Person{
    private boolean isSmoking;

    public boolean isSmoking() {
        return isSmoking;
    }

    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }

    public void earnMoney(){
        System.out.println("男人需要赚钱养家");
    }

    @Override
    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk(){
        System.out.println("男人霸气地走路");
    }
}
