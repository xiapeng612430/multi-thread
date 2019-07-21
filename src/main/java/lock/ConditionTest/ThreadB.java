package lock.ConditionTest;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:07
 */
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.get();
    }
}

