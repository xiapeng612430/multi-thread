package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 17:15
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("A");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(object);
        b.setName("B");
        b.start();
    }
}
