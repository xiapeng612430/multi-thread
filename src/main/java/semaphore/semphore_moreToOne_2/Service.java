package semaphore.semphore_moreToOne_2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xianpeng.xia
 * on 2019-07-21 01:00
 */
public class Service {

    private Semaphore semaphore = new Semaphore(3);
    private ReentrantLock lock = new ReentrantLock();

    void sayHello() {
        try {
            semaphore.acquire();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " ready ");
            lock.lock();
            System.out.println("begin hello " + System.currentTimeMillis());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " print " + (i + 1));
            }
            System.out.println("end   hello " + System.currentTimeMillis());
            lock.unlock();
            semaphore.release();
            System.out.println("Thread name = " + Thread.currentThread().getName() + " end ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
