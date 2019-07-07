package semaphore.semaphoreTest2;

/**
 * Created by xianpeng.xia
 * on 2019-07-08 01:11
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
