package countDownLatch.countDownLatch_test3;

import java.util.concurrent.CountDownLatch;

/**
 * Created by xianpeng.xia
 * on 2020/4/28 10:18 下午
 */
public class MyThread extends Thread {

    // 裁判等所有运动员来
    private CountDownLatch comingTag;
    //等待裁判说开始
    private CountDownLatch waitTag;
    //等待起跑
    private CountDownLatch waitRunTag;
    //起跑
    private CountDownLatch beginTag;
    //所有运动员到终点
    private CountDownLatch endTag;

    public MyThread(CountDownLatch comingTag, CountDownLatch waitTag, CountDownLatch waitRunTag, CountDownLatch beginTag, CountDownLatch endTag) {
        super();
        this.comingTag = comingTag;
        this.waitTag = waitTag;
        this.waitRunTag = waitRunTag;
        this.beginTag = beginTag;
        this.endTag = endTag;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " 运动员使用不同工具到达起跑点，正往这边走");
            Thread.sleep((int) Math.random() * 10000);
            System.out.println(Thread.currentThread().getName() + " 到达起跑点了");
            comingTag.countDown();
            System.out.println(Thread.currentThread().getName() + " 等待裁判说准备");
            waitTag.await();
            System.out.println(Thread.currentThread().getName() + (" 各就各位，准备起跑"));
            Thread.sleep((int) Math.random() * 10000);
            waitRunTag.countDown();
            beginTag.await();
            System.out.println(Thread.currentThread().getName() + " 运动员开始起跑 速度不同");
            Thread.sleep((int) Math.random() * 10000);
            endTag.countDown();
            System.out.println(Thread.currentThread().getName() + " 运动员到达终点");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
