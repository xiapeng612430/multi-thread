package synchronizedAndVolatile.synchronized_.synBlockMoreObjectOneLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:21
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        Service.printA();
    }
}
