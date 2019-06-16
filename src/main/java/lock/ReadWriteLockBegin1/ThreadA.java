package lock.ReadWriteLockBegin1;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:07
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
