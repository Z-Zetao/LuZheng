package cn.Stream;

import org.junit.Test;

import java.io.*;

/**
 * @author 51465
 */
public class ObjectInputOutputStreamTest {

    @Test
    public void objectInputStreamTest(){
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(
                    new FileInputStream("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Object.data"));
            Object o = objectInputStream.readObject();
            String str = (String) o;
            Person p = (Person) objectInputStream.readObject();
            System.out.println(str);
            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void objectOutputStreamTest(){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("D:\\IntelliJ IDEA\\LuZheng\\src\\cn\\Object.data"));
            objectOutputStream.writeObject(new String("我爱北京天安门"));
            objectOutputStream.flush();//刷新操作
            objectOutputStream.writeObject(new Person("郑泽涛", 24));
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Person implements Serializable{

    /**
     * 序列版本号serialVersionUID
     */
    public static final long serialVersionUID = 123785663547658L;

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
