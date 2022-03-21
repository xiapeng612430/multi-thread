package producerconsumer.lockconditon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import producerconsumer.AbstractConsumer;
import producerconsumer.AbstractProducer;
import producerconsumer.Consumer;
import producerconsumer.Producer;
import producerconsumer.ProducerConsumerModel;
import producerconsumer.Product;

/**
 * @author xianpeng.xia
 * on 2022/3/21 11:01 PM
 * 复杂方式的LockConditionMode
 */
public class LockConditionModel implements ProducerConsumerModel {

    private final Lock consumerLock = new ReentrantLock();
    private final Condition not_empty = consumerLock.newCondition();
    private final Lock producerLock = new ReentrantLock();
    private final Condition not_full = producerLock.newCondition();
    private final Queue<Product> queue = new LinkedList<>();
    private AtomicInteger queueLen = new AtomicInteger(0);
    private final int cap;
    private AtomicInteger productNo = new AtomicInteger(0);

    public LockConditionModel(int cap) {
        this.cap = cap;
    }

    @Override
    public Runnable newRunnableProducer() {
        return new ProducerImpl();
    }

    @Override
    public Runnable newRunnableConsumer() {
        return new ConsumerImpl();
    }

    private class ProducerImpl extends AbstractProducer implements Producer, Runnable {

        @Override
        public void produce() throws InterruptedException {
            // 不定期生产
            long sleepTime = (long) Math.random() * 1000;
            Thread.sleep(sleepTime);
            int newQueueSize = -1;
            producerLock.lock();
            try {
                while (queueLen.get() == cap) {
                    not_full.await();
                }
                Product product = new Product(productNo.getAndIncrement());
                queue.offer(product);
                newQueueSize = queueLen.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + " 生产了: " + product);
                // 队列未满，通知生产者生产
                if (newQueueSize < cap) {
                    not_full.signalAll();
                }

            } finally {
                producerLock.unlock();
            }
            // 队列有产品，通知消费者消费
            if (newQueueSize > 0) {
                consumerLock.lock();
                try {
                    not_empty.signalAll();
                } finally {
                    consumerLock.unlock();
                }
            }
        }
    }

    private class ConsumerImpl extends AbstractConsumer implements Consumer, Runnable {

        @Override
        public void consume() throws InterruptedException {
            // 固定时间消费
            long sleepTime = 500 + (long) Math.random() * 500;
            Thread.sleep(sleepTime);
            int newQueueSize = -1;
            consumerLock.lock();
            try {
                while (queueLen.get() == 0) {
                    System.out.println("empty....");
                    not_empty.await();
                }
                Product product = queue.poll();
                System.out.println(Thread.currentThread().getName() + " 消费了: " + product);
                newQueueSize = queueLen.decrementAndGet();
                // 如果队列中有产品，通知消费者来消费
                if (newQueueSize > 0) {
                    not_empty.signalAll();
                }
            } finally {
                consumerLock.unlock();
            }
            // 队列未满，通知生产者生产
            if (newQueueSize < cap) {
                producerLock.lock();
                try {
                    not_full.signalAll();
                } finally {
                    producerLock.unlock();
                }
            }
        }
    }
}