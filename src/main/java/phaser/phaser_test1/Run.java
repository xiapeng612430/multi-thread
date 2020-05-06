package phaser.phaser_test1;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 10:27 下午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PrintTools.phaser = phaser;

        ThreadA threadA = new ThreadA(phaser);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(phaser);
        threadB.setName("B");
        threadB.start();

        ThreadC threadC = new ThreadC(phaser);
        threadC.setName("C");
        threadC.start();
    }
}
