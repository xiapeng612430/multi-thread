package synchronizedAndVolatile.synchronized_.stringAndSyn;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:36
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        Service.print("AAA");
    }
}
