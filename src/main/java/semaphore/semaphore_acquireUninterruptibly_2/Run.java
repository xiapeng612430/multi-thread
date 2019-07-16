package semaphore.semaphore_acquireUninterruptibly_2;

/**
 * Created by xianpeng.xia
 * on 2019-07-09 00:08
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(100);
        b.interrupt();
        System.out.println("main thread interrupted a");
    }
}
