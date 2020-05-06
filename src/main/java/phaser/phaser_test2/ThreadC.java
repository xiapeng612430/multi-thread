package phaser.phaser_test2;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 10:24 下午
 */
public class ThreadC extends Thread {

    private Phaser phaser;

    public ThreadC(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodB();
    }
}
