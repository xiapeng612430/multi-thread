package synchronizedAndVolatile.synchronized_.synchronizedBlockLockAll.test_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 13:13
 */
public class Run_1 {

    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA a = new ThreadA(service, object1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service, object2);
        b.setName("B");
        b.start();
    }
}
