package lock.ReadWriteLockBegin4;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 17:10
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }
}
