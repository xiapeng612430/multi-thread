package producerconsumer.waitnotify;

import java.util.Queue;
import java.util.Random;

/**
 * @author xianpeng.xia
 * on 2022/3/13 4:30 PM
 */
public class Producer implements Runnable {

    private Queue<Product> queue;
    private int maxCapacity;

    public Producer(Queue<Product> queue, int maxCapacity) {
        this.queue = queue;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void run() {

        synchronized (queue) {
           /*
            1、这里有个问题，为什么只能用 while 而不是 if？
            其实在这一小段，生产者线程经历了几个过程：
            如果队列已满，它就没法生产，那也不能占着位置不做事，所以要把锁让出来，去 Q3 - 等待队列 等着；
            在等待队列里被唤醒之后，不能直接夺过锁来，而是要先加入 Q1 - 同步队列 等待资源；
            一旦抢到资源，关门上锁，才能来到 Q2 继续执行 wait() 之后的活，但是，此时这个队列有可能又满了，所以退出 wait() 之后，还需要再次检查 queue.size() == maxCapacity 这个条件，所以要用 while。

            2、那么为什么可能又满了呢？
            因为线程没有一直拿着锁，在被唤醒之后，到拿到锁之间的这段时间里，有可能其他的生产者线程先拿到了锁进行了生产，所以队列又经历了一个从不满到满的过程。

            3、总结：在使用线程的等待通知机制时，一般都要在 while 循环中调用 wait() 方法。
            */
            // 如果队列里的产品已经满了，生产者就不能继续生产；
            while (queue.size() == maxCapacity) {
                try {
                    System.out.printf("生产者" + Thread.currentThread().getName() + " 等待中....Queue 已达到最大容量，无法生产");
                    queue.wait();
                    System.out.printf("生产者" + Thread.currentThread().getName() + " 退出等待");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 如果队列里的产品从无到有，生产者就得通知一下消费者，告诉它可以来消费了；
            if (queue.size() == 0) {
                queue.notifyAll();
            }
            // 生产产品
            Random random = new Random();
            Integer i = random.nextInt();
            queue.offer(new Product("产品" + i));

            System.out.printf("生产者" + Thread.currentThread().getName() + " 生产了 " + i.toString());
        }
    }

}
