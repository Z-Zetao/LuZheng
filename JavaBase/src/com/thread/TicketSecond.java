package com.thread;

/**
 * @author 51465
 */
public class TicketSecond {
    public static void main(String[] args) {

        WindowSecond win1 = new WindowSecond();
        WindowSecond win2 = new WindowSecond();
        WindowSecond win3 = new WindowSecond();

        win1.start();
        win2.start();
        win3.start();
    }

}

class WindowSecond extends Thread{
    private static int ticket = 100;

    public static synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
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
