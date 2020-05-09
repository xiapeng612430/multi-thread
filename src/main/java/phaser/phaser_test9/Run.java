package phaser.phaser_test9;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:32 上午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();

        Thread.sleep(1000);
        phaser.forceTermination();

        System.out.println(phaser.isTerminated());
    }
}
