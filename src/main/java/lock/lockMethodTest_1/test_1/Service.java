package lock.lockMethodTest_1.test_1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:37
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount = " + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    private void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount = " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
