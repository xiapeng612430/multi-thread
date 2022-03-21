package producerconsumer.blockingqueue;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import producerconsumer.AbstractConsumer;
import producerconsumer.AbstractProducer;
import producerconsumer.Consumer;
import producerconsumer.Producer;
import producerconsumer.ProducerConsumerModel;
import producerconsumer.Product;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:19 PM
 * 阻塞队列模式
 */
public class BlockingQueueModel implements ProducerConsumerModel {

    private final BlockingQueue<Product> queue;
    private final AtomicInteger taskNo = new AtomicInteger(0);

    public BlockingQueueModel(int cap) {
        this.queue = new LinkedBlockingQueue<>(cap);
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
            Product product = new Product(taskNo.getAndIncrement());
            System.out.println(Thread.currentThread().getName() + " 生产了: " + product);
            queue.put(product);
        }
    }


    private class ConsumerImpl extends AbstractConsumer implements Consumer, Runnable {

        @Override
        public void consume() throws InterruptedException {
            Product product = queue.take();
            // 固定时间消费
            long sleepTime = 500 + (long) Math.random() * 500;
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName() + " 消费了: " + product);
        }
    }

}
