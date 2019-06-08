package synchronizedAndVolatile.synchronized_.synBlockString;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 11:30
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("b", "bb");
    }
}
