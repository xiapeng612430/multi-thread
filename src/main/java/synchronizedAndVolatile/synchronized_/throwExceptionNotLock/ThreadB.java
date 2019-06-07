package synchronizedAndVolatile.synchronized_.throwExceptionNotLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:17
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
