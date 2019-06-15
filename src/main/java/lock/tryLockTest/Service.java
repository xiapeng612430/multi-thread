package lock.tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-16 00:03
 */
public class Service {

    public ReentrantLock locl = new ReentrantLock();

    public void waitMethod() {
        if (locl.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " get lock");
        } else {
            System.out.println(Thread.currentThread().getName() + " not get lock");
        }
    }

}
