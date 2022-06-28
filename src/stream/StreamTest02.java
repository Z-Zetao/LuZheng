package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * @author 51465
 */
public class StreamTest02 {
    /**
     * 筛选与切片
     */
    @Test
    public void test01(){
        List<Employee> employees = EmployeeData.getEmployees();
        //filter(Predicate p)——接受lambda,从流中排除某些元素
        employees.stream().filter(e -> e.getSalary() > 7000).forEach(System.out::println);
        //limit(n)——截断流,使其元素不超过给定数量
        employees.stream().limit(3).forEach(System.out::println);
        //skip(n)——跳过前面n条数据
        employees.stream().skip(3).forEach(System.out::println);
        //distinct()——筛选,通过流所生成元素的hashCode()和equals()去除重复元素
        employees.add(new Employee(1010, "刘强东", 40, 8000));
        employees.add(new Employee(1010, "刘强东", 40, 8000));
        employees.add(new Employee(1010, "刘强东", 40, 8000));
        employees.add(new Employee(1010, "刘强东", 40, 8000));
        employees.add(new Employee(1010, "刘强东", 40, 8000));
        employees.stream().distinct().forEach(System.out::println);
    }

    /**
     * 映射
     */
    @Test
    public void test02(){
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        //map(Function f):接受一个函数作为参数,将元素转换成其他形式或提取信息,该函数会被应用到每个元素上,并将其银蛇成一个新的元素
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        //获取员工姓名长度大于3的员工的姓名
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> stringStream = employees.stream().map(e -> e.getName());
        stringStream.filter(name -> name.length() > 3).forEach(System.out::println);
        //flatMap(Function f):接受一个函数作为参数,将流中的每个值都换成另一个流,然后把所有流连接成一个流
        //map和flatMap的关系就有点像list中add和addAll的关系
    }

    /**
     * 排序
     */
    @Test
    public void test03(){
        //sorted()——自然排序
        List<Integer> integers = Arrays.asList(1, 34, 253, 64, 13, 4, 123);
        integers.stream().sorted().forEach(System.out::println);
        //sorted(Comparator com)——定制排序
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((e1, e2) -> {
            int compare = Integer.compare(e1.getAge(), e2.getAge());
            if (compare != 0){
                return compare;
            }else {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        }).forEach(System.out::println);
    }
}
