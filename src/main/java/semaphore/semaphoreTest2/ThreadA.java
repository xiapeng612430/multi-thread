package semaphore.semaphoreTest2;

/**
 * Created by xianpeng.xia
 * on 2019-07-08 01:09
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
