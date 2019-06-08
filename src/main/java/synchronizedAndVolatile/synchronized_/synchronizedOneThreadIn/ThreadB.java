package synchronizedAndVolatile.synchronized_.synchronizedOneThreadIn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 09:34
 */
public class ThreadB extends Thread {

    private ObjectService service;

    public ThreadB(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
