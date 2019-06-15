package lock.lockMethodTest_3.test_3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-15 21:49
 */
public class Service {
private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        this.lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());

        }finally {
            lock.unlock();
        }
    }
}
