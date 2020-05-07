package phaser.phaser_test6_1;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 11:36 下午
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethodA();
    }
}
