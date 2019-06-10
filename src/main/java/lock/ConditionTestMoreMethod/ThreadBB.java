package lock.ConditionTestMoreMethod;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 22:33
 */
public class ThreadBB extends Thread {

    private MyService service;

    public ThreadBB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
