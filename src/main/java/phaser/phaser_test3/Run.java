package phaser.phaser_test3;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 10:04 下午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        ThreadA threadA = new ThreadA(phaser);
        threadA.start();
    }
}
