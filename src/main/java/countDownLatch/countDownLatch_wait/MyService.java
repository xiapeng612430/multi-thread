package countDownLatch.countDownLatch_wait;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2020/4/28 11:48 下午
 */
public class MyService {

    private CountDownLatch count = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            count.await(3, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName() + " end   " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
