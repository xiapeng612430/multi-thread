package synchronizedAndVolatile.synchronized_.synLockIn_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:52
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.service1();
    }
}
