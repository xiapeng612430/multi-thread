package phaser.phaser_test5;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:00 下午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(7);
        MyThread[] myThreads = new MyThread[5];

        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread(phaser);
            myThreads[i] = myThread;
            myThreads[i].start();
        }

        Thread.sleep(2000);

        System.out.println("已到达：" + phaser.getArrivedParties());
        System.out.println("未到达：" + phaser.getUnarrivedParties());

    }
}
