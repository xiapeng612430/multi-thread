package countDownLatch.countDownLatch_test3;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xianpeng.xia
 * on 2020/4/28 11:14 下午
 */
public class Run {

    public static void main(String[] args) {

        try {
            CountDownLatch comingTag = new CountDownLatch(10);
            CountDownLatch waitTag = new CountDownLatch(1);
            CountDownLatch waitRunTag = new CountDownLatch(10);
            CountDownLatch beginTag = new CountDownLatch(1);
            CountDownLatch endTag = new CountDownLatch(10);

            MyThread[] myThreads = new MyThread[10];
            for (int i = 0; i < myThreads.length; i++) {
                MyThread myThread = new MyThread(comingTag, waitTag, waitRunTag, beginTag, endTag);
                myThread.setName("player" + i);
                myThreads[i] = myThread;
                myThreads[i].start();
            }

            System.out.println("裁判等待选手到来");
            comingTag.await();
            System.out.println("所有运动员到齐了,巡视5s");
            Thread.sleep(5000);
            waitTag.countDown();
            System.out.println("各就各位");
            waitRunTag.await();
            Thread.sleep(2000);
            System.out.println("发令枪响起");
            beginTag.countDown();
            endTag.await();
            System.out.println("所有运动员到达终点");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
