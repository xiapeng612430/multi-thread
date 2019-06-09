package Inter_threadCommunication.waitAndNotify.notifyHoldLock;

import synchronizedAndVolatile.synchronized_.selfPrivate.ThreadB;

/**
 * Created by xianpeng.xia
 * on 2019-06-09 09:14
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() Thread name = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end   wait() Thread name = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin notify() Thread Name = " + Thread.currentThread().getName());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end   notify() Thread Name = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
