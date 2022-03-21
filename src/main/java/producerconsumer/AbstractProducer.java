package producerconsumer;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:10 PM
 */
public class AbstractProducer implements Producer, Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    @Override
    public void produce() throws InterruptedException {

    }
}
