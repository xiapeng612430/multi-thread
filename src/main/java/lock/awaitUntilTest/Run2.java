package lock.awaitUntilTest;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 15:54
 */
public class Run2 {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(2000);
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
