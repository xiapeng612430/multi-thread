package producerconsumer.waitnotify;

import java.util.Queue;

/**
 * @author xianpeng.xia
 * on 2022/3/13 4:37 PM
 */
public class Consumer implements Runnable {

    private Queue<Product> queue;
    private int maxCapacity;

    public Consumer(Queue<Product> queue, int maxCapacity) {
        this.queue = queue;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void run() {
        synchronized (queue) {
            // 如果队列里已经没有产品了，消费者也无法继续消费；
            while (queue.isEmpty()) {
                try {
                    System.out.println("消费者 " + Thread.currentThread().getName() + " 等待中... Queue 已缺货，无法消费");
                    queue.wait();
                    System.out.println("消费者 " + Thread.currentThread().getName() + " 退出等待");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 如果队列里的产品从满到不满，消费者也得去通知下生产者，说你可以来生产了。
            if (queue.size() == maxCapacity) {
                queue.notifyAll();
            }
            Product product = queue.poll();
            System.out.println("消费者 " + Thread.currentThread().getName() + " 消费了 " + product.getName());
        }
    }
}
