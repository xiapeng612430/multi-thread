package cyclicBarrier.cyclicBarrier_run2;

/**
 * Created by xianpeng.xia
 * on 2020/5/5 11:46 下午
 */
public class MyThread extends Thread {

    MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testA();
    }
}
