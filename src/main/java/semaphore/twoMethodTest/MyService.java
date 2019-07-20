package semaphore.twoMethodTest;

import java.util.concurrent.Semaphore;

/**
 * Created by xianpeng.xia
 * on 2019-07-20 23:46
 */
public class MyService {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println("还有大约" + semaphore.getQueueLength() + "个线程在等待");
            System.out.println("是否有线程正在等待信号量呢?" + semaphore.hasQueuedThreads());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

}
