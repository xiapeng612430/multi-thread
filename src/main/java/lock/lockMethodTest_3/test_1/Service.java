package lock.lockMethodTest_3.test_1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-14 21:51
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
            System.out.println("公平锁的情况：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
