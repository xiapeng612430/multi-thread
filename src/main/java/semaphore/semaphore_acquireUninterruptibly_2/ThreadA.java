package semaphore.semaphore_acquireUninterruptibly_2;

/**
 * Created by xianpeng.xia
 * on 2019-07-09 00:04
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
