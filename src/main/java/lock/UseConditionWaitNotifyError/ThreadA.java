package lock.UseConditionWaitNotifyError;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:11
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.await();
    }
}
