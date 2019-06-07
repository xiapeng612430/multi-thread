package synchronizedAndVolatile.synchronizedMethodLockObject2;

/**
 * Created by xianpeng.xia
 * on 2019-06-07 20:20
 */
public class Run {

    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("a");
        ThreadB b = new ThreadB(object);
        b.setName("b");
        a.start();
        b.start();
    }
}
