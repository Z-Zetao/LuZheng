package com.Collection;

import org.junit.Test;

import java.util.*;

/**
 * @author 51465
 */
public class CollectionTest {

    @Test
    public void test5(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(234);
        collection.add(567);
        //hashCode():放回当前对象的哈希值
        collection.hashCode();//155815
        //toArray():集合转换为数组
        Object[] objects = collection.toArray();
        //Arrays.asList(数组):将数组转变为集合
        List<String> list = Arrays.asList(new String[]{"AA", "BB"});
        //iterator():返回Iterator接口的实例，用于遍历集合元素
    }

    @Test
    public void test4(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(234);
        collection.add(567);
        Collection collection1 = Arrays.asList(123,234,567);
        //retainAll(Collection collection):求当前集合和collection集合的交集,将元素赋值给当前集合
        collection.retainAll(collection1);
        System.out.println(collection);//[123, 567]
        //equals(Object obj):比较两个集合是否相同，每个元素的值都需要相同，并且顺序也要相同
        collection.equals(collection1);//true
    }

    @Test
    public void test3(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(234);
        collection.add(new String[]{"lulu", "zetao"});
        collection.add(new String("lulu"));
        collection.add(false);
        //remove(Object obj):移除obj中的相应元素,返回值为Boolean
        collection.remove(123);//[234, [Ljava.lang.String;@3d82c5f3, lulu, false]
        //removeAll(Collection coll):移除当前集合中coll中的所有元素
        Collection collection1 = new ArrayList();
        collection1.add(123);
        collection1.add(234);
        collection.removeAll(collection1);//[[Ljava.lang.String;@3d82c5f3, lulu, false]
    }

    @Test
    public void test2(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(234);
        collection.add(345);
        collection.add(new String[]{"lulu", "zetao"});
        collection.add(new String("lulu"));
        collection.add(false);
        //contains(Object obj):判断当前集合是否包含obj——它调用的是equals来判断是否含有obj
        boolean contains = collection.contains(123);
        System.out.println(contains);//true
        System.out.println(collection.contains(new String("lulu")));//true
        System.out.println(collection.contains(new String[]{"lulu", "zetao"}));//false——因为调用了Object中的equals，所以就是==
        //containsAll(Collection collection):判断collection中的所有元素是否都存在于当前集合中
        Collection collection1 = new ArrayList();
        collection1.add(123);
        collection1.add(234);
        System.out.println(collection.containsAll(collection1));//true
    }

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        //add(Object e):将元素添加到集合中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        //size():获取添加的元素的个数
        System.out.println(coll.size());
        //addAll():将coll1集合中的元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll);//[AA, BB, 123, Sun May 29 14:39:49 CST 2022, 456, CC]
        //isEmpty():判断当前集合是否为空——判断集合中是否有元素
        System.out.println(coll.isEmpty());//false
        //clear():清空集合元素
        coll.clear();
        System.out.println(coll.isEmpty());//true
    }
}
