package lock.ConditionTestMoreMethod;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 22:32
 */
public class ThreadAA extends Thread {

    private MyService service;

    public ThreadAA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
