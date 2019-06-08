package synchronizedAndVolatile.synchronized_.stringAndSyn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:35
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        Service.print("AAA");
    }
}
