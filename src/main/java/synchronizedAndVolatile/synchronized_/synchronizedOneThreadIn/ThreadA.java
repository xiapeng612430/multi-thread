package synchronizedAndVolatile.synchronized_.synchronizedOneThreadIn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 09:31
 */
public class ThreadA extends Thread {

    private ObjectService service;

    public ThreadA(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.serviceMethod();
    }
}
