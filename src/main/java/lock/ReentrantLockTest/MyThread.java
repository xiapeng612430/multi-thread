package lock.ReentrantLockTest;


/**
 * Created by xianpeng.xia
 * on 2019-06-10 21:24
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
