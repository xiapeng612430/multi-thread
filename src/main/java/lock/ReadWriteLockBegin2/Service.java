package lock.ReadWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 16:55
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("get write lock " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
