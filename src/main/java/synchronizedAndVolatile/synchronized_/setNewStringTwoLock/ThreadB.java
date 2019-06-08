package synchronizedAndVolatile.synchronized_.setNewStringTwoLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:42
 */
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
