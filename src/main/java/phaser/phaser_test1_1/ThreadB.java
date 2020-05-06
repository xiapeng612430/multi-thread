package phaser.phaser_test1_1;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 10:24 下午
 */
public class ThreadB extends Thread {

    private Phaser phaser;

    public ThreadB(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodA();
    }
}
