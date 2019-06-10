package lock.ConditionTestManyToMany;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:07
 */
public class ThreadA extends Thread {
private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}
