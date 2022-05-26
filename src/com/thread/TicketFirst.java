package com.thread;

/**
 * @author 51465
 */
public class TicketFirst {
    public static void main(String[] args) {
        Window window = new Window();

        Thread thread1 = new Thread(window);
        Thread thread2 = new Thread(window);
        Thread thread3 = new Thread(window);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Window implements Runnable{

    private int ticket = 100;

    private synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "：买票，票号为：" + ticket);
            ticket--;
        }
    }

    @Override
    public void run() {
        while (true) {
            show();
        }
    }
}
