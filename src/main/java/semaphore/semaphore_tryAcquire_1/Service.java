package semaphore.semaphore_tryAcquire_1;

import java.util.concurrent.Semaphore;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:33
 */
public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        if (semaphore.tryAcquire()) {
            System.out.println("thread name = " + Thread.currentThread().getName() + " join");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release();
        } else {
            System.out.println("thread name = " + Thread.currentThread().getName() + " failed join");
        }
    }
}
