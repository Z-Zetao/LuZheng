package java8.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author 51465
 */
public class LambdaTest {
    @Test
    public void test1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        runnable.run();

        System.out.println("***********************");

        Runnable runnableLambda = () -> System.out.println("我爱北京天安门");
        runnableLambda.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(32, 12));

        System.out.println("************Lambda表达式************");

        Comparator<Integer> comparatorLambda = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparatorLambda.compare(32, 12));

        System.out.println("************方法引用************");

        Comparator<Integer> comparatorLambdaInteger = Integer::compare;
        System.out.println(comparatorLambdaInteger.compare(32, 12));
    }

    @Test
    public void test3(){
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        stringConsumer.accept("zzt");

        System.out.println("***********************");

        Consumer<String> consumerLambda = System.out::println;
        consumerLambda.accept("lulu");
    }

    @Test
    public void test4(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int compare = comparator.compare(12, 24);
        System.out.println(compare);

        System.out.println("***********************");

        Comparator<Integer> comparatorLambda = Integer::compareTo;
        int compareLambda = comparatorLambda.compare(12, 24);
        System.out.println(compareLambda);
    }
}
