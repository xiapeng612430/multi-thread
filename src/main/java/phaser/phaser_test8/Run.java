package phaser.phaser_test8;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/8 12:06 上午
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{
        Phaser phaser = new Phaser(3);

        ThreadA threadA = new ThreadA(phaser);
        threadA.setName("A");
        threadA.start();

        Thread.sleep(5000);
        threadA.interrupt();
        System.out.println("中断了");
    }
}
