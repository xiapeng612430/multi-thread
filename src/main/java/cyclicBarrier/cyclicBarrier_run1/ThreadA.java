package cyclicBarrier.cyclicBarrier_run1;

/**
 * Created by xianpeng.xia
 * on 2020/5/5 11:25 下午
 */
public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.beginRun();
    }
}
