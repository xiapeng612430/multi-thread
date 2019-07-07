package semaphore.semaphore_acquire_release;

import java.util.concurrent.Semaphore;

/**
 * Created by xianpeng.xia
 * on 2019-07-08 01:23
 */
public class Service {

    private Semaphore semaphore = new Semaphore(10);

    public void testMethod() {
        try {
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName() + " begin timer= " + System.currentTimeMillis());
            int sleepValue = ((int) (Math.random() * 10000));
            System.out.println(Thread.currentThread().getName() + " sleeped " + (sleepValue / 1000) + " s");
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " end   timer= " + System.currentTimeMillis());
            semaphore.release(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
