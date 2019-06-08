package synchronizedAndVolatile.synchronized_.twoStop;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:54
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
