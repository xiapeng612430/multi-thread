package synchronizedAndVolatile.synchronized_.synTwoLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:10
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
