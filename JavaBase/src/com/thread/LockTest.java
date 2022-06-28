package com.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 51465
 */
public class LockTest {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();

        Thread thread1 = new Thread(saleTicket);
        Thread thread2 = new Thread(saleTicket);
        Thread thread3 = new Thread(saleTicket);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class SaleTicket implements Runnable{

    private int ticket = 100;

    //实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                //调用方法lock()方法锁定
                lock.lock();

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "：售票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }finally {
                //调用unlock()方法解锁
                lock.unlock();
            }
        }
    }
}
