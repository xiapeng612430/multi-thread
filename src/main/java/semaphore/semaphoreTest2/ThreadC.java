package semaphore.semaphoreTest2;

/**
 * Created by xianpeng.xia
 * on 2019-07-08 01:11
 */
public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
