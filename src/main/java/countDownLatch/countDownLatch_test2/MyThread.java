package countDownLatch.countDownLatch_test2;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 21:23
 */
public class MyThread extends Thread {

    private CountDownLatch maxRuner;

    public MyThread(CountDownLatch maxRuner) {
        super();
        this.maxRuner = maxRuner;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            maxRuner.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
