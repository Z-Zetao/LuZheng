package com.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 51465
 */
public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("AA");
        set.add(new String("lulu"));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
