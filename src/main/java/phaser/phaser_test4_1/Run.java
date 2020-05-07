package phaser.phaser_test4_1;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 10:51 下午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
    }
}
