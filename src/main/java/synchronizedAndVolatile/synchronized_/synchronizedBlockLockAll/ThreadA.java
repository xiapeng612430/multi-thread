package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 12:57
 */
public class ThreadA extends Thread {

    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethodA(object);
    }
}
