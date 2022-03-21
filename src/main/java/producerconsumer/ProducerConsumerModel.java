package producerconsumer;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:13 PM
 *
 * 生产者/消费者模式接口
 */
public interface ProducerConsumerModel {


    /**
     * 生产者任务
     *
     * @return 生产者任务
     */
    Runnable newRunnableProducer();


    /**
     * 消费者任务
     *
     * @return 消费者任务
     */
    Runnable newRunnableConsumer();


}
