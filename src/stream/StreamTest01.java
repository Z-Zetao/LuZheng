package stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author 51465
 */
public class StreamTest01 {
    /**
     * 创建Stream方式一:通过集合
     * default Stream<E> stream():返回一个顺序流
     * default Stream<E> parallelStream:返回一个并行流
     */
    @Test
    public void test01(){
        List<Employee> employees = EmployeeData.getEmployees();
        //default Stream<E> stream():返回一个顺序流
        //拿数据的时候按照顺序来
        Stream<Employee> stream = employees.stream();
        //default Stream<E> parallelStream:返回一个并行流
        //拿数据的时候是所有一起来，不一定有顺序
        Stream<Employee> employeeStream = employees.parallelStream();
    }

    /**
     * 创建Stream方式二:通过数组
     * 调用Arrays类的static <T> Stream<T> stream(T[] array):返回一个流
     */
    @Test
    public void test02(){
        int[] arr = new int[]{1,2,3,4,5,6};
        //调用Arrays类的static <T> Stream<T> stream(T[] array):返回一个流
        //扔进去什么类型的数组，就返回什么类型的流
        IntStream stream = Arrays.stream(arr);
    }

    /**
     * 创建Stream方式三:通过Stream的of()
     */
    @Test
    public void test03(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    /**
     * 创建Stream方式四:创建无限流
     * public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
     * public static<T> Stream<T> generate(Supplier<T> s)
     */
    @Test
    public void test04(){
        //public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        //public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
