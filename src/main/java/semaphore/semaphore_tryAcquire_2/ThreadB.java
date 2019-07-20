package semaphore.semaphore_tryAcquire_2;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:38
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
