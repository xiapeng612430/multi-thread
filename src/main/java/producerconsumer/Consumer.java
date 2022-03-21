package producerconsumer;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:05 PM
 * 消费者
 */
public interface Consumer {

    /**
     * 消费
     *
     * @throws InterruptedException 异常
     */
    void consume() throws InterruptedException;
}
