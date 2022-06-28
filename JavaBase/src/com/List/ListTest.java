package com.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 51465
 */
public class ListTest {

    @Test
    public void test1(){

    }

    @Test
    public void test(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("AA");
        arrayList.add(new String("lulu"));
        arrayList.add(456);
        //void add(int index, Object element):在索引为index的地方添加元素element
        arrayList.add(1,"BB");
        //boolean addAll(int index, Collection collection):从index位置开始将collection中的所有元素添加到当前集合中
        //Object get(int index):获取指定index位置的元素
        Object o = arrayList.get(1);
        //int indexOf(Object obj):返回obj在集合中首次出现的位置——存在返回索引值，不存在返回-1
        //int lastIndexOf(Object obj):返回obj在集合中最后一次出现的位置——存在返回索引值，不存在返回-1
        int aa = arrayList.indexOf("AA");
        //Object remove(int index):移除指定index位置的元素，并返回此元素
        Object remove = arrayList.remove(123);
        //Object set(int index, Object element):修改指定位置index的元素为element
        Object set = arrayList.set(1, 234);
        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开的子序列
        List list = arrayList.subList(1, 3);
    }
}
