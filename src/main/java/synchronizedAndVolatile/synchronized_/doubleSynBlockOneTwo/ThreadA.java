package synchronizedAndVolatile.synchronized_.doubleSynBlockOneTwo;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 10:49
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
        service.serviceMethodA();
    }
}
