package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 51465
 */
public class StreamTest03 {
    /**
     * 匹配与查找
     */
    @Test
    public void test01(){
        List<Employee> employees = EmployeeData.getEmployees();
        //allMath(Predicate p):检查是否匹配所有元素
        boolean allMatch = employees.stream().allMatch(employee -> employee.getAge() > 18);
        System.out.println(allMatch);
        //anyMatch(Predicate p):检查是否至少匹配一个
        boolean anyMatch = employees.stream().anyMatch(employee -> employee.getSalary() > 1000);
        System.out.println(anyMatch);
        //noneMatch(Predicate p):检查是否没有匹配的元素
        boolean noneMatch = employees.stream().noneMatch(employee -> employee.getName().contains("雷"));
        System.out.println(noneMatch);
        //findFirst:返回第一个元素
        Optional<Employee> first = employees.stream().findFirst();
        System.out.println(first);
        //findAny:返回当前流中的任意元素
        Optional<Employee> any = employees.stream().findAny();
        System.out.println(any);
        //count():返回流中的元素的总个数
        long count = employees.stream().filter(employee -> employee.getSalary() > 5000).count();
        System.out.println(count);
        //max(Comparator c):返回流中的最大值
        //min(Comparator c):返回流中的最小值
        Optional<Double> maxSalary = employees.stream().map(Employee::getSalary).max(Double::compare);
        System.out.println(maxSalary);
        //forEach(Consumer c):内部迭代
        employees.stream().forEach(System.out::println);
    }

    /**
     * 归约
     */
    @Test
    public void test02(){
        //reduce(T identity, BinaryOperator):可以将流中元素反复结合起来,得到一个值,返回T
        //T identity:这就是个初始值
        //BinaryOperator:这个就是你要怎么做,例如相加
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
        //reduce(BinaryOperator):可以将流中的元素反复结合起来,得到一个值,返回Optional<T>
        List<Employee> employees = EmployeeData.getEmployees();
        Optional<Double> sumSalary = employees.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(sumSalary);
    }

    /**
     * 收集
     */
    @Test
    public void test03(){
        //collect(Collector c):将流转换为其它形式,接受一个Collector接口的实现,用于给Stream中元素做汇总的方法
        //查找工资大于6000的员工,结果返回一个List
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> employeeList = employees.stream().filter(employee -> employee.getSalary() > 6000)
                .collect(Collectors.toList());
        employeeList.forEach(System.out::println);
        //返回一个Set
        Set<Employee> employeeSet = employees.stream().filter(employee -> employee.getSalary() > 6000)
                .collect(Collectors.toSet());
        employeeSet.forEach(System.out::println);
    }
}
