package semaphore.semaphore_acquireUninterruptibly_2;

import java.util.concurrent.Semaphore;

/**
 * Created by xianpeng.xia
 * on 2019-07-08 23:58
 */
public class Service {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName() + " begin timer = " + System.currentTimeMillis());
        for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
            String newString = new String();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + " end   timer = " + System.currentTimeMillis());
        semaphore.release();
    }
}
