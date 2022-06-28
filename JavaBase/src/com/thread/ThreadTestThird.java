package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 51465
 */
public class ThreadTestThird {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        FutureTask futureTask = new FutureTask(numberThread);
        //启动线程
        new Thread(futureTask).start();
        try {
            //get方法的返回值即为构造器Callable实现类重写call的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

class NumberThread implements Callable{

    @Override
    public Object call() throws Exception {
        //遍历100以内的偶数，并且返回其和
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
