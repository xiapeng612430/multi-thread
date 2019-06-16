package lock.awaitUninterruptiblyTest_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 00:26
 */
public class MyThread extends Thread {
private Service service;

    public MyThread(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
