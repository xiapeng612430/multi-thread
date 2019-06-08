package synchronizedAndVolatile.synchronized_.setNewStringTwoLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:47
 */
public class Run_2 {

    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
