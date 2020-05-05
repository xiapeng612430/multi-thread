package cyclicBarrier.cyclicBarrier_run5;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:26 上午
 */
public class ThreadC extends Thread {

    private MyService myService;

    public ThreadC(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
