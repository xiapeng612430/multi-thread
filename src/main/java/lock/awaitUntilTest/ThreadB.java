package lock.awaitUntilTest;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 15:46
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
