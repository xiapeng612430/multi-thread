package Inter_threadCommunication.waitAndNotify.notifyHoldLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:32
 */
public class SynNotifyMethodThread extends Thread {

    private Object lock;

    public SynNotifyMethodThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
