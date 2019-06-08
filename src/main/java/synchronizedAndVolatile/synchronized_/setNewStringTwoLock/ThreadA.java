package synchronizedAndVolatile.synchronized_.setNewStringTwoLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:39
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
