package lock.ReadWriteLockBegin3;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:07
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
