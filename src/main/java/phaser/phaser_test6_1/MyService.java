package phaser.phaser_test6_1;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:20 下午
 */
public class MyService {

    private Phaser phaser;

    public MyService(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void testMethodA() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin A1 " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + "   end A1 " + System.currentTimeMillis());

            System.out.println(Thread.currentThread().getName() + " begin A2 " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + "   end A2 " + System.currentTimeMillis());

            System.out.println(Thread.currentThread().getName() + " begin A3 " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + "   end A3 " + System.currentTimeMillis());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void testMethodB() {
        System.out.println(Thread.currentThread().getName() + " begin A1 " + System.currentTimeMillis());
        phaser.arrive();
        System.out.println(Thread.currentThread().getName() + "   end A1 " + System.currentTimeMillis());

        System.out.println(Thread.currentThread().getName() + " begin A2 " + System.currentTimeMillis());
        phaser.arrive();
        System.out.println(Thread.currentThread().getName() + "   end A2 " + System.currentTimeMillis());

        System.out.println(Thread.currentThread().getName() + " begin A3 " + System.currentTimeMillis());
        phaser.arrive();
        System.out.println(Thread.currentThread().getName() + "   end A3 " + System.currentTimeMillis());

    }
}
