package Inter_threadCommunication.waitAndNotify.waitOld;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 10:51
 */
public class Add {

    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
