package synchronizedAndVolatile.synchronized_.synTwoLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:12
 */
public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
