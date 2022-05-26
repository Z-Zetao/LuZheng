package com.thread;

/**
 * @author 51465
 */
public class ThreadTestSecond {
    public static void main(String[] args) {
        MyThreadSecond myThreadSecond = new MyThreadSecond();
        Thread thread = new Thread(myThreadSecond);
        thread.start();
    }

}

class MyThreadSecond implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}