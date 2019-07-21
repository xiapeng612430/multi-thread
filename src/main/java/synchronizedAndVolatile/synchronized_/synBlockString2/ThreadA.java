package synchronizedAndVolatile.synchronized_.synBlockString2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:42
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
