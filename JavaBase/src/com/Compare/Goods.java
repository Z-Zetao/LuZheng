package com.Compare;

public class Goods implements Comparable{
    String name;
    int price;

    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //先根据价格进行排序，价格相同的时候比较名称大小
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods goods = (Goods) o;
            if (this.price > goods.price){
                return 1;
            }else if (this.price < goods.price){
                return -1;
            }else {
                if (this.name.length() > goods.name.length()){
                    return 1;
                }else if (this.name.length() < goods.name.length()){
                    return -1;
                }else {
                    return 0;
                }
            }
        }
        throw new RuntimeException("传入的数据类型不一致");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
