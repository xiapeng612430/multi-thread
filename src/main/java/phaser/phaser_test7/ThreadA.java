package phaser.phaser_test7;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:48 下午
 */
public class ThreadA extends Thread {

    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " A1 begin = " + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A1   end = " + System.currentTimeMillis());

    }
}
