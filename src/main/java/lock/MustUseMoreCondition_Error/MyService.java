package lock.MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:39
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition.await();
            System.out.println("  end awaitA time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition.await();
            System.out.println("  end awaitB time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll() {
        try {
            lock.lock();
            System.out.println("  signalAll time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition.signalAll();
        } finally {
            lock.unlock();
        }

    }
}
