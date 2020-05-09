package phaser.phaser_test9;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:29 上午
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
