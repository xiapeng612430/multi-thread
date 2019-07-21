package countDownLatch.countDownLatch_test2;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 21:31
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch maxRuner = new CountDownLatch(10);
        MyThread[] threads = new MyThread[Integer.parseInt("" + maxRuner.getCount())];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(maxRuner);
            threads[i].setName("thread-" + (i + 1));
            threads[i].start();
        }
        maxRuner.await();
        System.out.println("all return");
    }
}
