package producerconsumer.blockingqueue;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:46 PM
 */
public class Run {

    public static void main(String[] args) {

        BlockingQueueModel blockingQueueModel = new BlockingQueueModel(3);
        for (int i = 0; i < 2; i++) {
            new Thread(blockingQueueModel.newRunnableConsumer()).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(blockingQueueModel.newRunnableProducer()).start();
        }
    }

}
