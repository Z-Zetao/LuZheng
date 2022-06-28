package reflection.reflectionTest01;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 51465
 */
public class ReflectionTest {
    //反射之前，对于Person的操作
    @Test
    public void test(){
        //创建Person类的对象
        Person person = new Person("Tom",12);
        //通过对象调用内部的属性和方法
        //在Person类的外部，不可以通过Person类的对象调用其内部的私有结构
        person.age = 10;
        System.out.println(person);
        person.show();
    }
    //反射之后，对于Person的操作
    @Test
    public void reflectionTest() throws Exception {
        Class<Person> personClass = Person.class;
        //通过反射创建Person类的对象
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person personTom = constructor.newInstance("Tom", 12);
        System.out.println(personTom);
        //通过反射调用对象指定的属性和方法
        //1.调用属性
        Field age = personClass.getDeclaredField("age");
        age.set(personTom, 10);
        System.out.println(personTom);
        //2.调用方法
        Method show = personClass.getDeclaredMethod("show");
        show.invoke(personTom);
        //通过反射调用Person类的私有结构————构造器、属性、方法
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
        //1.调用私有构造器
        declaredConstructor.setAccessible(true);
        Person personJerry = declaredConstructor.newInstance("Jerry");
        System.out.println(personJerry);
        //2.调用私有属性
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(personJerry,"HanMeimei");
        System.out.println(personJerry);
        //3.调用私有方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object china = showNation.invoke(personJerry, "China");//invoke就是调用的意思
        System.out.println(china);
    }

    /**
     * 如何获取Class实例的方式
     */
    @Test
    public void classTest() throws ClassNotFoundException {
        //方式一:调用运行时类的属性:.class
        Class<Person> personClass01 = Person.class;
        System.out.println(personClass01);
        //方式二:通过运行时类的对象
        Person person = new Person();
        Class<? extends Person> personClass02 = person.getClass();
        System.out.println(personClass02);
        //方式三:调用Class的静态方法:forName(String classPath)
        Class<?> personClass03 = Class.forName("reflection.reflectionTest01.Person");
        System.out.println(personClass03);
        //方式四:使用类的加载器ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> personClass04 = classLoader.loadClass("reflection.reflectionTest01.Person");
        System.out.println(personClass04);
    }
}
