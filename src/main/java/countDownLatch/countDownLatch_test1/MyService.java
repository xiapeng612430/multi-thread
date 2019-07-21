package countDownLatch.countDownLatch_test1;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 12:03
 */
public class MyService {

    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println("A");
            countDownLatch.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMethod() {
        System.out.println("X");
        countDownLatch.countDown();
    }
}
