package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 17:12
 */
public class ThreadA extends Thread {

    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod(object);
    }
}
