package synchronizedAndVolatile.synchronized_.synBlockString;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:29
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");
    }
}
