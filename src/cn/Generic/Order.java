package cn.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 51465
 */
public class Order<T> {
    String orderName;
    int orderAge;
    //这个T就是类型——也就是泛型
    //在实例化的时候才决定orderT的类型
    T orderT;

    public Order() {
    }

    public Order(String orderName, int orderAge, T orderT) {
        this.orderName = orderName;
        this.orderAge = orderAge;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}
