package synchronizedAndVolatile.synchronized_.throwExceptionNotLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 21:16
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
