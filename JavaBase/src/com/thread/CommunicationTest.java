package com.thread;

/**
 * @author 51465
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Communication communication = new Communication();
        Thread thread1 = new Thread(communication);
        Thread thread2 = new Thread(communication);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}

class Communication implements Runnable{

    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //调notify()唤醒阻塞的线程
                notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        //调wait()使当前线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
