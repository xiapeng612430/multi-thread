package lock.lockMethodTest_1.test_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 00:48
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();
    private Condition newCondition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            newCondition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("has " + lock.getWaitQueueLength(newCondition) + " number wait condition ");
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
