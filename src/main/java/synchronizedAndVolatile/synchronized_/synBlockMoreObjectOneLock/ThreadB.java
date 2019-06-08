package synchronizedAndVolatile.synchronized_.synBlockMoreObjectOneLock;


/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:22
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        Service.printB();
    }
}
