package lock.tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 00:08
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(" " + Thread.currentThread().getName() + " get lock time = " + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println(" " + Thread.currentThread().getName() + " not get lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }

    }
}
