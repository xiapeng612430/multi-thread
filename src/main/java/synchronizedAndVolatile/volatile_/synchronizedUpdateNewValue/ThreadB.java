package synchronizedAndVolatile.volatile_.synchronizedUpdateNewValue;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 22:40
 */
public class ThreadB extends Thread {
private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
