package cyclicBarrier.cyclicBarrier_run4;

/**
 * Created by xianpeng.xia
 * on 2020/5/6 12:17 上午
 */
public class ThreadC extends Thread{

    MyService myService;

    public ThreadC(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
