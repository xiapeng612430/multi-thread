package Inter_threadCommunication.waitAndNotify.notifyAll;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:57
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
