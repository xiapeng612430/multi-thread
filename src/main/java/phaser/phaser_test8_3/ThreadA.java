package phaser.phaser_test8_3;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 9:53 上午
 */
public class ThreadA extends Thread {

    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " A1 begin = " + System.currentTimeMillis());
            // 在指定的栏数等你的爱的最大单位时间，如果栏数不变，则出现异常，否则向下执行
            phaser.awaitAdvanceInterruptibly(0, 5, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName() + " A1   end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
