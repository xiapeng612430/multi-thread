package semaphore.twoMethodTest;

/**
 * Created by xianpeng.xia
 * on 2019-07-20 23:55
 */
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
