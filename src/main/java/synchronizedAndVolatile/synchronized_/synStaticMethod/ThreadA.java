package synchronizedAndVolatile.synchronized_.synStaticMethod;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 18:03
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        Service.printA();
    }
}
