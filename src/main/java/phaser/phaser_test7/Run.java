package phaser.phaser_test7;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:52 下午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        ThreadA threadA = new ThreadA(phaser);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(phaser);
        threadB.setName("B");
        threadB.start();

        ThreadC threadC = new ThreadC(phaser);
        threadC.setName("C");
        threadC.start();

        ThreadD threadD = new ThreadD(phaser);
        threadD.setName("D");
        threadD.start();
    }
}
