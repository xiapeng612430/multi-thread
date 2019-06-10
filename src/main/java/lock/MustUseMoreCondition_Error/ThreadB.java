package lock.MustUseMoreCondition_Error;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:44
 */
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
