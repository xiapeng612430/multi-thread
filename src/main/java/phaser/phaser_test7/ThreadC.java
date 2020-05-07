package phaser.phaser_test7;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:48 下午
 */
public class ThreadC extends Thread {

    private Phaser phaser;

    public ThreadC(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " A1 begin = " + System.currentTimeMillis());
            Thread.sleep(3000);
            phaser.awaitAdvance(0);
            System.out.println(Thread.currentThread().getName() + " A1   end = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
