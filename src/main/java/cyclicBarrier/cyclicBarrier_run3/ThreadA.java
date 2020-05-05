package cyclicBarrier.cyclicBarrier_run3;


/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:03 上午
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
