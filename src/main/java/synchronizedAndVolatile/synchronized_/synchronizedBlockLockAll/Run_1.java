package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 13:13
 */
public class Run_1 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service, object);
        b.setName("B");
        b.start();
    }
}
