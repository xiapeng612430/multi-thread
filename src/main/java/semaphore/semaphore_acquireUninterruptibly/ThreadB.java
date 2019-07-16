package semaphore.semaphore_acquireUninterruptibly;

/**
 * Created by xianpeng.xia
 * on 2019-07-09 00:06
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
