package lock.lockMethodTest_2.test_1;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 01:01
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread a = new Thread(runnable);
        a.start();
        Thread.sleep(500);
        Thread b = new Thread(runnable);
        b.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(a));
        System.out.println(service.lock.hasQueuedThread(b));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
