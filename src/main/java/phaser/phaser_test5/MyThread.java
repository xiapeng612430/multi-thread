package phaser.phaser_test5;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 10:58 下午
 */
public class MyThread extends Thread {

    private Phaser phaser;

    public MyThread(Phaser phaser) {
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
