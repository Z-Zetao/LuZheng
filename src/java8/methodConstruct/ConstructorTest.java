package java8.methodConstruct;

import org.junit.Test;

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
    public void test(){
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
}
