package synchronizedAndVolatile.synchronized_.synBlockString2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:43
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
