package phaser.phaser_test6_1;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:37 下午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        MyService myService = new MyService(phaser);

        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(myService);
        c.setName("C");
        c.start();
    }
}
