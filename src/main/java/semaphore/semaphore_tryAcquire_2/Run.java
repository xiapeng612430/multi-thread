package semaphore.semaphore_tryAcquire_2;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:39
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
