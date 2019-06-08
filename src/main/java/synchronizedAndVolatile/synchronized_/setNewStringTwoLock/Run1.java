package synchronizedAndVolatile.synchronized_.setNewStringTwoLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 20:38
 */
public class Run1 {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }
}
