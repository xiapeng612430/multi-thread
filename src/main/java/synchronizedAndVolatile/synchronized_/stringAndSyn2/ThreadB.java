package synchronizedAndVolatile.synchronized_.stringAndSyn2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:44
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        Service.print(new Object());
    }
}
