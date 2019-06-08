package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 13:13
 */
public class ThreadB extends Thread {

    private Service service;
    private MyObject object;

    public ThreadB(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethodA(object);
    }
}
