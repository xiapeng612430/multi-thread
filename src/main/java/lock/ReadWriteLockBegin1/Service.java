package lock.ReadWriteLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 16:55
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("get read lock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
