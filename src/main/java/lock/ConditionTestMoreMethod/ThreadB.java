package lock.ConditionTestMoreMethod;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 22:33
 */
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
