package synchronizedAndVolatile.synchronizedMethodLockObject;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 15:21
 */
public class Run {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
