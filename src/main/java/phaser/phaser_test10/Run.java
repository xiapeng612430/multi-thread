package phaser.phaser_test10;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/9 10:38 上午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        for (int i = 0; i < 3; i++) {
            ThreadA a = new ThreadA(phaser);
            a.setName("Thread-" + i);
            a.start();
        }
    }
}
