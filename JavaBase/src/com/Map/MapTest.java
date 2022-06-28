package com.Map;

import org.junit.Test;

import java.util.*;

/**
 * @author 51465
 */
public class MapTest {

    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);
        //Set keySet():返回所有key构成的Set集合
        Set set = map.keySet();
        //Collection values():返回所有的value构成的集合
        Collection values = map.values();
        //Set entrySet():遍历并返回所有的key-value值
        Set set1 = map.entrySet();
    }

    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 123);
        map.put("BB", 56);
        //Object get(Object key):查询key值对应的value,若key不存在则返回null
        map.get(45);
        //boolean containKey(Object key):查询指定对象中是否包含对应的key值
        //boolean containValue(Object value):查询指定对象中是否包含对应的value值
        map.containsKey("AA");
        map.containsValue(56);
        //int size():返回指定对象中包含的key-value键值对的个数
        map.size();
        //boolean inEmpty():判断指定对象是否为空
        map.isEmpty();
        //boolean equals(Object obj):判断指定对象和参数对象obj是否相等
        map.equals("AA");
    }

    @Test
    public void test1() {
        //添加、删除、修改
        Map map = new HashMap();
        //put(key,value):添加操作
        //Object putAll(Map map):将map中的所有key-value加入到指定Map中
        map.put("AA", 123);
        map.put("BB", 123);
        //修改操作
        map.put("AA", 87);
        //Object remove(Object key):移除key值对应的键值对
        map.remove("AA");//返回该key对应的value,若不存在返回null
        //void clear():清空map中的数据
        map.clear();
    }
}
