package Inter_threadCommunication.waitAndNotify.notifyAll;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:59
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notifyAll();
        }
    }
}
