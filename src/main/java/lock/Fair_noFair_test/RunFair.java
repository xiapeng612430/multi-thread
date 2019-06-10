package lock.Fair_noFair_test;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:24
 */
public class RunFair {

    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("* thread " + Thread.currentThread().getName() + " run ");
                service.serviceMethod();
            }
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
}
