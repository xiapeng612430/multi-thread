package phaser.phaser_onAdvance;

/**
 * Created by xianpeng.xia
 * on 2020/5/7 10:25 下午
 */
public class ThreadB extends Thread {

    private MyService myService;

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
