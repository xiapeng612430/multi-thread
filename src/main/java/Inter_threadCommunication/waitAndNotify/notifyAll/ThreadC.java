package Inter_threadCommunication.waitAndNotify.notifyAll;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:57
 */
public class ThreadC extends Thread {

    private Object lock;

    public ThreadC(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
