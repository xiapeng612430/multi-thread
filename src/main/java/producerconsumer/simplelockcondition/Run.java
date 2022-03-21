package producerconsumer.simplelockcondition;

/**
 * @author xianpeng.xia
 * on 2022/3/21 10:52 PM
 */
public class Run {

    public static void main(String[] args) {
        LockConditionModel lockConditionModel = new LockConditionModel(3);
        for (int i = 0; i < 2; i++) {
            new Thread(lockConditionModel.newRunnableConsumer()).start();
        }

        for (int i = 0; i < 5; i++) {
            new Thread(lockConditionModel.newRunnableProducer()).start();
        }
    }
}
