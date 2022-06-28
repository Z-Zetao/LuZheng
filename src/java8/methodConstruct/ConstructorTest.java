package java8.methodConstruct;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author 51465
 */
public class ConstructorTest {
    /**
     * Supplier中的T get()
     * Employee中的空参构造器Employee()
     */
    @Test
    public void test1(){
        Supplier<Employee> supplier = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        supplier.get();
        System.out.println("**************Lambda表达式***************");
        Supplier<Employee> supplierLambda = () -> new Employee();
        supplierLambda.get();
        System.out.println("**************构造器引用*****************");
        Supplier<Employee> supplierConstruct = Employee::new;
        supplierConstruct.get();
    }

    @Test
    public void test2(){
        Function<Integer, String[]> function = length -> new String[length];
        String[] apply = function.apply(10);
        System.out.println(Arrays.toString(apply));
        System.out.println("************数组引用***********");
        Function<Integer, String[]> functionConstruct = String[] :: new;
        String[] applyConstruct = functionConstruct.apply(5);
        System.out.println(Arrays.toString(applyConstruct));
    }
}
