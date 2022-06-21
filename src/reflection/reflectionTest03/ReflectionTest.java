package reflection.reflectionTest03;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * @author 51465
 */
public class ReflectionTest {
    @Test
    public void fieldTest(){
        Class<Person> personClass = Person.class;
        //获取属性结构
        //getFields():获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = personClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        //getDeclaredFields():获取当前运行时类自己的属性(所有)
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields) {
            //获取权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            //获取数据类型
            Class<?> type = f.getType();
            System.out.println(type.getName());
            //获取变量名
            String name = f.getName();
            System.out.println(name);
        }
    }

    /**
     * 属性的声明:权限修饰符 数据类型 变量名;
     */
    @Test
    public void fieldTest2(){
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields) {
            //获取权限修饰符
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            //获取数据类型
            Class<?> type = f.getType();
            System.out.println(type.getName());
            //获取变量名
            String name = f.getName();
            System.out.println(name);
        }
    }

    /**
     * 方法的声明:权限修饰符 返回值类型 方法名(参数类型 形参名,...)
     * 并且还有可能有注解
     */
    @Test
    public void methodTest(){
        Class<Person> personClass = Person.class;
        //getMethods():获取当前运行时类及其父类中声明为public访问权限的方法
        Method[] methods = personClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println();
        //getDeclaredMethods():获取当前运行时类自己的方法(所有)
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            //获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }
            //获取权限修饰符
            int modifiers = m.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //获取返回值类型
            Class<?> returnType = m.getReturnType();
            System.out.print(returnType + " ");
            //获取方法名
            String name = m.getName();
            System.out.print(name);
            System.out.print("(");
            //获取形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)){
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1){
                        System.out.print(parameterTypes[i].getName() + " " + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + " " + i + ",");
                }
            }
            System.out.print(") ");
            //获取异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if (exceptionTypes.length > 0){
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1){
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");
                }
            }
            System.out.println();
        }
    }

    @Test
    public void constructTest(){
        Class<Person> personClass = Person.class;
        //getConstructors():只能拿到当前运行时类中声明为public的自己的构造器
        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }
        //getDeclaredConstructors():拿到当前运行时类中声明的所有的构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        for (Constructor<?> c : declaredConstructors) {
            System.out.println(c);
        }
    }

    @Test
    public void parentsTest(){
        Class<Person> personClass = Person.class;
        //getSuperclass():获取当前运行时类的父类
        Class<? super Person> superclass = personClass.getSuperclass();
        System.out.println(superclass);
        //getGenericSuperclass():获取当前运行时类的带泛型的父类
        Type genericSuperclass = personClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
        //获取当前运行时类的带泛型的父类的泛型
        ParameterizedType paramType = (ParameterizedType) personClass.getGenericSuperclass();
        Type[] actualTypeArguments = paramType.getActualTypeArguments();
        for (Type t : actualTypeArguments) {
            System.out.println(t);
        }
    }

    @Test
    public void interfaceTest(){
        Class<Person> personClass = Person.class;
        //getInterfaces():获取当前运行时类的接口
        Class<?>[] interfaces = personClass.getInterfaces();
        for (Class<?> c : interfaces) {
            System.out.println(c);
        }
    }

    @Test
    public void packageTest(){
        Class<Person> personClass = Person.class;
        //getPackage():获取当前运行时类所在的包
        Package classPackage = personClass.getPackage();
        System.out.println(classPackage);
    }

    @Test
    public void annotationTest(){
        Class<Person> personClass = Person.class;
        //getAnnotations():获取当前运行时类所声明的注解
        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation a : annotations) {
            System.out.println(a);
        }
    }
}
