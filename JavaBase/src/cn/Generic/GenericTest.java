package cn.Generic;

import org.junit.Test;

import java.util.*;

/**
 * @author 51465
 */
public class GenericTest {

    @Test
    public void test5(){
        List<Object> list1 = null;
        List<String> list2 = null;
        print(list1);
        print(list2);
        List<?> list = new ArrayList<>();
        list.add(null);
    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    @Test
    public void test4(){
        Order<String> stringOrder = new Order<>();
        Integer[] integers = new Integer[]{1, 2, 3, 4};
        List<Integer> integer = stringOrder.copyFromArrayToList(integers);
        System.out.println(integer);
    }

    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(77);
        arrayList.add(88);
        arrayList.add(99);
        arrayList.add(66);
        arrayList.add("lulu");
        for (Object obj : arrayList) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(66);
        integers.add(77);
        integers.add(88);
        integers.add(99);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

    @Test
    public void test3(){
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("lulu", 18);
        hashMap.put("zetao", 21);
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        System.out.println(entries);
    }
}
