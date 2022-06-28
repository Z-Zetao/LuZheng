package com.Map;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 51465
 */
public class TreeMapTest {

    @Test
    public void test1(){
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User o11 = (User) o1;
                    User o21 = (User) o2;
                    return Integer.compare(o11.getAge(), o21.getAge());
                }else {
                    throw new RuntimeException("输入类型不匹配");
                }
            }
        });
        //自然排序
        User u1 = new User("lulu", 12);
        User u2 = new User("zetao", 24);
        User u3 = new User("huixia", 18);
        User u4 = new User("zheng", 35);
        treeMap.put(u1, 98);
        treeMap.put(u2, 89);
        treeMap.put(u3, 90);
        treeMap.put(u4, 100);
        System.out.println(treeMap);
    }

    @Test
    public void test(){
        TreeMap treeMap = new TreeMap();
        //自然排序
        User u1 = new User("lulu", 12);
        User u2 = new User("zetao", 24);
        User u3 = new User("huixia", 18);
        User u4 = new User("zheng", 35);
        treeMap.put(u1, 98);
        treeMap.put(u2, 89);
        treeMap.put(u3, 90);
        treeMap.put(u4, 100);
        System.out.println(treeMap);
    }
}
