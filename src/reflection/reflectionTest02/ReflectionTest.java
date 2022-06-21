package reflection.reflectionTest02;

import org.junit.Test;

import java.util.Random;

/**
 * 通过反射创建对应运行时类的对象
 *
 * @author 51465
 */
public class ReflectionTest {
    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        //生成的对象实例——这就是通过反射创建的运行时类对象
        //用newInstance()方法创建实例对象——调用的是空参构造器
        Person person = personClass.newInstance();
        System.out.println(person);
    }

    @Test
    public void test1() {
        //创建一个随机数
        int num = new Random().nextInt(3);
        String classPath = "";
        switch (num){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.sql.Date";
                break;
            case 2:
                classPath = "reflection.reflectionTest02.Person";
                break;
        }
        try {
            Object obj = getInstance(classPath);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建一个指定类的对象
     * @param classPath 指定类的全类名
     * @return 返回运行时对象
     * @throws Exception 异常
     */
    public Object getInstance(String classPath) throws Exception {
        Class aClass = Class.forName(classPath);
        return aClass.newInstance();
    }
}
