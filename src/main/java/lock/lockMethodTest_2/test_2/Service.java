package lock.lockMethodTest_2.test_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-11 01:07
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
            System.out.println("if has thread wait condition " + lock.hasWaiters(newCondition) + " " + lock.getWaitQueueLength(newCondition));
            newCondition.signal();
        } finally {
            lock.unlock();
        }
    }
}
