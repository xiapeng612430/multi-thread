package producerconsumer.simplelockcondition;

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
 * on 2022/3/21 10:22 PM
 *
 * 简单的Lock && Condition
 */
public class LockConditionModel implements ProducerConsumerModel {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private final Queue<Product> queue = new LinkedList<>();
    private final int cap;
    private final AtomicInteger productNo = new AtomicInteger(0);

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
            long sleepTime = (long) Math.random() * 1000;
            // 不定期生产
            Thread.sleep(sleepTime);
            lock.lock();
            try {
                // 队列满，停止生产
                while (queue.size() == cap) {
                    condition.await();
                }
                // 生产
                Product product = new Product(productNo.getAndIncrement());
                queue.offer(product);
                System.out.println(Thread.currentThread().getName() + " 生产了: " + product);
                condition.signalAll();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    private class ConsumerImpl extends AbstractConsumer implements Consumer, Runnable {

        @Override
        public void consume() throws InterruptedException {
            // 固定时间消费
            long sleepTime = 500 + (long) Math.random() * 500;
            Thread.sleep(sleepTime);
            lock.lock();
            try {
                // 队列空，等待
                while (queue.size() == 0) {
                    condition.await();
                }
                Product product = queue.poll();
                System.out.println(Thread.currentThread().getName() + " 消费了: " + product);
                condition.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
