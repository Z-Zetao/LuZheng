package com.Iterator;


import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 51465
 */
public class ForTest {
    public static void main(String[] args) {
        Collection collation = new ArrayList();
        collation.add(123);
        collation.add(456);
        collation.add(new String("lulu"));
        collation.add(false);
        //for...each:增强型for循环
        //for(集合元素的类型 局部变量 : 集合对象){}
        for (Object obj : collation){
            System.out.println(obj);
        }
    }
}
