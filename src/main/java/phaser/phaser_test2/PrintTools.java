package phaser.phaser_test2;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 10:08 下午
 */
public class PrintTools {

    public static Phaser phaser;

    public static void methodA() {
        System.out.println(Thread.currentThread().getName() + " A1 begin = " + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A1   end = " + System.currentTimeMillis());

        System.out.println(Thread.currentThread().getName() + " A2 begin = " + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A2   end = " + System.currentTimeMillis());

    }

    public static void methodB() {
        try {
            System.out.println(Thread.currentThread().getName() + " A1 begin = " + System.currentTimeMillis());
            Thread.sleep(5000);
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + " A1   end = " + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
