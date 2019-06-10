package lock.MustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-06-10 23:48
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition1.await();
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
            condition2.await();
            System.out.println("  end awaitB time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("  signalAll_A time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition1.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("  signalAll_B time = " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
            condition2.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
