package semaphore.availablePermitsTest;

import java.util.concurrent.Semaphore;

/**
 * Created by xianpeng.xia
 * on 2019-07-17 01:01
 */
public class MyService {

    private Semaphore semaphore = new Semaphore(10);

    public void testMehod() {
        try {
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
