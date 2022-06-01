package com.Set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 51465
 */
public class TreeSetTest {

    @Test
    public void test(){
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User user1 = (User) o1;
                    User user2 = (User) o2;
                    return Integer.compare(user1.getAge(), user2.getAge());
                }else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };

        TreeSet treeSet = new TreeSet(com);
        treeSet.add(new User("huixia", 12));
        treeSet.add(new User("hui", 18));
        treeSet.add(new User("zheng", 24));
        treeSet.add(new User("zetao", 19));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new User("huixia", 12));
        treeSet.add(new User("hui", 18));
        treeSet.add(new User("zheng", 24));
        treeSet.add(new User("zetao", 19));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //按照姓名从小到大排列
    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user = (User) o;
            return this.name.compareTo(user.name);
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
