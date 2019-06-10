package lock.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:22
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("Thread Name = " + Thread.currentThread().getName() + " get lock");
        } finally {
            lock.unlock();
        }
    }
}
