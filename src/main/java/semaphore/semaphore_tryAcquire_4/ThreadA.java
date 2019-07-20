package semaphore.semaphore_tryAcquire_4;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:38
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
