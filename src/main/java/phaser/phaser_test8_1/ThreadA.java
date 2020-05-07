package phaser.phaser_test8_1;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/8 12:12 上午
 */
public class ThreadA extends Thread{
private Phaser phaser;

    public ThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " A1 begin = " + System.currentTimeMillis());
            phaser.awaitAdvanceInterruptibly(0);
            System.out.println(Thread.currentThread().getName() + " A1   end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
