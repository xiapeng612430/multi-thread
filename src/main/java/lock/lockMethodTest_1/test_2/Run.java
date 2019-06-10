package lock.lockMethodTest_1.test_2;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:44
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
        Thread.sleep(2000);
        System.out.println("has method " + service.lock.getQueueLength());
    }
}
