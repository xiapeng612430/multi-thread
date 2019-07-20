package semaphore.semaphoreFairTest;

import java.util.concurrent.Semaphore;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:10
 */
public class MyService {

    private boolean isFair = true;
    private Semaphore semaphore = new Semaphore(1, isFair);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println("Thread name : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }

    }
}
