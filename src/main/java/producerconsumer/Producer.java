package producerconsumer;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:06 PM
 * 生产者接口
 */
public interface Producer {

    /**
     * 生产
     * @throws InterruptedException 异常
     */
    void produce() throws InterruptedException;
}
