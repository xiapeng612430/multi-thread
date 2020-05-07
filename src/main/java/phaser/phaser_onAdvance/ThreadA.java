package phaser.phaser_onAdvance;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 10:23 下午
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
