package semaphore.semaphore_tryAcquire_4;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 00:33
 */
public class Service {

    private Semaphore semaphore = new Semaphore(3);

    public void testMethod() {
        try {
            if (semaphore.tryAcquire(3, 3, TimeUnit.SECONDS)) {
                System.out.println("thread name = " + Thread.currentThread().getName() + " join");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    //String newString = new String();
                    //Math.random();
                }
                semaphore.release(3);
            } else {
                System.out.println("thread name = " + Thread.currentThread().getName() + " failed join");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
