package reflection.reflectionTest03;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 51465
 */
public class ReflectionSpecialTest {
    @Test
    public void fieldTest() throws Exception {
        Class<Person> personClass = Person.class;
        //创建运行时类的对象
        Person person = personClass.newInstance();
        //获取指定的属性：getField只能获取修饰为public的属性
        Field id = personClass.getField("id");
        //设置当前属性的值：参数一指明设置哪个对象，参数二将这个属性设置为多少
        id.set(person, 1001);
        //获取当前属性的值：参数指明获取哪个对象的值
        Object o = id.get(person);
        System.out.println(o);
    }

    @Test
    public void declaredFieldTest() throws Exception {
        Class<Person> personClass = Person.class;
        //创建运行时类对象
        Person person = personClass.newInstance();
        //获取指定的属性：getDeclaredField可以获取任意修饰的属性
        Field name = personClass.getDeclaredField("name");
        //一定要setAccessible，否则会报错，因为private不让设置属性的值
        //这里保证了当前属性是可访问的
        name.setAccessible(true);
        //设置属性值
        name.set(person, "zzt");
        Object o = name.get(person);
        System.out.println(o);
    }

    @Test
    public void methodTest() throws Exception {
        Class<Person> personClass = Person.class;
        //创建运行时类对象:操作非静态方法时必须要有
        Person person = personClass.newInstance();
        //获取指定的某个方法:参数一为指定的方法名;参数二为参数名
        Method show = personClass.getDeclaredMethod("show", String.class);
        //保证当前方法是可访问的
        show.setAccessible(true);
        //调用当前方法:参数一为方法的调用者;参数二为对形参赋值的实参
        Object china = show.invoke(person, "中国");
        System.out.println(china);
        //调用静态方法
        System.out.println("******************");
        Method showDesc = personClass.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        Object invoke = showDesc.invoke(Person.class);
    }

    @Test
    public void constructorTest() throws Exception {
        Class<Person> personClass = Person.class;
        //获取指定的构造器:参数都是构造器指定的参数列表
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
        //保证此构造器可访问
        declaredConstructor.setAccessible(true);
        //调用此构造器创建运行时类的对象
        Person person = declaredConstructor.newInstance("Tom");
        System.out.println(person);
    }
}
