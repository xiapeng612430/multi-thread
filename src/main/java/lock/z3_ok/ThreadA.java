package lock.z3_ok;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:25
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
