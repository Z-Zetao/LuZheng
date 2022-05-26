package com.thread;

/**
 * @author 51465
 */
public class ThreadTestFirst {
    public static void main(String[] args) {
        //创建一个MyThread的对象
        MyThreadFirst myThreadFirst = new MyThreadFirst();
        //调用start()方法
        myThreadFirst.start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i + "**");
            }
        }
    }
}

//创建一个新的类继承Thread
class MyThreadFirst extends Thread{
    @Override
    public void run() {
        //将创建这个线程要做的事情声明在这个方法中
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}