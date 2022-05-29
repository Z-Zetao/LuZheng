package com.Iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 51465
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("lulu"));
        collection.add(false);
        //首先获得迭代器的对象
        Iterator iterator = collection.iterator();
        //删除集合中“lulu”这个数据
        while (iterator.hasNext()){
            Object next = iterator.next();
            if ("lulu".equals(next)){
                iterator.remove();
            }
        }
        //遍历集合
        Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }

}
