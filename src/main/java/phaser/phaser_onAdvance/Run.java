package phaser.phaser_onAdvance;

import java.util.concurrent.Phaser;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 10:25 下午
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(2) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("protected boolean onAdvance(int phase,int registeredParties)被调用");
                //返回true 不等待了 ，Phaser呈无效/销毁的状态
                //返回false则Phaser继续工作
                return false;
            }
        };

        MyService myService = new MyService(phaser);

        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();

    }
}
