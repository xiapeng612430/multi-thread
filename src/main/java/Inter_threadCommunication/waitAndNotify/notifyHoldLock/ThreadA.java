package Inter_threadCommunication.waitAndNotify.notifyHoldLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:26
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
