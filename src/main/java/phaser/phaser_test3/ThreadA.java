package phaser.phaser_test3;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 9:56 下午
 */
public class ThreadA extends Thread {

    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A   end phase value = " + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A   end phase value = " + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A   end phase value = " + phaser.getPhase());

    }
}
