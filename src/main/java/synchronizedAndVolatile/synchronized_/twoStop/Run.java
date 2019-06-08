package synchronizedAndVolatile.synchronized_.twoStop;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 19:24
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
