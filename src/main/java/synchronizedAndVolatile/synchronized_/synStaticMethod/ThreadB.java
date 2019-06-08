package synchronizedAndVolatile.synchronized_.synStaticMethod;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:03
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        Service.printB();
    }
}
