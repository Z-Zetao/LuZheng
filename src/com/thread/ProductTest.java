package com.thread;

/**
 * 生产者（producer）将产品交给店员（clerk），而消费者（customer）从店员处取走产品，
 * 店员一次只能持有固定数量的产品（20），如果生产者试图生产更多的产品，店员会叫生产者停一下，
 * 如果店中有空位放产品了再通知生产者继续生产，如果店中没有产品了，店员会告诉消费者等一下，
 * 如果店中有产品了再通知消费者来取走产品
 *
 * 1.涉及多线程问题————生产者、消费者
 * 2.涉及共享数据————产品
 * 3.涉及线程安全问题
 * 4.涉及线程通信问题
 *
 *
 * @author 51465
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);
        producer.setName("生产者");

        Customer customer = new Customer(clerk);
        customer.setName("消费者");

        producer.start();
        customer.start();
    }
}

class Clerk{
    private int productCount = 0;
    //生产产品
    public synchronized void produceProduct() {
        if (productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + "开始生成第" + productCount + "个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费产品
    public synchronized void consumeProduct() {
        if (productCount > 0){
            System.out.println(Thread.currentThread().getName() + "开始消费第" + productCount + "个产品");
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Customer extends Thread{
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费产品");
        while (true) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}

class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始生产产品");
        while (true) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }
}

















