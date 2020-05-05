package cyclicBarrier.cyclicBarrier_run4;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:17 上午
 */
public class ThreadA extends Thread{

    MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
