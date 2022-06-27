package java8.methodConstruct;

import java8.lambda.LambdaTest;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 51465
 */
public class MethodTest {
    @Test
    public void test1(){
        System.out.println("***********Lambda表达式***********");
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("北京");
        System.out.println("***********方法引用***********");
        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("北京");
    }

    @Test
    public void test2(){
        System.out.println("***********Lambda表达式***********");
        Employee tom = new Employee(1001, "Tom", 24, 5600);
        Supplier<String> supplier = () -> tom.getName();
        System.out.println(supplier.get());
        System.out.println("***********方法引用***********");
        Supplier<String> supplier1 = tom::getName;
        System.out.println(supplier1.get());
    }

    @Test
    public void test3(){
        System.out.println("***********Lambda表达式***********");
        Comparator<Integer> comparator = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(comparator.compare(12, 21));
        System.out.println("***********方法引用***********");
        Comparator<Integer> comparator1 = Integer::compare;
        System.out.println(comparator1.compare(12, 21));
    }

    @Test
    public void test4(){
        System.out.println("***********Lambda表达式***********");
        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(12.3));
        System.out.println("***********方法引用***********");
        Function<Double, Long> function1 = Math::round;
        System.out.println(function1.apply(12.3));
    }

    /**
     * Comparator中的int compare(T t1, T t2)
     * String中的int t1.compareTo(t2)
     */
    @Test
    public void test5(){
        System.out.println("***********Lambda表达式***********");
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        System.out.println(comparator.compare("sbc", "sdf"));
        System.out.println("***********方法引用***********");
        Comparator<String> comparator1 = String::compareTo;
        System.out.println(comparator1.compare("sbc", "sdf"));
    }

    /**
     * BiPredicate中的boolean test(T t1, T t2)
     * String中的boolean t1.equals(t2)
     */
    @Test
    public void test6(){
        System.out.println("***********Lambda表达式***********");
        BiPredicate<String, String> biPredicate = (t1, t2) -> t1.equals(t2);
        System.out.println(biPredicate.test("abc", "abd"));
        System.out.println("***********方法引用***********");
        BiPredicate<String, String> biPredicate1 = String::equals;
        System.out.println(biPredicate1.test("abc", "abd"));
    }

    /**
     * Function中的R apply(T t)
     * Employee中的String getName()
     */
    @Test
    public void test7(){
        Employee tom = new Employee(1001, "Tom", 23, 5600);
        System.out.println("***********Lambda表达式***********");
        Function<Employee, String> function = employee -> employee.getName();
        System.out.println(function.apply(tom));
        System.out.println("***********方法引用***********");
        Function<Employee, String> function1 = Employee::getName;
        System.out.println(function1.apply(tom));
    }
}
