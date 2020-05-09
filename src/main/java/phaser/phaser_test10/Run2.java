package phaser.phaser_test10;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:38 上午
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        phaser.register();
        for (int i = 0; i < 3; i++) {
            ThreadA a = new ThreadA(phaser);
            a.setName("Thread-" + i);
            a.start();
        }
        Thread.sleep(5000);
        phaser.arriveAndDeregister();
    }
}
