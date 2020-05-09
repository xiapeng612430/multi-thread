package phaser.phaser_test8_2;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 9:55 上午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA threadA = new ThreadA(phaser);
        threadA.setName("A");
        threadA.start();
    }
}
